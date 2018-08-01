package com.test.testcontrol.managers;

public abstract class BaseRecordManager {
    boolean isRecordType1 = true;

    abstract void onCreate();

    abstract void onFinish();

    abstract void onPause();

    abstract void onStart();

    abstract void onStop();


}
