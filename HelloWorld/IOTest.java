import java.io.IOException;

public class IOTest
{
    public static void main(String[] args) 
    {
        char inputCh;
        System.out.println("Type something");
        try
        {
        	inputCh = (char)System.in.read();
        	System.out.println("U typed: " + inputCh);
        }
        catch (IOException e)
        {
        	System.out.println("So, it's a Error. Type something normal.");
        }
    }
}