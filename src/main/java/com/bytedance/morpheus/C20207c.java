package com.bytedance.morpheus;

import android.content.Context;
import com.bytedance.morpheus.core.AbstractC20209b;
import com.bytedance.morpheus.core.C20208a;
import java.util.Map;

/* renamed from: com.bytedance.morpheus.c */
public class C20207c {

    /* renamed from: a */
    private static AbstractC20206b f49348a;

    /* renamed from: b */
    private static Context f49349b;

    /* renamed from: c */
    private static AbstractC20194a f49350c;

    /* renamed from: d */
    private static boolean f49351d;

    /* renamed from: a */
    public static Context m73745a() {
        return f49349b;
    }

    /* renamed from: b */
    public static AbstractC20194a m73750b() {
        return f49350c;
    }

    /* renamed from: c */
    public static Map<String, C20208a> m73753c() {
        return f49348a.mo68359a();
    }

    /* renamed from: a */
    public static void m73747a(AbstractC20209b bVar) {
        C20211e.m73772a().mo68397a(bVar);
    }

    /* renamed from: b */
    public static C20208a m73751b(String str) {
        return f49348a.mo68364b(str);
    }

    /* renamed from: a */
    public static void m73748a(String str) {
        if (f49351d) {
            f49348a.mo68361a(str);
        }
    }

    /* renamed from: b */
    public static void m73752b(AbstractC20209b bVar) {
        C20211e.m73772a().mo68400b(bVar);
    }

    /* renamed from: a */
    public static synchronized void m73746a(AbstractC20194a aVar) {
        synchronized (C20207c.class) {
            if (!f49351d) {
                f49350c = aVar;
                f49349b = aVar.mo68355a();
                f49348a = C20210d.m73771a();
                f49351d = true;
            }
        }
    }

    /* renamed from: a */
    public static boolean m73749a(String str, String str2) {
        return f49348a.mo68363a(str, str2);
    }
}
