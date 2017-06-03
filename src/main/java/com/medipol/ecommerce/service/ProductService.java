package com.medipol.ecommerce.service;

import com.medipol.ecommerce.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<Product>();

    public ProductService() {

        products.add(new Product(1, "nike air", 200));
        products.add(new Product(2, "addidas", 300));
    }

    public void add(Integer id,String name, Integer quantity){
        //TODO

        Product newProduct = new Product(id,name,quantity);
        products.add(newProduct);

        //veya

        //products.add(new Product(id,name,quantity));

    }

    public void delete(Integer id) {
        //TODO

        for (int i = 0 ; i < products.size(); i++){
            if (products.get(i).getId().equals(id)){
                products.remove(i);
                break;
            }

        }
    }

    public void update(Integer id, String name, Integer price){
        //TODO
        for (int i = 0 ; i <products.size();i++){
            if (products.get(i).getId().equals(id)){
                products.get(i).setName(name);
                products.get(i).setPrice(price);
            }

        }

    }

    public List<Product> list(){
        return products;
    }

    public Product findBy(int productId) {
        //TODO

        for (int i = 0; i<products.size(); i++){
            if (products.get(i).getId().equals(productId)){
                return  products.get(i);
            }

        }
        return null;
    }
}
