package com.bytedance.dr;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.applog.AbstractC3420g;
import com.bytedance.dr.AbstractC4013i;
import com.bytedance.dr.C4007g;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.dr.h */
public final class C4011h {

    /* renamed from: a */
    static final String f12160a;

    /* renamed from: b */
    private static final String f12161b;

    /* renamed from: d */
    private static AbstractC3420g f12162d;

    /* renamed from: j */
    private static String f12163j;

    /* renamed from: c */
    private final ReentrantLock f12164c = new ReentrantLock();

    /* renamed from: e */
    private AbstractC4013i f12165e;

    /* renamed from: f */
    private boolean f12166f;

    /* renamed from: g */
    private C4017l f12167g;

    /* renamed from: h */
    private final Context f12168h;

    /* renamed from: i */
    private AtomicBoolean f12169i = new AtomicBoolean(false);

    /* renamed from: k */
    private Map<String, String> f12170k;

    /* renamed from: l */
    private Long f12171l;

    static {
        String str = C4011h.class.getSimpleName() + "#";
        f12161b = str;
        f12160a = str;
    }

    /* renamed from: b */
    public void mo15748b() {
        String str = f12160a;
        C4002d.m16661b(str, "Oaid#initOaid");
        try {
            this.f12164c.lock();
            C4002d.m16661b(str, "Oaid#initOaid exec");
            C4016k a = this.f12167g.mo15753a();
            C4002d.m16661b(str, "Oaid#initOaid fetch=" + a);
            if (a != null) {
                f12163j = a.f12175a;
                this.f12170k = a.mo15750a();
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Pair<String, Boolean> a2 = m16682a(this.f12168h);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            C4016k kVar = null;
            String str2 = null;
            if (a2.first != null) {
                int i = -1;
                int i2 = 1;
                if (a != null) {
                    str2 = a.f12176b;
                    i = a.f12180f.intValue() + 1;
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = UUID.randomUUID().toString();
                }
                if (i > 0) {
                    i2 = i;
                }
                C4016k kVar2 = new C4016k((String) a2.first, str2, (Boolean) a2.second, Long.valueOf(elapsedRealtime2), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i2), this.f12171l);
                this.f12167g.mo15754a(kVar2);
                kVar = kVar2;
            }
            if (kVar != null) {
                f12163j = kVar.f12175a;
                this.f12170k = kVar.mo15750a();
            }
            C4002d.m16661b(str, "Oaid#initOaid oaidModel=" + kVar);
        } finally {
            this.f12164c.unlock();
            m16683a(new AbstractC3420g.C3421a(f12163j));
        }
    }

    /* renamed from: a */
    public void mo15747a() {
        if (this.f12169i.compareAndSet(false, true)) {
            m16684a(new Runnable() {
                /* class com.bytedance.dr.C4011h.RunnableC40121 */

                public void run() {
                    C4011h.this.mo15748b();
                }
            });
        }
    }

    /* renamed from: a */
    private static void m16683a(AbstractC3420g.C3421a aVar) {
        AbstractC3420g gVar;
        if (aVar != null && (gVar = f12162d) != null) {
            gVar.mo13717a(aVar);
        }
    }

    /* renamed from: a */
    private static void m16684a(Runnable runnable) {
        C4005f.m16668a(f12160a + "-query", runnable);
    }

    C4011h(Context context) {
        this.f12168h = context;
        AbstractC4013i a = C4015j.m16692a(context);
        this.f12165e = a;
        if (a != null) {
            this.f12166f = a.mo15738b(context);
        } else {
            this.f12166f = false;
        }
        this.f12167g = new C4017l(context);
    }

    /* renamed from: a */
    private Pair<String, Boolean> m16682a(Context context) {
        Boolean bool;
        AbstractC4013i.C4014a d;
        AbstractC4013i iVar = this.f12165e;
        String str = null;
        if (iVar == null || (d = iVar.mo15740d(context)) == null) {
            bool = null;
        } else {
            str = d.f12173b;
            bool = Boolean.valueOf(d.f12174c);
            if (d instanceof C4007g.C4010a) {
                this.f12171l = Long.valueOf(((C4007g.C4010a) d).f12159a);
            }
        }
        return new Pair<>(str, bool);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005f, code lost:
        if (r3 == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
        r6.f12164c.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0056, code lost:
        if (r3 != false) goto L_0x0061;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, java.lang.String> mo15746a(long r7) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.dr.C4011h.mo15746a(long):java.util.Map");
    }

    /* renamed from: a */
    static <K, V> void m16685a(Map<K, V> map, K k, V v) {
        if (k != null && v != null) {
            map.put(k, v);
        }
    }

    /* renamed from: a */
    static void m16686a(JSONObject jSONObject, String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
