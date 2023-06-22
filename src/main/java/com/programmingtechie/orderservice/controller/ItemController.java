package com.programmingtechie.orderservice.controller;

import com.programmingtechie.orderservice.dto.OrderData;
import com.programmingtechie.orderservice.dto.RequestData;
import com.programmingtechie.orderservice.dto.OrderInfo;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zoetian
 * @create 6/15/23
 */


@RestController
@RequestMapping("/api/items")
@Validated
public class ItemController {



    @PostMapping(value = "allItems",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public OrderInfo createOrderList(@RequestBody @Valid List<RequestData> orderRequest) {

            OrderInfo orderInfo = new OrderInfo();
            List<OrderData> orderDataList = new ArrayList<>();
            orderInfo.setCurrency(orderRequest.get(0).getCurrency());
            orderInfo.setEmailAddress(orderRequest.get(0).getEmailAddress());
            for(RequestData request : orderRequest){
                OrderData orderData = new OrderData();
                orderData.setItemID(request.getItemID());
                orderData.setPrice(request.getPrice());
                orderData.setItemDescription(request.getItemDescription());
                orderDataList.add(orderData);
            }
            orderInfo.setOrderDataList(orderDataList);
            return orderInfo;



    }

    @PostMapping(value = "/item",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public RequestData createOneOrder(@RequestBody @Validated RequestData orderRequest){
//        if(bindingResult.hasErrors()){
//            return bindingResult.getAllErrors().get(0).toString();
//        }
        return orderRequest;
    }


}
