package College;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\n--------------------");
            System.out.println("1.GCD & LCM ");
            System.out.println("2.Fibonacci Series");
            System.out.println("3.Reverse number");
            System.out.println("4.Addition of number 1+2+3..+(n-1)");
            System.out.println("5.Exit");
            System.out.print("Enter your choice : ");
            int ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter 1st numbers : ");
                    int a = in.nextInt();
                    System.out.print("Enter 2nd numbers : ");
                    int b = in.nextInt();
                    int gcd = gcdlcm(a, b);
                    int lcm = (a * b) / gcd;
                    System.out.println("LCM and GCD of given numbers are "+lcm+" and "+gcd+" Respectively");
                    break;
                
                case 2:
                    System.out.print("Enter a number : ");
                    int number = in.nextInt();
                    System.out.print("Fibonacci series : ");
                    for (int i = 1; i <= number; i++)
                    {
                    System.out.print(fibonacci2(i) + " ");
                    }
                    break;
                
                case 3:
                    System.out.print("Enter a number : ");
                    int num = 0;
                    num=in.nextInt();
                    System.out.print("Reverse of the input number is : ");
                    reverse(num);
                    break;
                
                case 4:
                    System.out.print("Enter a number : ");
                    int c=in.nextInt();
                    System.out.println("Sum of 1+2+3+...+"+c+" : "+summetion(c));
                    break;
                
                case 5:
                    System.out.println("......Exit......");
                    System.exit(0);
            }
        }
    }

    public static int gcdlcm(int n, int m) {
        if (m == 0) {
            return n;
        } else {
            return gcdlcm(m, n % m);
        }
    }
    
    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static int fibonacci2(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 3; i <= number; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci; 
    }

    public static void reverse(int n){
        if (n < 10) {
            System.out.println(n);
            return;
            }
            else {
                System.out.print(n % 10);
                reverse(n/10);
            }
    }
    
    public static int summetion(int n){
        if (n != 0){
        return n + summetion(n - 1);
        }
        else
        {
            return n;
        }
    }
}

