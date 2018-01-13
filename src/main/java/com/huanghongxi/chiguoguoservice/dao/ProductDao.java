package com.huanghongxi.chiguoguoservice.dao;

import com.huanghongxi.chiguoguoservice.entity.Product;
import com.huanghongxi.chiguoguoservice.entity.condition.ProductCondition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {

    List<Product> findProductsByCondition(@Param("condition") ProductCondition productCondition);

    int addProduct(@Param("entity") Product product);

    int updateProduct(@Param("entity") Product product);

    int deleteProduct(@Param("productId") String productId);

    Product findProductById(@Param("productId") String productId);
}
