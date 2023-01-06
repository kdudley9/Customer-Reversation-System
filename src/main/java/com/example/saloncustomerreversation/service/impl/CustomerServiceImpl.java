package com.example.saloncustomerreversation.service.impl;

import com.example.saloncustomerreversation.data.Customer;
import com.example.saloncustomerreversation.data.CustomerRepository;
import com.example.saloncustomerreversation.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        super();
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAllCustomers() {
        // return list of customers
        return customerRepository.findAll();
    }
}
