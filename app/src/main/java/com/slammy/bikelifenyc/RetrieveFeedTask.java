package com.slammy.bikelifenyc;

import android.os.AsyncTask;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Slammy on 8/15/16.
 */
public class RetrieveFeedTask extends AsyncTask<String, Void, String> {


    @Override
    protected String doInBackground(String... str) {

        String stations;

        stations = "";
        try {
            URL url = new URL(str[0]);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();
            JsonParser jp = new JsonParser(); //from gson
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
            JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
//            JSONArray jsonArray = rootobj.optJSONArray("stationBeanList");

//            rootobj.get("stationBeanList");
//            stations = rootobj.getAsString("stationBeanList");
//            String[] arr = rootobj.get("stationBeanList").getAsString();
            System.out.println();
            System.out.println("sam");


//            JSONArray arrJSON = new JSONArray(rootobj.get("stationBeanList").getAsJsonArray());
//            JSONObject jsonGeneralData = new JSONObject(arrJSON.get(0).toString());


//            System.out.println(stations);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }catch(IOException ex) {
            ex.printStackTrace();
        }
        return stations;
    }


}
