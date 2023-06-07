package com.demand.api.entity;



import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "specialist_post")
@Data
@NoArgsConstructor

public class SpecialistPostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "specialist_contact")
    private String contact;

    @Column (name = "specialist_description")
    private String description;

    @Column(name = "specialist_city")
    private String city;

    @Column(name = "specialist_aviable")
    private Boolean available;

}
