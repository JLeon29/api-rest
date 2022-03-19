package com.idat.idatapirest.repository;

import java.util.List;

import com.idat.idatapirest.model.Product;

public interface ProductRepository {
	
	public void guardarProducto(Product p);
	public void eliminarProducto(Integer id);
	public void editarProducto(Product p);
	public List<Product> listarProductos();
	public Product productoById(Integer id);

}
