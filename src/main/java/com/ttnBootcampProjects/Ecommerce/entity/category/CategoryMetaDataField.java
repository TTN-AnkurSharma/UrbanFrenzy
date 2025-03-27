package com.ttnBootcampProjects.Ecommerce.entity.category;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CategoryMetaDataField {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID categoryMetaDataFieldId;
    private String name;

}
