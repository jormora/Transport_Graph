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
public class List {
    Node head; 
    private int size; 
    
    public List() {
        size = 0; 
        head = null; 
    }
    
    public boolean isEmpty() {
        return size == 0; 
    }
    
    public void pushFront ( String key ) {
        Node newNode = new Node(key); 
        newNode.next = head; 
        head = newNode; 
        size++; 
    }
    
    public void popFront( ) {
        if ( isEmpty() ) {
            System.out.println("Vacio D:");
        } else {
            head = head.next;
            size--; 
        }
    }
    
    public String topFront () {
        if ( isEmpty() ) {
            //BOTAR UN ERROR
        } 
        return head.key; 
        
    }
    
    public void pushBack ( String key ) {
        if ( isEmpty() ) {
            pushFront(key); 
        } else {
            Node current = head; 
            while ( current.next != null ) {
                current = current.next; 
            }
            Node newNode = new Node(key); 
            newNode.next = null; 
            current.next = newNode; 
            size++; 
        }
    }
    
    public void popBack () {
        if ( isEmpty() ) {
            //ERROR
            System.out.println("No puede borrar elementos de una lista vacía");
        } else {
            Node current = head; 
            while ( current.next.next != null ) {
                current = current.next;
            }
            current.next = null;
            size--; 
        }
        
    }
    public String topBack () {
        if ( isEmpty() ) {
            //ERROR
        }
        
        Node current = head; 
        while ( current.next != null ) {
            current = current.next; 
        }
        return current.key; 
    }
    
    @Override
    public String toString () {
        String s = "["; 
        Node current = head; 
        while ( current != null ) {
            s += current.key + ", ";
            current = current.next; 
        }
        if ( size > 0 ) {
            s = s.substring( 0, s.length() - 2 ); 
        }
        s += "]";
        return s; 
    }
    
    class Node{
        String key;
        Node next;
        
        Node( String key ) {
            this.key = key; 
        }
    }
}
