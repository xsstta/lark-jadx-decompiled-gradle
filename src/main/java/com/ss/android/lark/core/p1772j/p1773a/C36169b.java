package com.ss.android.lark.core.p1772j.p1773a;

import com.ss.android.lark.biz.core.api.NetworkLevelListener;
import com.ss.android.lark.main.interfaces.AbstractC44506i;
import com.ss.android.lark.main.interfaces.NetworkLevel;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.platform.ah.C51701b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.core.j.a.b */
public class C36169b implements AbstractC44136a.AbstractC44164q {

    /* renamed from: a */
    private static Map<AbstractC44506i, NetworkLevelListener> f93385a = new ConcurrentHashMap();

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44164q
    /* renamed from: a */
    public NetworkLevel mo133379a() {
        return mo133380a(C51701b.m200482a().mo201515a().mo201516a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.core.j.a.b$2 */
    public static /* synthetic */ class C361712 {

        /* renamed from: a */
        static final /* synthetic */ int[] f93388a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.biz.core.api.NetworkLevelListener$NetworkLevel[] r0 = com.ss.android.lark.biz.core.api.NetworkLevelListener.NetworkLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.core.p1772j.p1773a.C36169b.C361712.f93388a = r0
                com.ss.android.lark.biz.core.api.NetworkLevelListener$NetworkLevel r1 = com.ss.android.lark.biz.core.api.NetworkLevelListener.NetworkLevel.NET_UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.core.p1772j.p1773a.C36169b.C361712.f93388a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.biz.core.api.NetworkLevelListener$NetworkLevel r1 = com.ss.android.lark.biz.core.api.NetworkLevelListener.NetworkLevel.WEAK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.core.p1772j.p1773a.C36169b.C361712.f93388a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.biz.core.api.NetworkLevelListener$NetworkLevel r1 = com.ss.android.lark.biz.core.api.NetworkLevelListener.NetworkLevel.EXCELLENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.core.p1772j.p1773a.C36169b.C361712.f93388a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.biz.core.api.NetworkLevelListener$NetworkLevel r1 = com.ss.android.lark.biz.core.api.NetworkLevelListener.NetworkLevel.SERVICE_UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.core.p1772j.p1773a.C36169b.C361712.f93388a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.biz.core.api.NetworkLevelListener$NetworkLevel r1 = com.ss.android.lark.biz.core.api.NetworkLevelListener.NetworkLevel.EVALUATING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.core.p1772j.p1773a.C36169b.C361712.<clinit>():void");
        }
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44164q
    /* renamed from: b */
    public void mo133382b(AbstractC44506i iVar) {
        if (iVar != null) {
            C51701b.m200482a().mo201515a().mo201521b(f93385a.remove(iVar));
        }
    }

    /* renamed from: a */
    public NetworkLevel mo133380a(NetworkLevelListener.NetworkLevel networkLevel) {
        int i = C361712.f93388a[networkLevel.ordinal()];
        if (i == 1) {
            return NetworkLevel.NET_UNAVAILABLE;
        }
        if (i == 2) {
            return NetworkLevel.WEAK;
        }
        if (i == 3) {
            return NetworkLevel.EXCELLENT;
        }
        if (i == 4) {
            return NetworkLevel.SERVICE_UNAVAILABLE;
        }
        if (i != 5) {
            return null;
        }
        return NetworkLevel.EVALUATING;
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44164q
    /* renamed from: a */
    public void mo133381a(final AbstractC44506i iVar) {
        if (iVar != null) {
            C361701 r0 = new NetworkLevelListener() {
                /* class com.ss.android.lark.core.p1772j.p1773a.C36169b.C361701 */

                @Override // com.ss.android.lark.biz.core.api.NetworkLevelListener
                public void onNetworkLevelChanged(NetworkLevelListener.NetworkLevel networkLevel) {
                    iVar.mo157424a(C36169b.this.mo133380a(networkLevel));
                }
            };
            C51701b.m200482a().mo201515a().mo201518a(r0);
            f93385a.put(iVar, r0);
        }
    }
}
