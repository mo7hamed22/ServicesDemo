package com.example.servicesdemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class StartService extends Service {
    private static String TAG ="SERVICE ";
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG,"onCreate");
        //Toast.makeText(StartService.this,"oncreate",Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG,"onStartcommand");
        //Toast.makeText(StartService.this,"onStartcommand",Toast.LENGTH_SHORT).show();
        return Service.START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }

    public StartService(){}
    @Override
    public IBinder onBind(Intent intent) {
        Log.i(TAG,"onBind");
        return null;
        //return null cause i make statred service
    }
}
