package com.example.springbootmybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMapper {

    @Select("select * from customer")
    List<Customer> selectAllCustomer();

}
