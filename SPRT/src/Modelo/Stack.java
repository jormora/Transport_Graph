/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jorge Morales
 * @author Andrés Rojas
 * @author Jonathan Torres
 */
public class Stack {
    private List lista;
    
    public Stack ( ) {
        lista = new List();
    }
    
    public void push ( String s ) {
        lista.pushFront( s );
    }
    
    public String pop ( ) {
        String s = lista.topFront();
        lista.popFront();
        return s; 
    }
    
}
