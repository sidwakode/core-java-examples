package com.sidw.practice.rating.system.service;

import com.sidw.practice.rating.system.model.Review;


import java.util.Scanner;

public class ReviewService {
    public Review acceptReviewData(){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Please Enter Review Id:");
        int id=Integer.parseInt(scanner.nextLine());

        System.out.println("Please Enter  Heading:");
        String heading=scanner.nextLine();

        System.out.println("Please Enter  Disciption:");
        String discription=scanner.nextLine();

        System.out.println("Please Enter  Rating:");
        int rating=Integer.parseInt(scanner.nextLine());

        //Now we have to initilize the entity

        Review review= new Review();
        review.id=id;
        review.heading=heading;
        review.dicrpition=discription;
        review.rating=rating;
        return review;


    }
}
