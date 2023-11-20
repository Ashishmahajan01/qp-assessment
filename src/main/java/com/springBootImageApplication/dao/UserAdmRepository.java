package com.springBootImageApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBootImageApplication.beans.Customer;

public interface UserAdmRepository extends JpaRepository<Customer,Long>
{

}
