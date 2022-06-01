package com.mycompany.javascuola;
import java.io.*;

public class testReader 
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader n = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(n);
        String nome, cognome;
        System.out.println("Inserisci nome: ");
        nome = tastiera.readLine();
        System.out.println("Inserisci cognome: ");
        cognome = tastiera.readLine();
        System.out.println(nome+" "+cognome);    
    }  
}
