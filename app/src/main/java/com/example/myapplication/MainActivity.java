package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
}