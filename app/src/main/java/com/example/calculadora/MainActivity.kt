package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    Button btn0,btn1,btn3,btn4,btn5,bt6,btn7,btn8,btn9,btnPercent,btnPlus,btnMinus,btnMultiply,btnDivision,btnEqual,btnClear,btnDot,btnBracket;
    TextView tvInput,tvOutput;
    String process;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btn0);
        btn2 = findViewById(R.id.btn1);
        btn3 = findViewById(R.id.btn2);
        btn4 = findViewById(R.id.btn3);
        btn5 = findViewById(R.id.btn4);
        btn6 = findViewById(R.id.btn5);
        btn7 = findViewById(R.id.btn6);
        btn8 = findViewById(R.id.btn7);
        btn9 = findViewById(R.id.btn8);
        btn0 = findViewById(R.id.btn0);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnDivision = findViewById(R.id.btnDivision);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnEqual = findViewById(R.id.btnEqual);
        btnClear = findViewById(R.id.btnClear);
        btnDot = findViewById(R.id.btnDot);
        btnPercent = findViewById(R.id.btnPercent);
        btnBracket = findViewById(R.id.btnBracket);

        tvInput = findViewById(tv.Input)
        tvOutput =findViewById(tv.Output)

    }
}