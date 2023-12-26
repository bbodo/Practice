// FirstTabFragment.java
package com.example.practice;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class TabMyFragment extends Fragment {

    private RecyclerView recyclerView;
    private TestMyAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my, container, false);

        recyclerView = view.findViewById(R.id.recycler2);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        // 데이터 로드 및 어댑터에 전달
        List<ItemMy> itemList = generateItemList();
        adapter = new TestMyAdapter(itemList);
        recyclerView.setAdapter(adapter);
        Log.d("ItemCount", "Item count: " + itemList.size());

        return view;
    }

    private List<ItemMy> generateItemList() {
        List<ItemMy> itemList = new ArrayList<>();

        // Here, you should create instances of ItemMy instead of Item
        itemList.add(new ItemMy("Item 1", R.drawable.testimg)); // Replace R.drawable.image1 with your actual resource ID
        itemList.add(new ItemMy("Item 2", R.drawable.testimg));
        itemList.add(new ItemMy("Item 3", R.drawable.testimg));
        itemList.add(new ItemMy("Item 4", R.drawable.testimg));
        itemList.add(new ItemMy("Item 5", R.drawable.testimg));
        itemList.add(new ItemMy("Item 6", R.drawable.testimg));
        // ...

        return itemList;
    }
}
