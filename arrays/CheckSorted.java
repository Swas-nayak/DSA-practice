
//Check if Array is Sorted: Determine if every element is $\le$ the next one.
import java.util.*;

public class CheckSorted {

  public static boolean sorted(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1])
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    if (sorted(arr)) {
      System.out.println("Sorted");
    } else
      System.out.println("Not Sorted");
    sc.close();
  }
}
