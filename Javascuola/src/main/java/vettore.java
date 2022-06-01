import java.io.*;
import java.util.Scanner;

public class vettore 
{
    public static void main(String[] args)
    {
        int b;
        int vettore[] = null;
       
        
        //Visualizzazione vettore
        for(int i=0; i < 3; i++)
        {
            System.out.print(vettore[i]);
        }
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Quanto vuoi grande il vettore:");
        b = tastiera.nextInt();
        //Riempimento vettore
        for(int i=0; i < 3; i++)
        {
            System.out.println("Inerisci il "+i+"° nome: ");
            vettore[i] = tastiera.nextInt();
        }
    }
}

 
