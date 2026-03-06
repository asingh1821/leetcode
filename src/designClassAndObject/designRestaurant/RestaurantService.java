package designClassAndObject.designRestaurant;

import java.util.List;

public interface RestaurantService {
    List<Restaurant> getVegRestaurant();
    List<Restaurant> sortRestaurantByRating();
    MenuItem findCheapestDish();
}
