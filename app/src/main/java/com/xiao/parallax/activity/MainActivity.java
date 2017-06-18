package com.xiao.parallax.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.xiao.parallax.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goScrollView(View view) {
        startActivity(new Intent(this, ScrollViewActivity.class));
    }

    public void goRecyclerView(View view) {
        startActivity(new Intent(this, RecyclerViewLinearActivity.class));
    }

    public void goRecyclerViewGrid(View view) {
        startActivity(new Intent(this, RecyclerViewGridActivity.class));
    }
}
