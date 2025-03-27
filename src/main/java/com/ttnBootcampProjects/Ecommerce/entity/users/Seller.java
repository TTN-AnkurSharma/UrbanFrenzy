package com.ttnBootcampProjects.Ecommerce.entity.users;

import com.ttnBootcampProjects.Ecommerce.entity.product.Product;
import jakarta.persistence.Entity;
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
public class Seller extends User{
    private String gst;
    private Long companyContact;
    private String companyName;

    @OneToMany(mappedBy = "seller")
    private List<Product> productList;
}
