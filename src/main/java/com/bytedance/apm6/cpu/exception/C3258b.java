package com.bytedance.apm6.cpu.exception;

import com.bytedance.apm6.cpu.C3223a;
import com.bytedance.apm6.cpu.p169a.C3229c;
import java.util.Iterator;

/* renamed from: com.bytedance.apm6.cpu.exception.b */
public class C3258b {

    /* renamed from: a */
    private static String f10435a;

    /* renamed from: b */
    public static String m13615b() {
        return f10435a;
    }

    /* renamed from: a */
    public static boolean m13613a() {
        return m13616c();
    }

    /* renamed from: c */
    private static boolean m13616c() {
        String b = C3223a.m13484a().mo13338b();
        boolean z = !b.equals(f10435a);
        f10435a = b;
        return z;
    }

    /* renamed from: a */
    public static void m13612a(String str) {
        f10435a = str;
    }

    /* renamed from: a */
    public static boolean m13614a(C3229c cVar, double d, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (z) {
            if (!cVar.mo13356b().isEmpty()) {
                Iterator<String> it = C3223a.m13484a().mo13339c().iterator();
                z3 = false;
                while (it.hasNext()) {
                    String next = it.next();
                    if (cVar.mo13356b().containsKey(next)) {
                        double doubleValue = cVar.mo13356b().get(next).doubleValue();
                        if (doubleValue >= 0.0d) {
                            if (d > doubleValue) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            } else {
                z3 = false;
            }
            if (z3) {
                return z3;
            }
            if (d <= cVar.mo13364e()) {
                z4 = false;
            }
            return z4;
        }
        if (!cVar.mo13360c().isEmpty()) {
            Iterator<String> it2 = C3223a.m13484a().mo13339c().iterator();
            z2 = false;
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (cVar.mo13360c().containsKey(next2)) {
                    double doubleValue2 = cVar.mo13360c().get(next2).doubleValue();
                    if (doubleValue2 >= 0.0d) {
                        if (d > doubleValue2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
        } else {
            z2 = false;
        }
        if (z2) {
            return z2;
        }
        if (d <= cVar.mo13367h()) {
            z4 = false;
        }
        return z4;
    }
}
