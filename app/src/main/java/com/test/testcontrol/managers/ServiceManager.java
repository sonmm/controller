package com.test.testcontrol.managers;

import android.content.Context;

import java.util.ArrayList;

public class ServiceManager extends BaseManagers {

    private static ServiceManager mServiceManager;
    private ArrayList<String> mStringArrayList = new ArrayList<>();

    public ArrayList<String> getStringArrayList() {
        return mStringArrayList;
    }

    public void setStringArrayList(ArrayList<String> stringArrayList) {
        mStringArrayList = stringArrayList;
    }

    public ServiceManager(Context context) {
        onCreate();
    }

    public static ServiceManager getInstance(Context context) {
        if (mServiceManager == null) {
            mServiceManager = new ServiceManager(context);
        }
        return mServiceManager;
    }


    public void requestService(final OnBaseManagerListener onBaseManagerListener) {
        requestAPI(new OnBaseManagerListener() {
            @Override
            public void onSuccess(String data) {
                mStringArrayList.add(data);
                if (onBaseManagerListener != null)
                    onBaseManagerListener.onSuccess(data);
            }

            @Override
            public void onFail() {
                if (onBaseManagerListener != null)
                    onBaseManagerListener.onFail();
            }
        });
    }

    public void updateData() {
        mStringArrayList.set(1,"");
    }

    @Override
    public void onCreate() {
        // init service.
    }

    @Override
    public void onFinish() {
        mServiceManager = null;
    }
}
