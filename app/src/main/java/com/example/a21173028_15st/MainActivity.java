package com.example.a21173028_15st;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

public void makeRequest() {
    String url = editText.getText().toString();

    StringRequest request = new StringRequest(
            Request.Method.GET,
            rul,
            new response.Listener<String>() {}

            public void onResponse(String response) {
                println("응답 -> " + response);
                processResponse(response);
    }
    )
}
public void processResponse(String response)
{
    Gson gson = new Gson();
    Movielist movielist = gson.fronJson(response, Movielist.class);
    println("영화 정보의 수 : " + movielist.boxOfficeResult.dailyBoxOfficeList.size());
}