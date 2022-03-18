package com.ss.android.lark.platform.statistics.p2502b;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.lark.platform.statistics.p2502b.C51982j;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.statistics.b.l */
public class C51985l extends C51982j.C51983a {

    /* renamed from: c */
    public static long f129081c;

    /* renamed from: d */
    private long f129082d;

    /* renamed from: e */
    private long f129083e;

    /* renamed from: f */
    private long f129084f;

    /* renamed from: g */
    private String f129085g;

    /* renamed from: h */
    private String f129086h;

    /* renamed from: c */
    public String mo178184c() {
        return this.f129085g;
    }

    /* renamed from: e */
    public long mo178186e() {
        return this.f129082d;
    }

    /* renamed from: f */
    public long mo178187f() {
        return this.f129083e;
    }

    /* renamed from: d */
    public long mo178185d() {
        return this.f129083e - this.f129082d;
    }

    /* renamed from: h */
    public C51985l mo178189h() {
        this.f129082d = SystemClock.uptimeMillis();
        return this;
    }

    /* renamed from: i */
    public C51985l mo178190i() {
        this.f129083e = SystemClock.uptimeMillis();
        return this;
    }

    @Override // com.ss.android.lark.platform.statistics.p2502b.C51982j.C51983a
    /* renamed from: a */
    public void mo178176a() {
        super.mo178176a();
        this.f129083e = 0;
        this.f129082d = 0;
        this.f129084f = 0;
        this.f129086h = null;
        this.f129085g = null;
    }

    /* renamed from: g */
    public String mo178188g() {
        return this.f129082d + "," + this.f129083e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("[");
        sb.append(this.f129086h);
        sb.append(",");
        sb.append(this.f129085g);
        sb.append(":{");
        sb.append(this.f129082d + f129081c);
        sb.append(",");
        sb.append(this.f129083e + f129081c);
        sb.append("},Cost:");
        sb.append(this.f129083e - this.f129082d);
        sb.append("ms]");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo178179a(long j) {
        this.f129084f = j;
    }

    /* renamed from: b */
    public void mo178182b(String str) {
        this.f129085g = str;
    }

    /* renamed from: a */
    public void mo178180a(String str) {
        this.f129086h = str;
    }

    /* renamed from: b */
    public boolean mo178183b(long j) {
        if ((j & this.f129084f) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo178181a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null) {
            try {
                if (!TextUtils.isEmpty(this.f129086h) && this.f129086h.length() == 10) {
                    jSONObject2.put("context_id." + this.f129085g, this.f129086h);
                }
                jSONObject2.put("section." + this.f129085g, mo178188g());
                jSONObject.put(this.f129085g, mo178185d());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
