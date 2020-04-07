package com.dfieldfl.helloworld;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        for(int i = 0; i < 100; i++) {
          try {
            Thread.sleep(10000);
            throw new NullPointerException("whoops");
          } catch(Exception e) {
            //swallow
          }
        }
    }
}
