public class arraydemo6 {
    public static void main(String[] args) {
        int[] arr = {4, 33, 29, 1, 5};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second maximum found.");
        } else {
            System.out.println("Second maximum element in the array: " + secondMax);
        }
    }
}
