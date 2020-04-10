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
    for(int i = 0; i < 6; i++) {
      try {

        Thread.sleep(10000);
        throw new IndexOutOfBoundsException();
      } catch ( Exception e ) {
        // swallowed
      }
    }
  }
}
