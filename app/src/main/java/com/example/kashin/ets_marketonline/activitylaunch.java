package com.example.kashin.ets_marketonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;

public class activitylaunch extends AppCompatActivity {

    GridView griditem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitylauch);

        griditem = (GridView) findViewById(R.id.griditems);

        final ArrayList<String>  arrayList = new ArrayList<>();

        arrayList.add("item1");
        arrayList.add("item2");
        arrayList.add("item3");
        arrayList.add("item4");
        arrayList.add("item5");
        arrayList.add("item6");
        arrayList.add("item7");
        arrayList.add("item8");
        arrayList.add("item9");
        arrayList.add("item10");
        arrayList.add("item11");
        arrayList.add("item12");
        arrayList.add("item13");
        arrayList.add("item14");
        arrayList.add("item15");

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, arrayList);
        griditem.setAdapter(adapter);

        griditem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(activitylaunch.this, arrayList.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate();

        return super.onCreateOptionsMenu(menu);
    }*/
}
