// FirstTabFragment.java
package com.example.practice;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class TabHomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private TestAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.recycler1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // 데이터 로드 및 어댑터에 전달
        List<Item> itemList = generateItemList();
        adapter = new TestAdapter(itemList);
        recyclerView.setAdapter(adapter);
        Log.d("ItemCount", "Item count: " + itemList.size());

        return view;
    }

    private List<Item> generateItemList() {
        List<Item> itemList = new ArrayList<>();
        // 여기에서 데이터를 로드하거나 생성하여 itemList에 추가
        itemList.add(new Item("Item 1"));
        itemList.add(new Item("Item 2"));
        itemList.add(new Item("Item 3"));
        itemList.add(new Item("Item 3"));
        itemList.add(new Item("Item 4"));
        itemList.add(new Item("Item 5"));
        itemList.add(new Item("Item 6"));
        // ...

        return itemList;
    }
}

