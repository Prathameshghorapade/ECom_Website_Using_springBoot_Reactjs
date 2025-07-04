package com.ecomwebsite.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LogInRequest {

    @NotBlank(message = "Email is Required")
    private String email;

    @NotBlank(message = "Password is Required")
    private String password;


}
