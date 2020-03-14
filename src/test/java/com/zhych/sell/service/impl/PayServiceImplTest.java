package com.zhych.sell.service.impl;

import com.zhych.sell.SellApplicationTests;
import com.zhych.sell.dto.OrderDTO;
import com.zhych.sell.service.OrderService;
import com.zhych.sell.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.weaver.ast.Or;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created By Superman
 * Date: 2020/3/15
 * Time: 0:11
 * Description:
 */

@Slf4j
public class PayServiceImplTest extends SellApplicationTests {

    @Autowired
    private PayService payService;

    @Autowired
    private OrderService orderService;

    @Test
    public void create() {
        OrderDTO orderDTO = orderService.findOne("1577272635625807487");
        payService.create(orderDTO);
    }
}