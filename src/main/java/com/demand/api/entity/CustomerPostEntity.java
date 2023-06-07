package com.demand.api.entity;



import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer_post")
@Data
@NoArgsConstructor

public class CustomerPostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (name = "customer_description")
    private String description;

    @Column (name = "customer_city")
    private String city;

    @Column (name = "customer_contact")
    private String contact;


}
