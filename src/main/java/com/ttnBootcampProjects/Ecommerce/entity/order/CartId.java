package com.ttnBootcampProjects.Ecommerce.entity.order;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
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
public class CartId implements Serializable {
    private static final long serialVersionUID = 1L;

    private UUID customerUserId;
    private UUID productVariationId;


}
