import java.util.Arrays;
import java.util.Scanner;

public class FizzBuzz {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Which number?: ");
    final int input = scanner.nextInt();

    String[] output = new String[input];

    for (int i = 0; i < output.length; i++) {
      int num = i + 1;
      if (num % 5 == 0 && num % 3 == 0) {
        output[i] = "fizzbuzz";
      } else if (num % 5 == 0) {
        output[i] = "fizz";
      } else if (num % 3 == 0) {
        output[i] = "buzz";
      } else {
        output[i] = Integer.toString(num);
      }
    }

    System.out.println(Arrays.toString(output));
  }
}
