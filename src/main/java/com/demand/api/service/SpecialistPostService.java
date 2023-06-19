package com.demand.api.service;

import com.demand.api.model.SpecialistPostModel;
import com.demand.api.respositories.SpecialistPostRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SpecialistPostService {

    @Autowired
    private SpecialistPostRepository specialistPostRepository;

    @Transactional
    public SpecialistPostModel save(SpecialistPostModel specialistPostModel) {
        return specialistPostRepository.save(specialistPostModel);
    }

    public Optional<SpecialistPostModel> findById(Long id) {
        return specialistPostRepository.findById(id);
    }

    @Transactional
    public void delete(SpecialistPostModel specialistPostModel) {
        specialistPostRepository.delete(specialistPostModel);
    }

}
