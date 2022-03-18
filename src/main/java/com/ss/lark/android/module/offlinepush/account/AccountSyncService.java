package com.ss.lark.android.module.offlinepush.account;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AccountSyncService extends Service {

    /* renamed from: a */
    private static final Object f162451a = new Object();

    /* renamed from: b */
    private static C64264b f162452b;

    public void onCreate() {
        synchronized (f162451a) {
            if (f162452b == null) {
                f162452b = new C64264b(getApplicationContext(), true);
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return f162452b.getSyncAdapterBinder();
    }
}
