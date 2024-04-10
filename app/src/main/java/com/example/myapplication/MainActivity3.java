package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.databinding.ActivityMain3Binding;
import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity3 extends AppCompatActivity {
    ActivityMain3Binding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        Bundle arguments = getIntent().getExtras();
        if (arguments != null) {
            /*String name = arguments.getString("name");
            String surname = arguments.getString("surname");
            String age = arguments.getString("age");
            binding.textView5.setText(name);
            binding.textView.setText(surname);
            binding.textView6.setText(age);*/

        }
    }


}