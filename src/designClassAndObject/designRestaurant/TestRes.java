package designClassAndObject.designRestaurant;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestRes {
    public static void main(String[] args) {
        MenuItem m1 = new MenuItem(1,"Palak Paneer",150,true);
        MenuItem m2 = new MenuItem(2,"Mushroom biriyani",200,true);
        MenuItem m3 = new MenuItem(3,"chicken biriyani",250,false);
        MenuItem m4 = new MenuItem(4,"coffee",20,true);
        MenuItem m5 = new MenuItem(5,"chicken tikka",220,false);

        Restaurant r1 = new Restaurant(1,"Zayaka","Patna",4,
                Arrays.asList(m2,m3));
        Restaurant r2 = new Restaurant(2,"Lazeez","Muz",3.8,
                Arrays.asList(m1,m4));
        Restaurant r3 = new Restaurant(3,"Navya","Patna",3.9,
                Arrays.asList(m1,m2,m3));
        Restaurant r4 = new Restaurant(4,"Janglee","Patna",2.9,
                Arrays.asList(m3,m5));
        Restaurant r5 = new Restaurant(5,"Testy","Patna",4.2,
                Arrays.asList(m1,m2,m4));

        List<Restaurant> restaurantList = Arrays.asList(r1,r2,r3,r4,r5);
        RestaurantServiceImpl res = new RestaurantServiceImpl(restaurantList);

        //Veg Restaurant
        res.getVegRestaurant().forEach(System.out::println);

        //sorted restaurant as per rating
        res.sortRestaurantByRating().forEach(System.out::println);
        //cheapest dish
        System.out.println(res.findCheapestDish().getMenuName());
    }

}
