package com.hyt.demo.controller;

import com.hyt.demo.entity.Product;
import com.hyt.demo.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * author:king
 * FileName:ProductController
 * Date:2021/6/11  10:53
 */
@RestController
@RequestMapping("product")
@Slf4j
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("findAll")
    public Map<String,List> findAll(){
        List<Product> list = productService.findAll();
        List<String> productNameList = list.stream().map(Product::getProduct_name).collect(Collectors.toList());
        List<Integer> numList = list.stream().map(Product::getNum).collect(Collectors.toList());
        Map<String,List> map=new HashMap<>();
        map.put("productName",productNameList);
        map.put("num",numList);
        log.info(productNameList.toString());
        return map;
    }
}
