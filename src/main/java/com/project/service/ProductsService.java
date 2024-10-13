package com.project.service;

import com.project.model.CategoryEnum;
import com.project.model.Products;
import com.project.model.ProductsDTO;

import java.util.List;

public interface ProductsService {

    public Products addProducts(Products products);

    public List<Products> getAllProducts();

    public Products getProductsFromCatalogById(Integer id);

    public List<ProductsDTO> getCategoryWiseProducts(CategoryEnum cat);

    public String deleteProductFromCatalog(Integer id);

    public Products updateProductIncatalog(Products product);

}
	
	
	
	
	
	
	
	
	
	
	
	