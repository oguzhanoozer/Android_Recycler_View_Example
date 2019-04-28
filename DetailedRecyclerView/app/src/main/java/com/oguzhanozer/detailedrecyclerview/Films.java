package com.oguzhanozer.detailedrecyclerview;

import java.io.Serializable;

public class Films implements Serializable {

    private String film_title,film_image;
    private double film_price;


    public Films(String film_title, double film_price, String film_image) {
        this.film_title = film_title;
        this.film_price = film_price;
        this.film_image = film_image;
    }

    public String getFilm_title() {
        return film_title;
    }

    public void setFilm_title(String film_title) {
        this.film_title = film_title;
    }

    public double getFilm_price() {
        return film_price;
    }

    public void setFilm_price(double film_price) {
        this.film_price = film_price;
    }

    public String getFilm_image() {
        return film_image;
    }

    public void setFilm_image(String film_image) {
        this.film_image = film_image;
    }
}
