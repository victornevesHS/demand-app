package com.demand.api.controller;


import com.demand.api.dto.SpecialistPostDTO;
import com.demand.api.model.SpecialistPostModel;
import com.demand.api.service.SpecialistPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/specialist")
public class SpecialistPostController {

    @Autowired
    private SpecialistPostService specialistPostService;

    @PostMapping
    public ResponseEntity<Object> cerateSpecialist(@RequestBody SpecialistPostDTO specialistPostDTO) {
        var specialistPostModel = new SpecialistPostModel();
        specialistPostModel.setName(specialistPostDTO.getName());
        specialistPostModel.setCity(specialistPostDTO.getCity());
        specialistPostModel.setContact(specialistPostDTO.getContact());
        return ResponseEntity.status(HttpStatus.CREATED).body(specialistPostService.save(specialistPostModel));
    }
}
