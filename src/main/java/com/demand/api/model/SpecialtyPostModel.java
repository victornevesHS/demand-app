package com.demand.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "specialty_post")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpecialtyPostModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "specialty_name")
    private String specialtyName;
}
