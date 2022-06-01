package com.mycompany.cleantop;
import java.util.Scanner;
import java.io.*;


public class vettore 
{
    public int[] vet = new int[50];
    public int dim;

    
    public void set_vettore()
    {
        Scanner tastiera = new Scanner(System.in);
        int g;
        //System.out.println("Quanto grande vuoi il vettore:");
        g = tastiera.nextInt();
        this.dim = g;
        int[] vet = new int[g];
        for(int i=0;i < g;i++)
        {
            vet[i] = 0;
        }
    }
    public int[] get_vettore(){return this.vet;}
    public void visual_vettore()
    {
        for(int i=0; i < this.dim; i++)
        {
            System.out.print(vet[i]+" ");
        }
    }
    public void punta_vettore(int punta)
    {
        Scanner tastiera = new Scanner(System.in);
        vet[punta] = tastiera.nextInt();
    }
}
