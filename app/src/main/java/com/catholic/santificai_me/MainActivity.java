package com.catholic.santificai_me;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnSantos (View view){
        Intent intent = new Intent(this, Santos.class);
                startActivity(intent);
    }
    public void btnOracoesDiarias (View view){
        Intent intent = new Intent(this, OracoesDiarias.class);
        startActivity(intent);
    }

    NotificationCompat.Builder builder = new NotificationCompat(this, );
}