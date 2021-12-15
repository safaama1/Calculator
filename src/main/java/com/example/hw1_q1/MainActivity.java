package com.example.hw1_q1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView val;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    boolean start = true;
    boolean add = false, sub = false, mul = false, div = false;
    float first_val, second_val;
    String num = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val = (TextView) findViewById(R.id.val);

        // 7 button
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {  
            @Override
            public void onClick(View v) {
                if (!start)
                    val.setText(val.getText() + "7");
                else {
                    val.setText("7");
                    start = false;
                }
                num += "7";
            }
        });

        // 8 button
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!start)
                    val.setText(val.getText() + "8");
                else {
                    val.setText("8");
                    start = false;
                }
                num += "8";
            }
        });

        // 9 button
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!start)
                    val.setText(val.getText() + "9");
                else {
                    val.setText("9");
                    start = false;
                }
                num += "9";
            }
        });

        // division button
        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit();
                val.setText(first_val + "÷");
                div = true;
                num = "";
            }
        });

        // 4 button
        b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!start)
                    val.setText(val.getText() + "4");
                else {
                    val.setText("4");
                    start = false;
                }
                num += "4";
            }
        });

        // 5 button
        b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!start)
                    val.setText(val.getText() + "5");
                else {
                    val.setText("5");
                    start = false;
                }
                num += "5";
            }
        });

        // 6 button
        b7 = (Button) findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!start)
                    val.setText(val.getText() + "6");
                else {
                    val.setText("6");
                    start = false;
                }
                num += "6";
            }
        });

        // x button
        b8 = (Button) findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit();
                val.setText(first_val + "×");
                mul = true;
                num = "";
            }
        });

        // 1 button
        b9 = (Button) findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!start)
                    val.setText(val.getText() + "1");
                else {
                    val.setText("1");
                    start = false;
                }
                num += "1";
            }
        });

        // 2 button
        b10 = (Button) findViewById(R.id.b10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!start)
                    val.setText(val.getText() + "2");
                else {
                    val.setText("2");
                    start = false;
                }
                num += "2";
            }
        });

        // 3 button
        b11 = (Button) findViewById(R.id.b11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!start)
                    val.setText(val.getText() + "3");
                else {
                    val.setText("3");
                    start = false;
                }
                num += "3";
            }
        });

        // - button
        b12 = (Button) findViewById(R.id.b12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit();
                val.setText(first_val + "-");
                sub = true;
                num = "";
            }
        });

        // 0 button
        b13 = (Button) findViewById(R.id.b13);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!start)
                    val.setText(val.getText() + "0");
                else {
                    val.setText("0");
                    start = false;
                }
                num += "0";
            }
        });

        // C button
        b14 = (Button) findViewById(R.id.b14);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val.setText("");
                num = "";
                first_val = 0;
                second_val = 0;
                mul = div = add = sub = false;
            }
        });

        // = button
        b15 = (Button) findViewById(R.id.b15);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second_val = Float.parseFloat(num + "");
                if (add) {
                    val.setText(val.getText() + "=" + Float.toString(first_val + second_val));
                    num = "";
                    first_val = first_val + second_val;
                    add = false;
                }
                if (sub) {
                    val.setText(val.getText() + "=" + Float.toString(first_val - second_val));
                    num = "";
                    first_val = first_val - second_val;
                    sub = false;
                }
                if (div) {
                    val.setText(val.getText() + "=" + Float.toString(first_val / second_val));
                    num = "";
                    div = false;
                    first_val = first_val / second_val;
                }
                if (mul) {
                    val.setText(val.getText() + "=" + Float.toString(first_val * second_val));
                    num = "";
                    first_val = first_val * second_val;
                    mul = false;
                }
            }
        });

        // + button
        b16 = (Button) findViewById(R.id.b16);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit();
                val.setText(first_val + "+");
                add = true;
                num = "";
            }
        });
    }

    /* function to check if there is operation before adding the new operation */
    public void edit() {
        if (sub) {
            if (num != "")
                first_val -= Float.parseFloat(num + "");
            sub = false;
        } else if (add) {
            if (num != "")
                first_val += Float.parseFloat(num + "");
            add = false;
        } else if (mul) {
            if (num != "")
                first_val *= Float.parseFloat(num + "");
            mul = false;
        } else if (div) {
            if (num != "")
                first_val /= Float.parseFloat(num + "");
            div = false;
        } else {
            if (num != "")
                first_val = Float.parseFloat(num + "");
        }
    }
}