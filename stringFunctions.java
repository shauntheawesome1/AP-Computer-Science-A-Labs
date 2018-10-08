class Main {
public static void main(String[] args) {
 System.out.println(spaceCount("Hello mates"));
 System.out.println(vowelCount("Hello mates"));
 System.out.println(letterCount("Hello mates","l"));
 System.out.println(beforeString("Hello mates", "ma"));
 System.out.println(afterString("Hello mates", "lo"));
 System.out.println(capVowel("Hello mates"));
 System.out.println(spaceCount("Hello mates"));
 System.out.println(capFirstWord("Hello mates"));
}
public static int spaceCount(String s){
   int countSpace = 0;
   //string blankSpace = " ";
 for (int i = 0; i <s.length(); i++){
   String finder = s.substring(i, i+1);
   if (finder.compareTo(" ") == 0){
     countSpace = countSpace + 1;
   }
 }
 return countSpace;
}
public static int vowelCount(String s){
 int countVowel = 0;
 for(int j =0; j <s.length();j++){
   String vowelFinder = s.substring(j, j + 1);
   if (vowelFinder.compareTo("a") == 0 || vowelFinder.compareTo("e") == 0 || vowelFinder.compareTo("i") == 0 || vowelFinder.compareTo("o") == 0 || vowelFinder.compareTo("u") == 0)  {
     countVowel = countVowel + 1;
     }
 }
 return countVowel;
}
public static int letterCount(String s, String certainLetter){
 int sameLetter = 0;
 for(int k =0; k <s.length();k++){
   String vowelFinder = s.substring(k, k + 1);
   if (vowelFinder == certainLetter){
     sameLetter = sameLetter + 1;
   }

}
return sameLetter;
}

public static String beforeString (String s, String substr){
int x = s.indexOf(substr);
if(x == -1){
  return s;
}
else
return s.substring(0,x);
}
public static String afterString (String s, String substr){
int y = s.indexOf(substr);
String blankString = " ";
if(y == -1){
  return blankString;
}
else
return s.substring(y);
}
public static String capVowel(String s){
String buff = "";
for(int k = 0; k <s.length();k++){
  String checker = s.substring(k, k+1).toLowerCase();
  if(checker.compareTo("a")==0||checker.compareTo("e")==0||checker.compareTo("e")==0||checker.compareTo("i")==0||checker.compareTo("o")==0||checker.compareTo("u")==0){
    buff = buff + checker.toUpperCase();
  }
  else{
    buff = buff + checker;
  }
}
return buff;
}
public static String capFirstWord(String s){
String buff = "";
boolean indicator = false;
for (int j = 0; j <s.length();j++){
 
String checker = s.substring(j, j+1).toLowerCase();
  if (j == 0){
    buff = buff + checker.toUpperCase();
    //Continue; // for the if statement
  }
  if(checker.compareTo(".")==0){
    buff = buff + checker;
  }
  else{
    if(indicator){
      if(checker.compareTo(" ") == 0){ // 0 if comparison is the same
        buff = buff + checker; // buff is input, checker is string 2
      }
      else{
        buff = checker.toUpperCase();
        indicator = false;
      }
    }
    else{
      buff = buff + checker;
    }
  }
}
return buff;
}

}
