package com.example.pertemuan3b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void acttwo(View view) {
        Intent a = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(a);
        Toast.makeText(this, "anda membuka artikel", Toast.LENGTH_SHORT).show();
    }

    public void acttiga(View view) {
        Intent c = new Intent(MainActivity.this,MainActivity3.class);
        startActivity(c);
        Toast.makeText(this, "anda membuka biodata", Toast.LENGTH_SHORT).show();

    }
}