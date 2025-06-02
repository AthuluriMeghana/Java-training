public class arraydemo4 {
  public static void main(String[] args) {
    int[] arr = {4, 33, 29, 1, 5};
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }   
    System.out.println( max); 
  }
  
} 
