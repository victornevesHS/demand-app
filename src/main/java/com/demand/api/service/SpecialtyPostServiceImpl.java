package com.demand.api.service;

import com.demand.api.dto.SpecialtyPostDTO;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SpecialtyPostServiceImpl implements SpecialtyPostService {

    @Override
    public List<SpecialtyPostDTO> getSpecialty() {
        return null;
    }

    @Override
    public void changeSpecialty(SpecialtyPostDTO specialtyPostDTO, Long postId) {

    }

    @Override
    public void removeSpecialty(Long postId) {

    }

}
