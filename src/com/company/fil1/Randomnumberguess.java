package com.company.fil1;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Randomnumberguess {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        System.out.println("Guess a number");
        int thoughtno;

        int actualno=(int) Math.random();

            while(actualno!=thoughtno)
            {
                thoughtno=d.nextInt();
                System.out.println("guess again");
            }
        System.out.println("you are right");
        }
        System.out.println("bye bye");

    }
}
