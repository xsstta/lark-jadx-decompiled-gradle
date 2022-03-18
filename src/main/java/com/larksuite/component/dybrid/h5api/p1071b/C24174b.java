package com.larksuite.component.dybrid.h5api.p1071b;

import android.os.Build;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;

/* renamed from: com.larksuite.component.dybrid.h5api.b.b */
public class C24174b {

    /* renamed from: a */
    public static final String f59775a = (Build.MANUFACTURER + "-" + Build.MODEL + "-" + Build.CPU_ABI + "-api" + Build.VERSION.SDK_INT);

    /* renamed from: b */
    private static AbstractC24175a f59776b;

    /* renamed from: com.larksuite.component.dybrid.h5api.b.b$a */
    public interface AbstractC24175a {
        /* renamed from: a */
        void mo86770a(String str, String str2);
    }

    /* renamed from: a */
    public static void m88294a(String str) {
        m88296a("H5Log", str);
    }

    /* renamed from: b */
    public static void m88298b(String str) {
        m88299b("H5Log", str);
    }

    /* renamed from: c */
    public static void m88300c(String str) {
        m88297a("H5Log", str, null);
    }

    /* renamed from: a */
    public static void m88295a(String str, Exception exc) {
        m88297a("H5Log", str, exc);
    }

    /* renamed from: b */
    public static void m88299b(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            m88302d(str, str2);
            Log.m165397w(str, str2);
        }
    }

    /* renamed from: c */
    public static void m88301c(String str, String str2) {
        m88297a(str, str2, null);
    }

    /* renamed from: d */
    private static void m88302d(String str, String str2) {
        synchronized (AbstractC24175a.class) {
            AbstractC24175a aVar = f59776b;
            if (aVar != null) {
                aVar.mo86770a(str, str2);
            }
        }
    }

    /* renamed from: a */
    public static void m88296a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            m88302d(str, str2);
            Log.m165379d(str, str2);
        }
    }

    /* renamed from: a */
    public static void m88297a(String str, String str2, Exception exc) {
        m88302d(str, str2);
        Log.m165384e(str, str2, exc);
    }
}
