package com.company;

public class Main {

   public static void main(String[] args) {
       // write your code here
       System.out.println(onesDigit(12345));
       System.out.println(tensOnesDigit(12345));
       System.out.println(tensDigit(12345));
       System.out.println(hundredsDigit(12345));
       System.out.println(thousandsDigit(12345));
       System.out.println(getDigits(12345,3,0));
   }// end of void main, not class

   //Write your functions
   public static int onesDigit(int num) { // Task 1 Start
       int returnValue = num%10;
       return returnValue;
   }// end of function
   public static int tensOnesDigit(int num) { //Task 2 Start
       int returnValue = num %100;
       return returnValue;
   }// end of function
   public static int tensDigit(int num) { //Task 3 start
       int returnValue = (num%100)/10;
       return returnValue;
   }// end of function
   public static int hundredsDigit(int num){ //Task 4 start
       int returnValue = (num%1000)/100;
       return returnValue;
   }// end of function
   public static int thousandsDigit(int num){ //Task 4 cont
       int returnValue = num % 10000/1000;
       return returnValue;
   }// end of function
   public static int getDigits(int num, int biggestDigit, int smallestDigit){ //Task 5
       int returnValue;
       returnValue = (num%(int)Math.pow(10,biggestDigit+1))/(int)Math.pow(10,smallestDigit); // (10^n+1/10^n)
       return returnValue;
       }// end of function

   }

