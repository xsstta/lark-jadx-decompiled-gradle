package com.tt.miniapp.util;

import android.text.TextUtils;
import com.tt.miniapphost.AppbrandContext;

/* renamed from: com.tt.miniapp.util.e */
public class C67031e {
    /* renamed from: a */
    public static boolean m261247a() {
        if (AppbrandContext.getInst().getInitParams() != null) {
            return TextUtils.equals(AppbrandContext.getInst().getInitParams().mo234502b(), "local_test");
        }
        return false;
    }
}
