//Author: Adarsh Gupta
//Purpose: Calculates the sum of numbers
package com.example.stringcalculator;

public class StringCalculator{
        //To count how many times add is called
        private static int counter = 0;
        //Method created Add
        public static int Add (String numbers){

            int sum = 0;
            //Replacing all the non-digits with "no space"
            String a = numbers.replaceAll("[^-0-9]", "");
            counter ++;

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

        public static int GetCalledCount(){
            return counter;
        }
        public static void main(String[] args){
            String v= "1\n2,3";
            int addtotal = Add(v);
            System.out.println("The sum of numbers is: " + addtotal);

            int count = 0;
            count = GetCalledCount();
            System.out.print("Method called " + count + " times");
        }
    }

