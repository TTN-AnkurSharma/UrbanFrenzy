package com.ttnBootcampProjects.Ecommerce.entity.category;


import com.ttnBootcampProjects.Ecommerce.entity.product.Product;
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
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID categoryId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "parentCategoryId")
    private Category parentCategory;

    @OneToMany(mappedBy = "parentCategory", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Category> leafCategories;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

}
