package com.dheeraj.food.service;

import com.dheeraj.food.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private List<Customer> customerList = new ArrayList<>();

    public List<Customer> getAllCustomers() {
        return customerList;
    }

    public Customer addCustomer(Customer customer) {
        customerList.add(customer);
        return customer;
    }

    public Customer updateCustomer(int id, Customer updatedCustomer) {
        for (Customer c : customerList) {
            if (c.getId() == id) {
                c.setName(updatedCustomer.getName());
                c.setEmail(updatedCustomer.getEmail());
                c.setAddress(updatedCustomer.getAddress());
                return c;
            }
        }
        return null;
    }

    public boolean deleteCustomer(int id) {
        return customerList.removeIf(c -> c.getId() == id);
    }
}
