package com.xiao.parallax.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.xiao.parallax.R;
import com.xiao.parallax.custom.ParallaxRecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewGridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_grid);
        init();
    }

    private void init() {
        ParallaxRecyclerView parallaxRecyclerView = (ParallaxRecyclerView) findViewById(R.id.parallax_recycler_view_grid);
        parallaxRecyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        ItemAdapter adapter = new ItemAdapter(R.layout.item_grid, itemList());
        adapter.bindToRecyclerView(parallaxRecyclerView);
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(RecyclerViewGridActivity.this, position + "", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private List<Item> itemList() {
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < 28; i++) {
            if (i % 2 == 0) {
                items.add(new Item(R.drawable.girl, "赵丽颖"));
            } else {
                items.add(new Item(R.drawable.girl_1, "ZhaoLiying"));
            }
        }
        return items;
    }
}
