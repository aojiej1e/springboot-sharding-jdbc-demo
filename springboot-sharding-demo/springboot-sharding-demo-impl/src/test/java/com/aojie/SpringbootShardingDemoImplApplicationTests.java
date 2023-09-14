package com.aojie;

import com.aojie.dal.entity.Order;
import com.aojie.dal.mapper.OrderMapper;
import com.aojie.impl.SpringbootShardingDemoImplApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = SpringbootShardingDemoImplApplication.class)
@RunWith(SpringRunner.class)
class SpringbootShardingDemoImplApplicationTests {
    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void addOrders(){
        for (int i = 1; i <=10 ; i++) {
            Order orders = new Order();
            orders.setCustomId((long)i);
            orders.setOrderType("type");
            orders.setAmount((long)10000*i);
            orderMapper.insert(orders);
        }
    }

    @Test
    public void queryOrders(){
        Order orders = orderMapper.selectById(1L);
        System.out.println(orders);
    }

}
