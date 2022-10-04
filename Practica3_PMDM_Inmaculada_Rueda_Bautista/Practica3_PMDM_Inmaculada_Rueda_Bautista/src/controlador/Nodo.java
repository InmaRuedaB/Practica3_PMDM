/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;



/**
 *
 * @author Inmaculada Rueda Bautista
 */
public class Nodo <T> {
    
    //Objeto que guarda el objeto que se va a visualizar en la vista
    private T nodoActual;
    //Objeto que referencia al nodo siguiente (puntero)
    private Nodo nodoSiguiente;
    //objeto que referencia al nodo anterior (puntero)
    private Nodo nodoAnterior;
    

    /**
     * Constructor por defecto
     */
    public Nodo() {
    }   

    public T getNodoActual() {
        return nodoActual;
    }

    public Nodo getNodoSiguiente() {
        return nodoSiguiente;
    }

    public Nodo getNodoAnterior() {
        return nodoAnterior;
    }

    public void setNodoActual(T nodoActual) {
        this.nodoActual = nodoActual;
    }

    public void setNodoSiguiente(Nodo nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    public void setNodoAnterior(Nodo nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }
    

    
}
