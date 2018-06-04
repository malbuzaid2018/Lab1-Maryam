package hw;

public class FizzBuzz {

  public static void fizzbuzz(int num) {
    for (int i=1; i<num; i++) {
      if ((i%3 == 0) && (i%5 == 0)) {
        System.out.println("fizz buzz");
      } else if (i%3 == 0) {
        System.out.println("fizz");
      } else if (i%5 == 0) {
        System.out.println("buzz");
      } else {
        System.out.println(i);
      }
    }
  }

}
