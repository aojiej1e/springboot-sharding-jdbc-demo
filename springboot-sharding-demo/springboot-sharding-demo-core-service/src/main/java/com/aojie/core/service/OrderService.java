package com.aojie.core.service;


import com.aojie.dal.entity.Order;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 *
 */
public interface OrderService extends IService<Order> {

    /**
     * 获取订单信息
     * @param orderId
     * @return
     */
    Order getOrder(Integer orderId);
}
