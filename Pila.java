package fes.aragon;

public class Pila {

	    private Nodo cima;

	    public Pila() {
	        cima = null;
	    }
// vacia o no?
	    public boolean isEmpty() {
	        return cima == null;
	    }
//agregar pero push suena mas tecnico
	    public void push(int valor) {
	        Nodo nuevoNodo = new Nodo(valor);
	        nuevoNodo.siguiente = cima;
	        cima = nuevoNodo;
	    }
// pop pop pop (borrar el de arriba)
	    public int pop() {
	        if (isEmpty()) {
	            throw new IllegalStateException("La pila está vacía.");
	        }
	        int valor = cima.valor;
	        cima = cima.siguiente;
	        return valor;
	    }
//punta pico cabeza
	    public int peek() {
	        if (isEmpty()) {
	            throw new IllegalStateException("La pila está vacía.");
	        }
	        return cima.valor;
	    }
	
}
