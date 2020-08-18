package com.o0u0o.service;

import com.o0u0o.form.CategoryAddForm;
import com.o0u0o.vo.ResponseVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ICategoryServiceTest {

    @Autowired
    private ICategoryService categoryService;

    @Test
    public void add() {
        CategoryAddForm form = new CategoryAddForm();
        form.setName("测试");
        ResponseVo result = categoryService.add(form);
    }
}