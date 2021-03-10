package com.example.pertemuan3b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void actone(View view) {
        Intent b = new Intent(MainActivity3.this, MainActivity.class);
        startActivity(b);
        Toast.makeText(this, "anda membuka beranda", Toast.LENGTH_SHORT).show();
    }

    public void acttwo(View view) {
        Intent a = new Intent(MainActivity3.this,MainActivity2.class);
        startActivity(a);
        Toast.makeText(this, "anda membuka artikel", Toast.LENGTH_SHORT).show();
    }

}