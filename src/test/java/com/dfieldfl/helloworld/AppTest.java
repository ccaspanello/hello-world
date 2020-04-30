package com.dfieldfl.helloworld;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
  /**
   * Rigorous Test :-)
   */
  @Test
  public void shouldAnswerWithTrue()
  {
    assertTrue( true );
  }

  @Test
  public void failTestWithException() {
    System.out.println( "Hello World!" );

    // 1 minute worth of exceptions
    int times = 6;
    System.out.format("running errors %d times\n", times);
    for(int i = 0; i < times; i++) {
      try {
        System.out.format("test iteration %d\n", i);
        Thread.sleep(10000);
        throw new ClassCastException();
      } catch ( Exception e ) {
        // swallowed
      }
    }
  }
}
