package com.hyt.demo.service.impl;

import com.hyt.demo.dao.ProductDao;
import com.hyt.demo.entity.Product;
import com.hyt.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author:king
 * FileName:ProductServiceImpl
 * Date:2021/6/11  10:21
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDao;

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }
    @Override
    public void adds(Product product) {
        productDao.adds(product);
    }

}
