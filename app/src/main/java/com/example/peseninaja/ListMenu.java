package com.example.peseninaja;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListMenu extends AppCompatActivity {
    private RecyclerView rvMakanan;
    private ArrayList<Makanan> list = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_menu);
//        Intent.getIntent();

        rvMakanan = findViewById(R.id.rv_menu);
        rvMakanan.setHasFixedSize(true);

        list.addAll(MakananData.getListData());

    }

    private void showRecyclerList(){
        rvMakanan.setLayoutManager(new LinearLayoutManager(this));
        AdapterMakanan adapterMakanan = new AdapterMakanan(list);
        rvMakanan.setAdapter(adapterMakanan);
    }
}
