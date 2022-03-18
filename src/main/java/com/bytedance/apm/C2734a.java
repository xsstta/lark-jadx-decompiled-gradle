package com.bytedance.apm;

import android.content.Context;
import com.bytedance.apm.config.C2888d;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p153n.C3053c;

/* renamed from: com.bytedance.apm.a */
public class C2734a {

    /* renamed from: com.bytedance.apm.a$a */
    private static class C2737a {

        /* renamed from: a */
        public static final C2734a f8793a = new C2734a();
    }

    private C2734a() {
    }

    /* renamed from: a */
    public static C2734a m11611a() {
        return C2737a.f8793a;
    }

    /* renamed from: b */
    public void mo11778b() {
        ApmDelegate.m12591a().mo12798k();
    }

    /* renamed from: c */
    public void mo11780c() {
        ApmDelegate.m12591a().mo12799l();
    }

    /* renamed from: d */
    public C2888d.C2890a mo11781d() {
        return ApmDelegate.m12591a().mo12787c();
    }

    /* renamed from: b */
    public void mo11779b(C2888d dVar) {
        ApmDelegate.m12591a().mo12783b(dVar);
    }

    /* renamed from: a */
    public void mo11776a(Context context) {
        ApmDelegate.m12591a().mo12775a(context);
        if (C2785b.m11770k()) {
            C3053c.m12774a().mo12897a(new Runnable() {
                /* class com.bytedance.apm.C2734a.RunnableC27351 */

                public void run() {
                    ApmAgent.storeLogBypass("Apm#init", "Apm init");
                }
            });
        }
    }

    /* renamed from: a */
    public void mo11777a(C2888d dVar) {
        ApmDelegate.m12591a().mo12778a(dVar);
        if (C2785b.m11770k()) {
            C3053c.m12774a().mo12897a(new Runnable() {
                /* class com.bytedance.apm.C2734a.RunnableC27362 */

                public void run() {
                    ApmAgent.storeLogBypass("Apm#start", "Apm start");
                }
            });
        }
    }
}
