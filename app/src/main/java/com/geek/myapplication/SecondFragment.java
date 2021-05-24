package com.geek.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geek.myapplication.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment {


    private Adapter2 adapter2;
    private FragmentSecondBinding binding;
    private ArrayList<Integer> list = new ArrayList<Integer>();

    public SecondFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentSecondBinding.inflate(getLayoutInflater());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter2 = new Adapter2();
        adapter2.add2(createList());
        binding.recycle2.setAdapter(adapter2);
    }

    private ArrayList<Integer> createList() {
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        return list;
    }
}