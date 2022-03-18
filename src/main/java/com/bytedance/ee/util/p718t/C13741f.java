package com.bytedance.ee.util.p718t;

import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.ee.util.t.f */
public class C13741f {
    /* renamed from: a */
    public static void m55704a(FragmentManager fragmentManager) {
        if (fragmentManager != null && fragmentManager.isStateSaved()) {
            C13479a.m54775e("FragmentUtils", "popBackStack(), state save is true");
            try {
                Method declaredMethod = fragmentManager.getClass().getSuperclass().getDeclaredMethod("noteStateNotSaved", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(fragmentManager, new Object[0]);
            } catch (Exception e) {
                C13479a.m54758a("FragmentUtils", "noteStattSave(),error:" + e);
                C13606d.m55245a("FragmentUtils", e);
            }
        }
    }
}
