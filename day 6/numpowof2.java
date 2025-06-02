import java.util.Scanner;
public class numpowof2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number: ");
    int n=sc.nextInt();
    if(n > 0 && (n & (n-1)) == 0) {
        System.out.println(n + " is a power of 2");
    } else {
        System.out.println(n + " is not a power of 2");
    }
  }
}
