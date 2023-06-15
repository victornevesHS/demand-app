package com.demand.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "customer_post")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerPostModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (name = "customer_name")
    private String name;

    @Column (name = "customer_description")
    private String description;

    @Column (name = "customer_city")
    private String city;

    @Column (name = "customer_contact")
    private String contact;


}
