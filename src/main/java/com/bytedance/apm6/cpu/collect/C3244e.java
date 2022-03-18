package com.bytedance.apm6.cpu.collect;

import com.bytedance.apm6.p183g.C3324a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.apm6.cpu.collect.e */
public class C3244e {

    /* renamed from: a */
    public static List<C3242d> f10401a = new LinkedList();

    /* renamed from: b */
    public static volatile boolean f10402b = false;

    /* renamed from: c */
    private static Map<String, Object> f10403c = new HashMap();

    /* renamed from: a */
    public static synchronized void m13566a() {
        synchronized (C3244e.class) {
            f10402b = true;
            if (!f10401a.isEmpty()) {
                for (C3242d dVar : f10401a) {
                    C3324a.m13872a(dVar);
                }
                f10401a.clear();
            }
        }
    }
}
