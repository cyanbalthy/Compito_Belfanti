/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.compitothreads_belfanti;

/**
 *
 * @author informatica
 */
public class Commesso {
    private static int ordine;
    private static int pezzo;
    private boolean cO = true;
    
    public synchronized void  prelevaOrdine(int p){
        if(cO==false){
            try{wait();}catch(InterruptedException e){}
        }  
        cO = false;
        ordine = p;
        notify();
        System.out.println("il commesso preleva l'ordine: " + ordine);
    }

    public synchronized void  prelevaPezzo(int p){
        if(cO==true){
            try{wait();}catch(InterruptedException e){}
        } 
        cO = true;
        pezzo = p;
        notify();
        System.out.println("il commesso preleva l'hamburger: " + pezzo);
    }
    
    public synchronized int  depositaPezzo(){
        if(cO==false){
            try{wait();}catch(InterruptedException e){}
        } 
        int n = 0;
        n = pezzo;
        notify();
        System.out.println("il commesso consegna l'hamburger: " + ordine);
        return n;
    }
}
