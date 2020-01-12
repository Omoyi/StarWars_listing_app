package com.example.star_wars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
public RecyclerView recyclerView;
public Adapter mAdapter;
public ArrayList<StarConstructor> mList;
public   String URL_DATA="https://awesome-star-wars-api.herokuapp.com/characters";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FetchData pro=new FetchData();
        pro.execute();
        recyclerView=(RecyclerView)findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        mList=new ArrayList<>();
    }


     public class FetchData extends AsyncTask<Void,Void,Void>{
         @Override
         protected void onPostExecute(Void aVoid) {
             super.onPostExecute(aVoid);
             mAdapter=new Adapter(mList,getApplicationContext());
             recyclerView.setAdapter(mAdapter);
         }

         private String mString;

         @Override
         protected Void doInBackground(Void... voids) {
             HttpURLConnection urlConnection=null;
             BufferedReader reader=null;
             Uri  uri=Uri.parse(getString(R.string.war_api));
             URL url;
             System.out.println("aaaaa");
             try{

                 url=new URL(uri.toString());
                 urlConnection=(HttpURLConnection)url.openConnection();
                 urlConnection.setRequestMethod("GET");
                 urlConnection.setRequestProperty("user-key","");
                 urlConnection.connect();

                 InputStream inputStream=urlConnection.getInputStream();
                 StringBuffer buffer=new StringBuffer();
                 if(inputStream==null){
                     return null;

                 }
                 reader=new BufferedReader(new InputStreamReader(inputStream));

                 String line;
                 while((line=reader.readLine())!=null){
                     buffer.append(line+ "\n");
                 }
                 if(buffer.length()==0){
                     return null;
                 }

                 JSONObject jsonObject=new JSONObject(buffer.toString());

                 System.out.println(jsonObject.toString());
                 JSONArray array=jsonObject.getJSONArray("data");


                 for(int i=0;i<array.length();i++){
                     JSONObject o=array.getJSONObject(i);
                     StarConstructor hero=new StarConstructor();
                     List<String> aff=null;

                     JSONArray array2=o.getJSONArray("affiliations");

                     aff=new ArrayList<String>();
                     for(int j=0;j<array2.length();j++){
                         aff.add(array2.getString(j));

                     }
                     List<String> app=null;
                     if(o.has("apprentices")){


                         JSONArray array3=o.getJSONArray("apprentices");

                         app=new ArrayList<String>();
                         for(int j=0;j<array3.length();j++){
                             app.add(array3.getString(j));

                         }
                     }

                     List<String> form=null;

                     JSONArray array4=o.getJSONArray("formerAffiliations");

                     form=new ArrayList<String>();
                     for(int j=0;j<array4.length();j++){
                         form.add(array4.getString(j));

                     }
                     List<String> mast = null;
                     if(o.has("masters")) {


                         JSONArray array5 = o.getJSONArray("masters");

                         mast = new ArrayList<String>();
                         for (int j = 0; j < array5.length(); j++) {
                             mast.add(array5.getString(j));

                         }
                     }

                     List<String> equi=null;
                     if(o.has("equipment")){
                         JSONArray array6=null;
                       if(o.getString("equipment").equals("TranLang III communication module")){
//                           JSONObject ob =new JSONObject(o.getString("equipment"));
                           array6=new JSONArray();
                           array6.put("TranLang III communication module");
                       }
                       else {
                           array6 = o.getJSONArray("equipment");
                       }
                         equi=new ArrayList<String>();
                         for(int j=0;j<array6.length();j++){
                             equi.add(array6.getString(j));

                         }

                     }

                     List<String> era = null;
                     if(o.has("era")) {

                         JSONArray array7;
                         if(o.getString("era").equals("Rise of the Empire era")){
                             array7=new JSONArray();
                             array7.put("Rise of the Empire era");
                         }
                         else{
                             array7 = o.getJSONArray("era");


                         }


                         era = new ArrayList<String>();
                         for (int j = 0; j < array7.length(); j++) {
                             era.add(array7.getString(j));

                         }
                     }


                    StarConstructor hero1=new StarConstructor();

                     hero1.setAffiliations(aff);
                     hero1.setApprentices(app);
                     if(o.has("armament"))
                     hero1.setArmament(o.getString("armament"));
                     if(o.has("born"))
                     hero1.setBorn(o.getInt("born"));
                     if(o.has("id"))
                     hero1.setId(o.getInt("id"));
                     if(o.has("image"))
                         hero1.setImage(o.getString("image"));
                     if(o.has("name"))
                     hero1.setName(o.getString("name"));
                     if(o.has("height"))
                     hero1.setHeight(o.getInt("height"));
                     if(o.has("mass"))
                     hero1.setMass(o.getInt("mass"));
                     if(o.has("gender"))
                     hero1.setGender(o.getString("gender"));
                     if(o.has("homeWorld"))
                     hero1.setHomeworld(o.getString("homeWorld"));
                     if(o.has("wiki"))
                     hero1.setWiki(o.getString("wiki"));
                     if(o.has("image"))
                     hero1.setImage(o.getString("image"));
                     if(o.has("bornLocation"))
                     hero1.setBornLocation(o.getString("bornLocation"));
                     if(o.has("died"))
                     hero1.setDied(o.getInt("died"));
                     if(o.has("diedLocation"))
                     hero1.setDiedLocation(o.getString("diedLocation"));
                     if(o.has("species"))
                     hero1.setSpecies(o.getString("species"));
                     if(o.has("hairColor"))
                     hero1.setHairColor(o.getString("hairColor"));
                     if(o.has("eyeColor"))
                     hero1.setEyeColor(o.getString("eyeColor"));
                     if(o.has("skinColor"))
                     hero1.setSkinColor(o.getString("skinColor"));
                     if(o.has("cybernetics"))
                     hero1.setCybernetics(o.getString("cybernetics"));
                     hero1.setMasters(mast);
                     hero1.setFormerAffiliations(form);
                     if(o.has("dateCreated"))
                     hero1.setDateCreated(o.getInt("dateCreated"));
                     if(o.has("dateDestroyed"))
                     hero1.setDateDestroyed(o.getInt("dateDestroyed"));
                     if(o.has("destroyedLocation"))
                     hero1.setDestroyedLocation(o.getString("destroyedLocation"));
                     if(o.has("creator"))
                     hero1.setCreator(o.getString("creator"));
                     if(o.has("manufacturer"))
                     hero1.setManufacturer(o.getString("manufacturer"));
                     if(o.has("class"))
                     hero1.setClass_(o.getString("class"));
                     if(o.has("model"))
                     hero1.setModel(o.getString("model") );
                     if(o.has("sensorColor"))
                     hero1.setSensorColor(o.getString("sensorColor"));
                     if(o.has("platingColor"))
                     hero1.setPlatingColor(o.getString("platingColor"));
                     hero1.setEquipment(equi);
                     if(o.has("productLine"))
                     hero1.setProductLine(o.getString("productLine"));
                     if(o.has("kajidic"))
                     hero1.setKajidic(o.getString("kajidic"));
                     hero1.setEra(era);







                     mList.add(hero1);

                 }









             } catch (MalformedURLException e) {
                 e.printStackTrace();
             } catch (IOException e) {
                 e.printStackTrace();
             } catch (JSONException e) {
                 e.printStackTrace();
             }
             finally {


             }
             return null;
         }
     }

}
