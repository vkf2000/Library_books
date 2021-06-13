package com.example.library;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class Fragment2 extends AppCompatActivity implements Book.ListItemClickListener {


    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<contain>nbooklist;
    Book books;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment2);

        initdata();
        initRecyclerView();

    }

    private void initdata() {
        nbooklist=new ArrayList<>();
        nbooklist.add(new contain(R.drawable.don," Don Quixote by Miguel de Cervantes"));
        nbooklist.add(new contain(R.drawable.musketeers,"The Three Musketeers by Alexandre Dumas"));
        nbooklist.add(new contain(R.drawable.treasure,"Treasure Island by Robert Louis Stevenson"));
        nbooklist.add(new contain(R.drawable.fairytale,"fairytale"));
        nbooklist.add(new contain(R.drawable.horror,"horror"));
        nbooklist.add(new contain(R.drawable.poetry,"poetry"));
        nbooklist.add(new contain(R.drawable.sciencefiction,"sciencefiction"));
        nbooklist.add(new contain(R.drawable.mystery,"mystery"));

    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recycler);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);
        books=  new Book(nbooklist,this);

        recyclerView.setAdapter(books);
    }

    @Override
    public void onListItemClick(int clickedItemIndex) {
        Intent intent=new Intent(this,description.class);
//        intent.putExtra("image", (String)contain.getImage());

        Fragment2.this.startActivity(intent);
        Fragment2.this.finish();

    }
}
