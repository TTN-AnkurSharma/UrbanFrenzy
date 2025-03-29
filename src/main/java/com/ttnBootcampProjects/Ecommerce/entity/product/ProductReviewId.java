package com.ttnBootcampProjects.Ecommerce.entity.product;

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
public class ProductReviewId implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "customer_user_id")
    private UUID customerId;

    @Column(name = "product_id")
    private UUID productId;


}