/*
RestaurantFactoryTest.java
Author Demi Alexis Farquhar (220322104)
Date: 1 April 2022
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Restaurant;


import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class RestaurantFactoryTest {
@Test

//create restaurant and test pass
    void a_createRestaurant(){
        Restaurant restaurant= RestaurantFactory.createRestaurant("101A1","Spur"," 4 Wood Road Ottery","021 356 1488",true);
        assertNotNull(restaurant);
        System.out.println(restaurant);
        System.out.println("Restaurant added....");
        System.out.println();

}
@Test
//create new Restaurant with missing values
    void b_createNewRestaurant(){
    Restaurant restaurant= new Restaurant.Builder()
            .setRestaurantName("Joes")
            .setRestaurantTelphone("021 656 785")
            .setOpen(false)
            .build();

        assertNotNull(restaurant);
        Restaurant restaurant1 =null;
        assertNull(restaurant1);

        System.out.println("Restaurant added....");
        System.out.println();
}

    @Test
    void c_showRestaurantDetails(){
        //Show Restaurant details
        Restaurant  showRestaurant = RestaurantFactory.createRestaurant("101A1","Spur","4 Wood Road Ottery","021 356 1488",true);
        System.out.println("Show restaurant details");
        System.out.println(showRestaurant.toString());
        assertNotNull(showRestaurant);
        System.out.println();
    }
    @Test
    void d_testIdentityOfRestaurant(){
    //object identity
    Restaurant restaurantIdentity1= RestaurantFactory.createRestaurant("011B","Tom","10 Carter Cape Point","023 458 1788",true);
    Restaurant restaurantIdentity2= RestaurantFactory.createRestaurant("0123C","Pirates stakehouse","45 Main Road Retreat","021 564 7895",true);
    Restaurant restaurantIdentity3=restaurantIdentity1;

    assertSame(restaurantIdentity1,restaurantIdentity3);
    assertNotSame(restaurantIdentity1,restaurantIdentity2);
    assertNotSame(restaurantIdentity2,restaurantIdentity1);
    assertNotSame(restaurantIdentity2, restaurantIdentity3);
    System.out.println("testIdentityOfRestaurant passed");

    }

}