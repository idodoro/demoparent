package com.example.web.dao;

import com.example.web.entity.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

/**
 * Created by Zhaixiangyang on 2018/8/23-023.
 */
@Mapper
public interface ProductDao {
    @Insert("insert into product (name, price) values (#{name},#{price})")
    @Options(useGeneratedKeys = true)
    boolean save(Product product);
}
