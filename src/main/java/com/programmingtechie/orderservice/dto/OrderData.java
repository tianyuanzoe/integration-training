package com.programmingtechie.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author zoetian
 * @create 6/16/23
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderData {
    private BigDecimal itemID;
    private String itemDescription;
    private BigDecimal price;
}
