package com.ss.android.push;

import android.app.IntentService;
import android.content.Intent;
import android.os.IBinder;

public class DefaultService extends IntentService {
    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
    }

    public DefaultService() {
        super("DefaultService");
    }

    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }
}
