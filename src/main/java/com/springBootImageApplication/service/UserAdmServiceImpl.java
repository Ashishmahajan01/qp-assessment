package com.springBootImageApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBootImageApplication.beans.Customer;
import com.springBootImageApplication.dao.UserAdmRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserAdmServiceImpl implements UserAdmService
{
	@Autowired
	UserAdmRepository userAdmRepo;

	@Override
	public Optional<Customer> getCustomerId(Long pid)
	{
		
		return userAdmRepo.findById(pid);
	}

	@Override
	public List<Customer> getAllCustomer()
	{

		return userAdmRepo.findAll();
	}

	@Override
	public void deleteCustomer(Long pid) 
	{
		userAdmRepo.deleteById(pid);
		
	}

	@Override
	public void deleteAll(List<Customer> ids) 
	{
		
		
	}
	
}
