package com.zhych.sell.dto;


import lombok.Data;

/**
 * 购物车
 */
@Data
public class CartDTO {

    //商品的id
    private String productId;

    //商品的数量
    private Integer productQuantiry;

    public CartDTO(String productId, Integer productQuantiry) {
        this.productId = productId;
        this.productQuantiry = productQuantiry;
    }
}
