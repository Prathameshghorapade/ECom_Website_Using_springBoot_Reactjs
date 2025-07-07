package com.ecomwebsite.DTO;


import com.ecomwebsite.Enums.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long userId;


    private String name;


    private String password;


    private String email;


    private String phoneNumber;


    private UserRole role;



    private List<OrderItemDto> orderItemList ;

    private AddressDto address;


    private LocalDateTime createdAt;

}
