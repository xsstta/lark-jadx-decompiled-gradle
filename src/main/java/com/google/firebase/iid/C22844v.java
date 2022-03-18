package com.google.firebase.iid;

import android.os.Handler;
import android.os.Message;
import com.google.firebase.iid.MessengerIpcClient;

/* renamed from: com.google.firebase.iid.v */
final /* synthetic */ class C22844v implements Handler.Callback {

    /* renamed from: a */
    private final MessengerIpcClient.ServiceConnectionC22800a f56475a;

    C22844v(MessengerIpcClient.ServiceConnectionC22800a aVar) {
        this.f56475a = aVar;
    }

    public final boolean handleMessage(Message message) {
        return this.f56475a.mo79285a(message);
    }
}
