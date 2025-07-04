package com.ecomwebsite.DTO;


import com.ecomwebsite.Entity.Address;
import com.ecomwebsite.Enums.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
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



    private List<OrederItemDto> orderItemList ;

    private AddressDto address;


    private LocalDateTime createdAt;

}
