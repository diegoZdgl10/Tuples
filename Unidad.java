import java.util.List;
import java.util.ArrayList;

/**
 * Clase para representar tupla de un elmento.
 * La clase implementa {@link Tupla}
 * @author Zamora Cruz Diego Arturo
 */
public class Unidad<E> implements Tupla<E> {

    /* Elemento de la unidad. */
    E elemento;

    /**
     * Constructor que recibe los elementos que estaran de la unidad.
     * @param elemento el elemento de la unidad.
     */
    public Unidad(E elemento) {
        this.elemento = elemento;
    }

    /**
     * Constructor que define una unidad a partir de otra unidad.
     * @param unidad la unidad que definira a una nueva.
     */
    public Unidad(Unidad<E> unidad) {
        this.elemento = unidad.elemento;
    }

    /**
     * Constructor vacio de unidad.
     */
    public Unidad() {

    }

    /**
     * Regresa el elemento de la unidad.
     * @return el elemento de la unidad.
     */
    public E getElemento() {
        return this.elemento;
    }

    /**
     * Define el nuevo elemento de la unidad.
     * @param elemento el nuevo elemento de la unidad.
     */
    public void setElemento(E elemento) {
        this.elemento = elemento;
    }


    /**
     * Regresa la unidad en forma de lista.
     * @return la unidad en forma de lista.
     */
    public List<E> getTupla() {
        List<E> unidad = new ArrayList<E>();
        unidad.add(this.elemento);
        return unidad;
    }

    /**
     * Invierte los valores de la tupla, empezando en el ultimo y terminando en el primero.
     */
    public void invertirValores() {
        
    }

    /**
     * Coloca el valor de la posicion I en la posicion J y biceversa.
     * Las posiciones se comienzan a contar desde el 0.
     * @param posicionI el inidice del valor den la posicion I.
     * @param posicionJ el inidice del valor den la posicion J.
     */
    public void intercambiarValores(int posicionI, int posicionJ) {
        //throw new java.lang.UnsupportedOperationException("Opeacion no soportada.");
    }

    /**
     * Nos dice si la unidad es igual al objeto recibido.
     * @param objeto el objeto con el que hay que comparar.
     * @return <code>true</code> si la unidad es igual al objeto recibido;
     *         <code>false</code> en otro caso.
     */
    @Override
    public boolean equals(Object objeto) {
        if (objeto == null) {
            return false;
        }
        if (objeto instanceof Unidad) {
            return false;
        }
        @SuppressWarnings("unchecked") Unidad<E> nueva = (Unidad<E>) objeto;
        return nueva.elemento.equals(this.elemento);
    }

    /**
     * Regresa una representacion en cadena de la unidad.
     * @return una representacion en cadena de la unidad.
     */
    @Override
    public String toString() {
        String cadena;
        cadena = String.format("(%s)",
                                this.elemento.toString());
        return cadena;
    }

}