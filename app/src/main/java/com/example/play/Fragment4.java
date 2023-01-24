package com.example.play;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

public class Fragment4 extends Fragment {
    ImageView imageView;
    TextView searchingTV;
    LinearLayout l1,l2,l3;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment4, container, false);

        imageView=view.findViewById(R.id.imageView);
        l1=view.findViewById(R.id.lay1);
        l2=view.findViewById(R.id.lay2);
        l3=view.findViewById(R.id.lay3);

        searchingTV=view.findViewById(R.id.searchingTV);
        Glide.with(this)
                .load(R.raw.search)
                .into(imageView);
        new CountDownTimer(5000, 1000) {
            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                imageView.setVisibility(View.GONE);
                searchingTV.setVisibility(View.GONE);
                l1.setVisibility(View.VISIBLE);
                l2.setVisibility(View.VISIBLE);
                l3.setVisibility(View.VISIBLE);

            }
        }.start();
        return view;
    }
}
