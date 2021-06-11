package com.hyt.demo.service;

import com.hyt.demo.entity.Product;

import java.util.List;

/**
 * author:king
 * FileName:ProductService
 * Date:2021/6/11  10:20
 */
public interface ProductService {
    //查找全部
    List<Product>findAll();
    //添加商品
    void adds(Product product);

}
