package com.company;

public class Report {
    private int money;
    private String title;
    private double rating;

    public Report(int money, String title, double rating) {
        this.money = money;
        this.title = title;
        this.rating = rating;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Report{" +
                "money=" + money +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }

    
}
