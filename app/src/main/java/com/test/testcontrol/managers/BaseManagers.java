package com.test.testcontrol.managers;

public abstract class BaseManagers {
    protected boolean isRecordType1=true;
    protected abstract void onCreate();
    protected abstract void onFinish();

    protected void requestAPI(OnBaseManagerListener onBaseManagerListener) {
        // request service.

        // onSuccess
        onBaseManagerListener.onSuccess("");
        //on Fail
        onBaseManagerListener.onFail();

    }

    public interface OnBaseManagerListener {
        void onSuccess(String data);
        void onFail();
    }

}
