package com.ttnBootcampProjects.Ecommerce.entity.users;

import com.ttnBootcampProjects.Ecommerce.entity.order.Cart;
import com.ttnBootcampProjects.Ecommerce.entity.order.Orders;
import com.ttnBootcampProjects.Ecommerce.entity.product.ProductVariation;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.*;

import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "userId")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer extends User{
    private Long contact;

    @OneToMany(mappedBy = "customer")
    private List<Orders> orders;

    @OneToMany(mappedBy = "customer")
    private List<Cart> carts;

    @ManyToMany(mappedBy = "customers")
    private List<ProductVariation> productVariationList;
}
