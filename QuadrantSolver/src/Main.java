import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("X: ");
        int x = scan.nextInt();
        System.out.println("Y: ");
        int y = scan.nextInt();

        if (x > 0 && y > 0)
        {
            System.out.println("Quadrant 1");
        }
        else if (x < 0 && y > 0)
        {
            System.out.println("Quadrant 2");
        }
        else if (x < 0 && y < 0)
        {
            System.out.println("Quadrant 3");
        }
        else if (x > 0 && y < 0)
        {
            System.out.println("Quadrant 4");
        }
        else
        {
            if (x == 0 && y > 0)
            {
                System.out.println("Between 1 & 2");
            }
            else if (x == 0 && y < 0)
            {
                System.out.println("Between 3 & 4");
            }
            else if (y == 0 && x > 0)
            {
                System.out.println("Between 1 & 4");
            }
            else if (y == 0 && x < 0)
            {
                System.out.println("Between 2 & 3");
            }
            else
            {
                System.out.println("Origin");
            }
        }
    }
}