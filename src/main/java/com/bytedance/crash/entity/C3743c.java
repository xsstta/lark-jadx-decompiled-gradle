package com.bytedance.crash.entity;

import com.bytedance.crash.C3756h;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.CrashType;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.entity.c */
public final class C3743c extends C3740a {

    /* renamed from: a */
    public static final Object f11533a = new Object();

    /* renamed from: b */
    private static ConcurrentLinkedQueue<C3756h> f11534b = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    private static ConcurrentHashMap<Integer, C3756h> f11535c = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static JSONArray m15471a(Object obj, Throwable th, StackTraceElement[] stackTraceElementArr) {
        return null;
    }

    /* renamed from: a */
    public static JSONArray m15473a(String str, String str2, JSONArray jSONArray) {
        return null;
    }

    /* renamed from: b */
    public static int m15476b() {
        return f11534b.size();
    }

    /* renamed from: a */
    public static JSONArray m15469a() {
        return new JSONArray();
    }

    /* renamed from: a */
    public static File m15468a(File file) {
        return new File(file, "all_data.json");
    }

    /* renamed from: a */
    public static JSONArray m15472a(String str) {
        return new JSONArray();
    }

    /* renamed from: a */
    public static JSONArray m15470a(Object obj) {
        JSONArray jSONArray = new JSONArray();
        Iterator<C3756h> it = f11534b.iterator();
        while (true) {
            if (it.hasNext()) {
                C3756h next = it.next();
                if (next != null && next.mo15279a(obj)) {
                    jSONArray.put(next.mo15278a(CrashType.JAVA, (JSONArray) null));
                    break;
                }
            } else {
                break;
            }
        }
        return jSONArray;
    }

    /* renamed from: b */
    public static JSONArray m15477b(Object obj) {
        JSONArray jSONArray = new JSONArray();
        Iterator<C3756h> it = f11534b.iterator();
        while (true) {
            if (it.hasNext()) {
                C3756h next = it.next();
                if (next != null && next.mo15279a(obj)) {
                    jSONArray.put(next.mo15277a(CrashType.JAVA));
                    break;
                }
            } else {
                break;
            }
        }
        return jSONArray;
    }

    /* renamed from: c */
    public static JSONObject m15478c(Object obj) {
        Iterator<C3756h> it = f11534b.iterator();
        while (it.hasNext()) {
            C3756h next = it.next();
            if (next != null && next.mo15279a(obj)) {
                return next.mo15282d();
            }
        }
        return null;
    }

    /* renamed from: d */
    public static String m15479d(Object obj) {
        if (obj == f11533a) {
            return C3774m.m15591a().mo15460e();
        }
        Iterator<C3756h> it = f11534b.iterator();
        while (it.hasNext()) {
            C3756h next = it.next();
            if (next != null && next.mo15279a(obj)) {
                return next.mo15281c();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m15475a(C3756h hVar) {
        f11534b.add(hVar);
        if (hVar.mo15283e()) {
            f11535c.put(4444, hVar);
        }
    }

    /* renamed from: a */
    public static JSONArray m15474a(Throwable th, Thread thread, File file) {
        return new JSONArray();
    }
}
