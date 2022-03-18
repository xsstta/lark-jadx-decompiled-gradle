package com.google.firebase.iid;

import com.google.firebase.iid.MessengerIpcClient;

/* renamed from: com.google.firebase.iid.aa */
final /* synthetic */ class RunnableC22808aa implements Runnable {

    /* renamed from: a */
    private final MessengerIpcClient.ServiceConnectionC22800a f56373a;

    /* renamed from: b */
    private final MessengerIpcClient.AbstractC22803d f56374b;

    RunnableC22808aa(MessengerIpcClient.ServiceConnectionC22800a aVar, MessengerIpcClient.AbstractC22803d dVar) {
        this.f56373a = aVar;
        this.f56374b = dVar;
    }

    public final void run() {
        this.f56373a.mo79290c(this.f56374b);
    }
}
