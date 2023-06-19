package com.demand.api.service;

import com.demand.api.model.CustomerPostModel;
import com.demand.api.respositories.CustomerPostRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomerPostService {
    @Autowired
    private CustomerPostRepository customerPostRepository;

    @Transactional
    public CustomerPostModel save(CustomerPostModel customerPostModel) {
        return customerPostRepository.save(customerPostModel);
    }

    public Optional<CustomerPostModel> findById(Long id) {
        return customerPostRepository.findById(id);
    }

    @Transactional
    public void delete(CustomerPostModel customerPostModel) {
        customerPostRepository.delete(customerPostModel);
    }
}
