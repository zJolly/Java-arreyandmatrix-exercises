package com.mycompany.cleantop;
import java.util.Scanner;
//import java.util.vettore;
import java.io.*;

public class main1 
{
    public static void main(String[] args)
    {
        vettore depositi = new vettore();
        vettore prelievi = new vettore();
        int sw, quit = 0, p=0, d=0;
        double saldo;
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Quanto saldi inizale hai:");
        saldo = tastiera.nextDouble();
        System.out.println("Quante volte devi prelevare:");
        prelievi.set_vettore();
        System.out.println("Quante volte devi depositare:");
        depositi.set_vettore();
        for(;;)
        {
            System.out.println("Cosa vuoi fare:");
            System.out.println("1- Prelevare");
            System.out.println("2- Depositare");
            System.out.println("3- Saldo");
            System.out.println("*- Uscire");
            sw = tastiera.nextInt();
            switch(sw)
            {
                case 1:
                    if(p < prelievi.dim )
                    {
                        System.out.println("Inerisci l'importo: ");
                        prelievi.punta_vettore(p);
                        p++;
                    }
                    else 
                    {
                        System.out.println("Hai fatto troppe operazioni!!!");
                    }
                    break;
                case 2:
                    if(d < depositi.dim)
                    {
                        System.out.println("Inerisci l'importo: ");
                        depositi.punta_vettore(d);
                        d++;   
                    }
                    else 
                    {
                        System.out.println("Hai fatto troppe operazioni!!!");
                    }
                    break;
                case 3:
                    int totp=0, totd=0, mom;
                    for(int i=0; i < prelievi.dim; i++)
                    {
                        mom = prelievi.vet[i];
                        totp =  totp+mom;
                    }
                    for(int i=0; i < depositi.dim; i++)
                    {
                        mom = depositi.vet[i];
                        totd =  totd+mom;
                    }
                    saldo = saldo + totd - totp;
                    System.out.println("Questo è il tuo saldo finale: "+ saldo+ "€");
                    break;
                default:
                    quit = 1;
            }
            if(quit == 1)
            {
                System.out.println("Arrivederci!!!!");
                break;
            }
        }
    }
}
