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
public class Cliente extends Thread{
    private Commesso buffer;
    
    private int numero=0;

    public Cliente(Commesso buffer) {
        this.buffer = buffer;
    }
    
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            numero = i+1;
            System.out.println("il cliente entra e richiede l'ordine numero: " + numero);
            buffer.prelevaOrdine(numero);
            int a;
            a=buffer.depositaPezzo();
            try{
                sleep((int)(Math.random()*100));
            }catch(InterruptedException e){
                
            }
        }
    }
}
