package com.example.pertemuan3b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void actone(View view) {
        Intent b = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(b);
        Toast.makeText(this, "anda membuka beranda", Toast.LENGTH_SHORT).show();
    }

    public void acttiga(View view) {
        Intent c = new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(c);
        Toast.makeText(this, "anda membuka biodata", Toast.LENGTH_SHORT).show();

    }
}