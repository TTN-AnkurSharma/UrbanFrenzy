package com.ttnBootcampProjects.Ecommerce.entity.category;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CategoryMetadataFieldValueId implements Serializable {

    private static final long serialVersionUID = 1L;

    private UUID categoryId;
    private UUID categoryMetadataFieldId;

}
