package com.ttnBootcampProjects.Ecommerce.entity.order;

import com.ttnBootcampProjects.Ecommerce.enums.FromStatus;
import com.ttnBootcampProjects.Ecommerce.enums.ToStatus;
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
    @ManyToOne
    @JoinColumn(name = "orderProductId")
    private OrderProduct orderProduct;

    @Enumerated(EnumType.STRING)
    private FromStatus fromStatus;

    @Enumerated(EnumType.STRING)
    private ToStatus toStatus;

    private String transitionNotesComment;

    private LocalDate transitionDate;
}
