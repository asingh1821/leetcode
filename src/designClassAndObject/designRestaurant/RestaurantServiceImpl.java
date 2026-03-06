package designClassAndObject.designRestaurant;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RestaurantServiceImpl implements RestaurantService{

    private List<Restaurant> restaurantList;
    public RestaurantServiceImpl(List<Restaurant> restaurantList) {
        this.restaurantList=restaurantList;
    }
    public RestaurantServiceImpl(){

    }
    //VEG Restaurant
    @Override
    public List<Restaurant> getVegRestaurant() {
        return restaurantList.stream()
                .filter(res-> res.getMenu().stream().allMatch(MenuItem::isVeg))
                .collect(Collectors.toList());
    }
    //sort restaurant as per rating
    @Override
    public List<Restaurant> sortRestaurantByRating() {
        return restaurantList.stream()
                .sorted(Comparator.comparingDouble(Restaurant::getRating).reversed())
                .collect(Collectors.toList());
    }
    //cheapest dish across all restaurant
    @Override
    public MenuItem findCheapestDish() {
        return restaurantList.stream()
                .flatMap(res-> res.getMenu().stream())
                .min(Comparator.comparingDouble(MenuItem::getPrice))
                .orElse(null);
    }

}
