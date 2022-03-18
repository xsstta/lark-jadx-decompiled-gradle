package com.tt.miniapp.util;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.tt.miniapp.util.ad */
public class HandlerC67025ad extends Handler {

    /* renamed from: a */
    WeakReference<AbstractC67026a> f168998a;

    /* renamed from: com.tt.miniapp.util.ad$a */
    public interface AbstractC67026a {
        /* renamed from: a */
        void mo233141a(Message message);
    }

    public HandlerC67025ad(AbstractC67026a aVar) {
        this.f168998a = new WeakReference<>(aVar);
    }

    public void handleMessage(Message message) {
        AbstractC67026a aVar = this.f168998a.get();
        if (aVar != null && message != null) {
            aVar.mo233141a(message);
        }
    }
}
