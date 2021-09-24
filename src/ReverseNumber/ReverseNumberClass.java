package ReverseNumber;

import java.util.Scanner;

public class ReverseNumberClass {
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt(), reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
