package com.bytedance.monitor.collector.p852a;

import android.app.Service;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.monitor.util.C20164a;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: com.bytedance.monitor.collector.a.d */
public class C20126d implements Handler.Callback {

    /* renamed from: a */
    private static C20126d f49124a = new C20126d();

    /* renamed from: b */
    private static C20125c f49125b = null;

    /* renamed from: c */
    private static Map<IBinder, Service> f49126c;

    /* renamed from: d */
    private Handler.Callback f49127d;

    /* renamed from: d */
    public static void m73454d() {
        f49125b = null;
    }

    private C20126d() {
    }

    /* renamed from: a */
    public static C20126d m73452a() {
        return f49124a;
    }

    /* renamed from: c */
    public static C20125c m73453c() {
        return f49125b;
    }

    /* renamed from: b */
    public void mo68231b() {
        try {
            Handler handler = (Handler) C20164a.m73588d();
            Field b = C20123a.m73449b(Handler.class, "mCallback");
            this.f49127d = (Handler.Callback) b.get(handler);
            b.set(handler, this);
        } catch (Throwable unused) {
        }
    }

    public boolean handleMessage(Message message) {
        try {
            if (C20124b.m73450a(message)) {
                f49125b = C20125c.m73451a(message);
            }
        } catch (Throwable unused) {
        }
        Handler.Callback callback = this.f49127d;
        if (callback != null) {
            return callback.handleMessage(message);
        }
        return false;
    }

    /* renamed from: a */
    public synchronized String mo68230a(IBinder iBinder) {
        String str;
        if (f49126c == null) {
            try {
                Object e = C20164a.m73589e();
                f49126c = (Map) C20123a.m73449b(e.getClass(), "mServices").get(e);
            } catch (Throwable unused) {
            }
        }
        Map<IBinder, Service> map = f49126c;
        str = null;
        if (!(map == null || map.get(iBinder) == null)) {
            str = f49126c.get(iBinder).getClass().getName();
        }
        return str;
    }
}
