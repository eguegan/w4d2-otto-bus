package com.example.admin.w4d2ottobus;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG = "SecondActivityTAG_";

    private static final String MESSAGE_BROADCASTED = "What are you saying friend?";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void doMagic(View view) {
        Log.d(TAG, "broadcastMessage: " + MESSAGE_BROADCASTED);
        Intent intent = new Intent(MainActivity.CUSTOM_EVENT_KEY);
        intent.putExtra(MainActivity.BUNDLE_KEY_MESSAGE, MESSAGE_BROADCASTED);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }
}
