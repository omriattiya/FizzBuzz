import org.junit.Before;
import org.junit.Test;
import junit.framework.*;

import static org.junit.Assert.assertEquals;

public class TestFizzBuzz {

    FizzBuzz_Game game;

    @Before
    public void setUp(){
        game = new FizzBuzz_Game();
    }


    //The most basic case for Fizz
    @Test
    public void base_test_divided_by_3()
    {
        assertEquals("1, 2, Fizz, ", game.FizzBuzz(3));
    }

    //The most basic case for Buzz
    @Test
    public void base_test_divided_by_5()
    {
        assertEquals("1, 2, Fizz, 4, Buzz, ", game.FizzBuzz(5));
    }


    //The most basic case for FizzBuzz
    @Test
    public void base_test_divided_by_15()
    {
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, " +
                "FizzBuzz, ", game.FizzBuzz(15));
    }

    //Checking High Numbers
    @Test
    public void test_high_numbers_90_to_99()
    {
        assertEquals("FizzBuzz, ", game.output_at(90));
        assertEquals("91, ", game.output_at(91));
        assertEquals("92, ", game.output_at(92));
        assertEquals("Fizz, ", game.output_at(93));
        assertEquals("94, ", game.output_at(94));
        assertEquals("Buzz, ", game.output_at(95));
        assertEquals("Fizz, ", game.output_at(96));
        assertEquals("97, ", game.output_at(97));
        assertEquals("98, ", game.output_at(98));
        assertEquals("Fizz, ", game.output_at(99));
    }

    //Testing the last case -> מקרה קצה
    @Test
    public void test_last_case_100()
    {
        assertEquals("Buzz, ", game.output_at(100));
    }

    //The requirements are number between 2 to 100 - checking the upper limit
    @Test
    public void test_more_then_upper_limit()
    {
        assertEquals("ERROR", game.FizzBuzz(101));
        assertEquals("ERROR", game.FizzBuzz(1000));
        assertEquals("ERROR", game.FizzBuzz(102));
    }

    //The requirements are number between 2 to 100 - checking the bottom limit
    @Test
    public void test_less_then_bottom_limit()
    {
        assertEquals("ERROR", game.FizzBuzz(1));
        assertEquals("ERROR", game.FizzBuzz(0));
        assertEquals("ERROR", game.FizzBuzz(-1));
    }
}
