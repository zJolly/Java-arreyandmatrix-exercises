package com.mycompany.cleantop;
import java.io.*;
import java.util.Random;

public class main2 {
    
    public static void main(String[] args)
    {
        Random rand = new Random();
        matrice matr = new matrice();
        System.out.println("Quante righe e collone ti servono:");
        matr.set_matrice();
        for(int i=0; i < matr.dim1; i++)
        {
            for(int j=0; j < matr.dim2; j++)
            {
                matr.mat[i][j] = rand.nextInt(10);
            }
        }
        //matr.visual_matrice();       
    }
    
}
