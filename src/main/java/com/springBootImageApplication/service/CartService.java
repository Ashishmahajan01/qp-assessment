package com.springBootImageApplication.service;

import java.util.List;

import com.springBootImageApplication.beans.Cart;
import com.springBootImageApplication.beans.Customer;

public interface CartService {

	void saveCartItems(List<Cart> cartsItems);
	void saveCart(Cart cart);
	List<Cart> getCartItemsByCustomerId(Customer customer);
	void removeCartItems(Customer customer, Long id);
	void removeCartItem(Long id);
}
