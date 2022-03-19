package com.idat.idatapirest.service;

import java.util.List;

import com.idat.idatapirest.model.Product;

public interface ProductService {
	
	public void guardarProducto(Product p);
	public void eliminarProducto(Integer id);
	public void editarProducto(Product p);
	public List<Product> listarProductos();
	public Product productoById(Integer id);

}
