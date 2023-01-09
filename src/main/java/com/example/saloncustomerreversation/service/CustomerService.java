package com.example.saloncustomerreversation.service;

import com.example.saloncustomerreversation.data.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();

    Customer saveCustomer(Customer customer);

    Customer getCustomerById(long id);

    Customer updateCustomer(Customer customer);

    void deleteCustomerById(long id);
}
