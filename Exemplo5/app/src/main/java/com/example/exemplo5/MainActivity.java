package com.example.exemplo5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.exemplo5.model.Item;
import com.example.exemplo5.view.ItemAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<Item> list = new ArrayList<>();

    private ListView listView;

    private FloatingActionButton botao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.main_list_lista);
        botao = findViewById(R.id.main_button_add);

        botao.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,DetailActivity.class);
            startActivity(intent);
        });

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            Item item = (Item) adapterView.getItemAtPosition(i);
            Intent intent = new Intent(MainActivity.this,DetailActivity.class);
            intent.putExtra("ITEM", item);
            startActivity(intent);
        });

    }


    @Override
    protected void onStart() {
        super.onStart();
        ListAdapter adapter = new ItemAdapter(this,list);
        listView.setAdapter(adapter);
    }
}