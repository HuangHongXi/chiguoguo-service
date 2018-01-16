package com.huanghongxi.chiguoguoservice.service.Imp;

import com.huanghongxi.chiguoguoservice.dao.ShoppingCartDao;
import com.huanghongxi.chiguoguoservice.entity.ShoppingCart;
import com.huanghongxi.chiguoguoservice.service.ShoppingCartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class ShoppingCartServiceImp implements ShoppingCartService {

    @Resource
    private ShoppingCartDao shoppingCartDao;

    @Override
    public List<ShoppingCart> getShoppingCartByUserId(String userId) {
        return shoppingCartDao.findShoppingCartByUserId(userId);
    }

    @Override
    public int addProduct2ShoppingCart(ShoppingCart shoppingCart) {

        ShoppingCart existShoppingCart = shoppingCartDao.findShoppingCart(shoppingCart);

        Integer result;
        /*如果该商品已经添加到购物车，则叠加数量，否则直接插入*/
        if (existShoppingCart != null) {
            shoppingCart.setProductAmount(existShoppingCart.getProductAmount() + shoppingCart.getProductAmount());
            result = shoppingCartDao.updateShoppingCart(shoppingCart);
        } else {
            result = shoppingCartDao.addProduct2ShoppingCart(shoppingCart);
        }

        return result;
    }

    @Override
    public int updateShoppingCarts(String userId, List<ShoppingCart> carts) {

        int deleteResult = shoppingCartDao.deleteShoppingCartsByUserId(userId);
        log.debug("删除用户: {} 购物车内: {} 条商品", userId, deleteResult);

        return shoppingCartDao.insertList(carts);
    }
}
