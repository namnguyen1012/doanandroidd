package com.example.doanandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomappbar.BottomAppBar;

public class CartActivity extends AppCompatActivity {
    private Button btnThanhToan;
    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.cart);
        AnhXa();
        btnThanhToan.setOnClickListener(showModal);
    }
    private void AnhXa(){btnThanhToan = (Button) findViewById(R.id.btnThanhToan)};
        @Override
        public void onClick(View v){
            BottomAppBar bottomAppBar = new BottomAppBar(
                    CartActivity.this,R.style.android:statusBarColor
            )
        }
}
