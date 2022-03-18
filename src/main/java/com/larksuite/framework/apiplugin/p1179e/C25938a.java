package com.larksuite.framework.apiplugin.p1179e;

import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1176b.C25908c;

/* renamed from: com.larksuite.framework.apiplugin.e.a */
public class C25938a {
    /* renamed from: a */
    public static String m93909a(Object obj) {
        if (obj == null) {
            return null;
        }
        String canonicalName = obj.getClass().getCanonicalName();
        if (canonicalName == null) {
            return obj.getClass().getName();
        }
        return canonicalName;
    }

    /* renamed from: a */
    public static <T extends C25921b> void m93910a(T t, C25908c cVar, String str) {
        if (t != null) {
            t.mErrorCode = cVar.f64115H;
            t.mInnerCode = cVar.f64116I;
            t.mErrorMessage = cVar.f64117J;
            t.mInnerMsg = str;
        }
    }
}
