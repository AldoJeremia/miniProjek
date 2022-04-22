package com.example.mini_projek_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.tujuhbelas,R.drawable.remedi,R.drawable.ingkar,R.drawable.nala,R.drawable.diri,
    R.drawable.kelana,R.drawable.interaksi,R.drawable.jatuhsuka,R.drawable.hatidijalan,R.drawable.satukali};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.Playlist);
        s2 = getResources().getStringArray(R.array.penjelasan);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}