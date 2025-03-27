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
public class CategoryMetadataFieldValueId implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "category_id")
    private UUID categoryId;

    @Column(name = "category_metadata_field_id")
    private UUID categoryMetadataFieldId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryMetadataFieldValueId that = (CategoryMetadataFieldValueId) o;
        return Objects.equals(categoryId, that.categoryId) &&
                Objects.equals(categoryMetadataFieldId, that.categoryMetadataFieldId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, categoryMetadataFieldId);
    }
}
