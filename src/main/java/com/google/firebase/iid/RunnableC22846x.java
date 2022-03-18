package com.google.firebase.iid;

import android.os.IBinder;
import com.google.firebase.iid.MessengerIpcClient;

/* renamed from: com.google.firebase.iid.x */
final /* synthetic */ class RunnableC22846x implements Runnable {

    /* renamed from: a */
    private final MessengerIpcClient.ServiceConnectionC22800a f56477a;

    /* renamed from: b */
    private final IBinder f56478b;

    RunnableC22846x(MessengerIpcClient.ServiceConnectionC22800a aVar, IBinder iBinder) {
        this.f56477a = aVar;
        this.f56478b = iBinder;
    }

    public final void run() {
        this.f56477a.mo79283a(this.f56478b);
    }
}
