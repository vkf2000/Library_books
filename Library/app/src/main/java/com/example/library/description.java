package com.example.library;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class description extends AppCompatActivity {

    List<contain> nbooklist;
    private ImageView imageView;
int pos;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);

        imageView=findViewById(R.id.image2);
        Intent intent=getIntent();
        Uri img=intent.getData();
//        imageView.setImageResource(Integer.parseInt(img));
    }

//    private void setdata() {
//        nbooklist=new ArrayList<>();
//        nbooklist.add(new contain(R.drawable.don," Don Quixote by Miguel de Cervantes"));
//    }
}
