package com.huawei.hmsagentsamplexsj;

import android.app.Application;

import com.huawei.android.hms.agent.HMSAgent;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        HMSAgent.init(this);
    }
}