package com.bytedance.platform.godzilla.p860a.p869c;

import android.os.Build;
import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.p860a.p862b.p863a.p864a.AbstractC20260b;
import com.bytedance.platform.godzilla.p860a.p862b.p863a.p864a.AbstractC20261c;
import com.bytedance.platform.godzilla.p872b.C20309a;
import com.bytedance.platform.godzilla.p872b.C20312d;
import com.bytedance.platform.godzilla.p872b.C20316h;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.bytedance.platform.godzilla.a.c.a */
public class C20272a extends AbstractC20261c {

    /* renamed from: com.bytedance.platform.godzilla.a.c.a$a */
    private static class C20274a extends AbstractC20260b {
        private C20274a() {
        }

        @Override // com.bytedance.platform.godzilla.p860a.p862b.p863a.p864a.AbstractC20260b
        /* renamed from: a */
        public Object mo68542a(Object obj, Method method, Object[] objArr) {
            Logger.m74095a("IActivityTaskManagerProxy", method.getName() + " is called!");
            return super.mo68542a(obj, method, objArr);
        }
    }

    static {
        m73958a("activityDestroyed", new C20274a());
        m73958a("activitySlept", new C20274a());
    }

    /* renamed from: b */
    public void mo68555b() {
        if (Build.VERSION.SDK_INT < 29) {
            Logger.m74095a("IActivityTaskManagerProxy", "Below android Q,return.");
            return;
        }
        try {
            Object b = C20309a.m74069b(Class.forName("android.app.ActivityTaskManager"), "IActivityTaskManagerSingleton");
            if (Class.forName("android.util.Singleton").isInstance(b)) {
                Object a = C20309a.m74063a(b, "mInstance");
                if (a == null) {
                    a = C20312d.m74079a(b.getClass(), "get", new Class[0]).invoke(b, new Object[0]);
                }
                if (a != null && !Proxy.isProxyClass(a.getClass())) {
                    mo68546a(a);
                    C20309a.m74067a(b, "mInstance", C20316h.m74088a(a, this));
                    Logger.m74095a("IActivityTaskManagerProxy", "Hook proxy ActivityTaskManager success!!!");
                }
            }
        } catch (Throwable th) {
            Logger.m74095a("IActivityTaskManagerProxy", "Hook proxy ActivityTaskManager Failed!!!");
            th.printStackTrace();
        }
    }
}
