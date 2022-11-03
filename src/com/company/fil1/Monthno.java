package com.company.fil1;
import java.util.Scanner;

public class Monthno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number from(1-12)");
        int b= sc.nextInt();
        switch(b)
        {
            case 1:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 12:
                System.out.println("31 days");
                break;
            default:
                System.out.println("invalid option");
                break;
        }
        System.out.println("how about this now");

    }
}
