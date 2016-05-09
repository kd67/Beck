package com.rohan.beck;

/**
 * Created by Rohan on 3/24/2016.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Check extends AsyncTask<String,Void,String>{
    private TextView resultField;
    private Context context;

    //flag 0 means get and 1 means post.(By default it is get.)
    public Check(Context context, TextView result) {
        this.context = context;
        resultField = result;
    }
    protected void onPreExecute(){

    }

    @Override
    protected String doInBackground(String... arg0) {
        try{
            String rollnumber = (String)arg0[0];


            String link="http://192.168.183.1:7331/ancon.php";
            String data  = URLEncoder.encode("rollnumber", "UTF-8") + "=" + URLEncoder.encode(rollnumber, "UTF-8");
           // data += "&" + URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode(password, "UTF-8");

            URL url = new URL(link);
            URLConnection conn = url.openConnection();

            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());

            wr.write( data );
            wr.flush();

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            StringBuilder sb = new StringBuilder();
            String line = null;

            // Read Server Response
            while((line = reader.readLine()) != null)
            {
                sb.append(line);
                break;
            }

            return sb.toString();
        }
        catch(Exception e){
            return new String("Exception: " + e.getMessage());
        }
    }

    protected void onPostExecute(String result) {
        resultField.setText(result);
    }
}
