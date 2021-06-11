package com.hyt.demo;


import com.hyt.demo.entity.Product;
import com.hyt.demo.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class SpringMybatisApplicationTests {
    @Autowired
    ProductService productService;
    @Test
    public void add() throws CloneNotSupportedException {
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        Date date = new Date();
        Product p = new Product();
        p.setPid(1);
        p.setCreate_time(date);
        p.setProduct_name("鞋子");
        p.setNum(20);

        Product p1 = new Product();
        p1.setPid(2);
        p1.setProduct_name("袜子");
        p1.setNum(30);
        p1.setCreate_time(date);
        Product p2 = new Product();
        p2.setPid(3);
        p2.setProduct_name("衣服");
        p2.setNum(50);
        p2.setCreate_time(date);
        Product p3 = new Product();
        p3.setPid(4);
        p3.setProduct_name("裤子");
        p3.setNum(60);
        p3.setCreate_time(date);


        try {
            productService.adds(p);
            productService.adds(p1);
            productService.adds(p2);
            productService.adds(p3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void findAll() {
        List<Product> all = productService.findAll();
        System.out.println(all);
    }

    @Test
    void contextLoads() {
    }

}
