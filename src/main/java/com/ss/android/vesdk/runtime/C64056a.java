package com.ss.android.vesdk.runtime;

import com.ss.android.ttve.common.TECloudCtrlInvoker;
import com.ss.android.vesdk.runtime.p3193a.C64057a;

/* renamed from: com.ss.android.vesdk.runtime.a */
public class C64056a {

    /* renamed from: a */
    private static String f161745a = "VECloudCtrlManager";

    /* renamed from: d */
    private static volatile C64056a f161746d;

    /* renamed from: e */
    private static String[] f161747e = {"vesdk_log_command"};

    /* renamed from: b */
    private boolean f161748b;

    /* renamed from: c */
    private TECloudCtrlInvoker f161749c = new TECloudCtrlInvoker();

    /* renamed from: f */
    private String f161750f;

    private C64056a() {
    }

    /* renamed from: a */
    public static C64056a m251411a() {
        if (f161746d == null) {
            synchronized (C64056a.class) {
                if (f161746d == null) {
                    f161746d = new C64056a();
                }
            }
        }
        return f161746d;
    }

    /* renamed from: a */
    public void mo221794a(String str) {
        this.f161750f = str;
        String[] strArr = f161747e;
        for (String str2 : strArr) {
            String str3 = (String) C64057a.m251415a().mo221798b(str2, "");
            if (!str3.isEmpty()) {
                m251413b(str2, str3);
            }
        }
    }

    /* renamed from: a */
    private void m251412a(String str, String str2) {
        C64057a.m251415a().mo221796a(str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030 A[Catch:{ Exception -> 0x0170 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b A[Catch:{ Exception -> 0x0170 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m251413b(java.lang.String r17, java.lang.String r18) {
        /*
        // Method dump skipped, instructions count: 399
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.runtime.C64056a.m251413b(java.lang.String, java.lang.String):int");
    }
}
