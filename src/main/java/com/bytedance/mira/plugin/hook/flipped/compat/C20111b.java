package com.bytedance.mira.plugin.hook.flipped.compat;

import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.mira.plugin.hook.flipped.compat.b */
public class C20111b implements AbstractC20112c {
    @Override // com.bytedance.mira.plugin.hook.flipped.compat.AbstractC20112c
    /* renamed from: a */
    public void mo68209a() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
            Method method = (Method) declaredMethod.invoke(cls, "getRuntime", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(null, new Object[0]);
            Method method2 = (Method) declaredMethod.invoke(cls, "setHiddenApiExemptions", new Class[]{String[].class});
            method2.setAccessible(true);
            method2.invoke(invoke, new String[]{"L"});
            Log.e("FlippedV1Impl", "V1 invokeHiddenApiRestrictions success.");
        } catch (Exception e) {
            Log.e("FlippedV1Impl", "V1 invokeHiddenApiRestrictions fail: " + Log.getStackTraceString(e));
        }
    }
}
