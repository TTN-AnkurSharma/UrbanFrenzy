package com.ttnBootcampProjects.Ecommerce.entity.product;

import com.ttnBootcampProjects.Ecommerce.entity.order.Cart;
import com.ttnBootcampProjects.Ecommerce.entity.users.Customer;
import io.hypersistence.utils.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
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

    private Integer quantityAvailable;
    private BigDecimal price;

    @Type(JsonType.class)
    @Column(columnDefinition = "json")
    private Map<String, Object> metadata;

    private String primaryImageName;
    private boolean isActive;

    @OneToMany(mappedBy = "productVariation")
    private List<Cart> cartItems;


}
