package tsp.gps;


import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {

    private List<Item> cart = new ArrayList();

    public void addItem (Item item){
        cart.add(item);
    }

    public void removeItem (Item item){
      cart.remove(item);
    }

    public float itemCount(){
        return cart.size();
    }

    public double totalPrice(){
        double sum = 0;
        for(int i = 0; i < cart.size(); i++)
            sum += cart.get(i);
        return sum;
    }

    


}
