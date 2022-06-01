package com.mycompany.javascuola;
import java.io.*;


class conversioni 
{
    public static void main(String args[])
    {
        String Eta1 = "20";
        int nfigli = 2;
        String Nome = "Paola", x;
        float altezza = 179;
        //conversione implicita da numerico a string
        x = nfigli + Nome;  
        System.out.println(x);
        //conversione implicita da float a double
        double y = altezza;
        System.out.println(y);
        //conversione float in int
        int q = (int) altezza;
        System.out.println(q);
        /*Invocazione di metodo di conversione
        int p = Integor.parseInt(Eta1);
        double z = double.parse.Double(Eta1);
        z =z+p;
        System.out.println(z);*/  
    }    
}
