package classes;

import java.lang.*;
import interfaces.*;

public class FoodCourt implements RestaurantOperations
{
	Restaurant[] listOfRestaurants = new Restaurant[1000];
	

	
    public boolean insertRestaurant(Restaurant restaurant)
    {
        boolean flag = false;
        for (int i = 0; i < listOfRestaurants.length; i++) {
            if (listOfRestaurants[i] == null) {
                listOfRestaurants[i] = restaurant;
                flag = true;
                break;
            }
        }
        return flag;
    }
    
 
    public Restaurant searchRestaurant(String restaurantID)
    {
        Restaurant restaurant = null;

        for (int i = 0; i < listOfRestaurants.length; i++) {
            if (listOfRestaurants[i] != null) {
                if (listOfRestaurants[i].getRestaurantID().equals(restaurantID)) {
                    restaurant = listOfRestaurants[i];
                    break;
                }
            }
        }
        return restaurant;
    }
  
    public void showAllRestaurants()
    {
        System.out.println("**************************************************************");
        System.out.println();

        for(int i=0; i < listOfRestaurants.length; i++)
        {
            if(listOfRestaurants[i] != null)
            {
                System.out.println("..............................................................");
                listOfRestaurants[i].showAllFoodItems();
                System.out.println("..............................................................");
            }
        }
    }

    
}