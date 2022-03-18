package com.bytedance.platform.godzilla.anr.sp;

import android.util.Log;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.platform.godzilla.anr.sp.b */
public final class C20307b {
    /* renamed from: a */
    public static void m74061a() {
        Exception e;
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Field field;
        Log.d("QueuedWkProxyBAndroid0", "start hook, time stamp = " + System.currentTimeMillis());
        try {
            field = Class.forName("android.app.QueuedWork").getDeclaredField("sPendingWorkFinishers");
            try {
                field.setAccessible(true);
                concurrentLinkedQueue = (ConcurrentLinkedQueue) field.get(null);
                if (concurrentLinkedQueue != null) {
                    try {
                        field.set(null, new ConcurrentLinkedQueueProxy(concurrentLinkedQueue));
                        Log.d("QueuedWkProxyBAndroid0", "Below android 0,replaceQueueWorkPendingWorkFinishers success.");
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                concurrentLinkedQueue = null;
                try {
                    field.set(null, concurrentLinkedQueue);
                } catch (Exception unused) {
                }
                Log.e("QueuedWkProxyBAndroid0", "Below android 0,,hook sPendingWorkFinishers fail.", e);
                Log.d("QueuedWkProxyBAndroid0", "end hook, time stamp = " + System.currentTimeMillis());
            }
        } catch (Exception e4) {
            e = e4;
            field = null;
            concurrentLinkedQueue = null;
            if (!(concurrentLinkedQueue == null || field == null)) {
                field.set(null, concurrentLinkedQueue);
            }
            Log.e("QueuedWkProxyBAndroid0", "Below android 0,,hook sPendingWorkFinishers fail.", e);
            Log.d("QueuedWkProxyBAndroid0", "end hook, time stamp = " + System.currentTimeMillis());
        }
        Log.d("QueuedWkProxyBAndroid0", "end hook, time stamp = " + System.currentTimeMillis());
    }
}
