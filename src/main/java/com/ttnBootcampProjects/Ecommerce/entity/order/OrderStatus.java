package com.ttnBootcampProjects.Ecommerce.entity.order;

import com.ttnBootcampProjects.Ecommerce.enums.OrderStatusType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OrderStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID orderStatusId;

    @ManyToOne
    @JoinColumn(name = "orderProductId")
    private OrderProduct orderProduct;

    @Enumerated(EnumType.STRING)
    private OrderStatusType fromStatus;

    @Enumerated(EnumType.STRING)
    private OrderStatusType toStatus;

    private String transitionNotesComment;

    private LocalDate transitionDate;
}
