package com.bytedance.platform.horae.p874a.p877c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.platform.horae.common.Logger;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.platform.horae.a.c.c */
public class HandlerC20364c extends Handler {
    public HandlerC20364c(Looper looper) {
        super(looper);
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what != 100) {
            throw new IllegalArgumentException("UnSupport message is " + message.what);
        } else if (message.obj instanceof WeakReference) {
            Message message2 = (Message) ((WeakReference) message.obj).get();
            if (message2 == null || message2.arg2 != 9527) {
                Logger.m74201a("ServiceScheduleManager", "After 5 minutes followed message is already handled!");
                return;
            }
            RunnableC20365d.m74187b().mo68698b(message2);
            Logger.m74201a("ServiceScheduleManager", message2.what + " is delayed 5 seconds and put it into emergency list!");
        }
    }
}
