package com.ttnBootcampProjects.Ecommerce.entity.users;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID addressId;

    private String city;

    private String state;

    private String country;

    private String addressLine;

    private int zipCode;

    private String label;

}

