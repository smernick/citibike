package com.slammy.bikelifenyc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView output = (TextView) findViewById(R.id.textView1);

//        URL url;

        // Connect to the URL using java's native library
//        try {
//            url = new URL("https://feeds.citibikenyc.com/stations/stations.json");
//            HttpURLConnection request = (HttpURLConnection) url.openConnection();
//            request.connect();
//            JsonParser jp = new JsonParser(); //from gson
//            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
//            JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
//            String stations = rootobj.get("stationBeanList").getAsString();



//            System.out.println(stations);

//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }catch(IOException ex) {
//            ex.printStackTrace();
//        }

        RetrieveFeedTask task = new RetrieveFeedTask();
        task.execute("https://feeds.citibikenyc.com/stations/stations.json");
        System.out.println();




        // Convert to a JSON object to print data

//        String data = "";
//        try {
//            JSONObject jsonRootObject = new JSONObject(strJson);
//
//            //Get the instance of JSONArray that contains JSONObjects
//            JSONArray jsonArray = jsonRootObject.optJSONArray("Employee");
//
//            //Iterate the jsonArray and print the info of JSONObjects
//            for(int i=0; i < jsonArray.length(); i++){
//                JSONObject jsonObject = jsonArray.getJSONObject(i);
//
//                int id = Integer.parseInt(jsonObject.optString("id").toString());
//                String name = jsonObject.optString("name").toString();
//                float salary = Float.parseFloat(jsonObject.optString("salary").toString());
//
//                data += "Node"+i+" : \n id= "+ id +" \n Name= "+ name +" \n Salary= "+ salary +" \n ";
//            }
//            output.setText(data);
//        } catch (JSONException e) {e.printStackTrace();}
//    }
//}
    }
}
