package com.example.practical_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class product extends AppCompatActivity {
 Button navigation_to_phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        navigation_to_phone = findViewById(R.id.button3);
        navigation_to_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(product.this, phone.class);
                startActivity(intent);
            }
        });
    }
}