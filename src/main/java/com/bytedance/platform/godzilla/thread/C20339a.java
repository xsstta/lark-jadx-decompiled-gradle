package com.bytedance.platform.godzilla.thread;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.platform.godzilla.p872b.C20309a;
import java.lang.reflect.Field;
import java.util.HashMap;

/* renamed from: com.bytedance.platform.godzilla.thread.a */
public final class C20339a {

    /* renamed from: a */
    private static volatile Handler f49617a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static HashMap<String, HandlerThread> f49618b = new HashMap<>();

    /* renamed from: com.bytedance.platform.godzilla.thread.a$a */
    public static class HandlerThreadC20340a extends HandlerThread {

        /* renamed from: a */
        private volatile boolean f49619a;

        public synchronized void start() {
            if (!this.f49619a) {
                this.f49619a = true;
                super.start();
            }
        }

        /* renamed from: a */
        private boolean m74146a(long j) {
            Field a = C20309a.m74066a((Class<?>) HandlerThread.class, "stackSize");
            if (a == null) {
                return false;
            }
            a.setAccessible(true);
            try {
                if (((Long) C20309a.m74065a(a, this)).longValue() != j) {
                    C20309a.m74068a(a, this, Long.valueOf(j));
                }
                return true;
            } catch (IllegalAccessException unused) {
                return false;
            }
        }

        public HandlerThreadC20340a(String str, int i, int i2) {
            super(str, i);
            if (i2 != 0) {
                m74146a((long) i2);
            }
        }
    }

    /* renamed from: a */
    public static HandlerThread m74145a(String str, int i, int i2) {
        HandlerThreadC20340a aVar = new HandlerThreadC20340a(str, i, i2);
        aVar.start();
        return aVar;
    }
}
