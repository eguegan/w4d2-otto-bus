package com.example.admin.w4d2ottobus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG_";

    public static final String BUNDLE_KEY_MESSAGE = "MESSAGE_KEY";
    public static final String CUSTOM_EVENT_KEY = "CUSTOM_EVENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bus bus = Appp.getBus();
        bus.register(this);
    }

    public void doMagic(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    @Subscribe
    public void eventTriggered(String event) {
        Log.d(TAG, "eventTriggered: " + event);
    }
}
