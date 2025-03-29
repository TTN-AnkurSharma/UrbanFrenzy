package com.ttnBootcampProjects.Ecommerce.entity.product;

import com.ttnBootcampProjects.Ecommerce.entity.category.Category;
import com.ttnBootcampProjects.Ecommerce.entity.users.Customer;
import com.ttnBootcampProjects.Ecommerce.entity.users.Seller;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID productId;

    @ManyToOne
    @JoinColumn(name = "sellerUserId", referencedColumnName = "userId")
    private Seller seller;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    private Boolean isCancellable;

    private Boolean isReturnable;

    private String brand;

    private Boolean isActive;

    private Boolean isDeleted;

    @OneToMany(mappedBy = "product")
    private List<ProductVariation> productVariationList;

    @OneToMany(mappedBy = "product")
    private List<ProductReview> productReviewList;

}
