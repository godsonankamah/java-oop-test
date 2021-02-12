import exceptions.ProductAlreadyRegisteredException;

import java.util.*;

public class MontrealTradedProductsImpl implements  MontrealTradedProducts{

    Map<Product,Integer> products=new HashMap<Product,Integer>();

    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        if(products.containsKey(product)){
            throw new ProductAlreadyRegisteredException("Product already exist");
        }
        products.put(product,0);
    }

    @Override
    public void trade(Product product, int quantity) {
        if(!products.containsKey(product)){
            return;
        }
        products.replace(product,quantity,quantity+quantity);
    }

    @Override
    public int totalTradeQuantityForDay() {
        int totalQuantityTraded=0;
        for(Product p:products.keySet()){

        }
        return 0;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        return 0;
    }
}
