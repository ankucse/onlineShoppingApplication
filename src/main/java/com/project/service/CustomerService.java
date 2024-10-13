package com.project.service;

import com.project.model.Address;
import com.project.model.Customer;

import java.util.List;

public interface CustomerService {


    public Customer addCustomer(Customer customer);

    public Customer updateCustomer(Customer customer);

    public Customer removeCustomer(Customer customer);

    public Customer viewCustomer(Integer id);

    public List<Customer> viewAllCustomerByLocation(String location);

    public Customer addAddress(Address address, Integer customerId);

}
