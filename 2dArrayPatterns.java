public class Main {

    public static void main(String[] args) {
      	 int[][] example = new int[10][10];
   	 
   	 for(int i = 0; i < a.length; i++) {
   		 for(int j = 0; j < a[i].length; j++) {
   			 a[i][j] = (i*10) + j;
   		 }
   	 }
   	 
   	 System.out.println(pp2dInt(example));
   	 
System.out.println();
   	 
      	 String[][] task2 = new String[10][10];
   	 
   	 for(int i = 0; i < task2.length; i++) {
   		 for(int j = 0; j < b[i].length; j++) {
   			 b[i][j] = i + "-" + j;
   		 }
   	 }
   	 
   	 System.out.println(pp2dString(task2));
   	 System.out.println();
   	 
      	 int[][] Task3 = new int[10][10];
   	 
   	 for(int i = 0; i < Task3.length; i++) {
   		 for(int j = 0; j < Task3[i].length; j++) {
   			 if(i % 2 != 0) {
   				 Task3[i][j] = j % 2;
   			 } else if(i % 2 == 0){
   				 Task3[i][j] = (j+1) % 2;
   			 }
   		 }
   	 }
   	 
   	 System.out.println(pp2dInt(Task3));

   	 System.out.println();
   	 
   	 
   	 String[][] Task4 = new String[5][];
   	
int recorder= 0;
   	 
   	 for(int i = 0; i < Task4.length; i++) {
   		 Task4[i] = new String[i+1];
   		 for(int j = 0; j < Task4[i].length; j++) {
   			 d[i][j] = intToLetter(recorder);
   			 //int to letter used as external f(x);
count++;\
			//System.in;
   		 }
   	 }
   	 
   	 System.out.println(pp2dString(Task4));
   	 System.out.println(); // add line
    }
    
   
    public static String pp2dInt(int[][] b) {
   	 String rv = "";
   	 
   	 rv += "{";
   	 
   	 for(int i = 0; i < b.length; i++) {
   		 
   		 if(i == 0) {
   			 rv += "{";
   		 } else {
   			 rv += " {";
   		 }
   		 
   		 for(int j = 0; j < b[i].length; j++) {
   			 if(j == b[i].length - 1) {
   				 rv += b[i][j];
   			 } else {
   				 rv += b[i][j] + ",";
   			 }
   		 }
   		 
   		


 if(i != b.length - 1) {
   			 rv += "},";
   		 } else {
   			 rv += "}";
   		 }
   		 
   		 if(i >= 0 && i < a.length - 1) {
   			 rv += "\n";
   		 }
   	 }
   	 
   	 rv += "}";
   	 
   	 return rv;
    }
    
        public static String pp2dDouble(double[][] subF) {
   	 String rv = "";
   	 
   	 rv += "{";
   	 
   	 for(int i = 0; i < subF.length; i++) {
   		 
   		 if(i == 0) {
   			 rv += "{";
   		 } else {
   			 rv += " {";
   		 }
   		 
   		 for(int j = 0; j <subF[i].length; j++) {
   			 if(j == subF[i].length - 1) {
   				 rv += subF[i][j];
   			 } else {
   				 rv += subF[i][j] + ",";
   			 }
   		 }
   		 
   		 if(i != subF.length - 1) {
   			 rv += "},";
   		 } else {
   			 rv += "}";
   		 }
   		 
   		 if(i >= 0 && i < subF.length - 1) {
   			 rv += "\n";
   		 }
   	 }
   	 
   	 rv += "}";
   	 
   	 return rv;
    }
    
        public static String pp2dString(String[][] a) {
   	 String returnValue = "";
   	 
   	 returnValue += "{";
   	 
   	 for(int i = 0; i < a.length; i++) {
   		 
   		 if(i == 0) {
   			 returnValue += "{";
   		 } else {
   			 returnValue += " {";
   		 }
   		 
   		 for(int j = 0; j < a[i].length; j++) {
   			 if(j == a[i].length - 1) {
   				 returnValue += a[i][j];
   			 } else {
   				 returnValue += a[i][j] + ",";
   			 }
   		 }
   		 
   		 if(i != a.length - 1) {
   			 returnValue += "},";
   		 } else {
   			 returnValue += "}";
   		 }
   		 
   		 





if(i >= 0 && i < a.length - 1) {
   			 returnValue += "\n";
   		 }
   	 }
   	 
   	 rv += "}";
   	 
   	 return rv;
    }
    
      public static String intToLetter(int subF) {
   	 String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
   	 
   	 String returnValue = letters[subF];
   	 
   	 return returnValue;
    }
}
