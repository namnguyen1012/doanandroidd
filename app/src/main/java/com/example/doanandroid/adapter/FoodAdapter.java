package com.example.doanandroid.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doanandroid.R;
import com.example.doanandroid.model.Food;
import com.example.doanandroid.model.PopularFood;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    Context context;
    List<Food> FoodList;

    public FoodAdapter(Context context, List<Food> FoodList) {
        this.context = context;
        this.FoodList = FoodList;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.food_row_item, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FoodViewHolder holder, int position) {

        holder.foodImage.setImageResource(FoodList.get(position).getImageUrl());
        holder.name.setText(FoodList.get(position).getName());
        holder.price.setText(FoodList.get(position).getPrice());
        holder.rating.setText(FoodList.get(position).getRating());

    }

    @Override
    public int getItemCount() {
        return FoodList.size();
    }

    public static final class FoodViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name, rating;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.price);
            name = itemView.findViewById(R.id.name);
            rating = itemView.findViewById(R.id.rating);

        }
    }
}
