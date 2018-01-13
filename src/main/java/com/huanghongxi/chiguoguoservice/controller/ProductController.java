package com.huanghongxi.chiguoguoservice.controller;

import com.huanghongxi.chiguoguoservice.entity.Product;
import com.huanghongxi.chiguoguoservice.entity.condition.ProductCondition;
import com.huanghongxi.chiguoguoservice.service.ProductService;
import com.huanghongxi.chiguoguoservice.system.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * 根据条件获取商品列表
     *
     * @return 商品列表
     */
    @GetMapping("products")
    public Response getProducts(ProductCondition productCondition) {

        List<Product> products = productService.getProducts(productCondition);
        return new Response<>().success(products);
    }

    /**
     * 根据商品编号获取商品
     *
     * @param productId 商品编号
     * @return 商品信息
     */
    @GetMapping("product/{productId}")
    public Response getProduct(@PathVariable("productId") String productId) {

        Product result = productService.getProduct(productId);
        return new Response<>().success(result);
    }

    /**
     * 添加商品
     *
     * @return 结果
     */
    @PostMapping("product")
    public Response addProduct(@RequestBody Product product) {

        int result = productService.addProduct(product);
        return result > 0 ? new Response<>().success() : new Response().failure();
    }

    /**
     * 修改商品
     *
     * @param product 商品信息
     * @return 结果
     */
    @PutMapping("product")
    public Response updateProduct(@RequestBody Product product) {

        int result = productService.updateProduct(product);
        return result > 0 ? new Response<>().success() : new Response().failure();
    }

    /**
     * 删除商品
     *
     * @param productId 商品编号
     * @return 结果
     */
    @DeleteMapping("product/{productId}")
    public Response deleteProduct(@PathVariable("productId") String productId) {

        int result = productService.deleteProduct(productId);
        return result > 0 ? new Response<>().success() : new Response().failure();
    }


}
