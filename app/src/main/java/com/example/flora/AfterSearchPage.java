package com.example.flora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AfterSearchPage extends AppCompatActivity {

    public SearchRecyclerAdapter mRecyclerAdapter;
    public ArrayList<SearchItem> mSearchItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_search_page);

        RecyclerView mRecyclerView = findViewById(R.id.recycler);

//        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL,false));

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        /* initiate adapter */
        mRecyclerAdapter = new SearchRecyclerAdapter();

        /* initiate recyclerview */
        mRecyclerView.setAdapter(mRecyclerAdapter);

        /* adapt data */
        mSearchItems = new ArrayList<>();
        mSearchItems.add(new SearchItem(R.drawable.flower_temp1, R.drawable.profile_temp, "꽃빛나다", "프리지아 하늘색 꽃다발", "12%", "65,000원"));
        mSearchItems.add(new SearchItem(R.drawable.flower_temp2, R.drawable.profile_temp, "꽃빛나다", "프리지아 하늘색 꽃다발", "12%", "65,000원"));
        mSearchItems.add(new SearchItem(R.drawable.flower_temp3, R.drawable.profile_temp, "꽃빛나다", "프리지아 하늘색 꽃다발", "12%", "65,000원"));
        mSearchItems.add(new SearchItem(R.drawable.flower_temp4, R.drawable.profile_temp, "꽃빛나다", "프리지아 하늘색 꽃다발", "12%", "65,000원"));
        mSearchItems.add(new SearchItem(R.drawable.flower_temp1, R.drawable.profile_temp, "꽃빛나다", "프리지아 하늘색 꽃다발", "12%", "65,000원"));
        mSearchItems.add(new SearchItem(R.drawable.flower_temp2, R.drawable.profile_temp, "꽃빛나다", "프리지아 하늘색 꽃다발", "12%", "65,000원"));
        mSearchItems.add(new SearchItem(R.drawable.flower_temp3, R.drawable.profile_temp, "꽃빛나다", "프리지아 하늘색 꽃다발", "12%", "65,000원"));
        mSearchItems.add(new SearchItem(R.drawable.flower_temp4, R.drawable.profile_temp, "꽃빛나다", "프리지아 하늘색 꽃다발", "12%", "65,000원"));
        mRecyclerAdapter.setSearchList(mSearchItems);
    }
}