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
public class Queue {
    private List lista;
    
    public Queue ( ) {
        lista = new List();
    }
    
    public void push ( String s ) {
        lista.pushBack( s );
    }
    
    public String pop ( ) {
        String a = lista.topFront();
        lista.popFront();
        return a; 
    }

}
