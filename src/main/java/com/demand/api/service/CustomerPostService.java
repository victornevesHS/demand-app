package com.demand.api.service;

import com.demand.api.dto.CustomerPostDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerPostService {

    List<CustomerPostDTO> getCustomer();

    void changeCustomer(CustomerPostDTO customerPostDTO, Long postId);

    void removeCustomer(Long postId);

}
