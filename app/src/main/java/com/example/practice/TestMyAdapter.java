package com.example.practice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TestMyAdapter extends RecyclerView.Adapter<TestMyAdapter.ViewHolder> {
    private List<ItemMy> itemList;

    public TestMyAdapter(List<ItemMy> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public TestMyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new TestMyAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TestMyAdapter.ViewHolder holder, int position) {
        ItemMy item = itemList.get(position);

        holder.textView.setText(item.getText());
        holder.imageView.setImageResource(item.getImageResource());
    }


    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.my_image);
            textView = itemView.findViewById(R.id.my_text);
        }
    }
}
