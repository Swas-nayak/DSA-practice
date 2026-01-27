public class numPlaindrome{
  public static void main(String[] args){
    int num =12321;
    if(isPalindrome(num)){
      System.out.println(num+"is a palindrome");
    }
    else
    System.out.println(num+ " is not palindrome");
  }
  public boolean isPalindrome(int num){
    int og = Math.abs(num);
    int reverse =0;
    while(og != 0){
      reverse = (reverse*10)+ (og%10);
      og = og/10;

    }
    return (reverse == Math.abs(num));

  }
}