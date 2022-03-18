package com.ss.lark.android.module.offlinepush.account;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AuthenticatorService extends Service {

    /* renamed from: a */
    private C64263a f162453a;

    public void onCreate() {
        this.f162453a = new C64263a(this);
    }

    public IBinder onBind(Intent intent) {
        return this.f162453a.getIBinder();
    }
}
