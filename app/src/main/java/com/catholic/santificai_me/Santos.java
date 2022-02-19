package com.catholic.santificai_me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Santos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_santos);
    }
    public void btnSJose (View view){
        Intent intent = new Intent(this, SaoJose.class);
        startActivity(intent);
    }
}