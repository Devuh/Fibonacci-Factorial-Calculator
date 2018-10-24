import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choice = 0;
        Scanner input = new Scanner(System.in);
        int num = 0;

        while(choice != 100)
        {

            printMenu();
            choice = input.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter a number: ");
                    num = input.nextInt();
                    num = fibonacci(num);
                    System.out.println("\nFibonacci value is " + num + "\n");
                    break;

                case 2:
                    System.out.println("Enter a number: ");
                    num = input.nextInt();
                    num = factorial(num);
                    System.out.println("\nFactorial value is " + num + "\n");
                    break;

                case 3:
                    System.out.println("Exiting...");
                    choice = 100;
                    break;

                default:
                    System.out.println("Incorrect Value");
                    break;
            }

        }

    }

    public static void printMenu()
    {

        System.out.println("Choose your option");
        System.out.println("(1)Fibonacci Value\n(2)Factorial Value\n(3)Exit");

    }

    public static int factorial(int n)
    {

        if(n == 0 || n == 1)
        {

            return n;

        }else
        {

            return n * factorial(n - 1);

        }

    }

    public static int fibonacci(int n)
    {

        if(n == 0 || n == 1)
        {

            return 1;

        }
        else
        {

            return fibonacci(n - 1) + fibonacci(n - 2);

        }

    }

}
