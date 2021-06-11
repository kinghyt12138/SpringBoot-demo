package com.hyt.demo.dao;

import com.hyt.demo.entity.Product;

import java.util.List;

/**
 * author:king
 * FileName:ProductDao
 * Date:2021/6/11  10:21
 */
public interface ProductDao  {
    //查找全部
    List<Product> findAll();
    //添加商品
    void adds(Product product);
}
