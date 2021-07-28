package com.example.multiviewrecy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MultiAdapter multiAdapter;
    ArrayList<Multiemploy> multiemploys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        multiemploys = new ArrayList<>();

        settingdata();

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        multiAdapter = new MultiAdapter(this,multiemploys);

        recyclerView.setAdapter(multiAdapter);
    }

    private void settingdata()
    {
        multiemploys.add(new Multiemploy("sunil","venkatagiri","6437793923",""));

        multiemploys.add(new Multiemploy("sunil","venkatagiri","","sunil@gmail"));

    }

//    private void settingdata()
//    {
//
//        Multiemploy multiemploy1 = new Multiemploy();
//
//        multiemploy1.setUsername("sunil");
//        multiemploy1.setAddress("venkatagiri");
//        multiemploy1.setPhone("916303727148");
//        multiemploys.add(multiemploy1);
//
//
//        Multiemploy multiemploy4 = new Multiemploy();
//
//        multiemploy4.setUsername("kuladheep");
//        multiemploy4.setAddress("venkatagiri");
//        multiemploy4.setEmail("kuladheep@gmail");
//        multiemploys.add(multiemploy4);
//
//
//        Multiemploy multiemploy2 = new Multiemploy();
//
//        multiemploy2.setUsername("ramu");
//        multiemploy2.setAddress("venkatagiri");
//        multiemploy2.setPhone("916303727149");
//        multiemploys.add(multiemploy2);
//
//
//
//        Multiemploy multiemploy5 = new Multiemploy();
//
//        multiemploy5.setUsername("sai ganesh");
//        multiemploy5.setAddress("venkatagiri");
//        multiemploy5.setEmail("saiganesh@gmail");
//        multiemploys.add(multiemploy5);
//
//
//
//        Multiemploy multiemploy3 = new Multiemploy();
//
//        multiemploy3.setUsername("sunil");
//        multiemploy3.setAddress("venkatagiri");
//        multiemploy3.setPhone("916303727148");
//        multiemploys.add(multiemploy3);
//
//
//        Multiemploy multiemploy6 = new Multiemploy();
//
//        multiemploy6.setUsername("suresh");
//        multiemploy6.setAddress("venkatagiri");
//        multiemploy6.setEmail("suresh@gmail");
//        multiemploys.add(multiemploy6);
//
//    }
}