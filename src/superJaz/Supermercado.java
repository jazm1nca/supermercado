package superJaz;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	
	public static void Main(String arguments ) {
		 List<Producto> productos = new ArrayList<Producto>();
		 
		 Producto jabon = new Producto("", 0, 0);
		 Producto esponja = new Producto("", 0, 0);
		 Producto shampoo = new Producto("", 0, 0);
		 
		
		 agregar(productos, jabon);
		 mostrar(productos);
	}
	
	public static void agregar(List<Producto> productos, Producto unProducto) {
	
		 productos.add(unProducto);
		 
	}
	
	public static void baja(List<Producto> productos, Producto unProducto) {
		productos.remove(unProducto);
	}
	
	public static void modificacion(List<Producto> productos, Producto unProducto) {
		for (Producto p : productos) {
			if (p.getNombre() == "") {
				
			} 
			System.out.println(p.getNombre());
			
		}
	}
	
	public static void mostrar(List<Producto> productos) {
		for (Producto producto : productos) {
			System.out.println(producto);
		}
	}
}
