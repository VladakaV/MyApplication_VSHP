package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.myapplication.databinding.ActivityMain2Binding;
import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {
    ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        //обработка переключения между экранами
        binding.btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);

            };
        });
        Log.d("TAG", "OnCreate2: ");

        Bundle arguments = getIntent().getExtras();
        if (arguments!=null) {
            String name = arguments.getString("name");
            String surname = arguments.getString("surname");
            String ot = arguments.getString("othchestvo");
            binding.textView.setText(name+ "\n" + surname+ "\n" + ot);
        }

    };

}