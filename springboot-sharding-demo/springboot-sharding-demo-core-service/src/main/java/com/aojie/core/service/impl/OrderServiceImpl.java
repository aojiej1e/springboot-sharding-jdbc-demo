package com.aojie.core.service.impl;

import com.aojie.core.service.OrderService;
import com.aojie.dal.entity.Order;
import com.aojie.dal.mapper.OrderMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author MSI
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Override
    public Order getOrder(Integer orderId) {
        return null;
    }
}




