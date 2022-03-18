package com.ss.android.openbusiness.p3007d;

import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.openbusiness.C59480b;
import com.ss.android.openbusiness.OpbScene;

/* renamed from: com.ss.android.openbusiness.d.e */
public class C59562e {

    /* renamed from: a */
    private final String f147845a;

    /* renamed from: com.ss.android.openbusiness.d.e$a */
    private static class C59564a {

        /* renamed from: a */
        public static C59562e f147847a = new C59562e(null);
    }

    /* renamed from: a */
    public static C59562e m231064a() {
        return C59564a.f147847a;
    }

    private C59562e() {
        this.f147845a = C59480b.m230865a().mo144868a(DomainSettings.Alias.OPEN_APPCENTER3);
    }

    /* renamed from: com.ss.android.openbusiness.d.e$1 */
    static /* synthetic */ class C595631 {

        /* renamed from: a */
        static final /* synthetic */ int[] f147846a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.openbusiness.OpbScene[] r0 = com.ss.android.openbusiness.OpbScene.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.openbusiness.p3007d.C59562e.C595631.f147846a = r0
                com.ss.android.openbusiness.OpbScene r1 = com.ss.android.openbusiness.OpbScene.MESSAGE_ACTION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.openbusiness.p3007d.C59562e.C595631.f147846a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.openbusiness.OpbScene r1 = com.ss.android.openbusiness.OpbScene.PLUS_MENU_GROUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.openbusiness.p3007d.C59562e.C595631.f147846a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.openbusiness.OpbScene r1 = com.ss.android.openbusiness.OpbScene.PLUS_MENU_SINGLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.openbusiness.p3007d.C59562e.C595631.<clinit>():void");
        }
    }

    /* synthetic */ C59562e(C595631 r1) {
        this();
    }

    /* renamed from: c */
    public String mo202940c(OpbScene opbScene) {
        return m231065a("/lark/app_explorer/api/UpdateUserCommonApps");
    }

    /* renamed from: a */
    private String m231065a(String str) {
        return "https://" + this.f147845a + str;
    }

    /* renamed from: a */
    public String mo202938a(OpbScene opbScene) {
        int i = C595631.f147846a[opbScene.ordinal()];
        if (i == 1) {
            return m231065a("/lark/app_explorer/api/GetMsgActionExternalItems");
        }
        if (i == 2 || i == 3) {
            return m231065a("/lark/app_explorer/api/GetPlusMenuExternalItems");
        }
        return "";
    }

    /* renamed from: b */
    public String mo202939b(OpbScene opbScene) {
        int i = C595631.f147846a[opbScene.ordinal()];
        if (i == 1) {
            return m231065a("/lark/app_explorer/api/v1/GetMsgActionList");
        }
        if (i == 2 || i == 3) {
            return m231065a("/lark/app_explorer/api/v1/GetPlusMenuList");
        }
        return "";
    }
}
