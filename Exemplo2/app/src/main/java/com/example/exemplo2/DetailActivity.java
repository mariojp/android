package com.example.exemplo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView rotulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        rotulo = findViewById(R.id.detail_view_text);

        String texto = getIntent().getStringExtra("TEXTO");
        rotulo.setText(texto);

    }
}