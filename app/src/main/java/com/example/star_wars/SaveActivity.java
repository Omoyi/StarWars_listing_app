package com.example.star_wars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SaveActivity extends AppCompatActivity {
    private EditText name;
    private EditText email;
    private Button save;
    private SharedPreferences sharedPreferences;
    static final String mypref="myPref";
    static final String nameKey="NameKey";
    static final String emailKey="Email key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);
        name=findViewById(R.id.namee);
        email=findViewById(R.id.emaill);
    }
    public void save(View v){
        String a=name.getText().toString();
        String e=email.getText().toString();
        sharedPreferences=getSharedPreferences(mypref, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString(nameKey,a);
        editor.putString(emailKey,e);
        editor.commit();


    }

    public void retrieve(View v){
        sharedPreferences=getSharedPreferences(mypref, Context.MODE_PRIVATE);
        if(sharedPreferences.contains(nameKey)){
            System.out.println( sharedPreferences.getString(nameKey, ""));
        }
        if(sharedPreferences.contains(emailKey)){
            System.out.println( sharedPreferences.getString(emailKey, ""));
        }
    }
}
