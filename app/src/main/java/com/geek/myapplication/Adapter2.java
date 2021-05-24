package com.geek.myapplication;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geek.myapplication.databinding.Data2Binding;
import com.geek.myapplication.databinding.DataBinding;

import java.util.ArrayList;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.ViewHolder> {

    private ArrayList<Integer> list = new ArrayList<>();


    public void add2(ArrayList<Integer> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(DataBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(Adapter2.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private DataBinding binding;

        public ViewHolder(DataBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(Integer cttd2) {
            binding.tv.setText(String.valueOf(getAdapterPosition()+1));
        }
    }
}
