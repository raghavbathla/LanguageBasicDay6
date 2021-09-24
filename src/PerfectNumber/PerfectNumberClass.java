package PerfectNumber;

import java.util.Scanner;

public class PerfectNumberClass {

    public static void main(String[] args)

    {
        System.out.println("Enter a number");
        int check=0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =1; i<=num/2; i++)
        {
        if(num%i==0)
        {
            check+=i;
        }

        }

        if (check==num){
            System.out.println("It is a Perfect Number");
        }
        else {
            System.out.println("It is not a perfect NUmber");
        }
    }
}
