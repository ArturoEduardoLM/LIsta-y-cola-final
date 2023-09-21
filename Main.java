package fes.aragon;
import fes.aragon.Cola;
import fes.aragon.Nodo;
import fes.aragon.Pila;
import java.util.Scanner;
public class Main {

	 public static void main(String[] args) {
	        Pila pila = new Pila();
	        Cola cola = new Cola();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nSeleccione una opción:");
	            System.out.println("1. Agregar elemento a la Pila");
	            System.out.println("2. Eliminar elemento de la Pila");
	            System.out.println("3. Agregar elemento a la Cola");
	            System.out.println("4. Eliminar elemento de la Cola");
	            System.out.println("5. Salir");

	            int opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                    System.out.print("Ingrese un elemento para agregar a la Pila: ");
	                    int elementoPila = scanner.nextInt();
	                    pila.push(elementoPila);
	                    break;
	                case 2:
	                    if (!pila.isEmpty()) {
	                        int elementoEliminadoPila = pila.pop();
	                        System.out.println("Elemento eliminado de la Pila: " + elementoEliminadoPila);
	                    } else {
	                        System.out.println("La Pila está vacía.");
	                    }
	                    break;
	                case 3:
	                    System.out.print("Ingrese un elemento para agregar a la Cola: ");
	                    int elementoCola = scanner.nextInt();
	                    cola.enqueue(elementoCola);
	                    break;
	                case 4:
	                    if (!cola.isEmpty()) {
	                        int elementoEliminadoCola = cola.dequeue();
	                        System.out.println("Elemento eliminado de la Cola: " + elementoEliminadoCola);
	                    } else {
	                        System.out.println("La Cola está vacía.");
	                    }
	                    break;
	                case 5:
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Opción no válida. Intente nuevamente.");
	                    break;
	            }

	            // Mostrar elementos en la Pila y la Cola
	            mostrarElementosEnPila(pila);
	            mostrarElementosEnCola(cola);
	        }
	    }

	    public static void mostrarElementosEnPila(Pila pila) {
	        System.out.println("\nElementos en la Pila:");
	        Pila tempPila = new Pila();

	        while (!pila.isEmpty()) {
	            int elemento = pila.pop();
	            System.out.println("Elemento: " + elemento);
	            tempPila.push(elemento);
	        }

	        // Restaurar la Pila original
	        while (!tempPila.isEmpty()) {
	            int elemento = tempPila.pop();
	            pila.push(elemento);
	        }
	    }

	    public static void mostrarElementosEnCola(Cola cola) {
	        System.out.println("\nElementos en la Cola:");
	        Cola tempCola = new Cola();

	        while (!cola.isEmpty()) {
	            int elemento = cola.dequeue();
	            System.out.println("Elemento: " + elemento);
	            tempCola.enqueue(elemento);
	        }

	        // Restaurar la Cola original
	        while (!tempCola.isEmpty()) {
	            int elemento = tempCola.dequeue();
	            cola.enqueue(elemento);
	        }
	    }
	}