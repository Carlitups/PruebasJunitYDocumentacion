package carrito;

public class ExcepcionProductoNoEncontrado extends Exception {

	private static final long serialVersionUID = 1L;
	/**
	 * Construye una expection para Producto.
	 * @param string 
	 */
	public ExcepcionProductoNoEncontrado(String string) {
		super(string);
	}
}