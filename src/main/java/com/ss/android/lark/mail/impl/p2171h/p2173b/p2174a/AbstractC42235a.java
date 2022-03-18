package com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a;

import com.ss.android.lark.log.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.mail.impl.h.b.a.a */
public abstract class AbstractC42235a {

    /* renamed from: a */
    protected ConcurrentHashMap<String, Long> f107522a;

    /* renamed from: b */
    protected volatile boolean f107523b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo152338a();

    /* renamed from: b */
    public abstract String[] mo152341b();

    /* renamed from: c */
    public void mo152342c() {
        String a = mo152338a();
        Log.m165389i(a, "thread count " + Thread.activeCount());
        this.f107522a = new ConcurrentHashMap<>();
    }

    /* renamed from: d */
    public Map<String, Long> mo152343d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 1; i < mo152341b().length; i++) {
            try {
                linkedHashMap.put(String.format("step%1$s (%2$s)", Integer.valueOf(i), mo152341b()[i]), Long.valueOf(mo152337a(i)));
            } catch (Throwable unused) {
            }
        }
        return linkedHashMap;
    }

    /* renamed from: e */
    public void mo152344e() {
        if (!this.f107523b) {
            this.f107523b = true;
            StringBuilder sb = new StringBuilder();
            try {
                sb.append(String.format("%1$s total cost %2$s ms\n", Integer.valueOf(hashCode()), Long.valueOf(System.currentTimeMillis() - this.f107522a.get(mo152341b()[0]).longValue())));
                for (Map.Entry<String, Long> entry : mo152343d().entrySet()) {
                    sb.append(String.format("%1$s %2$s cost %3$s ms\n", Integer.valueOf(hashCode()), entry.getKey(), entry.getValue()));
                }
            } catch (Throwable unused) {
            }
            Log.m165379d(mo152338a(), sb.toString());
            ConcurrentHashMap<String, Long> concurrentHashMap = this.f107522a;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
        }
    }

    /* renamed from: b */
    public long mo152340b(String str) {
        int i = 0;
        while (true) {
            if (i >= mo152341b().length) {
                i = -1;
                break;
            } else if (str == mo152341b()[i]) {
                break;
            } else {
                i++;
            }
        }
        return mo152337a(i);
    }

    /* renamed from: a */
    public long mo152337a(int i) {
        Long l;
        ConcurrentHashMap<String, Long> concurrentHashMap = this.f107522a;
        if (concurrentHashMap == null || i <= 0 || (l = concurrentHashMap.get(mo152341b()[i])) == null) {
            return -9999;
        }
        int i2 = i - 1;
        Long l2 = null;
        while (l2 == null && i2 >= 0) {
            l2 = this.f107522a.get(mo152341b()[i2]);
            i2--;
        }
        if (l2 == null) {
            return -9999;
        }
        return l.longValue() - l2.longValue();
    }

    /* renamed from: a */
    public boolean mo152339a(String str) {
        if (this.f107523b) {
            return false;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = this.f107522a;
        if (concurrentHashMap == null || concurrentHashMap.containsKey(str)) {
            String a = mo152338a();
            Log.m165389i(a, hashCode() + " ignore reach " + str);
            return false;
        }
        String a2 = mo152338a();
        Log.m165389i(a2, hashCode() + " reach " + str);
        this.f107522a.put(str, Long.valueOf(System.currentTimeMillis()));
        return true;
    }
}
