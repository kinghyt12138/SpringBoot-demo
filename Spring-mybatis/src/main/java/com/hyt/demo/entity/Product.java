package com.hyt.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * author:king
 * FileName:Product
 * Date:2021/6/11  10:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    //商品id
    private int pid;
    //商品名称
    private String product_name;
    private int num;
    //创建时间
    private Date create_time;
}
