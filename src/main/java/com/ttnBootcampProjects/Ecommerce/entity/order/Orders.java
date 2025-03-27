package com.ttnBootcampProjects.Ecommerce.entity.order;

import com.ttnBootcampProjects.Ecommerce.entity.users.Customer;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID orderId;
    @ManyToOne
    @JoinColumn(name = "customerUserId",referencedColumnName = "userId")
    private Customer customer;
    private Double amountPaid;
    private LocalDate dateCreated;
    private String paymentMethod;
    private String customerAddressCity;
    private String customerAddressState;
    private String customerAddressCountry;
    private String customerAddressAddressLine;
    private int customerAddressZipCode;
  private String customerAddressLabel;

  @OneToMany(mappedBy = "order")
  private List<OrderProduct> orderProductList;

}
