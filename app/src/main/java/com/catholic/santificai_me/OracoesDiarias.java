package com.catholic.santificai_me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OracoesDiarias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oracoes_diarias);
    }
    public void btnSJose (View view){
        Intent intent = new Intent(this, SaoJose.class);
        startActivity(intent);
    }
}