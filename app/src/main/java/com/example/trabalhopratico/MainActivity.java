package com.example.trabalhopratico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Ir para a segunda tela.
    public void irSegun(View view){
        Intent in = new Intent(MainActivity.this, SegundaTela.class);
        startActivity(in);
    }
}


