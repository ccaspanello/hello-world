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
    try {
      throw new IndexOutOfBoundsException();
    } catch ( Exception e ) {
      // swallowed
    }
  }
}
