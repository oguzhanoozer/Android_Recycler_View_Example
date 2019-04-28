package com.oguzhanozer.detailedrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Film_Detail extends AppCompatActivity {

    private TextView titleText;
    private ImageView imageViewFilms;
    private Films films;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film__detail);

        titleText = findViewById(R.id.title_Text);
        imageViewFilms = findViewById(R.id.imageViewFilmDetail);

        films = (Films) getIntent().getSerializableExtra("object");

        titleText.setText(films.getFilm_title()+ " - "+films.getFilm_price());

        imageViewFilms.setImageResource(getResources().getIdentifier(
                films.getFilm_image(),
                "drawable",
                getPackageName()
        ));



    }
}
