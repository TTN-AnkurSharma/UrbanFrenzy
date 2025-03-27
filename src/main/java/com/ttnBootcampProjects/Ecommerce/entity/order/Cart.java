package com.ttnBootcampProjects.Ecommerce.entity.order;

import com.ttnBootcampProjects.Ecommerce.entity.product.ProductVariation;
import com.ttnBootcampProjects.Ecommerce.entity.users.Customer;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Cart {

    @EmbeddedId
    private CartId id;

    @ManyToOne
    @MapsId("customerUserId")
    private Customer customer;

    private int quantity;
    private boolean isWishlistItem;

    @ManyToOne
    @MapsId("productVariationId")
    private ProductVariation productVariation;

}
