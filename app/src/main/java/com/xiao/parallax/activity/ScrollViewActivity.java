package com.xiao.parallax.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.xiao.parallax.R;

public class ScrollViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorll_view);
    }


    public void img(View view) {
        Toast.makeText(this, "赵丽颖", Toast.LENGTH_SHORT).show();
    }
}
