package com.bytedance.applog.network;

import android.content.SharedPreferences;
import com.bytedance.applog.manager.C3435g;

/* renamed from: com.bytedance.applog.network.a */
public class C3449a {

    /* renamed from: a */
    protected static final long[][] f10953a = {new long[]{120000, 0, 12}, new long[]{120000, 5, 1}, new long[]{240000, 5, 1}, new long[]{480000, 4, 1}, new long[]{960000, 2, 1}};

    /* renamed from: b */
    private String f10954b;

    /* renamed from: c */
    private C3435g f10955c;

    /* renamed from: d */
    private int f10956d;

    /* renamed from: e */
    private int f10957e;

    /* renamed from: f */
    private int f10958f;

    /* renamed from: g */
    private long f10959g;

    /* renamed from: h */
    private long f10960h;

    /* renamed from: g */
    private boolean m14557g() {
        return this.f10955c.mo13816b().mo13730J();
    }

    /* renamed from: c */
    public void mo13883c() {
        if (m14557g()) {
            if (this.f10956d < f10953a.length - 1) {
                m14556f();
            } else {
                this.f10958f = 0;
            }
        }
    }

    /* renamed from: b */
    public boolean mo13882b() {
        if (!m14557g()) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long[][] jArr = f10953a;
        int i = this.f10956d;
        if (currentTimeMillis - this.f10959g >= jArr[i][0]) {
            this.f10957e = 1;
            this.f10959g = currentTimeMillis;
        } else {
            int i2 = this.f10957e;
            if (((long) i2) >= jArr[i][2]) {
                return false;
            }
            this.f10957e = i2 + 1;
        }
        return true;
    }

    /* renamed from: d */
    public void mo13884d() {
        if (m14557g()) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = this.f10958f;
            long[][] jArr = f10953a;
            int i2 = this.f10956d;
            if (((long) i) < jArr[i2][1] && currentTimeMillis - this.f10960h <= 1800000) {
                this.f10958f = i + 1;
            } else if (i2 > 0) {
                m14555e();
            }
        }
    }

    /* renamed from: e */
    private void m14555e() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f10956d--;
        this.f10957e = 1;
        this.f10958f = 1;
        this.f10959g = currentTimeMillis;
        this.f10960h = currentTimeMillis;
        this.f10955c.mo13831j().edit().putLong(this.f10954b + "downgrade_time", currentTimeMillis).putInt(this.f10954b + "downgrade_index", this.f10956d).apply();
    }

    /* renamed from: f */
    private void m14556f() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f10956d++;
        this.f10957e = 1;
        this.f10958f = 0;
        this.f10959g = currentTimeMillis;
        this.f10960h = currentTimeMillis;
        this.f10955c.mo13831j().edit().putLong(this.f10954b + "downgrade_time", currentTimeMillis).putInt(this.f10954b + "downgrade_index", this.f10956d).apply();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13881a() {
        this.f10956d = 0;
        SharedPreferences j = this.f10955c.mo13831j();
        if (System.currentTimeMillis() - j.getLong(this.f10954b + "downgrade_time", 0) < 10800000) {
            SharedPreferences j2 = this.f10955c.mo13831j();
            this.f10956d = j2.getInt(this.f10954b + "downgrade_index", 0);
            return;
        }
        SharedPreferences.Editor edit = this.f10955c.mo13831j().edit();
        SharedPreferences.Editor remove = edit.remove(this.f10954b + "downgrade_time");
        remove.remove(this.f10954b + "downgrade_index").apply();
    }

    public C3449a(String str, C3435g gVar) {
        this.f10955c = gVar;
        this.f10954b = str;
        mo13881a();
    }
}
