package com.programmingtechie.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * @author zoetian
 * @create 6/16/23
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderInfo {
    private String currency;
    private String emailAddress;

//    @XmlElementWrapper(name = "OrderDataList")
    @XmlElement(name = "OrderData")
    private List<OrderData> orderDataList;
}
