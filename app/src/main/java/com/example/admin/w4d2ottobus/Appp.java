package com.example.admin.w4d2ottobus;

import android.app.Application;

import com.squareup.otto.Bus;

/**
 * Created by admin on 4/19/2016.
 */
public class Appp extends Application {
    private static Bus bus;

    static {
        bus = new Bus();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static Bus getBus() {
        return bus;
    }
}
