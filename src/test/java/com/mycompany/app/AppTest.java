
package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
    private App app = new App();
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


    // constructor method that accepts input and output.


    public AppTest( String testName )
    {

        super( testName );
    }

    public void testShouldReturnFalseWhenNotValid(){
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        int [] arr2 = new int[]{10,1,2,3};
        boolean valid = false;
        int threshold = 2;
        assertFalse(
                app.firstArraySumGreaterThanSecondArraySumAndAThresholdValueWhenBooleanValidIsTrue(arr2,arr1,threshold,valid));

    }
    public void testShouldReturnFalseWhenThresholdHigher(){
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        int [] arr2 = new int[]{10,1,2,3};
        boolean valid = true;
        int threshold = 200;
        assertFalse(
                app.firstArraySumGreaterThanSecondArraySumAndAThresholdValueWhenBooleanValidIsTrue(arr2,arr1,threshold,valid));

    }
    public void testShouldReturnTrue(){
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        int [] arr2 = new int[]{10,1,2,3};
        boolean valid = true;
        int threshold = 10;
        assertTrue(
                app.firstArraySumGreaterThanSecondArraySumAndAThresholdValueWhenBooleanValidIsTrue(arr2,arr1,threshold,valid));

    }
    public void testNull() {
        ArrayList<Integer> arr1 = null;
        int [] arr2 = null;
        boolean valid = false;
        int threshold = 0;
        assertFalse(
                app.firstArraySumGreaterThanSecondArraySumAndAThresholdValueWhenBooleanValidIsTrue(arr2,arr1,threshold,valid));

    }
    public void testWhenBothNotValidAndThresholdHigher(){
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        int [] arr2 = new int[]{10,1,2,3};
        boolean valid = false;
        int threshold = 200;
        assertFalse(
                app.firstArraySumGreaterThanSecondArraySumAndAThresholdValueWhenBooleanValidIsTrue(arr2,arr1,threshold,valid));


    }
    public void testWhenNotValidAndThresholdHigherAndSecondArrayHigher(){
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,100));
        int [] arr2 = new int[]{10,1,2,3};
        boolean valid = false;
        int threshold = 200;
        assertFalse(
                app.firstArraySumGreaterThanSecondArraySumAndAThresholdValueWhenBooleanValidIsTrue(arr2,arr1,threshold,valid));


    }
    public void testShouldReturnFalseSecondArrhigher(){
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,250));
        int [] arr2 = new int[]{10,1,2,3};
        boolean valid = true;
        int threshold = 2;
        assertFalse(
                app.firstArraySumGreaterThanSecondArraySumAndAThresholdValueWhenBooleanValidIsTrue(arr2,arr1,threshold,valid));

    }



    public void testApp()
    {

        assertTrue( true );
    }

}

