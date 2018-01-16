package com.huanghongxi.chiguoguoservice.service;

import com.huanghongxi.chiguoguoservice.controller.ShoppingCartController;
import com.huanghongxi.chiguoguoservice.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {

    List<ShoppingCart> getShoppingCartByUserId(String userId);

    int addProduct2ShoppingCart(ShoppingCart shoppingCart);

    int updateShoppingCarts(String userId, List<ShoppingCart> carts);
}
