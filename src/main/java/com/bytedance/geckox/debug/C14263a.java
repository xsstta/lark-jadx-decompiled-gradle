package com.bytedance.geckox.debug;

import com.bytedance.geckox.C14205b;
import com.bytedance.geckox.C14218d;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.geckox.debug.a */
public class C14263a {
    /* renamed from: a */
    public static void m57550a(C14205b bVar, C14218d dVar) {
        try {
            Method declaredMethod = Class.forName("com.bytedance.geckox.b.a").getDeclaredMethod("debug", C14205b.class, C14218d.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, bVar, dVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
