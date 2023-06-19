package com.demand.api.controller;

import com.demand.api.dto.SpecialtyPostDTO;
import com.demand.api.model.CustomerPostModel;
import com.demand.api.model.SpecialtyPostModel;
import com.demand.api.service.SpecialtyPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/specialty")
public class SpecialtyPostController {

    @Autowired
    private SpecialtyPostService specialtyPostService;

    @PostMapping
    public ResponseEntity<Object> createSpecialty(@RequestBody SpecialtyPostDTO specialtyPostDTO){
        var specialtyPostModel = new SpecialtyPostModel();
        specialtyPostModel.setSpecialtyName(specialtyPostDTO.getSpecialtyName());
        return ResponseEntity.status(HttpStatus.CREATED).body(specialtyPostService.save(specialtyPostModel));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getSpecialty(@PathVariable(value = "id") Long id){
        Optional<SpecialtyPostModel> specialtyPostModelOptional = specialtyPostService.findById(id);
        if (!specialtyPostModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Specialty Spot not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(specialtyPostModelOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteSpecialty(@PathVariable(value = "id") Long id){
        Optional<SpecialtyPostModel> specialtyPostModelOptional = specialtyPostService.findById(id);
        if (!specialtyPostModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Specialty not found.");
        }
        specialtyPostService.delete(specialtyPostModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Customer deleted successfully.");
    }

}
