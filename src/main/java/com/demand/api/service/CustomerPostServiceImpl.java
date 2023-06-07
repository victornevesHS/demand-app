package com.demand.api.service;

import com.demand.api.dto.CustomerPostDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerPostServiceImpl implements CustomerPostService {
    @Override
    public List<CustomerPostDTO> getCustomer() {
        return null;
    }

    @Override
    public void changeCustomer(CustomerPostDTO customerPostDTO, Long postId) {

    }

    @Override
    public void removeCustomer(Long postId) {

    }
}
