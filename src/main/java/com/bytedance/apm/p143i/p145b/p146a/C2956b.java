package com.bytedance.apm.p143i.p145b.p146a;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.apm.i.b.a.b */
public class C2956b extends WeakReference<Object> {

    /* renamed from: a */
    public final String f9503a;

    /* renamed from: b */
    public final String f9504b;

    /* renamed from: a */
    static <T> T m12444a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str + " must not be null");
    }

    public C2956b(Object obj, String str, String str2, ReferenceQueue<Object> referenceQueue) {
        super(m12444a(obj, "referent"), (ReferenceQueue) m12444a(referenceQueue, "referenceQueue"));
        this.f9503a = (String) m12444a(str, "key");
        this.f9504b = (String) m12444a(str2, "name");
    }
}
