package tsp.gps;

public class Item {
    private String name;
    private long price;
    private int weight;

    public String getName (){
        return name;
    }

    public long getPrice (){
        return price;
    }

    public int getWeight(){
        return this.weight;
    }

    Item(String name, long price){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

}
