package com.demand.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "specialist_post")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpecialistPostModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "specialist_name")
    private String name;

    @Column(name = "specialist_contact")
    private String contact;

    @Column(name = "specialist_city")
    private String city;

}
