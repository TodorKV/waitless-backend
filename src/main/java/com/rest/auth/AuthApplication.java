package com.rest.auth;

import java.util.ArrayList;
import java.util.List;

import com.rest.auth.entity.Cafe;
import com.rest.auth.entity.Menu;
import com.rest.auth.entity.Review;
import com.rest.auth.entity.User;
import com.rest.auth.entity.consumable_entity.Drink;
import com.rest.auth.entity.consumable_entity.Food;
import com.rest.auth.repository.CafeRepository;
import com.rest.auth.repository.DrinkRepository;
import com.rest.auth.repository.FoodRepository;
import com.rest.auth.repository.MenuRepository;
import com.rest.auth.repository.ReviewRepository;
import com.rest.auth.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class AuthApplication implements CommandLineRunner{
	@Autowired
	FoodRepository foodRepository;

	@Autowired
	DrinkRepository drinkRepository;

	@Autowired
	MenuRepository menuRepository;

	@Autowired
	CafeRepository cafeRepository;
	
	@Autowired
	UserRepository userRepository;

		
	@Autowired
	ReviewRepository reviewRepository;

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception{

		/*
		User user = new User();
		user.setEmail("todor@todor.com");
		user.setPassword("123456");

		Review review = new Review();
		
		review.setDescription("Basi umreliq sok zakleam sa");

		Review review2 = new Review();

		review2.setDescription("basi qkata voda");

		user.getReview().add(review);
		user.getReview().add(review2);





		review.setUser(user);
		review.setStars(3);
		review2.setUser(user);	
		review2.setStars(5);
	


		

		Food food1 = new Food();
		// Food food2 = new Food();
		// Food food3 = new Food();
		// Food food4 = new Food();
		food1.setName("hot dog");
		// food2.setName("duner");
		// food3.setName("banica");
		// food4.setName("gevrek");
		food1.getReviews().add(review);
		Drink drink1  = new Drink();
		// Drink drink2 = new Drink();
		// Drink drink3 = new Drink();
		// Drink drink4 = new Drink();
		// Drink drink5 = new Drink();
		drink1.setName("sok voda");
		drink1.getReviews().add(review2);
		// drink2.setName("sok banan");
		// drink3.setName("sok portokal");
		// drink4.setName("sok amfet");
		// drink5.setName("sok s amfet");

		// List<Drink> drinks = new ArrayList<Drink>();
		// drinks.add(drink1);drinks.add(drink2);
		// drinks.add(drink3);drinks.add(drink4);
		// drinks.add(drink5);

		// List<Food> foods = new ArrayList<Food>();
		// foods.add(food1);foods.add(food2);
		// foods.add(food3);foods.add(food4);
	

        Menu menu1 = new Menu();
        menu1.setName("menu1");
        menu1.getFoods().add(food1);
		menu1.getDrinks().add(drink1);
    	// menu1.getDrinks().add(drink3);
		// menu1.getDrinks().add(drink5);

		Menu menu2 = new Menu();
		menu2.setName("menu2");
		menu2.getFoods().add(food1);
		menu2.getDrinks().add(drink1);

		foodRepository.save(food1);
		drinkRepository.save(drink1);

		review.setFood(food1);
		review2.setDrink(drink1);

		userRepository.save(user);
		reviewRepository.save(review);
		reviewRepository.save(review2);
		// List<Menu> menus = new ArrayList<Menu>();
		// menus.add(menu1);menus.add(menu2);

		food1.getMenus().add(menu1);
		drink1.getMenus().add(menu2);
		menuRepository.save(menu1);
		menuRepository.save(menu2);

	
		// food3.getMenus().add(menu2);

		// drink3.getMenus().add(menu1);
		// drink3.getMenus().add(menu1);
		
		Cafe cafe = new Cafe();
		cafe.setName("Largo");
		cafe.setMenu(menu1);
		
		cafeRepository.save(cafe);
		*/
	}

}
