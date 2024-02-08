import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        try
        {
            File file = new File("src/happyorsad.txt");
            Scanner scanner = new Scanner(file);
            String text = scanner.nextLine();

            int happyCount = 0;
            int sadCount = 0;

            for (int i = 0; i < text.length(); i++)
            {
                if (text.startsWith(":-)", i))
                {
                    happyCount++;
                }
                else if (text.startsWith(":-(", i))
                {
                    sadCount++;
                }
            }

            if (happyCount == 0 && sadCount == 0)
            {
                System.out.println("none");
            }
            else if (happyCount == sadCount)
            {
                System.out.println("unsure");
            }
            else if (happyCount > sadCount)
            {
                System.out.println("happy");
            }
            else
            {
                System.out.println("sad");
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch (NoSuchElementException e)
        {
            System.out.println("none");
        }
    }
}