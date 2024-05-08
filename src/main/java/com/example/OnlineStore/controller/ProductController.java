package com.example.OnlineStore.controller;

import com.example.OnlineStore.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping("/")
    public String product(Model model){
            model.addAttribute("products",productService.listProducts());
            return "products.ftlh";
    }
}
