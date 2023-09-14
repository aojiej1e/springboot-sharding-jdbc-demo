package com.aojie.impl.controller;

import com.alibaba.fastjson.JSON;
import com.aojie.core.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/getOrder")
    public String getOrderDetail(@RequestParam("id")Integer orderId){
        return JSON.toJSONString(orderService.getOrder(orderId));
    }
}
