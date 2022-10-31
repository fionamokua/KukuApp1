package com.example.kukuapp1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Fragment2 extends Fragment {
    Button fragmentBreeds , fragmentHealth , fragmentFeeding , fragmentHousing;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view;


        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_2, container, false);


        fragmentBreeds= (Button)view.findViewById(R.id.breeds);
        fragmentFeeding= (Button)view.findViewById(R.id.feed);
        fragmentHealth=(Button)view.findViewById(R.id.health);
        fragmentHousing=(Button)view.findViewById(R.id.house);

        fragmentBreeds.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                fragmentBreeds.setVisibility(View.GONE);
                fragmentFeeding.setVisibility(View.GONE);
                fragmentHealth.setVisibility(View.GONE);
                fragmentHousing.setVisibility(View.GONE);
                FragmentTransaction fr = getChildFragmentManager().beginTransaction();
                fr.replace(R.id.learning,new BreedsFragment());
                fr.commit();


            }
        });
        fragmentHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentBreeds.setVisibility(View.GONE);
                fragmentFeeding.setVisibility(View.GONE);
                fragmentHealth.setVisibility(View.GONE);
                fragmentHousing.setVisibility(View.GONE);
                FragmentTransaction fr = getChildFragmentManager().beginTransaction();
                fr.replace(R.id.learning,new HealthFragment());
                fr.commit();

            }
        });
        fragmentFeeding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentBreeds.setVisibility(View.GONE);
                fragmentFeeding.setVisibility(View.GONE);
                fragmentHealth.setVisibility(View.GONE);
                fragmentHousing.setVisibility(View.GONE);
                FragmentTransaction fr = getChildFragmentManager().beginTransaction();
                fr.replace(R.id.learning,new FeedFragment());
                fr.commit();

            }
        });
       fragmentHousing.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               fragmentBreeds.setVisibility(View.GONE);
               fragmentFeeding.setVisibility(View.GONE);
               fragmentHealth.setVisibility(View.GONE);
               fragmentHousing.setVisibility(View.GONE);
               FragmentTransaction fr = getChildFragmentManager().beginTransaction();
               fr.replace(R.id.learning,new HouseFragment());
               fr.commit();

           }
       });

        return  view;

    }

}