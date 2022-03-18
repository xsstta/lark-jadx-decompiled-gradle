package com.ss.android.ugc.effectmanager.common;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.ss.android.ugc.effectmanager.common.j */
public class HandlerC60543j extends Handler {

    /* renamed from: a */
    private AbstractC60544a f151374a;

    /* renamed from: com.ss.android.ugc.effectmanager.common.j$a */
    public interface AbstractC60544a {
        /* renamed from: a */
        void mo207058a(Message message);
    }

    public HandlerC60543j(AbstractC60544a aVar) {
        super(Looper.getMainLooper());
        this.f151374a = aVar;
    }

    public void handleMessage(Message message) {
        AbstractC60544a aVar = this.f151374a;
        if (aVar != null && message != null) {
            aVar.mo207058a(message);
        }
    }
}
