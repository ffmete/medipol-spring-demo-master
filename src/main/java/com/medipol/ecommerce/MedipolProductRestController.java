package com.medipol.ecommerce;

import com.medipol.ecommerce.model.Product;
import com.medipol.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping()//TODO
@RestController
public class MedipolProductRestController {

    @Autowired
    private ProductService productService;
    //add
    @RequestMapping(path = "/addProduct")
    public Product addProduct(@RequestParam Integer id,@RequestParam String name, @RequestParam int price) {
        return productService.add(id,name,price);

    }
    //delete
    @RequestMapping(path = "/removeProduct")
    public Product removeProduct(@RequestParam Integer id) {
        productService.delete(id);
        return (Product) productService.getProducts();
    }
    //update
    @RequestMapping(path = "/updateProduct")
    public Product updateProduct(@RequestParam Integer id, @RequestParam String name, @RequestParam int price) {
        //return productService.update(id, name, price);
        //hata verdigi için yorum satırına aldım
        return null;
    }
    //list
    @RequestMapping(path = "/listProduct")
    public List<Product> listProduct() {
        return productService.list();
    }
    //findById
    @RequestMapping(path = "/findProduct")
    public Product findProduct(@RequestParam int id) {
        return productService.findBy(id);
    }

}
