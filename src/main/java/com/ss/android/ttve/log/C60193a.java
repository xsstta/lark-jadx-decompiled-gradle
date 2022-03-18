package com.ss.android.ttve.log;

import com.ss.android.vesdk.AbstractC63928aa;

/* renamed from: com.ss.android.ttve.log.a */
public class C60193a {

    /* renamed from: a */
    private static AbstractC63928aa f150238a;

    /* renamed from: a */
    public static void m233972a() {
        TELog2ClientInvoker.nativeInit();
    }

    /* renamed from: a */
    public static void m233974a(AbstractC63928aa aaVar) {
        f150238a = aaVar;
    }

    /* renamed from: a */
    public static void m233975a(boolean z) {
        TELog2ClientInvoker.nativeSetIsToLogcat(z);
    }

    /* renamed from: a */
    public static void m233973a(int i, String str) {
        AbstractC63928aa aaVar = f150238a;
        if (aaVar != null) {
            aaVar.mo196110a(i, "[VESDK]" + str);
        }
    }
}
