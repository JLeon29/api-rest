package com.idat.idatapirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.idatapirest.model.Product;
import com.idat.idatapirest.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Override
	public void guardarProducto(Product p) {
		repository.guardarProducto(p);

	}

	@Override
	public void eliminarProducto(Integer id) {
		repository.eliminarProducto(id);

	}

	@Override
	public void editarProducto(Product p) {
		repository.editarProducto(p);

	}

	@Override
	public List<Product> listarProductos() {
		repository.listarProductos();
		return null;
	}

	@Override
	public Product productoById(Integer id) {
		repository.productoById(id);
		return null;
	}

}
