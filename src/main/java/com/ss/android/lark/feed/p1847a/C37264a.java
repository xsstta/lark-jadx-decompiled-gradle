package com.ss.android.lark.feed.p1847a;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.feed.a.a */
public class C37264a {

    /* renamed from: a */
    public static String f95669a = "feed.shortcut";

    /* renamed from: b */
    public static String f95670b = "urgent.urgentList";

    /* renamed from: c */
    public static String f95671c = "secretChat";

    /* renamed from: d */
    public static boolean f95672d = true;

    /* renamed from: e */
    public static boolean f95673e = true;

    /* renamed from: f */
    public static boolean f95674f = true;

    /* renamed from: g */
    private static boolean f95675g;

    /* renamed from: b */
    public static boolean m146753b() {
        m146752a();
        return f95672d;
    }

    /* renamed from: c */
    public static boolean m146754c() {
        m146752a();
        return f95673e;
    }

    /* renamed from: d */
    public static boolean m146755d() {
        m146752a();
        return f95674f;
    }

    /* renamed from: a */
    public static synchronized void m146752a() {
        synchronized (C37264a.class) {
            if (!f95675g) {
                AbstractC38037a.AbstractC38042b G = C37268c.m146766b().mo139160G();
                f95672d = G.mo139224a(f95669a, true);
                f95673e = G.mo139224a(f95670b, true);
                f95674f = G.mo139224a(f95671c, true);
                G.mo139223a(new IGetDataCallback<HashMap<String, Boolean>>() {
                    /* class com.ss.android.lark.feed.p1847a.C37264a.C372651 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }

                    /* renamed from: a */
                    public void onSuccess(HashMap<String, Boolean> hashMap) {
                        Boolean bool = hashMap.get(C37264a.f95669a);
                        if (bool != null) {
                            C37264a.f95672d = bool.booleanValue();
                        }
                        Boolean bool2 = hashMap.get(C37264a.f95670b);
                        if (bool2 != null) {
                            C37264a.f95673e = bool2.booleanValue();
                        }
                        Boolean bool3 = hashMap.get(C37264a.f95671c);
                        if (bool3 != null) {
                            C37264a.f95674f = bool3.booleanValue();
                        }
                    }
                });
                f95675g = true;
            }
        }
    }
}
