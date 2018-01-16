package com.huanghongxi.chiguoguoservice.dao;

import com.huanghongxi.chiguoguoservice.entity.ShoppingCart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShoppingCartDao {

    List<ShoppingCart> findShoppingCartByUserId(@Param("userId") String userId);

    ShoppingCart findShoppingCart(@Param("entity") ShoppingCart shoppingCart);

    int addProduct2ShoppingCart(@Param("entity") ShoppingCart shoppingCart);

    int updateShoppingCart(@Param("entity") ShoppingCart shoppingCart);

    int deleteShoppingCartsByUserId(@Param("userId") String userId);

    int insertList(@Param("entities") List<ShoppingCart> carts);
}
