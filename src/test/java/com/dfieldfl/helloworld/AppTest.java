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

    try {
      Thread.sleep(10000);
      throw new IndexOutOfBoundsException();
    } catch ( Exception e ) {
      // swallowed
    }
  }
}
