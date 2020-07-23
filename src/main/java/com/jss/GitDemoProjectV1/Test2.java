package com.jss.GitDemoProjectV1;

/**
 * Hello world!
 *
 */
public class Test2 
{
    public static void main( String[] args )
    {	
    	String hungry = "yes";
    	if(hungry.equals("yes") || hungry.equals("Y") || hungry.equals("y")) {
    		System.out.println("Please eat something");
    	}
    	else {
    		System.out.println("Do work...");
    	}
    }
}
