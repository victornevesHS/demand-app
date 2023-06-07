package com.demand.api.service;

import com.demand.api.dto.SpecialtyPostDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpecialtyPostService {

    List<SpecialtyPostDTO> getSpecialty();

    void changeSpecialty(SpecialtyPostDTO specialtyPostDTO, Long postId);

    void removeSpecialty(Long postId);
}
