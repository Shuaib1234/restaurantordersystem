/*
RestaurantFactory.java
Author Demi Alexis Farquhar (220322104)
Date: 1 April 2022
 */
package za.ac.cput.factory;

import za.ac.cput.entity.Restaurant;

public class RestaurantFactory {
  public static Restaurant createRestaurant(String restaurantId, String restaurantName, String restaurantAddress, String restaurantTelphone,boolean isOpen ) {
     Restaurant   restaurant= new Restaurant.Builder().setRestaurantId(restaurantId)
             .setRestaurantName(restaurantName)
             .setRestaurantAddress(restaurantAddress)
             .setRestaurantTelphone(restaurantTelphone)
             .setOpen(isOpen)
             .build();
     return restaurant;
  }
}
