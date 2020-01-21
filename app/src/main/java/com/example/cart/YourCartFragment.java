package com.example.cart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class YourCartFragment extends Fragment {
    View view;
    public YourCartFragment() {

    }

    @Nullable
    @Override
    //google it
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       view = inflater.inflate(R.layout.your_cart_fragment,container,false);
        return view;
    }
}
