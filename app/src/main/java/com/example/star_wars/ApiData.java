package com.example.star_wars;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiData extends AsyncTask<Void, Void, Void> {

    public static String data="";
    String dataParsed="";
    String singleParsed="";
    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url=new URL("https://awesome-star-wars-api.herokuapp.com/characters");

            HttpURLConnection httpURLConnection=(HttpURLConnection) url.openConnection();

            InputStream inputStream=httpURLConnection.getInputStream();
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));

            String line="";
            while(line !=null){

                line=bufferedReader.readLine();
                data=data +line;



            }
            JSONArray JA=new JSONArray(data);

            for(int i=0;i<JA.length();i++){
                JSONObject JO=(JSONObject) JA.get(i);
                singleParsed="Name"+ JO.get("message") + "\n" +
                        "id"+ JO.get("status") + "\n" ;

                dataParsed=dataParsed +singleParsed;
            }

        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }


        return null;

    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

    }
}
