package com.bytedance.ee.webapp.menu;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.webapp.menu.WebMoreCommonItem;
import com.bytedance.ee.webapp.p720a.C13755b;
import com.bytedance.ee.webapp.p720a.C13756c;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.service.OPMonitor;

/* renamed from: com.bytedance.ee.webapp.menu.b */
public class C13814b {
    /* renamed from: b */
    private static String m55966b(boolean z) {
        return z ? "success" : "failure";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.webapp.menu.b$1 */
    public static /* synthetic */ class C138151 {

        /* renamed from: a */
        static final /* synthetic */ int[] f36080a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.bytedance.ee.webapp.menu.WebMoreCommonItem$Type[] r0 = com.bytedance.ee.webapp.menu.WebMoreCommonItem.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.webapp.menu.C13814b.C138151.f36080a = r0
                com.bytedance.ee.webapp.menu.WebMoreCommonItem$Type r1 = com.bytedance.ee.webapp.menu.WebMoreCommonItem.Type.ADD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.webapp.menu.C13814b.C138151.f36080a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.webapp.menu.WebMoreCommonItem$Type r1 = com.bytedance.ee.webapp.menu.WebMoreCommonItem.Type.REMOVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.webapp.menu.C13814b.C138151.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static OPMonitorCode m55963a(boolean z) {
        if (z) {
            return C13756c.f35971m;
        }
        return C13756c.f35972n;
    }

    /* renamed from: a */
    private static OPMonitorCode m55962a(WebMoreCommonItem.Type type, boolean z) {
        int i = C138151.f36080a[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return C13756c.f35973o;
            }
            if (z) {
                return C13756c.f35969k;
            }
            return C13756c.f35970l;
        } else if (z) {
            return C13756c.f35967i;
        } else {
            return C13756c.f35968j;
        }
    }

    /* renamed from: a */
    public static void m55965a(IAppContext iAppContext, boolean z, boolean z2, C13813a aVar) {
        OPMonitor addCategoryValue = C13755b.m55770a(m55963a(z), iAppContext).addCategoryValue("app_id", iAppContext.getAppId()).addCategoryValue("is_tab", Boolean.valueOf(z2));
        if (!z && aVar != null) {
            addCategoryValue.addCategoryValue("error_code", Integer.valueOf(aVar.mo50896a()));
            addCategoryValue.addCategoryValue("error_msg", aVar.mo50897b());
        }
        addCategoryValue.flush();
    }

    /* renamed from: a */
    public static void m55964a(IAppContext iAppContext, WebMoreCommonItem.Type type, boolean z, boolean z2, C13813a aVar) {
        OPMonitor addCategoryValue = C13755b.m55771a("Webapp_containerActions_onFavoriteClick", m55962a(type, z), iAppContext).addCategoryValue("app_id", iAppContext.getAppId()).addCategoryValue("action_result", m55966b(z)).addCategoryValue("action_type", type.getValue()).addCategoryValue("is_tab", Boolean.valueOf(z2));
        if (!z && aVar != null) {
            addCategoryValue.addCategoryValue("error_code", Integer.valueOf(aVar.mo50896a()));
            addCategoryValue.addCategoryValue("error_msg", aVar.mo50897b());
        }
        addCategoryValue.flush();
    }
}
