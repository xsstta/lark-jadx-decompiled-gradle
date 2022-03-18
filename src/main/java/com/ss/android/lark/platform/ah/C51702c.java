package com.ss.android.lark.platform.ah;

import android.content.Context;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.wschannelprocess.C59307d;
import com.ss.android.lark.wschannelprocess.p2985a.AbstractC59297a;
import com.tencent.mmkv.MMKV;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.platform.ah.c */
public class C51702c {

    /* renamed from: a */
    private static volatile C59307d f128582a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.ah.c$a */
    public static class C51706a {

        /* renamed from: a */
        public static final AbstractC59297a f128588a = C51702c.m200483a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C59307d m200484a() {
        if (f128582a == null) {
            synchronized (C51702c.class) {
                if (f128582a == null) {
                    f128582a = new C59307d(C51706a.f128588a);
                }
            }
        }
        return f128582a;
    }

    /* renamed from: a */
    public static AbstractC59297a m200483a(final Context context) {
        return new AbstractC59297a() {
            /* class com.ss.android.lark.platform.ah.C51702c.C517031 */

            @Override // com.ss.android.lark.wschannelprocess.p2985a.AbstractC59297a
            /* renamed from: a */
            public Context mo177782a() {
                return context;
            }

            @Override // com.ss.android.lark.wschannelprocess.p2985a.AbstractC59297a
            /* renamed from: g */
            public void mo177789g() {
                AppLifecycle.m200904a().mo177970b();
            }

            @Override // com.ss.android.lark.wschannelprocess.p2985a.AbstractC59297a
            /* renamed from: b */
            public String mo177784b() {
                return MMKV.mmkvWithID("wschannel_private_sp", 4).getString("did", null);
            }

            @Override // com.ss.android.lark.wschannelprocess.p2985a.AbstractC59297a
            /* renamed from: c */
            public int mo177785c() {
                return MMKV.mmkvWithID("wschannel_private_sp", 4).getInt("env_type", 1);
            }

            @Override // com.ss.android.lark.wschannelprocess.p2985a.AbstractC59297a
            /* renamed from: d */
            public String mo177786d() {
                return MMKV.mmkvWithID("wschannel_private_sp", 4).getString("long_domain", null);
            }

            @Override // com.ss.android.lark.wschannelprocess.p2985a.AbstractC59297a
            /* renamed from: e */
            public String mo177787e() {
                return C36083a.m141486a().getPassportDependency().mo133086e();
            }

            @Override // com.ss.android.lark.wschannelprocess.p2985a.AbstractC59297a
            /* renamed from: f */
            public AbstractC59297a.AbstractC59298a mo177788f() {
                final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                return new AbstractC59297a.AbstractC59298a() {
                    /* class com.ss.android.lark.platform.ah.C51702c.C517031.C517041 */

                    @Override // com.ss.android.lark.wschannelprocess.p2985a.AbstractC59297a.AbstractC59298a
                    /* renamed from: a */
                    public boolean mo177791a() {
                        return AppLifecycle.m200904a().mo177975e();
                    }

                    @Override // com.ss.android.lark.wschannelprocess.p2985a.AbstractC59297a.AbstractC59298a
                    /* renamed from: a */
                    public void mo177790a(final AbstractC59297a.AbstractC59298a.AbstractC59299a aVar) {
                        C517051 r0 = new AbstractC29586u() {
                            /* class com.ss.android.lark.platform.ah.C51702c.C517031.C517041.C517051 */

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29586u
                            public void onAppLifecycleChanged(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
                                boolean c = aVar2.mo105887c();
                                AbstractC59297a.AbstractC59298a.AbstractC59299a aVar3 = aVar;
                                if (aVar3 != null) {
                                    aVar3.mo201568a(c);
                                }
                            }
                        };
                        concurrentHashMap.put(aVar, r0);
                        AppLifecycle.m200904a().mo177967a(r0);
                    }
                };
            }

            @Override // com.ss.android.lark.wschannelprocess.p2985a.AbstractC59297a
            /* renamed from: a */
            public boolean mo177783a(String str, boolean z) {
                return C37239a.m146648b().mo136952a(str, z);
            }
        };
    }
}
