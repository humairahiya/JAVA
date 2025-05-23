package interfaces;

import java.lang.*;
import classes.*;

public interface FoodItemOperations
{
	boolean insertFoodItem(FoodItem foodItem); 
	FoodItem searchFoodItem(String foodItemNumber); 
	void showAllFoodItems(); 
}