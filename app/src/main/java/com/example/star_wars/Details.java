package com.example.star_wars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class Details extends AppCompatActivity {

    ImageView image;
    TextView name;
    TextView aff;
    SharedPreferences sharedPreferences;
    SharedPreferences sharedPreferencess;
    Button save;
    Button retrieve;
    int last=0;
    int lastIncremented=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        image=(ImageView)findViewById(R.id.image1);
        name=findViewById(R.id.name);
        aff=findViewById(R.id.affiliations);
        retrieve=findViewById(R.id.list);

        save=findViewById(R.id.save);
        final Intent intent=getIntent();
       name.setText(intent.getStringExtra("name"));
        List<String> mList=intent.getStringArrayListExtra("aff");
        Glide.with(this)
                .load(intent.getStringExtra("image"))
                .into(image);
        String affi="";
        for(int i=0;i<mList.size();i++){

            affi=affi+mList.get(i)+"\n";
        }
        aff.setText(affi);

    save.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            sharedPreferences=getSharedPreferences("com.example.starwar", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor=sharedPreferences.edit();
            int i=0;
            String[] saved=new String[2111];
            Map<String,?> keys = sharedPreferences.getAll();
            for(Map.Entry<String,?> entry : keys.entrySet()){
                System.out.println("map values"+entry.getKey() + ": " + entry.getValue().toString());
                saved[i++]=entry.getValue().toString();
            }

            sharedPreferencess=getSharedPreferences("other", Context.MODE_PRIVATE);
            SharedPreferences.Editor edit=sharedPreferencess.edit();
            Set<String> set = new HashSet<>(Arrays. asList(saved));
            edit.putStringSet("arraySaved",set);
            edit.commit();


//            String lastKey= keyList.get(keyList.size()-1);
//
//            last= Integer.parseInt(lastKey);
//            System.out.println(last);
//            lastIncremented=last+1;
//            System.out.println(lastIncremented);
            SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
            String currentTime=sdf.format(new Date());

            editor.putString(currentTime,intent.getStringExtra("name"));
            editor.commit();

        }


    });

    retrieve.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            sharedPreferences=getSharedPreferences("com.example.starwar", Context.MODE_PRIVATE);
//            System.out.println(last);

                Intent intent=new Intent(getApplicationContext(),SavedCharacters.class);
                startActivity(intent);
        }
    });
}



}
