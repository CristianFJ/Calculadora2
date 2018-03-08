package com.firesoul.calculadora2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bmas, bmen, bdiv, bmul, bpun, bigu;
     EditText etProceso, etconcatenar;
     double numero1, numero2, resultado;
     String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //para poner icono en la action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.cal);
        etProceso = (EditText) findViewById(R.id.eNumero);
        b0 = (Button) findViewById(R.id.button14);
        b1 = (Button) findViewById(R.id.button9);
        b2 = (Button) findViewById(R.id.button10);
        b3 = (Button) findViewById(R.id.button11);
        b4 = (Button) findViewById(R.id.button5);
        b5 = (Button) findViewById(R.id.button6);
        b6 = (Button) findViewById(R.id.button7);
        b7 = (Button) findViewById(R.id.button1);
        b8 = (Button) findViewById(R.id.button2);
        b9 = (Button) findViewById(R.id.button3);
        bmas = (Button) findViewById(R.id.button4);
        bmen = (Button) findViewById(R.id.button8);
        bdiv = (Button) findViewById(R.id.button16);
        bmul = (Button) findViewById(R.id.button12);
        bpun = (Button) findViewById(R.id.button13);
        bigu = (Button) findViewById(R.id.button15);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                etconcatenar = (EditText)findViewById(R.id.eNumero);
                etProceso.setText(etconcatenar.getText().toString() + "0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.eNumero);
                etProceso.setText(etconcatenar.getText().toString() + "1");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.eNumero);
                etProceso.setText(etconcatenar.getText().toString() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.eNumero);
                etProceso.setText(etconcatenar.getText().toString() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.eNumero);
                etProceso.setText(etconcatenar.getText().toString() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.eNumero);
                etProceso.setText(etconcatenar.getText().toString() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.eNumero);
                etProceso.setText(etconcatenar.getText().toString() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.eNumero);
                etProceso.setText(etconcatenar.getText().toString() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.eNumero);
                etProceso.setText(etconcatenar.getText().toString() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.eNumero);
                etProceso.setText(etconcatenar.getText().toString() + "9");
            }
        });
        bpun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.eNumero);
                etProceso.setText(etconcatenar.getText().toString() + ".");
            }
        });
        bigu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.eNumero);
                numero2 = Double.parseDouble(etconcatenar.getText().toString());
                if(operador.equals("+")){
                    etProceso.setText("");

                    resultado = numero1 + numero2;
                }
                if(operador.equals("-")){
                    etProceso.setText("");
                    resultado = numero1 - numero2;
                }
                if(operador.equals("*")){
                    etProceso.setText("");
                    resultado = numero1 * numero2;
                }
                if(operador.equals("/")){
                    etProceso.setText("");
                    if(numero2 == '0'){
                        etProceso.setText("Infinito");
                    }else if(numero2!='0'){
                        resultado = numero1 / numero2;
                    }
                }
                etProceso.setText(String.valueOf(resultado));
            }
        });
        bmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "+";
                etconcatenar = (EditText)findViewById(R.id.eNumero);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        bmen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "-";
                etconcatenar = (EditText)findViewById(R.id.eNumero);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "*";
                etconcatenar = (EditText)findViewById(R.id.eNumero);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "/";
                etconcatenar = (EditText)findViewById(R.id.eNumero);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });

    }



}

