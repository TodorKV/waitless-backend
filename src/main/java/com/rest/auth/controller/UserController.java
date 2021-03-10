package com.rest.auth.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.rest.auth.entity.Cafe;
import com.rest.auth.entity.Menu;
import com.rest.auth.entity.Review;
import com.rest.auth.entity.User;
import com.rest.auth.entity.consumable_entity.Drink;
import com.rest.auth.entity.consumable_entity.Food;
import com.rest.auth.model.CafeModel;
import com.rest.auth.model.DrinkModel;
import com.rest.auth.model.FoodModel;
import com.rest.auth.model.IsReviewable;
import com.rest.auth.model.ReviewModel;
import com.rest.auth.model.UserModel;
import com.rest.auth.repository.CafeRepository;
import com.rest.auth.repository.DrinkRepository;
import com.rest.auth.repository.FoodRepository;
import com.rest.auth.repository.MenuRepository;
import com.rest.auth.repository.ReviewRepository;
import com.rest.auth.repository.UserRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
	CafeRepository cafeRepository;
    
    @Autowired
	MenuRepository menuRepository;
        
    @Autowired
	FoodRepository foodRepository;
            
    @Autowired
	DrinkRepository drinkRepository;

    @Autowired
	ReviewRepository reviewRepository;

    @PostMapping("/register")
    public User Register(@RequestBody User user) {
        User oldUser = userRepository.findByEmailAndPassword(user.email, user.password);
        if(oldUser != null){
            System.out.print(oldUser);
            return oldUser;
        }else{
            return userRepository.save(user);
        }

    }
    @PostMapping("/login")
    public UserModel Login(@RequestBody User user) {
        User oldUSer = userRepository.findByEmailAndPassword(user.email, user.password);
        
        return new UserModel(oldUSer);
    }

    @RequestMapping(value = "getcafe/{id}", method = RequestMethod.GET)
    public CafeModel getCafeWithId(@PathVariable("id") Integer id){
        try {
            CafeModel cafeCustom = new CafeModel();

            Optional<Cafe> cafes = cafeRepository.findById(id);
            if(cafes.isPresent() ){
                CafeModel cc = new CafeModel();
                Cafe cafe = new Cafe();

                BeanUtils.copyProperties(cafes.get(), cafe);
                Optional<Menu> menu = menuRepository.findById(cafe.getMenu().getMid());
                
                List<FoodModel> foods = new ArrayList<FoodModel>();
                menu.get().getFoods().stream().forEach(f -> {
                    Food food = new Food();
                    BeanUtils.copyProperties(f, food);

                    System.out.println(food.getName());

                    FoodModel foodModel = new FoodModel(food);
                    foodModel.setReviewModels(extractReviewModels(food));
                    foods.add(foodModel);
                });
                List<DrinkModel> drinks = new ArrayList<DrinkModel>();
                menu.get().getDrinks().stream().forEach(d -> {
                    Drink drink = new Drink();
                    BeanUtils.copyProperties(d, drink);
                    System.out.println(drink.getReviews());

                    DrinkModel drinkModel = new DrinkModel(drink);
                    drinkModel.setReviewModels(extractReviewModels(drink));
                    drinks.add(drinkModel);
                });
                cc.setMenuFoods(foods);
                cc.setMenuDrinks(drinks);
                cc.setName(cafe.getName());
                cafeCustom = new CafeModel(cc);
            }
            return cafeCustom;
        }catch(Exception e) {
            throw e;
        }
    }

    public List<ReviewModel> extractReviewModels (IsReviewable product){
        List<ReviewModel> reviewModels = new ArrayList<ReviewModel>();
        product.getReviews().stream().forEach(r -> {
            Review review = new Review();

            BeanUtils.copyProperties(r, review);

            ReviewModel reviewModel = new ReviewModel(review);

            reviewModels.add(reviewModel);
        });
        return reviewModels;
    }
}