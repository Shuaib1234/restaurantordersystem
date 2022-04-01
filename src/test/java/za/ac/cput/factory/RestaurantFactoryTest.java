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
//create new Restaurant with missing values and test fails
    void b_createNewRestaurant2(){
    Restaurant restaurant= new Restaurant.Builder()
            .setRestaurantName("Joes")
            .setRestaurantTelphone("021 656 785")
            .setOpen(false)
            .build();

        Restaurant restaurant1=null;
        assertNotNull(restaurant1);

        assertNotNull(restaurant);
        System.out.println(restaurant);
        System.out.println("Restaurant1 added....");
        System.out.println();
}

    @Test
    void c_showRestaurantDetails(){
        //Show Restaurant details
        Restaurant  restaurant = RestaurantFactory.createRestaurant("101A1","Spur","5 Land Road Ottery","021 356 1488",true);
        System.out.println(restaurant);
        assertNotNull(restaurant);
    }

}