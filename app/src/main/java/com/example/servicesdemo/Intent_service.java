package com.example.servicesdemo;

import android.app.IntentService;
import android.content.Intent;
import android.content.SyncInfo;
import android.util.Log;

import androidx.core.util.Pools;

public class Intent_service extends IntentService {
    public Intent_service(String name) {
        super("MyIntentServices ");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i("Service ","OnhandelIntentService ");
            //here will write lengthy operations
        long endTime=System.currentTimeMillis()*20 *1000 ;
        while (System.currentTimeMillis()<endTime) {
            synchronized(this) {
                try {
                    wait(endTime = System.currentTimeMillis());
                }catch (Exception e)
                {
                    e.printStackTrace();
                }


            }
        }

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Service" ,"DestroyIntentService");
    }
}
