package com.example.shahin.test.interests;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.shahin.test.R;

/**
 * Created by Shahin on 1/28/16 AD.
 */
public class show_sports extends Activity {

    sport_interest sport;
    public Button deleteButton;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sport_listview);

        deleteButton = (Button) findViewById(R.id.delete_Button);


        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.sport_textview, R.id.label, sport.Sports);
        ListView listView = (ListView) findViewById(R.id.sportlistview);
        listView.setAdapter(adapter);

    }

    public void delete(View v){

        ListView listview1 = (ListView) findViewById(R.id.sportlistview);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.sport_textview, R.id.label, sport.Sports);


        final int position = listview1.getPositionForView((View) v.getParent());
        System.out.println("position = " + position);
        sport.Sports.remove(position);
        System.out.println(sport.Sports);
        adapter.notifyDataSetChanged();

        ArrayAdapter adapter2 = new ArrayAdapter<String>(this, R.layout.sport_textview, R.id.label, sport.Sports);
        ListView listView = (ListView) findViewById(R.id.sportlistview);
        listView.setAdapter(adapter2);


    }



}
