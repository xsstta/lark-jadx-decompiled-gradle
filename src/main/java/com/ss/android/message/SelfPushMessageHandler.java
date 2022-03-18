package com.ss.android.message;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.ss.android.pushmanager.p3019a.C59959a;
import com.ss.android.ug.bus.C60442b;

public class SelfPushMessageHandler extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int onStartCommand = super.onStartCommand(intent, i, i2);
        if (((C59959a.AbstractC59961b) C60442b.m234863a(C59959a.AbstractC59961b.class)).mo68800b()) {
            return 2;
        }
        return onStartCommand;
    }
}
