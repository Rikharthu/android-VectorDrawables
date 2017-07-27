package com.example.uberv.vectordrawables;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final List<String> list =
//                new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.documentation_resources)));
//        ArrayAdapter<String> adapter =
//                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
//        ListView listView = (ListView) findViewById(R.id.listview);
//        listView.setAdapter(adapter);

        image = (ImageView) findViewById(R.id.imageview);
        image.setOnClickListener(this);
//        image.setEnabled(false);
    }

    @Override
    public void onClick(View view) {
        image.setSelected(!image.isSelected());
    }
}
