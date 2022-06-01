package com.mycompany.javascuola;
import java.io.*;
import java.util.Scanner;

public class es2 {
     public static void main(String args[])
    {
        int a[], n, out = 0;
        float prodotto, totale;
        Scanner tastiera = new Scanner(System.in);
        for(;;)
        {
            System.out.println("Inserici il prezzo del prodotto: ");
            prodotto = tastiera.nextFloat();
            System.out.println("Quanti prodotti vuoi: /max 100/");
            n = tastiera.nextInt();
        
            totale = prodotto*n;
            if(totale >= 200)
            {
                totale = (float) (totale - totale*0.2);
            }
            System.out.println("Devi pagare: "+totale+" €");
            System.out.println("Vuoi acquistare ancora?");
            System.out.println("1/ Next");
            System.out.println("0/ Exit");
            out = tastiera.nextInt();
            if(out == 0) 
            {
                break;
            }        
        }
    }
    
}
