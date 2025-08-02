package com.sidw.practice.rating.system.model;

public class Review {
    public int id;
    public String heading;
    public String dicrpition;
    public int rating;

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", heading='" + heading + '\'' +
                ", dicrpition='" + dicrpition + '\'' +
                ", rating=" + rating +
                '}';
    }
}
