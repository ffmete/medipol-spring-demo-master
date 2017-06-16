package com.medipol.ecommerce;

import com.medipol.ecommerce.model.Basket;
import com.medipol.ecommerce.model.BasketItem;
import com.medipol.ecommerce.model.Product;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BasketTest {

    final Basket basket = new Basket();
    @Test
    public void shouldAddProductWithOneQuantity() throws Exception {

        final Product product = new Product(1, "nike air", 200);

        basket.addItem(new BasketItem(1, product));

        assertTrue(basket.getItems().size() == 1);
        assertTrue(basket.getItems().get(0).getProduct().equals(product));

    }

    @Test
    public void shouldAddProductWithTwoQuantity() throws Exception {
      //TODO
        final Product product = new Product(1, "nike air", 200);

        basket.addItem(new BasketItem(2, product));

        assertTrue(basket.getItems().size() == 1);

    }

    @Test
    public void shouldAddTwoDifferentProduct() throws Exception {
      //TODO
        final Product product = new Product(1, "nike air", 200);
        final Product product2 = new Product(2, "nb", 200);

        basket.addItem(new BasketItem(1,product));
        basket.addItem(new BasketItem(2,product2));
        assertTrue(basket.getItems().size()==2);

    }

    @Test
    public void shouldCalculateBasketPriceWithOneProductOneQuantity() throws Exception {

        //TODO
        final Product product = new Product(1, "nike air", 200);
        basket.addItem(new BasketItem(1,product));
        assertTrue(basket.calculateBasketPrice()==200);

    }

    @Test
    public void shouldCalculateBasketPriceWithOneProductTwoQuantity() throws Exception {

        //TODO
        final Product product = new Product(1, "nike air", 200);
        basket.addItem(new BasketItem(2,product));
        assertTrue(basket.calculateBasketPrice()==400);

    }

    @Test
    public void shouldCalculateBasketPriceWithMultipleProduct() throws Exception {
        //TODO
        final Product product = new Product(1, "nike air", 200);
        final Product product2 = new Product(2, "nb", 200);

        basket.addItem(new BasketItem(1,product));
        basket.addItem(new BasketItem(1,product2));
        assertTrue(basket.calculateBasketPrice()==400);
    }

    @Test
    public void shouldUpdateBasketItemQuantity() throws Exception {
        //TODO
        final Product product = new Product(1, "nike air", 200);
    }

}