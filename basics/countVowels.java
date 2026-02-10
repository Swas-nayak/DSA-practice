package basics;
//Program to count vowels in a string (Iterative and Recursive)
// Given a string, count the total number of vowels (a, e, i, o, u) in it. There are two methods to count total number of vowels in a string. 
// Iterative 
// Recursive


//1. Iterative Method:
public class countVowels {
  public static int vowelCount(String str){
    int count =0;
    for(int i=0; i<str.length(); i++){
      char ch = str.charAt(i);
      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
         ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
        count++;
      }
    }
    return count;
  }
  public static void main(String args[]){
    String str ="Hello World";
    System.out.println("Total number of vowels in the string:"+vowelCount(str));
    }
}
