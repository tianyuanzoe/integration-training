package com.programmingtechie.orderservice.exceptionHandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author zoetian
 * @create 6/21/23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseInfo<T> {

        /**
         * status code
         */
        protected String code;

        protected Map<String,String> msg;
        /**
         * return data
         */




}
