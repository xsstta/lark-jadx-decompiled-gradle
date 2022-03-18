package com.ss.android.appcenter.business.p1265a;

import android.text.TextUtils;
import com.ss.android.appcenter.common.util.C28184h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.appcenter.business.a.e */
public class C27576e {

    /* renamed from: a */
    private long f68793a = -1;

    /* renamed from: b */
    private long f68794b = -1;

    /* renamed from: c */
    private long f68795c = -1;

    /* renamed from: d */
    private Map<String, Long> f68796d;

    /* renamed from: b */
    public Map<String, Long> mo98253b() {
        return this.f68796d;
    }

    /* renamed from: d */
    private boolean m100645d() {
        if (this.f68795c != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo98257c() {
        if (this.f68794b != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public long mo98249a() {
        long currentTimeMillis;
        long j;
        if (m100645d()) {
            currentTimeMillis = this.f68795c;
            j = this.f68794b;
        } else {
            currentTimeMillis = System.currentTimeMillis();
            j = this.f68794b;
        }
        return currentTimeMillis - j;
    }

    public C27576e(boolean z) {
        if (z) {
            this.f68796d = new HashMap();
        }
    }

    /* renamed from: b */
    public void mo98254b(String str, String str2) {
        mo98251a(str, str2, null);
    }

    /* renamed from: c */
    public void mo98256c(String str, String str2) {
        mo98255b(str, str2, null);
    }

    /* renamed from: a */
    public void mo98250a(String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f68794b = currentTimeMillis;
        this.f68793a = currentTimeMillis;
        this.f68795c = -1;
        C28184h.m103250d(str, str2 + " recent time:" + this.f68794b);
    }

    /* renamed from: b */
    public void mo98255b(String str, String str2, String str3) {
        mo98252a(str, str2, str3, null);
    }

    /* renamed from: a */
    public void mo98251a(String str, String str2, String str3) {
        if (!m100645d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.f68793a;
            this.f68793a = currentTimeMillis;
            C28184h.m103250d(str, str2 + " recent time:" + currentTimeMillis + " last period duration:" + j);
            if (this.f68796d != null && !TextUtils.isEmpty(str3)) {
                this.f68796d.put(str3, Long.valueOf(j));
            }
        }
    }

    /* renamed from: a */
    public void mo98252a(String str, String str2, String str3, String str4) {
        if (!m100645d()) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f68795c = currentTimeMillis;
            long j = currentTimeMillis - this.f68793a;
            C28184h.m103250d(str, str2 + " recent time:" + this.f68795c + " last period duration:" + j + " the thole duration is:" + (this.f68795c - this.f68794b));
            Map<String, Long> map = this.f68796d;
            if (!(map == null || str3 == null)) {
                map.put(str3, Long.valueOf(j));
            }
            Map<String, Long> map2 = this.f68796d;
            if (map2 != null && str4 != null) {
                map2.put(str4, Long.valueOf(this.f68795c - this.f68794b));
            }
        }
    }
}
