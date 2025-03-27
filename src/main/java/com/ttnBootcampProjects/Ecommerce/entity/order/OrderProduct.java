package com.ttnBootcampProjects.Ecommerce.entity.order;

import com.ttnBootcampProjects.Ecommerce.entity.product.ProductVariation;
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
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID orderProductId;

    @ManyToOne
    @JoinColumn(name = "orderId")

    private Orders order;
    private int quantity;
    private double price;

    @ManyToOne
    @JoinColumn(name = "productVariationId")
    private ProductVariation productVariation;

    @OneToMany(mappedBy = "orderProduct")
    private List<OrderStatus> orderStatus;

}
