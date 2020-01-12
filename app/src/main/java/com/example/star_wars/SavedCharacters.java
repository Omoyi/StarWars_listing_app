package com.example.star_wars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SavedCharacters extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_characters);
        listView=findViewById(R.id.listview);
        sharedPreferences=getSharedPreferences("other", Context.MODE_PRIVATE);
        Set<String> set = new HashSet<>();
        set=sharedPreferences.getStringSet("arraySaved",null);
        String[] savedArray=new String[set.size()];
        set.toArray(savedArray);
        final ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, savedArray);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                parent.removeViewInLayout(view);
                sharedPreferences=getSharedPreferences("com.example.star_wars", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                String nameSelected=parent.getItemAtPosition(position).toString();
                int i=0,j=0;
                Map<String,?> keys = sharedPreferences.getAll();

                for(Map.Entry<String,?> entry : keys.entrySet()){

                    if(entry.getValue().toString().equals(nameSelected)){

                        if(nameSelected.equals(entry.getValue().toString())){
                            System.out.println(entry.getKey());
                            editor.remove(entry.getKey());
                            editor.clear();
                            editor.commit();
                        }
                    }

                }



            }
        });
    }
}

