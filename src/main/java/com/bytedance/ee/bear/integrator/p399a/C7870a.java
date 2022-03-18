package com.bytedance.ee.bear.integrator.p399a;

import android.content.Context;
import android.content.res.Configuration;
import com.bytedance.ee.log.C13479a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.bear.integrator.a.a */
public class C7870a {

    /* renamed from: a */
    private final ConcurrentHashMap<String, AbstractC7873b> f21260a;

    /* renamed from: com.bytedance.ee.bear.integrator.a.a$a */
    private static class C7872a {

        /* renamed from: a */
        public static final C7870a f21261a = new C7870a();
    }

    /* renamed from: com.bytedance.ee.bear.integrator.a.a$b */
    public interface AbstractC7873b {
        /* renamed from: a */
        void mo17016a(Context context, Configuration configuration);
    }

    /* renamed from: a */
    public static C7870a m31582a() {
        return C7872a.f21261a;
    }

    private C7870a() {
        this.f21260a = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public void mo30703a(Context context, Configuration configuration) {
        C13479a.m54764b("ConfigurationChangedMan", "notifyOnChangedListener : " + this.f21260a.size());
        for (Map.Entry<String, AbstractC7873b> entry : this.f21260a.entrySet()) {
            AbstractC7873b value = entry.getValue();
            if (value != null) {
                value.mo17016a(context, configuration);
            }
        }
    }
}
