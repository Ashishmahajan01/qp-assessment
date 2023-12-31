package com.springBootImageApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springBootImageApplication.beans.Cart;
import com.springBootImageApplication.beans.Customer;
import com.springBootImageApplication.dao.CartRepository;

@Service
@Transactional
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartRepository cartRepository;

	@Override
	public List<Cart> getCartItemsByCustomerId(Customer customer) {
		return cartRepository.findCartItemsByCustomer(customer);
	}

	@Override
	public void removeCartItems(Customer customer, Long id) {
		cartRepository.deleteCartItems(customer, id);
	}

	@Override
	public void removeCartItem(Long id) {
		cartRepository.deleteCartItem(id);
	}

	@Override
	public void saveCartItems(List<Cart> cartsItems) {
		cartRepository.saveAll(cartsItems);
	}

	@Override
	public void saveCart(Cart cart) {
		cartRepository.save(cart);
	}

}
