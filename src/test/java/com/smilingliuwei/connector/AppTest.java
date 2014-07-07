package com.smilingliuwei.connector;

import java.io.IOException;

import com.smilingliuwei.connector.http.HttpConnection;
import com.smilingliuwei.connector.http.impl.PostMethod;

public class AppTest {
	public static void main(String[] args) throws IOException {

		/*
		 * http://172.16.10.188:8080/mobile/collect.do Host: 127.0.0.1:86
		 * User-Agent: Mozilla/5.0 (Windows NT 6.1; rv:26.0) Gecko/20100101
		 * Firefox/26.0 Accept:
		 * text/html,application/xhtml+xml,application/xml;q=0.9,
		 *//*
			 * ;q=0.8 Accept-Language: zh-cn,zh;q=0.8,en-us;q=0.5,en;q=0.3
			 * Accept-Encoding: gzip, deflate Connection: keep-alive
			 * Content-Type: application/x-www-form-urlencoded Content-Length:
			 * 95
			 */

		for (int i = 0; i < 2; i++) {
			Thread thread = new Thread(new Runnable() {
				public void run() {
					try {
						System.out.println("\n"
								+ Thread.currentThread().getName() + "\n");

						HttpConnection postMethod = new PostMethod();
						postMethod.connect("172.16.10.188", 8080);

						postMethod.appendHeader("Host", "127.0.0.1:8080");
						postMethod.appendHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; rv:26.0) Gecko/20100101 Firefox/26.0");
						postMethod .appendHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*//*;q=0.8");
						postMethod.appendHeader("Accept-Language", "zh-cn,zh;q=0.8,en-us;q=0.5,en;q=0.3");
						postMethod.appendHeader("Accept-Encoding", "gzip, deflate");
						postMethod.appendHeader("Connection", "keep-alive");
						postMethod.appendHeader("Content-Type", "application/x-www-form-urlencoded");
						postMethod.appendHeader("Content-Length", "95");

						postMethod.send("/mobile/collect.do");
						postMethod.receive();
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}, "task-" + i);
			
			thread.start();
		}

		// HttpConnection getMethod = new GetMethod();
		//
		// getMethod.connect( "127.0.0.1", 51666 );
		//
		// getMethod.appendHeader( "Accept",
		// "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8" );
		// getMethod.appendHeader( "Accept-Encoding", "gzip, deflate" );
		// getMethod.appendHeader( "Accept-Language",
		// "zh-cn,zh;q=0.8,en-us;q=0.5,en;q=0.3" );
		// getMethod.appendHeader( "Connection", "keep-alive" );
		// getMethod.appendHeader( "Host", "58.59.4.3" );
		// getMethod.appendHeader( "User-Agent",
		// "Mozilla/5.0 (Windows NT 6.1; rv:26.0) Gecko/20100101 Firefox/26.0"
		// );
		// getMethod.appendHeader( "Cookie",
		// "JSESSIONID=78B98A8C26B17BD6058D7856A49E59F3;sessionKey=3BfZKNkSXQKlkMzO2%252B8uHO1PKeU%253D;username=admin;account=admin;domainid=5e27447d-c971-4583-ad80-35fd1153bff0;role=1;userfullname=Admin%20User;userid=7eba8e4a-63de-4fa8-a6ca-4b2972e76e7b;capabilities=%5Bobject%20Object%5D;supportELB=false;userpublictemplateenabled=true;userProjectsEnabled=true"
		// );
		//
		// getMethod.buildArguments(
		// "cmd=access&vm=73a10084-6e31-4548-9012-2c547d638e83" );
		//
		// getMethod.send( "/console" );
		//
		// System.out.println( "\n" + getMethod.receive() );
	}
}
