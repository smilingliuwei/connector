package com.smilingliuwei.connector.common;

import java.util.Properties;
import java.util.Set;

import com.smilingliuwei.configurator.Configuration;


public class Conf {

    public enum PRINT {

        CHILD1_PREFIX( "print_prefix_child1" ), INFO_PREFIX( "print_prefix_info" ), ERROR_PREFIX( "print_prefix_error" );

        private String key;

        private PRINT( String key ) {

            this.key = key;
        }

        public String toString() {

            return key;
        }
    }

    private static final Configuration PRINT = new Configuration( Conf.FILE_PATH, "UTF-8" );

    private static final String FILE_PATH = "print.properties";

    public static String getProperty( PRINT key ) {

        return Conf.PRINT.getProperty( key.toString() );
    }

    public static Properties getProperties() {

        return Conf.PRINT.getProperties();
    }

    public static Set<String> getKeySet() {

        return Conf.PRINT.getkeySet();
    }

}