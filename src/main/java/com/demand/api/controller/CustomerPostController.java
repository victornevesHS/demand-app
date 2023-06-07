package com.demand.api.controller;

import com.demand.api.dto.CustomerPostDTO;
import com.demand.api.service.CustomerPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/demand")
public class CustomerPostController {

    @Autowired
    private CustomerPostService customerPostService;

    @GetMapping("/customers")
    public ResponseEntity<List<CustomerPostDTO>> getCustomer() {
        return ResponseEntity.status(HttpStatus.FOUND).body(customerPostService.getCustomer());

    }

    @PutMapping("/customer/{id}")
    public ResponseEntity changeCustomer
}
