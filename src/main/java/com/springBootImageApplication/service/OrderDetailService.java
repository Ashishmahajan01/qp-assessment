package com.springBootImageApplication.service;

import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Pageable;

import com.springBootImageApplication.beans.Order;
import com.springBootImageApplication.beans.OrderDetail;
import com.springBootImageApplication.beans.Product;

public interface OrderDetailService {
	boolean saveOrderDetail(OrderDetail od);
	List<OrderDetail> getAllOrdersOrderId(Set<Long> id, String customerEmail);
	void deleteOrderDetailByNum(int paymentId);
	boolean saveCartOrderDetail(Order orders, Product products, int quantity, double mrpPrice, double amount, double totalPrice, int paymentId, String orderStatus, String paymentMode);
	List<OrderDetail> getOrderByPayId(int paymentId);
	void sendPdfEmail(String name, String email, int OrderNum, byte[] bytes);
	void saveOrderDetails(List<OrderDetail> orderDetails);
	List<OrderDetail> getLastOrderByIdDesc(Pageable pageable);
}	
