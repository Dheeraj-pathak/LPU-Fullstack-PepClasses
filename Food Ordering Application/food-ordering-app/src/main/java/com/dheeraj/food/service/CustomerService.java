package com.dheeraj.food.service;

import com.dheeraj.food.model.Customer;
import com.dheeraj.food.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepo;

    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    public Customer getCustomerById(int id) {
        Optional<Customer> optional = customerRepo.findById(id);
        return optional.orElse(null);
    }

    public Customer addCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public Customer updateCustomer(int id, Customer updatedCustomer) {
        updatedCustomer.setId(id);
        return customerRepo.save(updatedCustomer);
    }

    public boolean deleteCustomer(int id) {
        if (customerRepo.existsById(id)) {
            customerRepo.deleteById(id);
            return true;
        }
        return false;
    }
}
