package com.example.web.controller;

import com.example.web.dao.ProductDao;
import com.example.web.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Zhaixiangyang on 2018/8/23-023.
 */
@Controller
public class HelloController {
    @Autowired
    private ProductDao productDao;

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("helloparam", "xxx");
//        modelAndView.addObject("helloparam","helloworld");
        return "index";
    }

    @RequestMapping("/save")
    public String save(Model model, @RequestParam String name, @RequestParam Double price) {
        System.out.println(name);
        System.out.println(price);
        Product product = new Product(name, price);

        boolean bool_save = false;
        try {
            productDao.save(product);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(bool_save);

        if (bool_save) {
            model.addAttribute("product", product);
        } else {
            model.addAttribute("error", "新增失败");
        }
        return "index";
    }
}
