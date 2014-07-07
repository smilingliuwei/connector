package com.smilingliuwei.connector.common;

import java.util.ResourceBundle;


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
    
    private static final ResourceBundle conf = ResourceBundle.getBundle("print");

    public static String getProperty( PRINT key ) {

    	return conf.getString( key.toString() );
    }
}