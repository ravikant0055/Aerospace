package com.example.aerospace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import Adapterss.DroneAdapter;
import Models.DroneModel;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);recyclerView = findViewById(R.id.recyclerview);

        ArrayList<DroneModel> list = new ArrayList<>();

        list.add(new DroneModel(R.drawable.dji, "Dji","5.2 x 5.2 x 1 inches","12ounces"));
        list.add(new DroneModel(R.drawable.mavicpro, "Dji Mavic Pro","5.5×3.2×2.2 in","8.78ounce"));
        list.add(new DroneModel(R.drawable.download, "Dji New Model","5.5×3.2×2.2","8.78 oz"));
        list.add(new DroneModel(R.drawable.ident, "Mavic Air 2","7.4×3.8×3.3 in","20.1"));


        DroneAdapter adapter = new DroneAdapter(list, this);
        recyclerView.setAdapter(adapter);

        GridLayoutManager gridLayoutManager =new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);

    }

}
