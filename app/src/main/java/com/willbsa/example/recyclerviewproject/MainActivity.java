package com.willbsa.example.recyclerviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<ExampleItem> mExampleList;

    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mExampleList = new ArrayList<>();
        mExampleList.add(new ExampleItem(R.mipmap.americanbusiness_foreground, "American Business"));
        mExampleList.add(new ExampleItem(R.mipmap.americancultures_foreground, "American Cultures"));
        mExampleList.add(new ExampleItem(R.mipmap.americanheritage_foreground, "American Heritage"));

        /*mRecyclerView = findViewById(R.id.recyclerVIew);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(mExampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);*/
        buildRecyclerView();

    }

    public void buildRecyclerView () {
        mRecyclerView = findViewById((R.id.recyclerVIew));
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(mExampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new ExampleAdapter.OnItemClickListener() {
            int i;
            @Override
            public void onItemClick(int position) {
                //handle click here
                i++;
            }
        });
    }
}
