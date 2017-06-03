package com.medipol.ecommerce.service;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ProductServiceTest {

    @Test
    public void shouldListInitialProducts() throws Exception {
        //TODO
        ProductService productService = new ProductService();
    }

    @Test
    public void shouldAddOneProduct() throws Exception {
        //TODO
        ProductService productService = new ProductService();
        productService.add(3, "bardak" , 50);
        assertTrue(productService.list().size() == 3);
    }

    @Test
    public void shouldMultipleOneProduct() throws Exception {
        //TODO
        ProductService productService = new ProductService();
        productService.add( 3,"kalem", 10 );
        productService.add( 4,"silgi", 10 );
        assertTrue(productService.list().size() == 4);
    }

    @Test
    public void shouldDeleteProductById() throws Exception {
        //TODO
        ProductService productService = new ProductService();
        productService.delete( 2 );
        assertTrue(productService.list().size() == 1 );
    }

    @Test
    public void shouldUpdateProductName() throws Exception {
        //TODO
        final ProductService productService = new ProductService();
        productService.update(2, "newblance",100);

        assertTrue(productService.findBy(2 ).getName().equals("newblance"));

    }


    @Test
    public void shouldUpdateProductPrice() throws Exception {
        //TODO
    }

    @Test
    public void shouldUpdateProductNameAndPrice() throws Exception {
        //TODO
    }

}