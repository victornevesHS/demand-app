package com.demand.api.service;

import com.demand.api.dto.SpecialistPostDTO;

import java.util.List;

public interface SpecialistPostService {

    List<SpecialistPostDTO> getSpecialist();

    void changeSpecialist(SpecialistPostDTO specialistPostDTO, Long postId);

    void removeSpecialist(Long postId);
}
