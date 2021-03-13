//Author: Adarsh Gupta
//Purpose: Calculates the sum of numbers
package com.example.stringcalculator;

public class StringCalculator{
        //Method created Add
        public static int Add (String num){
            //To store sum (initialization)
            int sum = 0;

            //Adding delimiter using split
            String arr[]= num.split(",|\\n");
            //Extracting split array


                for (int i = 0; i < arr.length; i++) {
                    ///calculating sum and convert string to int
                    sum = Integer.parseInt(arr[i]) + sum;
                }

            return sum;
        }
        public static void main(String args[]){
            String v= "2,4\n5,7";
            //Adding try and catch block to catch "empty string" (error handling)
            try{
                    int a = Add(v);
                    System.out.println(a);
                }catch(Exception e){
                System.out.println("0");
            }
        }
    }

