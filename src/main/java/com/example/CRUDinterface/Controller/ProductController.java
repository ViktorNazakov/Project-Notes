package com.example.CRUDinterface.Controller;

import com.example.CRUDinterface.Model.Product;
import com.example.CRUDinterface.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.NoSuchElementException;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("")
    public String getListPage(Model model) {
        model.addAttribute("listProducts", productService.getAllProducts());
        return "index";
    }


    @GetMapping("/add")
    public ModelAndView addProductPage() {
        ModelAndView mav = new ModelAndView("addProduct");
        Product newProduct = new Product();
        mav.addObject("product",newProduct);
        return mav;

    }

    @PostMapping({"/saveProduct", "/notesEdit"})
    public String saveProduct(@ModelAttribute Product product) {
        productService.saveProduct(product);
        return "redirect:/";
    }

    @GetMapping("/{id}")
    public String editProduct(@PathVariable Integer id, Model model) {
        Product product = productService.findProductById(id);
        if (product == null) {
            throw new IllegalArgumentException("Invalid user id: " + id);
        }
        model.addAttribute("product", product);
        return "productEdit";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id) {
        productService.deleteById(id);
        return "redirect:/";
    }

}
