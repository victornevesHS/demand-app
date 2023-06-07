package com.demand.api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "specility_post")
@Data
@NoArgsConstructor
public class SpecialtyPostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "specialty")
    private Long specialty;
}
