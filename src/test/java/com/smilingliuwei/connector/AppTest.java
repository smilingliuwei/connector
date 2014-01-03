package com.smilingliuwei.connector;

import java.io.IOException;

import com.smilingliuwei.connector.http.HttpConnection;
import com.smilingliuwei.connector.http.impl.GetMethod;
import com.smilingliuwei.connector.http.impl.PostMethod;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() throws IOException
    {
        assertTrue( true );
        
        HttpConnection request = new PostMethod();
        
        request.connect( "58.59.4.3" );

        /*
         * Host: 127.0.0.1:86
         * User-Agent: Mozilla/5.0 (Windows NT 6.1; rv:26.0) Gecko/20100101 Firefox/26.0
         * Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*//*;q=0.8
         * Accept-Language: zh-cn,zh;q=0.8,en-us;q=0.5,en;q=0.3
         * Accept-Encoding: gzip, deflate
         * Connection: keep-alive
         * Content-Type: application/x-www-form-urlencoded
         * Content-Length: 95
         */
//        request.appendHeader( "Host", "58.59.4.3" );
//        request.appendHeader( "User-Agent", "Mozilla/5.0 (Windows NT 6.1; rv:26.0) Gecko/20100101 Firefox/26.0" );
//        request.appendHeader( "Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*//*;q=0.8" );
//        request.appendHeader( "Accept-Language", "zh-cn,zh;q=0.8,en-us;q=0.5,en;q=0.3" );
//        request.appendHeader( "Accept-Encoding", "gzip, deflate" );
//        request.appendHeader( "Connection", "keep-alive" );
//        request.appendHeader( "Content-Type", "application/x-www-form-urlencoded" );
//        request.appendHeader( "Content-Length", "95" );
//
//        request.buildArgumentString( "command=login&username=admin&password=fd3bac7648c29e20b5e5b09e05fd965e&domain=%2F&response=json" );
//
//        request.send( "/api" );
//
//        System.out.println( "\n" + request .receive() );
        
        
        
        HttpConnection getMethod = new GetMethod();
        
        getMethod.connect( "58.59.4.3" );

        getMethod.appendHeader( "Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8" );
        getMethod.appendHeader( "Accept-Encoding", "gzip, deflate" );
        getMethod.appendHeader( "Accept-Language", "zh-cn,zh;q=0.8,en-us;q=0.5,en;q=0.3" );
        getMethod.appendHeader( "Connection", "keep-alive" );
        getMethod.appendHeader( "Host", "58.59.4.3" );
        getMethod.appendHeader( "User-Agent", "Mozilla/5.0 (Windows NT 6.1; rv:26.0) Gecko/20100101 Firefox/26.0" );
        getMethod.appendHeader( "Cookie", "JSESSIONID=78B98A8C26B17BD6058D7856A49E59F3;sessionKey=3BfZKNkSXQKlkMzO2%252B8uHO1PKeU%253D;username=admin;account=admin;domainid=5e27447d-c971-4583-ad80-35fd1153bff0;role=1;userfullname=Admin%20User;userid=7eba8e4a-63de-4fa8-a6ca-4b2972e76e7b;capabilities=%5Bobject%20Object%5D;supportELB=false;userpublictemplateenabled=true;userProjectsEnabled=true" );
        
        getMethod.buildArgumentString( "cmd=access&vm=73a10084-6e31-4548-9012-2c547d638e83" );

        getMethod.send( "/console" );
        
        System.out.println( "\n" + getMethod.receive() );
    }
}
