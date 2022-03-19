package com.idat.idatapirest.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.idatapirest.model.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
	
	public List<Product> listar= new ArrayList<Product>();

	@Override
	public void guardarProducto(Product p) {
		listar.add(p);

	}

	@Override
	public void eliminarProducto(Integer id) {
		listar.remove(productoById(id));

	}

	@Override
	public void editarProducto(Product p) {
		listar.remove(productoById(p.getIdProducto()));
		listar.add(p);

	}

	@Override
	public List<Product> listarProductos() {
		
		return listar;
	}

	@Override
	public Product productoById(Integer id) {
	
		//stream() solo funciona con listas
		// findFirst() ayuda a obtener el primer resultado encontrado al id que le envias
		//orElse(null) sirve para que si lo anterior no es correcto ( osea no encuentra el id) retorne un valor nulo
		return listar.stream().filter(p->p.getIdProducto()== id).findFirst().orElse(null);
	}

}
