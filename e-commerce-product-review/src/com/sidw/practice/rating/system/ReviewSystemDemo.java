package com.sidw.practice.rating.system;

import com.sidw.practice.rating.system.model.Product;
import com.sidw.practice.rating.system.model.Review;
import com.sidw.practice.rating.system.model.User;
import com.sidw.practice.rating.system.service.ProductService;
import com.sidw.practice.rating.system.service.ReviewService;
import com.sidw.practice.rating.system.service.UserService;

public class ReviewSystemDemo {

    public static void main(String[] args) {
        System.out.println("***  E-Commerce Review ***");

        UserService userService=new UserService();
       User user= userService.acceptUserData();

        ProductService productService=new ProductService();
       Product product= productService.acceptProductData();

        ReviewService reviewService= new ReviewService();
       Review review= reviewService.acceptReviewData();

        //From this 3 method we have to take data outside , return from the corrosponding methods and accept here in the variables

        System.out.println("User Details :"+user);

        System.out.println("User Details :"+product);

        System.out.println("User Details :"+review);

    }

}
