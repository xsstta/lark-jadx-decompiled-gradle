package com.tt.refer.common.util;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;

/* renamed from: com.tt.refer.common.util.f */
public class C67864f {

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.refer.common.util.f$1 */
    public static /* synthetic */ class C678651 {

        /* renamed from: a */
        static final /* synthetic */ int[] f170934a;

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
                com.tt.refer.common.util.C67864f.C678651.f170934a = r0
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.WebGadgetAPP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.tt.refer.common.util.C67864f.C678651.f170934a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.WebAPP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.tt.refer.common.util.C67864f.C678651.f170934a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.CardAPP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.tt.refer.common.util.C67864f.C678651.f170934a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.GadgetAPP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tt.refer.common.util.C67864f.C678651.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static String m264021a(AppType appType) {
        int i = C678651.f170934a[appType.ordinal()];
        if (i == 1) {
            return "h5gadget";
        }
        if (i == 2) {
            return "web";
        }
        if (i != 3) {
            return "";
        }
        return "card";
    }

    /* renamed from: a */
    private static String m264020a(IAppContext iAppContext) {
        String md5Hex = CharacterUtils.md5Hex(((AbstractC67724a) iAppContext.findServiceByInterface(AbstractC67724a.class)).mo50471l());
        if (TextUtils.isEmpty(md5Hex)) {
            AppBrandLogger.m52829e("SpUtil", "sp prefix path is null");
            return m264021a(iAppContext.getAppType());
        }
        return m264021a(iAppContext.getAppType()) + md5Hex + "_";
    }

    /* renamed from: a */
    public static SharedPreferences m264018a(IAppContext iAppContext, String str) {
        return m264019a(iAppContext, str, false);
    }

    /* renamed from: a */
    public static SharedPreferences m264019a(IAppContext iAppContext, String str, boolean z) {
        return iAppContext.getApplicationContext().getSharedPreferences(m264020a(iAppContext) + str, 0);
    }
}
