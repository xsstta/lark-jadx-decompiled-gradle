package com.huawei.updatesdk.service.otaupdate;

import android.content.Intent;

/* renamed from: com.huawei.updatesdk.service.otaupdate.d */
public class C23930d {

    /* renamed from: b */
    private static final Object f59197b = new Object();

    /* renamed from: c */
    private static C23930d f59198c;

    /* renamed from: a */
    private CheckUpdateCallBack f59199a;

    /* renamed from: a */
    public static C23930d m87479a() {
        C23930d dVar;
        synchronized (f59197b) {
            if (f59198c == null) {
                f59198c = new C23930d();
            }
            dVar = f59198c;
        }
        return dVar;
    }

    /* renamed from: a */
    public void mo85864a(int i) {
        CheckUpdateCallBack checkUpdateCallBack = this.f59199a;
        if (checkUpdateCallBack != null) {
            checkUpdateCallBack.onMarketStoreError(i);
        }
    }

    /* renamed from: a */
    public void mo85865a(Intent intent) {
        CheckUpdateCallBack checkUpdateCallBack = this.f59199a;
        if (checkUpdateCallBack != null) {
            checkUpdateCallBack.onMarketInstallInfo(intent);
        }
    }

    /* renamed from: a */
    public void mo85866a(CheckUpdateCallBack checkUpdateCallBack) {
        this.f59199a = checkUpdateCallBack;
    }

    /* renamed from: b */
    public void mo85867b(Intent intent) {
        CheckUpdateCallBack checkUpdateCallBack = this.f59199a;
        if (checkUpdateCallBack != null) {
            checkUpdateCallBack.onUpdateInfo(intent);
        }
    }
}
