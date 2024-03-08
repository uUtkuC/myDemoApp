package com.mycompany.app;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //System.out.println( "Hello World!" );
    }
    public static boolean firstArraySumGreaterThanSecondArraySumAndAThresholdValueWhenBooleanValidIsTrue
            (int [] ar1, ArrayList<Integer> arayList, int threshold, boolean valid){
            if(valid == true) {
                int sum1 = 0;
                for (int i = 0; i < ar1.length; i++) {
                    sum1 += ar1[i];
                }
                int sum2 = 0;
                for (int i = 0; i < arayList.size(); i++) {
                    sum2 += arayList.get(i);
                }
                if(sum2>=sum1) return false;
                if(threshold >= sum1) return false;
                return true;
            } else{
                return false;
            }


    }



}










