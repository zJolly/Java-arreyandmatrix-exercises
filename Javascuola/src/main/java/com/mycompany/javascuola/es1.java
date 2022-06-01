package com.mycompany.javascuola;
import java.io.*;
import java.util.Scanner;

public class es1    
{
    public static void main(String args[])
    {
        int a ,b,c,d = 0;
        //BufferedReader tastiera = new BufferedReader(System.in);
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci a:");
        a = tastiera.nextInt();
        if(a > 0)
        {
            d++;
        }
        System.out.println("Inserisci b:");
        b = tastiera.nextInt();
        if(b > 0)
        {
            d++;
        }
        System.out.println("Inserisci c:");
        c = tastiera.nextInt();
        if(c > 0)
        {
            d++;
        }
        System.out.println("Sono "+d+" numeri positivi !");
    }
}
