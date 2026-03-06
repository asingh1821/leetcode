package designClassAndObject.designRestaurant;

import java.util.List;

public class Restaurant {
    private int restId;
    private String restName;
    private String city;
    private double rating;

    private List<MenuItem> menu;
    public Restaurant(int restId,String restName, String city, double rating,List<MenuItem> menu){
        this.restId=restId;
        this.restName=restName;
        this.city=city;
        this.rating=rating;
        this.menu=menu;
    }
    public int getRestId(){
        return restId;
    }
    public String getRestName(){
        return restName;
    }
    public String getCity(){
        return city;
    }
    public double getRating(){
        return rating;
    }
    public List<MenuItem> getMenu(){
        return menu;
    }
    public String toString(){
        return "Restaurant id " + restId
                + " Restaurant name "+ restName +
                "  city " + city +
                " rating " + rating +
                "list of menu : " + menu;
    }
}
