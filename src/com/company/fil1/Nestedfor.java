package com.company.fil1;

public class Nestedfor {
    public static void main(String[] args)
    {
        int count=5;
        for(int i=5;i>=1;i--)
        {
            for(int j=count;j>=1;j--)
            {
                System.out.print(i+" ");
            }
            count--;
            System.out.println();
        }
    }
}
