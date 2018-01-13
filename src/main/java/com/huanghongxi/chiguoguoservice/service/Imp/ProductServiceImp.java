package com.huanghongxi.chiguoguoservice.service.Imp;

import com.huanghongxi.chiguoguoservice.dao.ProductDao;
import com.huanghongxi.chiguoguoservice.entity.Product;
import com.huanghongxi.chiguoguoservice.entity.condition.ProductCondition;
import com.huanghongxi.chiguoguoservice.service.ProductService;
import com.huanghongxi.chiguoguoservice.system.utils.UUIDTool;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImp implements ProductService {

    @Resource
    private ProductDao productDao;

    @Override
    public List<Product> getProducts(ProductCondition productCondition) {
        return productDao.findProductsByCondition(productCondition);
    }

    @Override
    public int addProduct(Product product) {

        product.setProductId(UUIDTool.getUUID());
        product.setUpdateTime(new Date());
        return productDao.addProduct(product);
    }

    @Override
    public int updateProduct(Product product) {
        return productDao.updateProduct(product);
    }

    @Override
    public int deleteProduct(String productId) {
        return productDao.deleteProduct(productId);
    }

    @Override
    public Product getProduct(String productId) {
        return productDao.findProductById(productId);
    }
}
