package com.bytedance.apm.p140f;

import java.util.Map;

/* renamed from: com.bytedance.apm.f.a */
public class C2934a {

    /* renamed from: a */
    private static AbstractC2935a f9442a;

    /* renamed from: com.bytedance.apm.f.a$a */
    public interface AbstractC2935a {
        /* renamed from: a */
        void mo12638a(Map<Object, Object> map);
    }

    /* renamed from: a */
    public static void m12392a(Map<Object, Object> map) {
        AbstractC2935a aVar = f9442a;
        if (aVar != null) {
            try {
                aVar.mo12638a(map);
            } catch (Throwable unused) {
            }
        }
    }
}
