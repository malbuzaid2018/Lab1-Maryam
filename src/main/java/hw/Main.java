package hw;

import java.util.Arrays;

public class Main {

  public static void main(final String[] args) {
    int num = 0;

    if (args.length > 0) {
      try {
        num = Integer.parseInt(args[0]);
        if (num < 0) {
          System.err.println("The argument entered cannot a negative integer");
        }
        else {
          FizzBuzz.fizzbuzz(num);
        }
      }
      catch(NumberFormatException e) {
        System.err.println("The argument entered must be an integer");
        System.exit(1);
      }
    }
    else {
      System.out.println("No command line arguments found");
    }
  }
}
