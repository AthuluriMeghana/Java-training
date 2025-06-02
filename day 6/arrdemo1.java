import java.util.Scanner;
import java.util.Arrays;

public class arrdemo1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size:");
    int size=sc.nextInt();
    int a[]=new int[size];
    for (int i=0;i<size;i++){
      a[i]=sc.nextInt();
      
    }
    System.out.println(Arrays.toString(a));
  }
}