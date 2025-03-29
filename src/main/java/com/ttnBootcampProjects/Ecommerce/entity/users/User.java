package com.ttnBootcampProjects.Ecommerce.entity.users;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID userId;
    @Column(name = "email")
    private String emailId;

    private String firstName;

    private String middleName;
    private String lastName;
    private String password;

    private boolean isDeleted;
    private boolean isActive;
    private boolean isExpired;
    private boolean isLocked;
    private int invalidAttemptCount;
    private LocalDate passwordUpdateDate;

    @ManyToMany(mappedBy = "userList")
    private Set<Role> roles;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private Set<Address> addresses;


}

