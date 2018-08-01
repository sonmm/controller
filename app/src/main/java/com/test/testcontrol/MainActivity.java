package com.test.testcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.test.testcontrol.managers.ServiceManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ServiceManager.getInstance(this).getStringArrayList();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ServiceManager.getInstance(this).onFinish();
    }
}
