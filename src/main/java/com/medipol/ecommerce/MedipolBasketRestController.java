package com.medipol.ecommerce;

import com.medipol.ecommerce.model.Basket;
import com.medipol.ecommerce.model.Product;
import com.medipol.ecommerce.service.BasketService;
import com.medipol.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping()//TODO
@RestController
public class MedipolBasketRestController {

    @Autowired private BasketService basketService;
    @Autowired private ProductService productService;

    @RequestMapping(path = "/addToBasket")
    public Basket addToBasket(@RequestParam int productId, @RequestParam int quantity) {

        Product product = productService.findBy(productId);
        basketService.addProduct(product, quantity);
        return basketService.getBasket();

    }

    //createBasket
    @RequestMapping(path = "/createBasket")
    public Basket createBasket() {
        basketService.createBasket();
        return basketService.getBasket();
    }

    //getBasketDetail
    @RequestMapping(path = "/getBasketDetail")
    public void getBasketDetail() {
        basketService.printBasketDetail();
    }
    //addToBasket

    //removeProduct
    @RequestMapping(path = "/removeProduct")
    public void removeProduct(@RequestParam int id) {
        Product product = productService.findBy(id);
        basketService.removeProduct(product);

    }
    //incrementQuantity
    @RequestMapping(path = "/incrementQuantity")
    public boolean incrementQuantity(@RequestParam int id,@RequestParam int quantity) {
        Product product = productService.findBy(id);
        basketService.incrementQuantity(product,quantity);
        return true;

    }
    //decrementQuantity
    @RequestMapping(path = "/decrementQuantity")
    public boolean decrementQuantity(@RequestParam int id,@RequestParam int quantity) {
        Product product = productService.findBy(id);
        basketService.decrementQuantity(product,quantity);
        return true;
    }
    //getBasketPrice

}
