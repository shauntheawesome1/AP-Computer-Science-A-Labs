package com.company;

public class Main {

  public static void main(String[] args) {
      int[] money = createMoney(69, 50);
       System.out.println("createMoney Function : Dollars = " + money[0] + " Cents = " + money[1]);
       int[] x1 = new int[2];
       x1[0] = 14;
       x1[1] = 34;
       System.out.println("Accessor function: Dollars = " + dollars("$20.22"));
       System.out.println(" Accessor function: Cents = " + cents("$20.22")) // ouch;
       System.out.println(" moneyToText: " + moneyToText(x1));

       // 3. Create Checking Functions
       int[] m1 = new int[2];
       int[] m2 = new int[2];
       m1[0] = 50;
       m1[1] = 92;
       m2[0] = 4;
       m2[1] = 31;
       System.out.println("3a. IsGreater function: " + isGreater(m1, m2));
       System.out.println("3b. IsEqual function: " + isEqual(m1, m2));
       System.out.println("4. Adder function: " + "$" + adder(m1, m2));

       int[] y1 = new int[2];
       y1[0] = 6;
       y1[1] = 15;
       System.out.println("5. Calculation function: " + "$" + calculation(y1));

  }

  //Task 1
  public static int[] createMoney(int dollars, int cents) {
      int money[] = new int[2];
      while (cents >= 100) {
          dollars++;
          cents = 100 - cents;
      }
      money[0] = dollars;
      money[1] = cents;
      return money;
  } // end of createMoney

  public static int cents(int[] money) {
      String first_Money = money.replace("$", "");
       String[] current_Money = first_Money.split("\\.");
       int cent = Integer.parseInt(current_Money[1]);
       return cent;

   }
      }
      public static int dollars(String money) {
       String first_Money = money.replace("$", "");
       String[] current_Money = first_Money.split("\\.");
       int dollar = Integer.parseInt(current_Money[0]);
       return dollar;

   }
  public static String prettyPrint(int[] money){
      if(money[1]<10)
          return "$"+money[0]+".0"+money[1];

      else if(money[1]==0)
          return "$"+money[0]+"."+"00";

      else // if all ELSE fails haha
          return "$"+money[0]+"."+money[1];
  }
  //public String moneyToText(int[] money);{ // Returns the Money as words. Ex,{123,51} => "One hundred and twenty three dollars and fifty one cents." YOU MAY ASSUME money <$1000.

 // }
  public String moneyWord(int[] money){
      if(money[0] ==1)
          return "one";
      if(money[0] ==2)
          return "two";
      if(money[0] ==3)
          return "three";
      if(money[0] ==4)
          return "four";
      if(money[0] ==5)
          return "five";
      if(money[0] ==6)
          return "six";
      if(money[0] ==7)
          return "seven";
      if(money[0] ==8)
          return "eight";
      if(money[0] ==9)
          return "nine";

  return money;
  //}
  public static boolean isGreaterThan(int[] m1, int[] m2){
      float m1_Correct = m1[0] + m1[1] / 100;
       float m2_Correct = m2[0] + m2[1] / 100;
       if (m1_Correct > m2_Correct) {
           return true;
       } else {
           return false;
       }
   }
   public static boolean isEqual(int[] m1, int[] m2) {
       float m1_Correct = m1[0] + m1[1] / 100;
       float m2_Correct = m2[0] + m2[1] / 100;
       if (m1_Correct > m2_Correct) {
           return true;
       } else {
           return false;
       }
   }
   public static float calculation(int[] y1) {
       float receipt = ((20 - y1[0]) - 1) + ((100 - y1[1]) / 100.00);
       return reciept;
   }
   }
   public static double adder(int[] m1, int[] m2) {
       int cents_Correct = m1[1] + m2[1];
       int dollar_IC = 0;
       if (cents_Correct > 99) {
           cents_Correct = cents_Correct % 100;
           dollar_IC = cents_Correct / 100;
       }
       int dollar_Correct = dollar_IC + m1[0] + m2[0];
       double m3_Correct = dollar_Correct + cents_Correct / 100.00;
       return m3_Correct;
   }
    public static String moneyToText(int[] money) {
       int dollars = money[0];
       int cents = money[1];
       String a = "";
       if (dollars >= 900)
           a = a + "Nine Hundred";
       else if (dollars >= 800)
           a = a + "Eight Hundred";
       else if (dollars >= 700)
           a = a + "Seven Hundred";
       else if (dollars >= 600)
           a = a + "Six Hundred";
       else if (dollars >= 500)
           a = a + "Five Hundred";
       else if (dollars >= 400)
           a = a + "Four Hundred";
       else if (dollars >= 300)
           a = a+ "Three Hundred";
       else if (dollars >= 200)
           a = a + "Two Hundred";
       else if (dollars >= 100)
           a = a + "One Hundred";
       if ((dollars % 100 == 0) && (cents == 0)) {
           a = a + " dollars";
           return a;
       } else if (((dollars % 100 != 0) || (cents != 0)) && (dollars / 100 != 0))
           a += " and ";
     
     
     
      // New f(x)?????
      //No, its the same one, but testing for tens/tensOnesPlace
      //DONT USE DOUBLE
       int value_TensOnes = dollars % 100;
       if (value_TensOnes >= 90)
           a = a + "Ninety";
       else if (value_TensOnes >= 80)
           a = a + "Eighty";
       else if (value_TensOnes >= 70)
           a = a + "Seventy";
       else if (value_TensOnes >= 60)
           a = a + "Sixty";
       else if (value_TensOnes >= 50)
           a = a + "Fifty";
       else if (value_TensOnes >= 40)
           a = a + "Fourty";
       else if (value_TensOnes >= 30)
           a = a + "Thirty";
       else if (value_TensOnes >= 20)
           a = a + "Twenty";
       else if (value_TensOnes == 10)
           a = a + "Ten";
       if ((dollars % 10 == 0) && (cents == 0)) {
           a = a + " Dollars";
           return a;

       }

       if ((dollars % 10 == 0) && (cents != 0))
           a += " Dollars and";
       else {
           int value_Ones = value_TensOnes % 10;
           if (value_Ones == 9)
               a = a + " Nine Dollars";
           else if (value_TensOnes == 19)
               a = a + "Nineteen Dollars";
           else if (value_TensOnes == 18)
               a = a + "Eightteen Dollars";
           else if (tensOnesPlace == 17)
               a = a + "Seventeen Dollars";
           else if (value_TensOnes == 16)
               a = a + "Sixteen Dollars";
           else if (value_TensOnes == 15)
               a = a + "Fifteen Dollars";
           else if (value_TensOnes == 14)
               a = a + "Fourteen Dollars";
           else if (value_TensOnes == 13)
               a = a + "Thirteen Dollars";
           else if (value_TensOnes == 12)
               a = a + "Twelve Dollars";
           else if (value_TensOnes == 11)
               a = a + "Eleven Dollars";
           else if (value_Ones == 8)
               a = a + " Eight Dollars";
           else if (value_Ones == 7)
               a = a + " Seven Dollars";
           else if (value_Ones == 6)
               a= a + " Six Dollars";
           else if (value_Ones == 5)
               a = a + " Five Dollars";
           else if (value_Ones == 4)
               a = a + " Four Dollars";
           else if (value_Ones == 3)
               a = a + " Three Dollars";
           else if (value_Ones == 2)
               a = a + " Two Dollars";
           else if (value_Ones == 1)
               a = a + " One Dollar";
           if (cents != 0){
               a = a + " and";}
       }


       if ((cents != 0)) {
         // if the cents aren't equal to zero, work on the modulus and divide operators
         //Key notes op
         //Error 100 %
           int value_OnesCents = cents % 10; // STOP ASSIGNING FLOATS SHAUN
           int value_TenCents = cents / 10; // DIVIDE THIS ONE, SRIRAM"S EXAMPLE
          
           if (centtensPlace != 0)
               if (((cents % 10 == 0) || (value_TenCents != 0)) && (cents >= 20))
                   a += " ";
           if (cents >= 90)
               a = a + "Ninety";
           else if (cents >= 80)
               a = a + "Eighty";
           else if (cents >= 70)
               a = a + "Seventy";
           else if (cents >= 60)
               a = a + "Sixty";
           else if (cents >= 50)
               a = a + "Fifty";
           else if (cents >= 40)
               a = a + "Fourty";
           else if (cents >= 30)
               a = a + "Thirty";
           else if (cents >= 20)
               a = a + "Twenty";
           else if (cents == 10)
               a = a + " Ten";
           if ((cents % 10 == 0) && (cents != 10)) {
               a = a + " cents";
               return a;
           }

           if (value_OnesCents == 9)
               a = a + " Nine Cents";
           else if (cents == 19)
               a = a + " Nineteen Cents";
           else if (cents == 18)
               a = a + " Eighteen Cents";
           else if (cents == 17)
               a = a + " Seventeen Cents";
           else if (cents == 16)
               a = a + " Sixteen Cents";
           else if (cents == 15)
               a = a + Fifteen Cents";
           else if (cents == 14)
               a = a + " Fourteen Cents";
           else if (cents == 13)
               a = a + " Thirteen Cents";
           else if (cents == 12)
               a = a + " Twelve Cents";
           else if (cents == 11)
               a = a + " Eleven Cents";
           else if (centonesPlace == 8)
               a = a + " Eight Cents";
           else if (centonesPlace == 7)
               a = a +" Seven Cents";
           else if (centonesPlace == 6)
               a = a + " Six Cents";
           else if (centonesPlace == 5)
               a = a + " Five Cents";
           else if (centonesPlace == 4)
               a = a + " Four Cents";
           else if (centonesPlace == 3)
               a = a + " Three Cents";
           else if (centonesPlace == 2)
               a = a + " Two Cents";
           else if (centonesPlace == 1)
               a = a + " One Cents";
       }

       return a;

   }
}


}


