package com.geek.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geek.myapplication.databinding.Data2Binding;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<cttd> list = new ArrayList<>();

    public void add(ArrayList<cttd> cttd){
        this.list.addAll(cttd);
        notifyDataSetChanged();
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(Data2Binding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private Data2Binding binding;

        public ViewHolder(@NonNull Data2Binding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(cttd cttd) {
            binding.heading.setText(cttd.getHeading());
            binding.description.setText(cttd.getDescription());
        }
    }
}
