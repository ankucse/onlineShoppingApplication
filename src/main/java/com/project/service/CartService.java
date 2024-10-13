package com.project.service;

import com.project.model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartService {

//	public Cart addProductToCart(Cart cart,String Name, Integer quantity);

    public Cart AddProduct(Cart cart, Integer Productid, Integer customerId);

//	public Cart UpdateCartProduct(Cart cart);

    public String deleteProductfromCart(Integer id);

    public void deleteAllCart();

//	public String DeleteALl();

    public List<Cart> ViewAllCart();

}
