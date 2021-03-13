//Author: Adarsh Gupta
//Purpose: Calculates the sum of numbers
package com.example.stringcalculator;

public class StringCalculator{
        //Method created Add
        public static int Add (String num){
            //To store sum (initialization)
            int sum = 0;
            String a = num.replaceAll("[^-0-9]", "");
            for(int i=0; i<=a.length()-1; i++) {
                //System.out.println(a.charAt(i));
                if(a.charAt(i) == '-') {
                    sum = 0;
                    System.out.println("Negatives not allowed");
                    break;
                }
                else {
                    sum = sum + Character.getNumericValue(a.charAt(i));
                }
            }

            return sum;
        }
        public static void main(String[] args){
            String v= "//;\\n1;-2";
            //Adding try and catch block to catch "empty string" (error handling)
            try{
                    int a = Add(v);
                    System.out.println(a);
                }catch(Exception e){
                System.out.println("0");
            }
        }
    }

