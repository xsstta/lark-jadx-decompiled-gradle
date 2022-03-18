package com.bytedance.apm.block;

import android.os.Build;
import android.view.View;
import com.bytedance.apm.block.p136a.C2848f;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: com.bytedance.apm.block.h */
public class C2870h {
    /* renamed from: a */
    public static void m12078a() {
        Class<?> cls;
        try {
            Class<?> cls2 = Class.forName("android.view.WindowManagerGlobal");
            Object invoke = cls2.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls2.getDeclaredField("mRoots");
            declaredField.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField.get(invoke);
            Field declaredField2 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mView");
            declaredField2.setAccessible(true);
            Field declaredField3 = View.class.getDeclaredField("mRenderNode");
            declaredField3.setAccessible(true);
            if (Build.VERSION.SDK_INT > 28) {
                cls = Class.forName("android.graphics.RenderNode");
            } else {
                cls = Class.forName("android.view.RenderNode");
            }
            Method a = C2848f.m12009a((Class) cls, "output", (Class<?>[]) new Class[0]);
            for (int i = 0; i < arrayList.size(); i++) {
                a.invoke(declaredField3.get(declaredField2.get(arrayList.get(i))), new Object[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
