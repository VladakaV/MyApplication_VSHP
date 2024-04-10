package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.databinding.ActivityMain2Binding;
import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {
    ActivityMain2Binding binding;
    SharedPreferences settings;
    private static final String PREFS_FILE = "Account";
    private static final String PREF_NAME = "Name";


    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        settings = getSharedPreferences(PREFS_FILE, MODE_PRIVATE);
        getName();
        setContentView(binding.getRoot());


        //обработка переключения между экранами
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
//                String age = String.valueOf(binding.editTextText3.getText());
                saveName();
                startActivity(intent);
            }
        });
    }
    public void getName() {
        TextView nameView = binding.editTextText3;
        String name = settings.getString(PREF_NAME, "не определено");
        nameView.setText(name);
    }
    public void saveName() {
        EditText nameBox = binding.editTextText3;
        String name = nameBox.getText().toString();
        SharedPreferences.Editor prefEditor = settings.edit();
        prefEditor.putString(PREF_NAME, name);
        prefEditor.apply();
    }
//        Log.d("TAG", "OnCreate2: ");
//
//        /*Bundle arguments = getIntent().getExtras();*/
//      /*  if (arguments!=null) {*/
//            /*String name = arguments.getString("name");
//            String surname = arguments.getString("surname");
//            String ot = arguments.getString("othchestvo");
//            binding.textView.setText(name+ "\n" + surname+ "\n" + ot);*/
//            /*Person person = (Person) arguments.getSerializable(Person.class.getSimpleName());
//            binding.textView.setText(person.getName() + person.getAge());*/
//
//       /*
//        }*/
//
//    };
//
    }