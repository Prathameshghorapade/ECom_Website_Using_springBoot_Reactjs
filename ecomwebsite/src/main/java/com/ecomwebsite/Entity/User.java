package com.ecomwebsite.Entity;

import com.ecomwebsite.Enums.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotBlank(message = "Name is Required")
    private String name;

    @NotBlank(message = "Password is Required")
    private String password;

    @Column(unique = true)
    @NotBlank(message = "Email is Required")
    private String email;

    @Column(name = "phone_number")
    @NotBlank(message = "Phone Number is Required")
    private String phoneNumber;


    private UserRole role;


    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    private List<OrderItem> orderItemList ;


    @OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    private Address address;

    @Column(name = "created_at")
    private final LocalDateTime createdAt = LocalDateTime.now();


}
