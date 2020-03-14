package com.zhych.sell.service;

import com.zhych.sell.dto.OrderDTO;

public interface PayService {

    void create(OrderDTO orderDTO);
}
