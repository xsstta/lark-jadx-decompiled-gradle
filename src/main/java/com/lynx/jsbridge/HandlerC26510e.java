package com.lynx.jsbridge;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.lynx.jsbridge.e */
public class HandlerC26510e extends Handler {

    /* renamed from: a */
    WeakReference<AbstractC26511a> f65555a;

    /* renamed from: com.lynx.jsbridge.e$a */
    public interface AbstractC26511a {
        void handleMsg(Message message);
    }

    public void handleMessage(Message message) {
        AbstractC26511a aVar = this.f65555a.get();
        if (aVar != null && message != null) {
            aVar.handleMsg(message);
        }
    }

    public HandlerC26510e(Looper looper, AbstractC26511a aVar) {
        super(looper);
        this.f65555a = new WeakReference<>(aVar);
    }
}
