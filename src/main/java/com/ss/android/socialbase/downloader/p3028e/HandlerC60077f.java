package com.ss.android.socialbase.downloader.p3028e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.socialbase.downloader.e.f */
public class HandlerC60077f extends Handler {

    /* renamed from: a */
    private final WeakReference<AbstractC60078a> f149869a;

    /* renamed from: com.ss.android.socialbase.downloader.e.f$a */
    public interface AbstractC60078a {
        /* renamed from: a */
        void mo204876a(Message message);
    }

    public void handleMessage(Message message) {
        AbstractC60078a aVar = this.f149869a.get();
        if (aVar != null && message != null) {
            aVar.mo204876a(message);
        }
    }

    public HandlerC60077f(Looper looper, AbstractC60078a aVar) {
        super(looper);
        this.f149869a = new WeakReference<>(aVar);
    }
}
