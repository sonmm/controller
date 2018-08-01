package com.test.testcontrol.managers;

import android.content.Context;

public class RecordManager extends BaseRecordManager {
    private static RecordManager mServiceManager;
    private RecorderManager1 mRecorderManager1;
    private RecorderManager2 mRecorderManager2;

    public RecordManager(Context context) {
        mRecorderManager1 = new RecorderManager1();
        mRecorderManager2 = new RecorderManager2();
    }

    public static RecordManager getInstance(Context context) {
        if (mServiceManager == null) {
            mServiceManager = new RecordManager(context);
        }
        return mServiceManager;
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onFinish() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStart() {
        if (isRecordType1) {
            try {
                mRecorderManager1.onStart();
            } catch (Exception e) {
                e.printStackTrace();
                isRecordType1 = false;
                onStart();
            }
        } else {
            try {
                mRecorderManager2.onStart();
            } catch (Exception e) {
                e.printStackTrace();
                // Thông báo lỗi ko thể record
            }
        }
    }

    @Override
    public void onStop() {
        if (isRecordType1) {
            try {
                mRecorderManager1.onStop();
            } catch (Exception e) {
                isRecordType1 = false;
                onStop();
                e.printStackTrace();
            }
        } else {
            try {
                mRecorderManager2.onStop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
