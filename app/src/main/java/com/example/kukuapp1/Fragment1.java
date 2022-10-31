package com.example.kukuapp1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;


public class Fragment1 extends Fragment {
    Button Sell,Buy;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_1, container, false);
        Sell= (Button)view.findViewById(R.id.sell);
        Buy= (Button)view.findViewById(R.id.buy);
        Sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sell.setVisibility(View.GONE);
                Buy.setVisibility(View.GONE);
                FragmentTransaction fr = getChildFragmentManager().beginTransaction();
                fr.replace(R.id.trade,new SellFragment());
                fr.commit();


            }
        });
        Buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Sell.setVisibility(View.GONE);
                Buy.setVisibility(View.GONE);
                FragmentTransaction fr = getChildFragmentManager().beginTransaction();
                fr.replace(R.id.trade,new BuyFragment());
                fr.commit();

            }
        });
        return view;
    }
}