package com.programmingtechie.orderservice.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;

/**
 * @author zoetian
 * @create 6/15/23
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestData {
    @Digits(integer = 8, fraction = 0, message = "itemId must be an 8 digit number")
    private BigDecimal itemID;//integer/Bigdecimal, 8 digit

    @Pattern(regexp = "^[a-zA-Z0-9 ]*$",message = "itemDescription can not include special characters")
    private String itemDescription;//no special

    @DecimalMin(value = "0.0",inclusive = false, message = "price must be a positive number")
    private BigDecimal price;//integer/decimal

    @Pattern(regexp = "^(USD|EUR|GBP|JPY)$")
    private String currency;//a list (need to be one of list)

    @Email(message = "email address must be valid")
    private String emailAddress;//should have valid email address
}
