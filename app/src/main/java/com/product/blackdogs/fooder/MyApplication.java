package com.product.blackdogs.fooder;

import android.app.Application;
import android.content.Context;

/**
 * Created by Milan Marwadi on 21-09-2016.
 */

public class MyApplication extends Application {
    private static Context context;

    public void onCreate() {
        super.onCreate();
        MyApplication.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return MyApplication.context;
    }
}