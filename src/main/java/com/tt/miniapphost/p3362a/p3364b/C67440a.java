package com.tt.miniapphost.p3362a.p3364b;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12887b;
import com.tt.refer.common.base.AppType;

/* renamed from: com.tt.miniapphost.a.b.a */
public class C67440a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapphost.a.b.a$1 */
    public static /* synthetic */ class C674411 {

        /* renamed from: a */
        static final /* synthetic */ int[] f170043a;

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
                com.tt.refer.common.base.AppType[] r0 = com.tt.refer.common.base.AppType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.tt.miniapphost.p3362a.p3364b.C67440a.C674411.f170043a = r0
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.WebAPP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.tt.miniapphost.p3362a.p3364b.C67440a.C674411.f170043a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.CardAPP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.tt.miniapphost.p3362a.p3364b.C67440a.C674411.f170043a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.GadgetAPP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.tt.miniapphost.p3362a.p3364b.C67440a.C674411.f170043a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.WebGadgetAPP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.tt.miniapphost.p3362a.p3364b.C67440a.C674411.f170043a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.UnKnown     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.p3362a.p3364b.C67440a.C674411.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static AbstractC12887b m262344a(AppType appType, String str) {
        AppBrandLogger.m52828d("AppContextKeyBuilderFac", "appType:" + appType.name() + " identifier:" + str);
        int i = C674411.f170043a[appType.ordinal()];
        if (i == 1) {
            return new C67446f(str);
        }
        if (i == 2) {
            return new C67443c(str);
        }
        if (i == 3) {
            return new C67444d(str);
        }
        if (i != 4) {
            return new C67445e(str);
        }
        return new C67447g(str);
    }
}
