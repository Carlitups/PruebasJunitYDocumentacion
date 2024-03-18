package carrito;

import java.util.ArrayList;
import java.util.Iterator;

public class CarroCompra {

	private ArrayList<Producto> cesta;

    /**
     * Construye una instancia de un CarroCompra
     */
    public CarroCompra() {
        cesta = new ArrayList<Producto>();
    }

    /**
     * Devuelve el precio de todos los articulos del carro
     * @return Importe total del carro.
     */
    public double importeTotal() {
        Iterator<Producto> i = cesta.iterator();
        double importe = 0.00;
        while (i.hasNext()) {
            Producto p = (Producto)i.next();
            importe = importe + p.getPrice();
        }
        return importe;
    }
    
    /**
     * Añade un nuevo producto a la cesta
     * @param p Producto.
     */
    public void anyadir(Producto p) {
        cesta.add(p);
    }

    /**
     * Elimina un articulo de la cesta
     * @param p Producto.
     * @throws ExcepcionProductoNoEncontrado Si el producto no está
     */
    public void eliminar(Producto p) throws ExcepcionProductoNoEncontrado {
        if (!cesta.remove(p)) {
            throw new ExcepcionProductoNoEncontrado("Producto no está en el carrito");
        }
    }

    /**
     * Número total de articulos en la cesta
     * @return Número de productos en la cesta.
     */
    public int totalArticulos() {
        return cesta.size();
    }
    
    /**
     * Vacia la cesta de la compra
     */
    public void empty() {
        cesta = new ArrayList<Producto>();
    }

    /**
     * Indica si la cesta está vacia o no
     * @return true si la cesta está vacía;
     *     false en caso contrario.
     */
    public boolean isEmpty() {
        return (cesta.size() == 0);
    }
}