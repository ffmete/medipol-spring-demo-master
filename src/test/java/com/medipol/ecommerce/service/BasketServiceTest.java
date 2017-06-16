package com.medipol.ecommerce.service;

import com.medipol.ecommerce.model.Product;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class BasketServiceTest {

    final BasketService basketService = new BasketService();
    @Test
    public void shouldCreateBasket() throws Exception {
        //TODO
        basketService.createBasket();
        assertTrue(basketService.getBasket()== null);
    }

    @Test
    public void shouldAddProductWithOneQuantity() throws Exception {
        //TODO
    }

    @Test
    public void shouldAddProductWithTwoQuantity() throws Exception {
        //TODO
    }

    @Test
    public void shouldAddMultipleProduct() throws Exception {
        //TODO
        Product p1 = new Product(1,"samsung",500);
        Product p2 = new Product(2,"apple",500);
        basketService.addProduct(p1,1);
        basketService.addProduct(p2,1);

        assertTrue(basketService.getBasket().getItems().size()==2);

    }

    @Test
    public void shouldRemoveProduct() throws Exception {
        //TODO
        Product p1= new Product(1,"dell",100);
        basketService.addProduct(p1,1);
        basketService.removeProduct(p1);
        assertTrue(basketService.getBasket().getItems().size()==0);
    }

    @Test
    public void shouldIncrementBasketItemQuantity() throws Exception {
        //TODO
        Product p1=new Product(1,"dell",100);
        basketService.addProduct(p1,1);
        basketService.incrementQuantity(p1,1);
        assertTrue(basketService.getBasketPrice()==200);
    }

    @Test
    public void shouldDecrementBasketItemQuantity() throws Exception {
        //TODO
        Product p1=new Product(1,"dell",100);
        Product p2=new Product(2,"apple",100);
        basketService.addProduct(p1,2);
        basketService.addProduct(p2,1);
        basketService.decrementQuantity(p1,1);
        assertTrue(basketService.getBasketPrice()==200);

    }

    @Test
    public void shouldDecrementBasketItemQuantityAndRemoveWhenQuantityZero() throws Exception {
        //TODO
        Product p1=new Product(1,"dell",100);
        Product p2=new Product(2,"apple",100);
        basketService.addProduct(p1,2);
        basketService.addProduct(p2,1);
        basketService.decrementQuantity(p1,2);
        assertTrue(basketService.getBasket().getItems().size()==1);
    }

    @Test
    public void shouldPriceBeZeroWhenBasketIsEmpty() throws Exception {
        //TODO sepet bosken total 0 olmalı
        assertTrue(basketService.getBasketPrice()==0);
    }

    @Test
    public void shouldCalculateOneProductPrice() throws Exception {
        //TODO sepette 1 urun varken price hesaplanmali
        Product p1=new Product(1,"dell",100);
        basketService.addProduct(p1,1);
        assertTrue(basketService.getBasketPrice()==100);
    }

    @Test
    public void shouldCalculateMultipleProductPrice() throws Exception {
        //TODO sepette coklu urun varken price hesaplanmali
        Product p1=new Product(1,"dell",100);
        Product p2=new Product(2,"apple",100);
        basketService.addProduct(p1,2);
        basketService.addProduct(p2,2);
        assertTrue(basketService.getBasketPrice()==400);
    }

    @Test
    public void shouldCalculateOneProductPriceAfterIncrement() throws Exception {
        //TODO sepette 1 urun varken sayisi arttirildiginda price hesaplanmali
        Product p1=new Product(1,"dell",100);
        basketService.addProduct(p1,1);
        basketService.incrementQuantity(p1,5);
        assertTrue(basketService.getBasketPrice()==600);
    }

    @Test
    public void shouldCalculateOneProductPriceAfterDecrement() throws Exception {
        //TODO sepette 1 urun varken sayisi azaltildiginda price hesaplanmali
        Product p1=new Product(1,"dell",100);
        basketService.addProduct(p1,3);
        basketService.decrementQuantity(p1,1);
        assertTrue(basketService.getBasketPrice()==200);
    }

    @Test
    public void shouldCalculatePriceWithMultipleProductAndOneQuantityIncrementOperation() throws Exception {
        //TODO sepette coklu urun varken ve bir sayi arttirma isleminden sonra price hesaplanmali
        Product p1=new Product(1,"dell",100);
        Product p2=new Product(2,"apple",100);
        basketService.addProduct(p1,2);
        basketService.addProduct(p2,2);
        basketService.incrementQuantity(p1,2);
        basketService.incrementQuantity(p2,2);
        assertTrue(basketService.getBasketPrice()==800);
    }

    @Test
    public void shouldCalculatePriceWithMultipleProductAndOneQuantityDecrementOperation() throws Exception {
        //TODO sepette coklu urun varken ve bir sayi azaltma isleminden sonra price hesaplanmali
        Product p1=new Product(1,"dell",100);
        Product p2=new Product(2,"apple",100);
        basketService.addProduct(p1,2);
        basketService.addProduct(p2,2);
        basketService.decrementQuantity(p1,1);
        basketService.decrementQuantity(p2,1);
        assertTrue(basketService.getBasketPrice()==200);


    }


}