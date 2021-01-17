package com.example.doanandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

import com.example.doanandroid.adapter.FoodAdapter;
import com.example.doanandroid.adapter.PopularFoodAdapter;
import com.example.doanandroid.model.Food;
import com.example.doanandroid.model.PopularFood;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    RecyclerView popularRecycler, foodRecycler;
    PopularFoodAdapter popularFoodAdapter;
    FoodAdapter foodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<PopularFood> popularFoodList = new ArrayList<>();

        popularFoodList.add(new PopularFood("Cơm Chiên","25000đ",R.drawable.comchien));
        popularFoodList.add(new PopularFood("Mì Xào Hải Sản","30000đ",R.drawable.mixao));
        popularFoodList.add(new PopularFood("Cháo","20000đ",R.drawable.chao));

        setPopularRecycler(popularFoodList);

        List<Food> foodList = new ArrayList<>();
        foodList.add(new Food("Pizza","35000đ",R.drawable.pizza,"4.5"));
        foodList.add(new Food("Hamburger","30000đ",R.drawable.hamburger,"4.2"));
        foodList.add(new Food("Gà KFC","33000đ",R.drawable.chicken,"5.0"));

        setFoodRecycler(foodList);
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    private void setPopularRecycler(List<PopularFood> popularFoodList){

        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);
    }

    private void setFoodRecycler(List<Food> foodList){

        foodRecycler = findViewById(R.id.food_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        foodRecycler.setLayoutManager(layoutManager);
        foodAdapter = new FoodAdapter(this, foodList);
        foodRecycler.setAdapter(foodAdapter);
    }
}