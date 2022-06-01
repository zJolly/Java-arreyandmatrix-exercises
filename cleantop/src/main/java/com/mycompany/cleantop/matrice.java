package com.mycompany.cleantop;
import java.util.Scanner;
import java.io.*;

public class matrice 
{
    public int mat[][] = new int[50][50];
    public int dim1, dim2;
    void set_matrice()
    {
        Scanner tastiera = new Scanner(System.in);
        int g, j;
        //System.out.println("Quanto grande vuoi matrice:");
        g = tastiera.nextInt();
        j = tastiera.nextInt();
        dim1 = g;
        dim2 = j;
        int[][] mat = new int[g][j];
        for(int i=0;i < g;i++)
        {
            for(int h=0; h < j; h++)
            {
                mat[i][h] = 0; 
            }
        }
    }
    public int[][] get_matrice(){return this.mat;}
    public void visual_matrice(String[] nomi)
    {
        for(int i=0; i < this.dim1; i++)
        {
            System.out.print(nomi[i]+" ");
            for(int j=0; j < this.dim2; j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" "); 
        }
    }
    public void punta_matrice(int punta1, int punta2)
    {
        Scanner tastiera = new Scanner(System.in);
        mat[punta1][punta2] = tastiera.nextInt();
    }
}
