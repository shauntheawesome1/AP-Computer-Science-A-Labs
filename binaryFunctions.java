package com.APCS;

public class binConvertFunc {

	public static void main (String[] args) throws java.lang.Exception
	{
		int regNum = 67;
		int binNum = 10100101;
		int[] binNumber = {1,0,1,0,0,1,0,1};
		String binString = "10100101";
		double doubleNum = 1.25;
		System.out.println(pp(createBin(binNum)));
		System.out.println(pp(createBin(binString)));
		System.out.println(intValue(binNumber));
		System.out.println(pp(doubleValue(binNumber)));
		System.out.println(pp(intToBinary(regNum)));
		System.out.println(pp(doubleToBinary(doubleNum)));
	}
	public static String pp(int[] a){
       String rV = "{";
       if (a == null|| a.length == 0)                            
           return "null";
       for (int i=0; i<a.length; i++) {
           rV += a[i];
           if (i!=a.length-1)
               rV+=",";
       }
       rV+="}";
       return rV;
   }
	public static int[] createBin(int binaryNumber){
		int [] returnValue = new int[8];// assuming 8 bits in a byte
		for(int i = 0; i < 8; i++){
			returnValue[i] = binaryNumber % (int)Math.pow(10,-i+8) / (int)Math.pow(10,8-(i+1));
		}
		return returnValue;
		}
	public static int[] createBin(String binaryNumber){
		int [] returnValue = new int[8];
		for(int i = 0; i < 8; i++){
		   if( binaryNumber.substring(i,i+1).compareTo("0")== 0){
		   	returnValue[i] = 0;
		   }
		   else
		   returnValue[i] = 1;
		   }
		   return returnValue;
		}
		
	
	public static int intValue(int[] b){
		//int returnValue = 0;
		//int digit0 = b[0], digit1 = b[1], digit2 = b[2], digit3 = b[3], digit4 = b[4], digit5 = b[5], digit6 = b[6], digit7 = b[7];
		int returnValue = -128*b[0] + 64*b[1] + 32*b[2] + 16*b[3] + 8*b[4] + 4*b[5] + 2*b[6] + 1 *b[7];
		return returnValue;
	}




 public static int[] doubleValue(int[] b) {
   	 int[] returnValue = {0, 0};
   	 int[] exp = {b[0], b[1], b[2], b[3]}; 
int[] man = {b[4], b[5], b[6], b[7]};
   	 
   	 for(int i = 3; i >= 0; i--) {
   		 if(i == 0) {
   			 returnValue[0] += exp[i] * (int) - (Math.pow(2, i+1));
   		 } else {
   			 returnValue[0] += exp[i] * (int) Math.pow(2, i+1);
   		 }
   		 
   	 }
   	 
   	 for(int i = 3; i >= 0; i--) {
   		 if(i == 0) {
   			 returnValue[1] += man[i] * (int) -(Math.pow(2, 3-i));
   		 } else {
   			 returnValue[1] += man[i] * (int) Math.pow(2, 3-i);
   		 }
   	 }
   	 
   	 return returnValue;
    }
 public static int[] intToBinary(int a) {
   	 int[] returnValue = new int[8];
   	 int adder = 0;
   	 int positive = 0;
   	 
   	 if(a < 0) {
   		 positive = 1;
   	 }
   	 
   	 for(int i = 0; i < 8; i++) {
   		 if(adder == 1 && adder + (int) -(Math.pow(2, 7-i)) <= a) {
   			 returnValue[i] = 1;
   			 adder += (int) -(Math.pow(2, 7-i));
   			positive = 0;
   		 } else if(adder + (int) Math.pow(2, 7-i) <= a) {
   			 returnValue[i] = 1;
   			 adder += (int) Math.pow(2, 7-i);
   		 } else {
   			 returnValue[i] = 0;
   		 }
   	 }
   	 
   	 return returnValue;
    }
 public static int[] subArray(int[] a, int firstIncluded, int firstExcluded){
     int[] rV=null;
     if (firstIncluded>firstExcluded||firstExcluded>a.length||firstIncluded<0)
         return rV;
     rV  = new int[firstExcluded-firstIncluded];
     for (int i = firstIncluded; i<firstExcluded ; i++) {
         rV[i-firstIncluded] = a[i];
     }
     return rV;
 }

 public static int[] doubleToBinary(double a) {
   	 int[] twosComplement = new int[8];
   	 int[] returnValue = new int[8];
   	 int[] man = new int[4];
   	 int[] copy = new int[4];
   	 int[] exp = new int[4];
   	 int maximum = 0, val = 0, lastIndex = 0, count = 0;
   	 int x = (int) b / 1;

   	  twosComplement= intToBinary(x);
   	 
   	 for(int i = 0; i < 5; i++) {
   		 val = intValue(subArray(twosComplement, i, i+3));
   		 if(val > maximum) {
   			 maximum = intValue(subArray(twosComplement, i, i+3));
   			 copy = subArray(twosComplement, i, i+3);
   			 lastIndex = i+3;
   		 }     
   	 }
   	 
   	 man = copy;
   	 
   	 for(int i = lastIndex + 1; i < twosComplement.length - 1; i++) {
   		 exp[count] = twosComplement[i];
   	 }
   	 
   	 for(int i = 0; i < 8; i++) {
   		 if(i < 4) {
   			 returnValue[i] = man[i];
   		 } else if(i >= 4) {
   			 returnValue[i] = exp[i - 4];
   		 } else {
   			 returnValue[i] = -1;
   		 }
   	 }
   	 
   	 return returnValue;
    }


}

