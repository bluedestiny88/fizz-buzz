package com.tlglearning;


import java.util.Set;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

  @Test
  void valueOf()  {
    assert Set.of(FizzBuzz.FIZZ).equals(FizzBuzz.valueOf(6));
  }
}
