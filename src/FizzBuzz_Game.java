/**
 * Created by Omri on 30/12/2017.
 */
public class FizzBuzz_Game {

    String gameOutput;

    public String FizzBuzz(int n)
    {
        gameOutput = "";

        for(int i=1; i<=n; i++)
        {
            gameOutput += output_at(i);
        }
        return gameOutput;
    }

    public String output_at(int n)
    {
        if(n%3 == 0) {
            if(n%5 == 0) return "FizzBuzz, ";
            else  return "Fizz, ";
        }
        else
        if(n%5 == 0)
            return "Buzz, ";
        else
            return n + ", ";
    }
}
