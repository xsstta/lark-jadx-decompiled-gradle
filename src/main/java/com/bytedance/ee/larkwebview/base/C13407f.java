package com.bytedance.ee.larkwebview.base;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.larkwebview.base.f */
public class C13407f {

    /* renamed from: a */
    private long f35339a;

    /* renamed from: b */
    private boolean f35340b = true;

    /* renamed from: c */
    private ConcurrentHashMap<String, Long> f35341c = new ConcurrentHashMap<>();

    /* renamed from: a */
    public long mo49750a() {
        return System.currentTimeMillis() - this.f35339a;
    }

    /* renamed from: a */
    public Long mo49751a(String str) {
        long j;
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Long l = this.f35341c.get(str);
        this.f35341c.remove(str);
        if (l == null) {
            j = 0;
        } else {
            j = l.longValue();
        }
        return Long.valueOf(j);
    }

    /* renamed from: a */
    public void mo49752a(String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            this.f35341c.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public void mo49753b(String str, long j) {
        if (!TextUtils.isEmpty(str) && !this.f35341c.containsKey(str)) {
            this.f35341c.put(str, Long.valueOf(j));
        }
    }
}
