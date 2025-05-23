import java.lang.*;
import java.util.*;
import java.io.*;
import classes.*;


public class Start 
{
	public static void main(String[] args) {
		
		FoodCourt foodCourt = new FoodCourt();

		

		Scanner input = new Scanner(System.in);

		boolean repeat = true;

		System.out.println();
		System.out.println("\t                 Food Ordering System           ");
		System.out.println();

		while(repeat)
		{
			System.out.println("-----------------------------------------------------");
			System.out.println();
			System.out.println("# What do you want to choose?\n");
			System.out.println("1.	Restaurant. ");
			System.out.println("2.	FoodItem. ");
			System.out.println("3.	Exit. ");
			System.out.println();
			System.out.println("-----------------------------------------------------");

			System.out.println();
			System.out.print("Enter your choice : ");
			int choice = input.nextInt();
			System.out.println();

			switch(choice)
			{
				

				

				case 1:
					System.out.println("Your Choice Is :	Restaurant");
					System.out.println();

					System.out.println("-----------------------------------------------------");
					System.out.println("# Here are your options: \n");
					System.out.println("1.	Insert New Restaurant   ");
					System.out.println("2.	Show All Restaurant   ");
					System.out.println("3.	Search a Restaurant  ");
					System.out.println("4.	Go Back  ");
					System.out.println("-----------------------------------------------------");
					System.out.println();

					System.out.print("Enter your option : ");
					int option2 = input.nextInt();
					System.out.println();

					switch(option2)
					{
						case 1:
							System.out.println("Your Option Is :	Insert New Restaurant  ");
							System.out.println();

							System.out.print("Enter the Restaurant ID   : ");
							String restaurantID1 = input.next();
							System.out.print("Enter the Restaurant Name : ");
							String restaurantName1 = input.next();

							Restaurant restaurant1 = new Restaurant();
							restaurant1.setRestaurantID(restaurantID1);
							restaurant1.setName(restaurantName1);

							if (foodCourt.insertRestaurant(restaurant1)) {
								System.out.println("\nYou inserted Restaurant.... Restaurant's ID : " +restaurant1.getRestaurantID());
							}
							else {
								System.out.println("\nSorry, You Done Something Wrong. ");
							}

							System.out.println();
							break;


						case 2:
							System.out.println("Your Option Is :	Show All Restaurant  ");
							System.out.println();

							foodCourt.showAllRestaurants();
							
							System.out.println();
							break;

						case 3:
							System.out.println("Your Option Is :	Search a Restaurant  ");
							System.out.println();

							System.out.print("Enter the Restaurant's ID : ");
							String restaurantID4 = input.next();

							Restaurant restaurant4 = foodCourt.searchRestaurant(restaurantID4);

							if (restaurant4 != null) {
								System.out.println();
								System.out.println("........ Restaurant is Found .......\n");
								System.out.println("Restaurant's ID     : " +restaurant4.getRestaurantID());
								System.out.println("Restaurant's Name   : " +restaurant4.getName());
								System.out.println();
							}
							else {
								System.out.println("\nSorry..... No such Restaurants are bearing this ID.");
								System.out.println("Please, try again...");
							}

							System.out.println();
							break;

						case 4:
							System.out.println("Your Option Is :	Go Back  ");
							System.out.println();

							break;

						default:

							System.out.println("Your Option Is :	Invalid  ");
							System.out.println();
					}

					System.out.println();
					break;
				case 2:
					System.out.println("Your Choice Is :	FoodItem ");
					System.out.println();

					System.out.println("-----------------------------------------------------");
					System.out.println("# Here are your options: \n");
					System.out.println("1.	Insert New FoodItem   ");
					System.out.println("2.	Show All FoodItems   ");
					System.out.println("3.	Search a FoodItem   ");
					System.out.println("4.	Go Back  ");
					System.out.println("-----------------------------------------------------");
					System.out.println();

					System.out.print("Enter your option : ");
					int option3 = input.nextInt();
					System.out.println();

					switch(option3)
					{
						case 1:
							System.out.println("Your Option Is :	Insert New FoodItem  ");
							System.out.println();

							System.out.println("# There are two types of Food-Items in our Restaurant : ");
							System.out.println("1.   Appitizers. ");
							System.out.println("2.   Main Dish. ");
							System.out.println("3.   Go Back. ");
							System.out.println();

							System.out.print("Enter the type of Food-Item : ");
							int type = input.nextInt();

							FoodItem foodItem1 = null;

							if (type == 1) {
								System.out.println("\n.... Your selected Type is Appitizers ....\n");

								System.out.print("Enter the Food-Item's Name   : ");
								String foodItemName1 = input.next();

								System.out.print("Enter the Food-Item's Number : ");
								String foodItemNumber1 = input.next();

								System.out.print("Enter the Food-Item's Available Quantity : ");
								int foodItemAvailableQuantity1 = input.nextInt();

								System.out.print("Enter the Food-Item's Price : ");
								double foodItemPrice1 = input.nextDouble();

								System.out.print("Enter the Food-Item's Size : ");
								String foodItemSize1 = input.next();

								Appitizers appitizers1 = new Appitizers(foodItemNumber1, foodItemName1, foodItemAvailableQuantity1, foodItemPrice1, foodItemSize1);

								foodItem1 = appitizers1;
							}

							else if (type == 2) {
								System.out.println("\n.... Your selected Type is Main Dish ....\n");

								System.out.print("Enter the Food-Item's Name   : ");
								String foodItemName2 = input.next();

								System.out.print("Enter the Food-Item's Number : ");
								String foodItemNumber2 = input.next();

								System.out.print("Enter the Food-Item's Available Quantity : ");
								int foodItemAvailableQuantity2 = input.nextInt();

								System.out.print("Enter the Food-Item's Price : ");
								double foodItemPrice2 = input.nextDouble();

								System.out.print("Enter the Food-Item's Category : ");
								String foodItemCategory2 = input.next();

								MainDish mainDish1 = new MainDish(foodItemNumber2, foodItemName2, foodItemAvailableQuantity2, foodItemPrice2, foodItemCategory2);

								foodItem1 = mainDish1;
							}
							else if (type == 3) {
								System.out.println("Go to Back...");
							}
							else{
								System.out.println("..... You Selected Invalid Type .....");
							}

							if (foodItem1 != null) {
								System.out.print("Enter the Restaurant ID : ");
								String restaurantID0 = input.next();

								Restaurant restaurant0 = foodCourt.searchRestaurant(restaurantID0);

								if (restaurant0 != null) {
									if (restaurant0.insertFoodItem(foodItem1)) {
										System.out.println("\nFood-Item has been inserted....");
										System.out.println("Food-Item's Number : " +foodItem1.getFoodItemNumber());
									}
								}
								else {
									System.out.println("\nSorry, Something is doing wrong.....");
								}
							}

							System.out.println();
							break;

						
						case 2:
							System.out.println("Your Option Is :	Show All FoodItems  ");
							System.out.println();

							System.out.print("Enter the Restaurant ID : ");
							String restaurantID02 = input.next();
							Restaurant restaurant02 = foodCourt.searchRestaurant(restaurantID02);
							if (restaurant02 != null) {
								restaurant02.showAllFoodItems();
							}
							else {
								System.out.println("\nSorry, No such Restaurant is bearing this ID.....");
								System.out.println("Please, try again......");
							}
							System.out.println();
							break;
						case 3:
							System.out.println("Your Option Is :	Search a FoodItem  ");
							System.out.println();
							System.out.print("Enter the Restaurant ID : ");
							String restaurantID03 = input.next();
							Restaurant restaurant03 = foodCourt.searchRestaurant(restaurantID03);
							if (restaurant03 != null) {

								System.out.print("Enter the Food-Item's Number : ");
								String foodItemNumber02 = input.next();

								FoodItem foodItem3 = restaurant03.searchFoodItem(foodItemNumber02);
 
								if (foodItem3 != null) {
									System.out.println();
									System.out.println("........ Food-Item is Found .......\n");
									foodItem3.showInfo();
									System.out.println();
								}
								else {
									System.out.println("\nSorry..... No such Food-Items are bearing this Number.");
									System.out.println("Please, try again...");
								}
							}
							else {
								System.out.println("\nSorry..... No such Restaurant is bearing this Number.");
								System.out.println("Please, try again...");
							}
							break;
						case 4:
							System.out.println("Your Option Is :	Go Back  ");
							System.out.println();
							break;
						default:
							System.out.println("Your Option Is :	Invalid  ");
							System.out.println();
					}
					System.out.println();
					break;
				case 3:
					repeat = false;
					System.out.println("      Thank You For Food Ordering System    ");
					System.out.println();
					break;

				default:
					System.out.println("Your Choice Is :	This is invalid Choice ");
					System.out.println();
			}
		}
		input.close();
	}
}