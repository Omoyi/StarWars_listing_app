package com.example.star_wars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.HashSet;
import java.util.Set;

public class SavedCharacters extends AppCompatActivity {
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_characters);
        sharedPreferences=getSharedPreferences("other", Context.MODE_PRIVATE);
        Set<String> set = new HashSet<>();
        set=sharedPreferences.getStringSet("arraySaved",null);
        System.out.println(set);
        String[] savedArray=new String[set.size()];
        set.toArray(savedArray);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, savedArray);

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }
}
