
package estructuras.de.datos;

public class ClasePila <T> {
	
	final int max=50;
	T pila[];
	int datos;
	
	public ClasePila() {
		datos=0;
		pila=(T[]) new Object[max];
	}
	
	public void añadirDatos(T dato) throws Exception{
		if(datos<max) {
			pila[datos++]=dato;
		}
	}
	
	public T borrarDatos() throws Exception{
		if(!pilaVacia()) {
			return pila[--datos];
		}
		throw new Exception("La pila está vacia");
	}
	
	public int DatosEnLaPila() {
		return datos;
	}
	
	private boolean pilaVacia() {
		return datos==0;
	}
	
	T Limite() throws Exception{
		if(pilaVacia()) {
			throw new Exception("La pila está vacia");
		}
		int CantidadElementos=datos;
		return pila[--CantidadElementos];
	}
	
	public T[] ObtenerPila() {
		return pila;
	}
	public void EstablacerPila(T[] pila) {
		this.pila = pila;
	}
	public int ObtenerDatos() {
		return datos;
	}
	public void EstablacerDatos(int datos) {
		this.datos = datos;
	}
	public int Max() {
		return max;
	}

}	