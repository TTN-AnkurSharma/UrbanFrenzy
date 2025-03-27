package com.ttnBootcampProjects.Ecommerce.entity.product;

import com.ttnBootcampProjects.Ecommerce.entity.users.Customer;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductReview {

    @EmbeddedId
    private ProductReviewId id;

    @ManyToOne
    @MapsId("customerId")
    @JoinColumn(name = "customer_user_id")
    private Customer customer;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private Product product;

    private String review;
    private Double rating;
}
