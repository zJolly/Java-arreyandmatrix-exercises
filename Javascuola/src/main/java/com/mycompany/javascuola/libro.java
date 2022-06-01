package com.mycompany.javascuola;

import java.util.Scanner;

public class libro {
    String titolo, autore;
    int num_p;
    float prezzo_p = 1, costo_f= 10;
    
    public void set_titolo(String titolo) 
    {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Che titolo ha il libro?");
        titolo = tastiera.next();
        this.titolo = titolo;  
    }
    public String get_titolo(){return this.titolo;}
    public void set_autore(String autore) 
    {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Che autore ha il libro?");
        autore = tastiera.next();
        this.autore = autore;  
    }
    public String get_autore(){return this.autore;}
    public void set_num_p(int num_p) 
    {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Quante pagine ha?");
        num_p = tastiera.nextInt();
        this.num_p = num_p;  
    }
    public Integer get_num_p(){return this.num_p;}
    
   public static void main(String[] args)
   {
       //Costruttore della classe
       libro libro1 = new libro();
       //metodi main
       libro1.set_titolo(libro1.titolo);
       libro1.set_autore(libro1.autore);
       libro1.set_num_p(libro1.num_p);  
       System.out.println(libro1.get_titolo()+" "+libro1.get_autore()+" "+libro1.get_num_p()+" ");
   }
   
}
