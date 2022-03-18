package com.ss.android.lark.audit.p1377a;

import com.ss.android.lark.pb.authorization.AllPermissionData;

/* renamed from: com.ss.android.lark.audit.a.f */
public final class C29291f {
    /* renamed from: a */
    public static boolean m107667a(AllPermissionData allPermissionData) {
        if (allPermissionData == null || allPermissionData.mexpire_time.longValue() * 1000 >= System.currentTimeMillis()) {
            return false;
        }
        return true;
    }
}
