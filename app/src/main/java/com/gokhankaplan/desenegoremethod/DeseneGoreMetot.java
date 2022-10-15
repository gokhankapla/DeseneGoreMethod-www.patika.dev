package com.gokhankaplan.desenegoremethod;

import java.util.Scanner;

public class DeseneGoreMetot{

    static boolean state=true;
    static int counter=0;
    public static int desenMetodu(int a)
    {
        if(state==true && a>0)
        {
            System.out.print(a+" ");
            a-=5;
            counter++;
            return desenMetodu(a);
        }
        else
        {
            state=false;

            counter--;
            System.out.print(a+" ");
            a+=5;
            if(counter==0)
            {
                System.out.print(a);
                return 1;
            }
            else
            {
                return desenMetodu(a);
            }
        }

    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int number = input.nextInt();
        int number2=number;

        desenMetodu(number);
    }
}
