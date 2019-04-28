package com.oguzhanozer.detailedrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.CardDesignGetter>{

    private Context mContext;
    private List<Films> filmList;

    public MyAdapter(Context mContext, List<Films> filmList) {
        this.mContext = mContext;
        this.filmList = filmList;
    }

    @NonNull
    @Override
    public CardDesignGetter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.film_card_design,viewGroup,false);

        return new CardDesignGetter(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull CardDesignGetter holder, int i) {

        final Films films = filmList.get(i);

        holder.film_titleText.setText(films.getFilm_title());
        holder.film_priceText.setText(films.getFilm_price()+"");
//        holder.film_imageImage.setImageResource(R.drawable.django);

        holder.film_imageImage.setImageResource(mContext.getResources().getIdentifier(
                films.getFilm_image(),
                "drawable",
                mContext.getPackageName()
        ));

        holder.film_imageImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,Film_Detail.class);
                intent.putExtra("object",films);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return filmList.size();
    }


    public class CardDesignGetter extends RecyclerView.ViewHolder{

        private TextView film_titleText,film_priceText;
        private ImageView film_imageImage;
        private Button buttonBasket;

        public CardDesignGetter(@NonNull View itemView) {
            super(itemView);

            film_titleText = itemView.findViewById(R.id.film_title);
            film_priceText = itemView.findViewById(R.id.film_price);
            film_imageImage = itemView.findViewById(R.id.film_image);
            buttonBasket = itemView.findViewById(R.id.button_basket);
        }
    }


}
