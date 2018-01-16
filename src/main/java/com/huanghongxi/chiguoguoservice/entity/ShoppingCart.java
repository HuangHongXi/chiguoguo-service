package com.huanghongxi.chiguoguoservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShoppingCart extends Product {

    private String userId;          //用户编号
//    private String productId;       //产品编号
    private Integer productAmount;  //数量
}
