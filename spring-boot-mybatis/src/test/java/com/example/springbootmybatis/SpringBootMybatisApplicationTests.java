package com.example.springbootmybatis;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class SpringBootMybatisApplicationTests {

    @Autowired
    private TestMapper testMapper;

    @Test
    void contextLoads() {
        List<Customer> customers = testMapper.selectAllCustomer();
        customers.forEach(c -> log.info(c.toString()));
    }

}
