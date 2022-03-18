package com.tt.miniapphost.p3371e;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12783b;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.ref.card.p690e.C13538c;
import com.bytedance.ee.webapp.p720a.C13757d;
import com.larksuite.component.openplatform.core.block.C24421i;
import com.tt.refer.impl.business.meta.GadgetMonitorCreator;

/* renamed from: com.tt.miniapphost.e.e */
public class C67515e {

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapphost.e.e$1 */
    public static /* synthetic */ class C675161 {

        /* renamed from: a */
        static final /* synthetic */ int[] f170264a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tt.refer.common.base.AppType[] r0 = com.tt.refer.common.base.AppType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.tt.miniapphost.p3371e.C67515e.C675161.f170264a = r0
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.CardAPP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.tt.miniapphost.p3371e.C67515e.C675161.f170264a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.BlockitApp     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.tt.miniapphost.p3371e.C67515e.C675161.f170264a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.GadgetAPP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.tt.miniapphost.p3371e.C67515e.C675161.f170264a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.WebAPP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.p3371e.C67515e.C675161.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static IMonitorCreator m262603a(IAppContext iAppContext) {
        if (iAppContext == null) {
            AppBrandLogger.m52829e("MonitorUtils", "newMonitorCreator error: appContext is null!");
            return null;
        }
        int i = C675161.f170264a[iAppContext.getAppType().ordinal()];
        if (i == 1) {
            return new C13538c(iAppContext);
        }
        if (i == 2) {
            return new C24421i(iAppContext);
        }
        if (i == 3) {
            return new GadgetMonitorCreator(iAppContext);
        }
        if (i == 4) {
            return new C13757d(iAppContext);
        }
        C12783b.m52840a("newMonitorCreator return null object!");
        return null;
    }
}
