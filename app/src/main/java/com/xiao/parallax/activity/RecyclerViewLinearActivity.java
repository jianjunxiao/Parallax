package com.xiao.parallax.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.xiao.parallax.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewLinearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_linear);
        init();
    }

    private void init() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter adapter = new ItemAdapter(R.layout.item, itemList());
        adapter.bindToRecyclerView(recyclerView);
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(RecyclerViewLinearActivity.this, position + "", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private List<Item> itemList() {
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                items.add(new Item(R.drawable.girl, "赵丽颖"));
            } else {
                items.add(new Item(R.drawable.girl_1, "赵丽颖"));
            }
        }
        return items;
    }
}
