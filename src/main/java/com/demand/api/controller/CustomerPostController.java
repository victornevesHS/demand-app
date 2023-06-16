package com.demand.api.controller;

import com.demand.api.dto.CustomerPostDTO;
import com.demand.api.model.CustomerPostModel;
import com.demand.api.service.CustomerPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerPostController {
    @Autowired
    private CustomerPostService customerPostService;

    @PostMapping
    public ResponseEntity<Object> createCustomer(@RequestBody CustomerPostDTO customerPostDTO){
        var customerPostModel = new CustomerPostModel();
        customerPostModel.setName(customerPostDTO.getName());
        customerPostModel.setDescription(customerPostDTO.getDescription());
        customerPostModel.setCity(customerPostDTO.getCity());
        customerPostModel.setContact(customerPostDTO.getContact());
        return ResponseEntity.status(HttpStatus.CREATED).body(customerPostService.save(customerPostModel));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getCustomer(@PathVariable(value = "id") Long id){
        Optional<CustomerPostModel> customerPostModelOptional = customerPostService.findById(id);
        if (!customerPostModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Customer Spot not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(customerPostModelOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteCustomer(@PathVariable(value = "id") Long id){
        Optional<CustomerPostModel> customerPostModelOptional = customerPostService.findById(id);
        if (!customerPostModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Customer not found.");
        }
        customerPostService.delete(customerPostModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Customer deleted successfully.");
    }
}
