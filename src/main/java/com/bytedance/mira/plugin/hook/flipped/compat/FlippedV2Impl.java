package com.bytedance.mira.plugin.hook.flipped.compat;

import android.util.Log;
import com.C1711a;
import java.lang.reflect.Method;

public class FlippedV2Impl implements AbstractC20112c {
    private native Method getDeclaredMethod(Object obj, String str, Class<?>[] clsArr);

    static {
        C1711a.m7628a("flipped");
    }

    @Override // com.bytedance.mira.plugin.hook.flipped.compat.AbstractC20112c
    /* renamed from: a */
    public void mo68209a() {
        try {
            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
            Method declaredMethod = getDeclaredMethod(cls, "getRuntime", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Method declaredMethod2 = getDeclaredMethod(cls, "setHiddenApiExemptions", new Class[]{String[].class});
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(invoke, new String[]{"L"});
            Log.e("FlippedV2Impl", "V2 invokeHiddenApiRestrictions success.");
        } catch (Exception e) {
            Log.e("FlippedV2Impl", "V2 invokeHiddenApiRestrictions fail: " + Log.getStackTraceString(e));
        }
    }
}
