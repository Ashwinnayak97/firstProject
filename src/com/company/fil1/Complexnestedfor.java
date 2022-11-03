package com.company.fil1;

public class Complexnestedfor {
    public static void main(String[] args) {
        int count=3;
        for(int i=1;i<=5;i++)
        {
            if(i%2==0)
            {
                for(int j=1;j<=count;j++)
                {
                    System.out.print("*"+" ");
                }
                System.out.println();
                count++;
            }
            else
            {
                System.out.println("*");
            }
        }
        System.out.println("task completed");
    }
}
