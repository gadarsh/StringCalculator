//Author: Adarsh Gupta
//Purpose: Calculates the sum of numbers
package com.example.stringcalculator;

public class StringCalculator{
        //Method created Add
        public static int Add (String num){
            int sum = 0;
            //Replacing all the non-digits with "no space"
            String a = num.replaceAll("[^-0-9]", "");

            for(int i=0; i<=a.length()-1; i++) {
                //Extracting and checking for negative numbers
                if(a.charAt(i) == '-'){
                    System.out.println("Exception : Negative(s) not allowed: " + a.charAt(i)+a.charAt(i+1));
                    //Skipping so the next number sticks to negative
                    i++;
                }
                else {
                    //Adding the positive numbers
                    sum = sum + Character.getNumericValue(a.charAt(i));
                }
            }
            return sum;
        }
        public static void main(String[] args){
            String v= "//;\n1;-2,-4,5,-8";
            //Adding try and catch block to catch "empty string" (error handling)
            try{
                    int a = Add(v);
                    System.out.println(a);
                }catch(Exception e){
               System.out.println("0");
            }
        }
    }

