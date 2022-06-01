package com.mycompany.javascuola;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class VotiEsame 
{
    final int []voti;
    public VotiEsame(int n){ voti = new int[n];}
    void GeneraVoti()
    {
        Random r = new Random();
        for(int i = 0;i < voti.length; i++)
        {
            voti[i] = 15+r.nextInt(16);
        }
        System.out.println("Vettpre generato!");
    }
    
    public void StampaVoti()
    {
        for(int i = 0;i < voti.length; i++)
        {
            System.out.println("Elemento in posizione: "+ i +":" + voti[i]);
        }
    }
    
    public static void main(String args[])
    {
        VotiEsame voto = null;
        int c;
        Scanner inu = new Scanner(System.in);
        System.out.println("Inserici quanti voti vuoi: max 16");
        c = inu.nextInt();
        voto.VotiEsame;
        voto.GeneraVoti();
        voto.StampaVoti();
    }
    
}
