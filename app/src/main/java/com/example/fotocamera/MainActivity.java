package com.example.fotocamera;

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

    /**
     * metodo para abrir otra actividad
     * @param view vista
     */
    public void iniciarCamera(View view){
        Intent intent = new Intent(this,CameraActivity.class);
        startActivity(intent);
    }
}