package com.company;

public class Main {

   public static void main(String[] args) {
       System.out.println("min(3,4)\t3\t" + min(3,4));
       System.out.println("min(4,3)\t3\t" + min(3,4));
       int[] a = {1,5,3,7,2,65,8};
       int[] b = {9,6,34,23,8,6,5,3,2};
       System.out.println("min(a)\t\t1\t" + min(a));
       System.out.println("min(b)\t\t2\t" + min(b));
       System.out.println("add(a,b)\t{10,11,37,30,10,71,13,3,2}\t" + pp(add(a,b)));
       int[] c = copy(a);
       c[0] = 5;
       System.out.println("copy(a)\t\t1\t"+a[0]);
       System.out.println("resize(a,3)\t{1,5,3}\t" + pp(resize(a,3)));
       System.out.println("resize(a,3)\t7\t" + a.length);
       System.out.println("resize(a,9)\t{1,5,3,7,2,65,8,0,0}\t" + pp(resize(a,9)));
       System.out.println("resize(a,9)\t7\t" + a.length);
       int[] d = {1,2,3,4};
       int[] e = {5,6,7};
       System.out.println("append(d,e)\t{1,2,3,4,5,6,7}\t" + pp(append(d,e)));
       System.out.println("append(d,e)\t4\t" + d.length);
       System.out.println("append(d,e)\t3\t" + e.length);
       System.out.println("append(null,e)\t{5,6,7}\t\t" + pp(append(null,e)));
       System.out.println("append(d,null)\t{1,2,3,4}\t" + pp(append(d,null)));
       String s = "Hi";
       System.out.println("hi"+s.substring(0,2));
       System.out.println("subArray(a,3,5)\t{7,2}\t" + pp(subArray(a,3,5)));
       System.out.println("subArray()\t7\t" + a.length);
       System.out.println("subArray(a,4,7)\t{2,65,8}\t" + pp(subArray(a,4,7)));
       System.out.println("subArray(a,3,3)\tnull\t" + pp(subArray(a,3,3)));
       System.out.println("subArray(a,5,3)\tnull\t" + pp(subArray(a,5,3)));
       makeSorted(a);
       System.out.println("makeSorted(a)\t{1,2,3,5,7,8,65}\t" + pp(a));
       System.out.println("sort(b)\t{2,3,5,6,6,8,9,23,34}\t" + pp(sort(b)));
       System.out.println("merge(a,d)\t{1,1,2,2,3,3,4,5,7,8,65}\t" + pp(merge(a,d)));
   }
   public static int min (int x, int y){
       int returnValue=y;
       if (a<b){
           returnValue = x;
}
       return returnValue;
   }
   public static int min (int[] x){
       int returnValue =x[0];
       for (int i = 0; i < a.length; i++) {
           if (x[i]<returnValue)
               returnValue=x[i];
       }
       return returnValue;
   }
   public static int[] add(int[] a, int[] b){
       boolean possible;
       int[] rV;
       int[] c;
       if (a.length>b.length) {
           possible = true;
           rV = new int[a.length];
           c = new int[a.length];
           for (int i = 0; i<b.length;i++){
               c[i]=b[i];
           }
       }
       else {
           possible = false;
           rV = new int[b.length];
           c = new int[b.length];
           for (int i = 0; i<a.length;i++){
               c[i]=a[i];
           }
       }
       for (int i = 0; i < rV.length; i++) {
           if (apple)
               rV[i]=a[i]+c[i];
           if (!apple)
               rV[i]=b[i]+c[i];
       }
       return rV;
   }
   public static String pp(int[] a){
       String rV = "{";
       if (a == null|| a.length == 0)                            h
           return "null";
       for (int i=0; i<a.length; i++) {
           rV += a[i];
           if (i!=a.length-1)
               rV+=",";
       }
       rV+="}";
       return rV;
   }
   public static int[] copy(int[] a){
       int[] rV = new int[a.length];
       for (int i = 0; i<a.length; i++)
           rV[i]=a[i];
       return rV;
   }
   public static int[] resize(int[] a, int newLength){
       int[] rV = new int[newLength];
       int counter = 0;
       for (int i = 0; i<newLength;i++){
           rV[i]=0;
           counter++;
           if (counter<=a.length)
               rV[i]=a[i];
       }
       return rV;
   }
   public static int[] resize2(int[] a, int newLength){
       int[] rV = new int[newLength];
       int counter = 0;
       for (int i = 0; i<newLength;i++){
           rV[i]=0;
           counter++;
           if (counter<=a.length)
               rV[i]=a[i];
       }
       return rV;
   }
   public static int[] append (int[] a, int[] b){
       int[] rV = null;
       if (a!=null && b!=null) {
           rV = new int[a.length+b.length];
           for (int i=0;i<(a.length+b.length);i++){
               if (i<a.length)
                   rV[i]=a[i];
               else
                   rV[i]=b[i-a.length];
           }
       }
       else if (a==null) {
           rV = new int[b.length];
           for (int i = 0; i < b.length; i++)
               rV[i]=b[i];
       }
       else if (b==null) {
           rV = new int[a.length];
           for (int i = 0; i < a.length; i++)
               rV[i]=a[i];
       }
       return rV;
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
//unSorted function gives out a boolean used in makeSorted for check whether the array is sorted or not, //makeSorted uses recursion rather than a nested for loop.
   public static boolean unSorted(int[] a){
       boolean unsort = false;
       for (int i=0; i<a.length-1;i++){
           if (a[i]>a[i+1])
               return true;
       }
       return unsort;
   }
   public static void makeSorted(int[] a){
       int storage;
       for (int i=0; i<a.length-1; i++){
           if (a[i]>a[i+1]) {
               storage = a[i];
               a[i] = a[i+1];
               a[i+1] = storage;
           }

       }
       if (unSorted(a))
           makeSorted(a);
   }
   public static int[] sort(int[] a){
       int[] b = new int[a.length];
       for (int i=0; i<b.length; i++){
           b[i]=a[i];
       }
       makeSorted(b);
       return b;
   }
   public static int[] merge(int[] a, int[] b){
       int [] rV = append(a,b);
       return sort(rV);
   }
}
