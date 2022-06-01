package com.mycompany.cleantop;
import java.util.Scanner;
import java.io.*;


public class main3 {
    
    public static void main(String[] args)
    {
        int sw, quit=0, punta_n,punta_v, ns=0,nv=0;
        Scanner tastiera= new Scanner(System.in);
        matrice matr = new matrice();
        System.out.println("Quanti studenti e voti x studente ti servono:");
        matr.set_matrice();
        System.out.println("Quanti studenti hai:");
        punta_n = tastiera.nextInt();
        String[] nome_stud = new String[punta_n];
        for(;;)
        {
            System.out.println("Cosa vuoi fare:");
            System.out.println("1- Inserire studente");
            System.out.println("2- Inserire voti studente");
            System.out.println("3- Eliminare uno studente");
            System.out.println("4- Cancellare un voto di uno studente");
            System.out.println("5- Visualizzare voti studente");
            System.out.println("6- Visualizzare voti di tutti gli sudenti");
            System.out.println("*- Uscire");
            sw = tastiera.nextInt();
            switch(sw)
            {
                case 1:
                    System.out.println("Inserisci il nome del nuovo studente:");
                    nome_stud[ns] = tastiera.next();
                    ns++;
                    break;
                case 2:
                    System.out.println("Inserisci matricola studente:");
                    punta_n = tastiera.nextInt();
                    System.out.print("Voti attuali dello studente: ");
                    for(int y=0; y < matr.dim2; y++)
                    {
                        if(matr.mat[punta_n][y] == 0)
                        {
                            System.out.print("x ");
                        }
                        else 
                        {
                            System.out.print(matr.mat[punta_n][y]);
                            nv++;
                        }
                        System.out.println(" ");
                    }
                    System.out.println("Inserisci voto dello studente:");
                    matr.mat[punta_n][nv] = tastiera.nextInt();
                    break;
                case 3:
                    System.out.println("Inserisci matricola dello studente che vuoi eliminare:");
                    punta_n = tastiera.nextInt();
                    nome_stud[punta_n] = "/";
                    for(int y=0; y < matr.dim2; y++)
                    {
                        matr.mat[punta_n][y] = 0;   
                    }   
                    System.out.println("Studente eliminato con successo!!!");
                    break;
                case 4:
                    System.out.println("Inserisci matricola dello studente per eliminare i suoi voti:");
                    punta_n = tastiera.nextInt();
                    System.out.print("Voti attuali dello studente: ");
                    for(int y=0; y < matr.dim2; y++)
                    {
                        if(matr.mat[punta_n][y] == 0)
                        {
                            System.out.print("x ");
                        }
                        else 
                        {
                            System.out.print(matr.mat[punta_n][y]);
                            nv++;
                        }
                    }
                    System.out.println(" ");
                    System.out.println("Inserisci quale voto vuoi eliminare: ");
                    punta_v = tastiera.nextInt()-1;
                    matr.mat[punta_n][punta_v] = 0;
                    break;
                case 5:
                    System.out.println("Inserisci la matricola dello studente:");
                    punta_n = tastiera.nextInt();
                    System.out.println("Nome:"+nome_stud[punta_n]);
                    System.out.print("Voti: ");
                    for(int j=0; j < matr.dim2;j++)
                    {
                        System.out.print(matr.mat[punta_n][j]+" ");
                    }
                    System.out.println(" ");
                    break;
                case 6:
                    System.out.println("Elenco studenti e voti: ");
                    matr.visual_matrice(nome_stud);
                    break;
                default:
                    quit=1;
            }
            if(quit == 1)
            {
                System.out.print("Arrivederci");
                break;
            }
        }
        
        
    }
    
}
