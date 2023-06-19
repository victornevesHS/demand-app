package com.demand.api.service;

import com.demand.api.model.SpecialtyPostModel;
import com.demand.api.respositories.SpecialtyPostRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SpecialtyPostService {

    @Autowired
    private SpecialtyPostRepository specialtyPostRepository;

    @Transactional
    public SpecialtyPostModel save(SpecialtyPostModel specialtyPostModel) {
        return specialtyPostRepository.save(specialtyPostModel);
    }

    public Optional<SpecialtyPostModel> findById(Long id) {
        return specialtyPostRepository.findById(id);
    }

    @Transactional
    public void delete(SpecialtyPostModel specialtyPostModel) {
        specialtyPostRepository.delete(specialtyPostModel);
    }
}
