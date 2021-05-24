package com.geek.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geek.myapplication.databinding.FragmentFirstBinding;

import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    Adapter adapter;
    ArrayList<cttd> list = new ArrayList<>();

    public FirstFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentFirstBinding.inflate(getLayoutInflater());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate
                (inflater, container, false);
        return binding.getRoot();

    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        create();
        adapter= new Adapter();
        adapter.add(list);
        binding.recycle1.setAdapter(adapter);
    }


    private void create() {
        list = new ArrayList<>();
        list.add(new cttd("jlnv", "jldvh"));
        list.add(new cttd("jlnv", "jldvh"));
        list.add(new cttd("jlnv", "jldvh"));
        list.add(new cttd("jlnv", "jldvh"));
        list.add(new cttd("jlnv", "jldvh"));
        list.add(new cttd("jlnv", "jldvh"));
        list.add(new cttd("jlnv", "jldvh"));
        list.add(new cttd("jlnv", "jldvh"));
    }

}