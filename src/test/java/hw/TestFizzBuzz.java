 package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestFizzBuzz {

  private FizzBuzz fixture;

  @Before
  public void setUp() throws Exception {
    fixture = new FizzBuzz();
  }

  @After
  public void tearDown() throws Exception {
    fixture = null;
  }

  @Test
  public void testNegativeTen() {
    String[] expectedVals = {"You must enter a positive integer > 0"};
    assertArrayEquals(expectedVals, fixture.fizzBuzz(-10));
  }

  @Test
  public void testNegativeOne() {
    String[] expectedVals = {"You must enter a positive integer > 0"};
    assertArrayEquals(expectedVals, fixture.fizzBuzz(-1));
  }

  @Test
  public void testZero() {
    String[] expectedVals = {"You must enter a positive integer > 0"};
    assertArrayEquals(expectedVals, fixture.fizzBuzz(0));
  }

  @Test
  public void testOne() {
    String[] expectedVals = {};
    assertArrayEquals(expectedVals, fixture.fizzBuzz(1));
  }

  @Test
  public void testSeven() {
    String[] expectedVals = {"1", "2", "fizz", "4", "buzz", "fizz"};
    assertArrayEquals(expectedVals, fixture.fizzBuzz(7));
  }

  @Test
  public void testSeventeen() {
    String[] expectedVals = {"1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizz buzz", "16"};
    assertArrayEquals(expectedVals, fixture.fizzBuzz(17));
  }
}
