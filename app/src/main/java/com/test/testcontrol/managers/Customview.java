package com.test.testcontrol.managers;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class Customview extends RelativeLayout {
    private ListView mListView;

    public Customview(Context context) {
        super(context);
        ServiceManager.getInstance(context).requestService(new BaseManagers.OnBaseManagerListener() {
            @Override
            public void onSuccess(String data) {
                // update
            }

            @Override
            public void onFail() {

            }
        });
        ServiceManager.getInstance(context).updateData();
    }

    public Customview(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void addDatatoListView() {
        RecordManager.getInstance(getContext()).onStart();
        // animation
        // update ui
    }

    public void addDatatoListView2() {
        // animation
        // update ui
        RecordManager.getInstance(getContext()).onStop();
    }
}

