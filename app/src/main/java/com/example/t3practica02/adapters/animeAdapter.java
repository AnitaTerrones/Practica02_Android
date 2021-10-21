package com.example.t3practica02.adapters;


import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.t3practica02.Anime;
import com.example.t3practica02.R;

import java.util.List;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;


public class animeAdapter {

    List<Anime> varAnime;

    private View.OnClickListener listener;

    public animeAdapter(List<Anime> varAnime) {
        this.varAnime = varAnime;
    }





}