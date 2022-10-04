package controlador;


/**
 * Clase que sirve de controlador de nodos en la vista
 * @author UIbnaculada Rueda Bautista
 */
public class Lista {
    //Objeto de tipo nodo que muestra en la vista el nodo actual
    private Nodo nodoActual;
    //Objeto de tipo nodo que nos va a servir para pivotar (intercambiar/auxiliar) cuando cambiamos de cuenta
    private Nodo nodoPivote;
    
    /**
     * Método que sirve para añadir un nodo a la lista (vista)
     * @param nodo 
     */
    public void addNodo(Nodo nodo) {
        //si el nodo actual es null, no existe ninguno y se pone como actual el que se inserta
        if(nodoActual == null) {
            nodoActual = nodo;
        }else {
            //si ya existe un actual, al que insertamos, le referenciamos el actual como anterior a este
            // ya que vamos a insertar al final de la lista
            nodo.setNodoAnterior(nodoActual);
            //asignamos el nodo que creamos como el acutal
            nodoActual = nodo;
        }
    }
    
    public Nodo getNodoActual() {
        return nodoActual;
    }
    
    public void setNodoActual(Nodo nodo) {
        this.nodoActual = nodo;
    }
    
    public Nodo getNodoPivote() {
        return this.nodoPivote;
    }
    
    public void setNodoPivote(Nodo nodo) {
        this.nodoPivote = nodo;
    }
   
   
   
}