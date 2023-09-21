package fes.aragon;

public class Cola {
	private Nodo frente;
    private Nodo fin;

    public Cola() {
        frente = null;
        fin = null;
    }

    public boolean isEmpty() {
        return frente == null;
    }

    public void enqueue(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (isEmpty()) {
            frente = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía.");
        }
        int valor = frente.valor;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        return valor;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía.");
        }
        return frente.valor;
    }
}
