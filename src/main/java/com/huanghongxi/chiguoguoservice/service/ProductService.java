package com.huanghongxi.chiguoguoservice.service;

import com.huanghongxi.chiguoguoservice.entity.Product;
import com.huanghongxi.chiguoguoservice.entity.condition.ProductCondition;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCondition productCondition);

    int addProduct(Product product);

    int updateProduct(Product product);

    int deleteProduct(String productId);

    Product getProduct(String productId);

}
