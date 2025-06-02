public class arraydemo5 {
  public static void main(String[] args) {
    int[] arr = {4, 33, 29, 1, 5};
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }   
    System.out.println( min); 
  }
  
} 

