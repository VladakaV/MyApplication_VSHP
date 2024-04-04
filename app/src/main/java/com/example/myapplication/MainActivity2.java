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
    };
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG", "onStart: ");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", "onResume: ");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG", "onPause: ");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG", "onRestart: ");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "onDestroy: ");
    }
}