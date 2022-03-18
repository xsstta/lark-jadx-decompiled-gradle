package com.bytedance.platform.horae.p874a;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.platform.horae.AbstractC20367b;
import com.bytedance.platform.horae.p874a.p875a.C20346a;
import com.bytedance.platform.horae.p874a.p875a.RunnableC20349c;
import com.bytedance.platform.horae.p874a.p877c.RunnableC20365d;
import java.util.Set;

/* renamed from: com.bytedance.platform.horae.a.b */
public class C20353b {

    /* renamed from: b */
    private static C20353b f49673b;

    /* renamed from: a */
    private Application f49674a;

    /* renamed from: c */
    private boolean f49675c;

    /* renamed from: d */
    private boolean f49676d;

    private C20353b(Application application) {
        this.f49674a = application;
    }

    /* renamed from: a */
    public static C20353b m74170a(Application application) {
        if (f49673b == null) {
            synchronized (C20353b.class) {
                if (f49673b == null) {
                    f49673b = new C20353b(application);
                }
            }
        }
        return f49673b;
    }

    /* renamed from: a */
    public void mo68664a(boolean z, String str, AbstractC20367b bVar, Set<String> set, boolean z2) {
        if (!this.f49675c) {
            if (!TextUtils.isEmpty(str)) {
                this.f49676d = z;
                this.f49675c = true;
                if (z) {
                    RunnableC20365d.m74187b().mo68696a(this.f49674a, str, bVar, z2);
                    return;
                }
                C20346a.m74157a(set);
                RunnableC20349c.m74162a().mo68654a(this.f49674a, str, bVar, z2);
                return;
            }
            throw new IllegalArgumentException("Parameter threadName can not be null!");
        }
    }
}
