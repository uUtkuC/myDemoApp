
package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
    private App app;
    // following are variables that are to be used given to app as parameters
    private int [] inpArr;
    private ArrayList<Integer> inpArrayList;
    private int threshold;
    private int valid;

    //following are expected results::
    private int [] ExpectedinpArr;
    private ArrayList<Integer> ExpectedinpArrayList;
    private int Expectedthreshold;
    private int Expectedvalid;



    public void initialize(){app = new App();};
    // constructor method that accepts input and output.


    public AppTest( String testName )
    {

        super( testName );
    }


    public static Test suite()
    {

        return new TestSuite( AppTest.class );
    }

    public void testAlwaysTrue(){
       assertEquals("True",1,1);
    }


    public void testApp()
    {

        assertTrue( true );
    }

}

