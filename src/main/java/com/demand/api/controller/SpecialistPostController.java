package com.demand.api.controller;


import com.demand.api.dto.SpecialistPostDTO;
import com.demand.api.model.SpecialistPostModel;
import com.demand.api.service.SpecialistPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("/{id}")
    public ResponseEntity<Object> getSpecialist(@PathVariable(value = "id") Long id){
        Optional<SpecialistPostModel> specialistPostModelOptional = specialistPostService.findById(id);
        if (!specialistPostModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Customer Spot not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(specialistPostModelOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteSpecialist(@PathVariable(value = "id") Long id){
        Optional<SpecialistPostModel> specialistPostModelOptional = specialistPostService.findById(id);
        if (!specialistPostModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Customer not found.");
        }
        specialistPostService.delete(specialistPostModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Customer deleted successfully.");
    }

}
