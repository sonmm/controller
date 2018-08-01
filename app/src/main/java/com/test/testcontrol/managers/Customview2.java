package com.test.testcontrol.managers;

import android.content.Context;
import android.widget.RelativeLayout;

public class Customview2 extends RelativeLayout {

    public Customview2(Context context) {
        super(context);

        RecordManager.getInstance(context).onStart();

        RecordManager.getInstance(context).onStop();
    }
}
