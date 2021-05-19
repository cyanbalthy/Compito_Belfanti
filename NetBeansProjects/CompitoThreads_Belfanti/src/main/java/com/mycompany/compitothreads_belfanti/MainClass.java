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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Commesso b = new Commesso();
        
        Cliente cl = new Cliente(b);
        Cuoco cu = new Cuoco(b);
        
        cl.start();
        cu.start();
    }
    
}
