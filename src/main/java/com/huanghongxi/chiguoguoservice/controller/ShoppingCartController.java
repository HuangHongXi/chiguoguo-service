package com.huanghongxi.chiguoguoservice.controller;

import com.huanghongxi.chiguoguoservice.entity.ShoppingCart;
import com.huanghongxi.chiguoguoservice.service.ShoppingCartService;
import com.huanghongxi.chiguoguoservice.system.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("shoppingCart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    /**
     * 查询购物车信息
     *
     * @param userId 用户编号
     * @return 购物车内商品信息
     */
    @GetMapping("{userId}")
    public Response getShoppingCart(@PathVariable String userId) {

        List<ShoppingCart> result = shoppingCartService.getShoppingCartByUserId(userId);
        return new Response<>().success(result);
    }

    /**
     * 单个添加商品到购物车
     *
     * @param userId        用户编号
     * @param productId     商品编号
     * @param productAmount 商品数量
     * @return 结果
     */
    @PostMapping("{userId}/product/{productId}")
    public Response addProduct2ShoppingCart(@PathVariable String userId,
                                            @PathVariable String productId,
                                            Integer productAmount) {
        ShoppingCart shoppingCart = new ShoppingCart(userId, productAmount);
        shoppingCart.setProductId(productId);
        int success = shoppingCartService.addProduct2ShoppingCart(shoppingCart);

        return success > 0 ? new Response().success() : new Response().failure();
    }

    /**
     * 全量更新购物车信息
     *
     * @param userId 用户编号
     * @return 操作结果
     */
    @PutMapping("{userId}")
    public Response updateShoppingCart(@PathVariable String userId,
                                       @RequestBody List<ShoppingCart> carts) {
        int result = shoppingCartService.updateShoppingCarts(userId, carts);
        return result > 0 ? new Response().success() : new Response().failure();
    }
}
