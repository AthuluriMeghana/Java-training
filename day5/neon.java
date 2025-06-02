public class neon {
  public static void main(String[] args) {
        int number = 9;
        int square = number * number;
        int sum = 0;

        while (square > 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is a Neon Number.");
        } else {
            System.out.println(number + " is not a Neon Number.");
        }
    }
}
