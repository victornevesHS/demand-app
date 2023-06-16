package com.demand.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


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
    @NonNull
    private String name;

    @Column (name = "customer_description")
    @NonNull
    private String description;

    @Column (name = "customer_city")
    @NonNull
    private String city;

    @Column (name = "customer_contact")
    @NonNull
    private String contact;


}
