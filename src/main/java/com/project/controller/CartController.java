package com.project.controller;

import com.project.model.Cart;
import com.project.repository.CartDao;
import com.project.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @Autowired
    private CartDao cDao;

    //To add the data we use this

    @PostMapping("/addtocart/{id}/{custId}")
    public ResponseEntity<Cart> addorder(@RequestBody Cart cart, @PathVariable Integer id, @PathVariable Integer custId) {
        Cart uporder = cartService.AddProduct(cart, id, custId);
        return new ResponseEntity<Cart>(uporder, HttpStatus.ACCEPTED);
    }

    //To delete the cart data

    @DeleteMapping(value = "/cart/{id}")
    public ResponseEntity<String> removeCartProduct(@PathVariable("id") Integer id) {

        String res = cartService.deleteProductfromCart(id);
        return new ResponseEntity<String>(res, HttpStatus.OK);
    }


    //To view the cart data;

    @GetMapping("/cart")
    public ResponseEntity<List<Cart>> getAllProductsHandler() {

        List<Cart> list = cartService.ViewAllCart();

        return new ResponseEntity<List<Cart>>(list, HttpStatus.OK);
    }

    @DeleteMapping(value = "/cart/clear")
    public String clearCartHandler() {
        cartService.deleteAllCart();
        String res = "Cart is empty Now";
        return res;

    }

}
