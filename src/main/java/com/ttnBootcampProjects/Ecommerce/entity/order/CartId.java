package com.ttnBootcampProjects.Ecommerce.entity.order;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Embeddable
public class CartId implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "customer_user_id")
    private UUID customerUserId;

    @Column(name = "product_variation_id")
    private UUID productVariationId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartId that = (CartId) o;
        return Objects.equals(customerUserId, that.customerUserId) &&
                Objects.equals(productVariationId, that.productVariationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerUserId, productVariationId);
    }
}
