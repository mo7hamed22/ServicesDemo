package com.example.servicesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button str ,stop ,Intentservicebtn ;
    Intent outIntent ;//cuase intent who can launch conponente
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        str =findViewById(R.id.btnstr);
        stop =findViewById(R.id.btnstop);
        Intentservicebtn =findViewById(R.id.Intentsevice);
        str.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    outIntent=new Intent(MainActivity.this,StartService.class);
                startService(outIntent);
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outIntent=new Intent(MainActivity.this,StartService.class);
               stopService(outIntent);
            }
        });
        Intentservicebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outIntent=new Intent(MainActivity.this, IntentService.class);
                startService(outIntent);

            }
        });
    }
}
