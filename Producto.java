package carrito;

public class Producto {

	private String nombre;
	private double precio;

	/**
	 * Crea un nuevo producto.
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto
	 */
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	/**
	 * Devuelve el nombre del producto.
	 * @return Nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Devuelve el precio del producto.
	 * @return Precio.
	 */
	public double getPrice() {
		return precio;
	}

	/**
	 * Valida si los productos son iguales
	 * @return true si el producto es igual;
	 * 		false en caso contrario
	 */
	public boolean equals(Object o) {
		if (o instanceof Producto) {
			Producto p = (Producto)o;  //Hacemos un cast del objeto al producto
			return p.getNombre().equals(nombre);
		}
		return false;
	}
}