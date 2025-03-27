package com.ttnBootcampProjects.Ecommerce.entity.product;

import com.ttnBootcampProjects.Ecommerce.entity.order.Cart;
import com.ttnBootcampProjects.Ecommerce.entity.users.Customer;
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
public class ProductVariation {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID productVariationId;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    private int quantityAvailable;
    private double price;

    private String metadata;
    private String primaryImageName;
    private boolean isActive;

    @OneToMany(mappedBy = "productVariation")
    private List<Cart> cartItems;

    @ManyToMany
    @JoinTable(name = "wishlist",
            joinColumns = @JoinColumn(name = "productVariationId"),
            inverseJoinColumns = @JoinColumn(name = "userId"))
    private List<Customer> customers;

}
