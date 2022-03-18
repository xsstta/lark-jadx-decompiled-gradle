package com.bytedance.ee.eenet.httpclient.p600a;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Headers;
import okhttp3.Request;

/* renamed from: com.bytedance.ee.eenet.httpclient.a.a */
public final class C12615a {

    /* renamed from: a */
    private static boolean f33790a;

    /* renamed from: b */
    private static AbstractC12616a f33791b;

    /* renamed from: c */
    private static AtomicBoolean f33792c = new AtomicBoolean(false);

    /* renamed from: com.bytedance.ee.eenet.httpclient.a.a$a */
    public interface AbstractC12616a {
        /* renamed from: a */
        Map<String, String> mo23881a(Headers headers);
    }

    /* renamed from: a */
    public static boolean m52353a() {
        return f33792c.get();
    }

    /* renamed from: a */
    public static void m52351a(AbstractC12616a aVar) {
        f33791b = aVar;
    }

    /* renamed from: a */
    public static void m52352a(boolean z) {
        f33792c.set(z);
    }

    /* renamed from: a */
    public static Map<String, String> m52350a(Headers headers) {
        AbstractC12616a aVar = f33791b;
        if (aVar == null) {
            return new HashMap();
        }
        return aVar.mo23881a(headers);
    }

    /* renamed from: a */
    public static boolean m52354a(Request request) {
        boolean z;
        if (!"GET".equals(request.method().toUpperCase()) && !"HEAD".equals(request.method().toUpperCase())) {
            z = false;
        } else {
            z = true;
        }
        String str = request.headers().get("EENet-Request-Enable-Complex-Connect");
        if (!TextUtils.isEmpty(str)) {
            z = Boolean.valueOf(str).booleanValue();
        }
        if (z || f33790a) {
            return true;
        }
        return false;
    }
}
