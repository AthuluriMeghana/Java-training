
public class arrdemo3 {
  public static void main(String[] args) {
    int[] a ={2,3, 4};
    int[] b = {4, 5};
    int[] c = new int[a.length];
    for (int i = 0; i < a.length; i++) {
        if (i < b.length) {
            c[i] = a[i] * b[i];
        } else {
            c[i] = a[i];
        }
    }
    System.out.print("c = [");
    for (int i = 0; i < c.length; i++) {
        System.out.print(c[i]);
        if (i < c.length - 1) System.out.print(", ");
    }
    System.out.println("]");
  }
}
