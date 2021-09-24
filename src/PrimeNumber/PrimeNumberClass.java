package PrimeNumber;

import java.util.Scanner;

public class PrimeNumberClass {
    public static void main(String[] args) {
        int flag=0;
        System.out.println("Enter a Number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 0 || num == 1) {
            System.out.println("It is not a prime number");
        } else if (num == 2) {
            System.out.println("It is a prime number");
        }
        else {
            for (int i = 3; i <= num / 2; i = i + 2) {
                if (num % i == 0 ) {
                    System.out.println("It is not a prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("It is a prime number");
            }
        }
    }
}
