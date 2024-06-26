package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.Adapters.DataAdapter;
import com.example.myapplication.Classes.Data;
import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private static final String PREFS_FILE = "Account";
    private static final String PREF_NAME = "Name";
    SharedPreferences settings;
    String[] titles = {"Star", "Planet", "Command", "Row", "Ladder"};
    String[] autors = {"John Cennedy", "Jim Beam", "Anna Lorak", "Swift Dartovich", "Micro USB"};
    int[] images = {R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_foreground
    };
    ArrayList<Data> data = new ArrayList<Data>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        settings = getSharedPreferences(PREFS_FILE, MODE_PRIVATE);
//        getName();
//       ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cars);
//        binding.listview.setAdapter(adapter);
        setContentView(binding.getRoot());
        for (int i=0; i<titles.length; i++) {
            data.add(new Data(titles[i], autors[i], images[i], i));
        }
        DataAdapter adapter = new DataAdapter(this, data);
        binding.listview.setAdapter(adapter);

//        binding.button4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
//                saveName();
//                startActivity(intent);
//            }
//        });
//        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, binding.listview.getItemAtPosition(position).toString(), Toast.LENGTH_LONG);
//            }
//        });
    };

//    public void saveName() {
//        EditText nameBox = binding.editTextText;
//        String name = nameBox.getText().toString();
//        SharedPreferences.Editor prefEditor = settings.edit();
//        prefEditor.putString(PREF_NAME, name);
//        prefEditor.apply();
//    }
//    public void getName() {
//        TextView nameView = binding.editTextText2;
//        String name = settings.getString(PREF_NAME, "не определено");
//        nameView.setText(name);
//    }








        /*super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final float[] number_first = {0};
        final float[] number_second = {0};
        final float[] result = {0};
        final char[] operation = {'0'};
        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = binding.textView2.getText().toString();
                if (text.equalsIgnoreCase("0")) {
                    binding.textView2.setText("1");
                }
                else {
                    text+="1";
                    binding.textView2.setText(text);
                }
            }
        });
        //цифра 2
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = binding.textView2.getText().toString();
                if (text.equalsIgnoreCase("0")) {
                    binding.textView2.setText("2");
                }
                else {
                    text+="2";
                    binding.textView2.setText(text);
                }
            }
        });
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = binding.textView2.getText().toString();
                if (text.equalsIgnoreCase("0")) {
                    binding.textView2.setText("3");
                }
                else {
                    text+="3";
                    binding.textView2.setText(text);
                }
            }
        });

        binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = binding.textView2.getText().toString();
                if (text.equalsIgnoreCase("0")) {
                    binding.textView2.setText("4");
                }
                else {
                    text+="4";
                    binding.textView2.setText(text);
                }
            }
        });

        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = binding.textView2.getText().toString();
                if (text.equalsIgnoreCase("0")) {
                    binding.textView2.setText("5");
                }
                else {
                    text+="5";
                    binding.textView2.setText(text);
                }
            }
        });

        binding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(binding.textView2.getText());
                System.out.println(text);
                if (text.equalsIgnoreCase("0")) {
                    binding.textView2.setText("6");
                }
                else {
                    text+="6";
                    binding.textView2.setText(text);
                }
            }
        });
        binding.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(binding.textView2.getText());
                System.out.println(text);
                if (text.equalsIgnoreCase("0")) {
                    binding.textView2.setText("7");
                }
                else {
                    text+="7";
                    binding.textView2.setText(text);
                }
            }
        });
        binding.button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(binding.textView2.getText());
                System.out.println(text);
                if (text.equalsIgnoreCase("0")) {
                    binding.textView2.setText("8");
                }
                else {
                    text+="8";
                    binding.textView2.setText(text);
                }
            }
        });
        binding.button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(binding.textView2.getText());
                System.out.println(text);
                if (text.equalsIgnoreCase("0")) {
                    binding.textView2.setText("9");
                }
                else {
                    text+="9";
                    binding.textView2.setText(text);
                }
            }
        });
        binding.button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(binding.textView2.getText());
                System.out.println(text);
                if (text.equalsIgnoreCase("0")) {
                    binding.textView2.setText("0");
                }
                else {
                    text+="0";
                    binding.textView2.setText(text);
                }
            }
        });

        //знак =
        binding.button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(number_first[0] + "  " + operation[0]);
                String text = binding.textView2.getText().toString();
                number_second[0] = Float.parseFloat(text);
                String operation_symbol = String.valueOf(operation[0]);
                if (number_first[0]!=0 && !operation_symbol.equalsIgnoreCase("0")) {
                    if (operation_symbol.equalsIgnoreCase("+")) {
                        result[0] = number_first[0] + number_second[0];
                        binding.textView2.setText(String.valueOf((int) result[0]));
                    }
                    else if (operation_symbol.equalsIgnoreCase("-")) {
                        result[0] = number_first[0] - number_second[0];
                        binding.textView2.setText(String.valueOf((int) result[0]));
                    }
                    else if (operation_symbol.equalsIgnoreCase("*")) {
                        result[0] = number_first[0] * number_second[0];
                        binding.textView2.setText(String.valueOf((int) result[0]));
                    }
                    else {
                        result[0] = number_first[0]/number_second[0];
                        binding.textView2.setText(String.valueOf((int) result[0]));
                    }
                    number_first[0] = 0;
                    number_second[0] = 0;
                    result[0] = 0;
                    operation[0] = '0';
                }
                else {
                    System.out.println("Введите число, операцию, затем еще одно число");
                }
            }
        });

        binding.button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textView2.setText("0");
                number_first[0] = 0;
                number_second[0] = 0;
                result[0] = 0;
                operation[0] = '0';
            }
        });

        //знак +
        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = binding.textView2.getText().toString();
                System.out.println(text);
                number_first[0] = Float.parseFloat(text);
                operation[0] = '+';
                binding.textView2.setText("0");
            }
        });

        //знак /
        binding.button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = binding.textView2.getText().toString();
                System.out.println(text);
                number_first[0] = Float.parseFloat(text);
                operation[0] = '/';
                binding.textView2.setText("0");
            }
        });
        //знак *
        binding.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = binding.textView2.getText().toString();
                System.out.println(text);
                number_first[0] = Float.parseFloat(text);
                operation[0] = '*';
                binding.textView2.setText("0");
            }
        });
        //знак -
        binding.button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = binding.textView2.getText().toString();
                System.out.println(text);
                number_first[0] = Float.parseFloat(text);
                operation[0] = '-';
                binding.textView2.setText("0");
            }
        });*/
}



