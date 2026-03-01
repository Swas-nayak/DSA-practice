
//Move Zeros to End: Given an array, move all 0s to the end while maintaining the relative order of non-zero elements.
import java.util.Scanner;

public class MoveZeroEnd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int count = 0;
    for (int i = 0; i < size; i++) {
      if (arr[i] != 0)
        arr[count++] = arr[i];

    }
    while (count < size) {
      arr[count++] = 0;
    }
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}
