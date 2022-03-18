package com.bytedance.platform.horae.p874a.p877c;

import android.app.Service;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.platform.horae.common.C20370a;
import com.bytedance.platform.horae.common.C20371b;
import com.bytedance.platform.horae.p874a.C20345a;
import com.bytedance.platform.horae.p874a.p875a.C20346a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.platform.horae.a.c.e */
public class C20366e implements Handler.Callback {

    /* renamed from: a */
    private static C20366e f49713a = new C20366e();

    /* renamed from: d */
    private static Map<IBinder, Service> f49714d;

    /* renamed from: b */
    private List<C20345a> f49715b = new ArrayList();

    /* renamed from: c */
    private boolean f49716c;

    /* renamed from: e */
    private Handler.Callback f49717e;

    /* renamed from: a */
    public static C20366e m74194a() {
        return f49713a;
    }

    private C20366e() {
    }

    /* renamed from: b */
    public void mo68702b() {
        try {
            Handler handler = (Handler) C20370a.m74214d();
            Field a = C20371b.m74215a(Handler.class, "mCallback");
            this.f49717e = (Handler.Callback) a.get(handler);
            a.set(handler, this);
        } catch (Throwable th) {
            if (RunnableC20365d.m74187b().mo68699c() != null) {
                RunnableC20365d.m74187b().mo68699c().mo68707a(th);
            }
        }
    }

    public boolean handleMessage(Message message) {
        if (C20346a.m74158b(message)) {
            if (message.arg2 == 9529) {
                return true;
            }
            try {
                this.f49715b.add(C20345a.m74155a(message));
                if (this.f49715b.size() > 100) {
                    this.f49715b.subList(0, 50).clear();
                }
            } catch (Throwable unused) {
            }
            message.arg2 = 9529;
        }
        Handler.Callback callback = this.f49717e;
        if (callback != null) {
            return callback.handleMessage(message);
        }
        return false;
    }

    /* renamed from: a */
    public synchronized String mo68701a(IBinder iBinder) {
        String str;
        if (f49714d == null) {
            try {
                Object c = C20370a.m74213c();
                f49714d = (Map) C20371b.m74215a(c.getClass(), "mServices").get(c);
            } catch (Throwable unused) {
            }
        }
        Map<IBinder, Service> map = f49714d;
        str = null;
        if (!(map == null || map.get(iBinder) == null)) {
            str = f49714d.get(iBinder).getClass().getName();
        }
        if (str == null) {
            this.f49716c = true;
        }
        return str;
    }
}
