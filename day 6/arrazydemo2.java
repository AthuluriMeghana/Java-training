import java.util.Arrays;
import java.util.Scanner;

public class arrazydemo2 {
  
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int sum=0;
        for (int val:arr) {
            if (val % 2 == 0) {
              sum += val;
              System.out.println(val+" ");
            }
        }
        System.out.println("Sum of even numbers: " + sum);
      }
      
    }

