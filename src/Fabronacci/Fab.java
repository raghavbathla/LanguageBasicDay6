package Fabronacci;

import java.util.Scanner;

public class Fab {
    private static void fab(int num){
        int n1 =0;
        int n2 = 1;
        System.out.print(n1+",");
        System.out.print(n2+",");
        for(int i=0; i <=num; i++)
        {
            System.out.print(n1+n2+",");
            int n3 = n1+n2;
            n1=n2;
            n2=n3;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Fab.fab(num);
    }

}
