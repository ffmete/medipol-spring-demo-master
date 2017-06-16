package com.medipol.ecommerce.service;

import com.medipol.ecommerce.model.Basket;
import com.medipol.ecommerce.model.BasketItem;
import com.medipol.ecommerce.model.Product;
import org.springframework.stereotype.Service;

@Service
public class BasketService {

    private Basket basket = new Basket();

    public void createBasket() {
        basket = new Basket();
    }

    public void printBasketDetail() {
        //TODO productName, quantity
        for (BasketItem basketItem:basket.getItems()){
            System.out.println("Name:"+basketItem.getProduct().getName()+" Price"+basketItem.getProduct().getPrice()+" Quality"+basketItem.getQuantity());
        }
    }

    public void addProduct(Product product, Integer quantity){
        //TODO
        BasketItem basketItem = new BasketItem(quantity,product);
        basket.addItem(basketItem);
    }

    public void removeProduct(Product product){
        //TODO
        //sepetten ilgili ürünü silmeli
        for (int i = 0; i < basket.getItems().size(); i++) {
            if ((basket.getItems().get(i).getProduct() == product)){
                basket.getItems().remove(basket.getItems().get(i));
            }
        }
    }

    public void incrementQuantity(Product product, Integer quantity){
        //TODO sepetteki itemin sayisi soylenen k   adar artirilmali
        for (int i = 0; i < basket.getItems().size(); i++) {
            if (basket.getItems().get(i).getProduct() == product){
                Integer newQuantity = basket.getItems().get(i).getQuantity();
                BasketItem basketItem = new BasketItem(newQuantity + quantity, product);
                basket.getItems().set(i, basketItem);
            }
        }
    }

    public void decrementQuantity(Product product, Integer quantity){
        //TODO sepetteki itemin sayisi soylenen kadar azaltilmali
        //0 ise sepetten cikartilmali
        for (int i = 0; i < basket.getItems().size(); i++) {
            if (basket.getItems().get(i).getProduct() == product) {
                Integer newQuantity = basket.getItems().get(i).getQuantity();
                BasketItem basketItem = new BasketItem(quantity - newQuantity, product);
                basket.getItems().set(i, basketItem);
            }
        }
    }

    public Basket getBasket() {
        return basket;
    }

    public Integer getBasketPrice() {
        //TODO  sepet tutarini donmeli
        basket.calculateBasketPrice();
        return 0;
    }

}
