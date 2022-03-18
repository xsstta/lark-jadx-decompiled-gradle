package com.bytedance.common.utility.collection;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

public class WeakHandler extends Handler {
    WeakReference<IHandler> mRef;

    public interface IHandler {
        void handleMsg(Message message);
    }

    public void handleMessage(Message message) {
        IHandler iHandler = this.mRef.get();
        if (iHandler != null && message != null) {
            iHandler.handleMsg(message);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WeakHandler(com.bytedance.common.utility.collection.WeakHandler.IHandler r2) {
        /*
            r1 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L_0x000b
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            goto L_0x000f
        L_0x000b:
            android.os.Looper r0 = android.os.Looper.myLooper()
        L_0x000f:
            r1.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.collection.WeakHandler.<init>(com.bytedance.common.utility.collection.WeakHandler$IHandler):void");
    }

    public WeakHandler(Looper looper, IHandler iHandler) {
        super(looper);
        this.mRef = new WeakReference<>(iHandler);
    }
}
