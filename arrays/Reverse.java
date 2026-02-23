
//Reverse an Array: Reverse the order of elements in-place (without using a second array).
import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Take input for the number of elements and the elements themselves
    System.out.println("Enter the number of elements:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter the elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    // Reverse the array in-place
    System.out.println("Reversed array:");
    for (int i = n - 1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }

    sc.close();
  }

}
