package com.example.myapplication.Adapters;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintHelper;

import com.example.myapplication.Classes.Data;
import com.example.myapplication.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Random;

public class DataAdapter extends ArrayAdapter<Data> {
    public DataAdapter(@NotNull Context context, ArrayList<Data> data) {
        super(context, R.layout.layout, data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Data data = getItem(position);
        Random random = new Random();

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout, parent, false);
        }

        TextView textView = convertView.findViewById(R.id.textView2);
        TextView textView2 = convertView.findViewById(R.id.textView);
        ImageView imageView = convertView.findViewById(R.id.img);
        RatingBar rating = convertView.findViewById(R.id.ratingBar);

        textView.setText(data.getI()+1 + ". " + data.getTitle());
        textView2.setText(data.getText());
        imageView.setImageResource(data.getId_image());
        rating.setRating(1 + random.nextInt(6));
        return convertView;
    }
}
