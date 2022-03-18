package com.ss.android.lark.feed.p1872c;

import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53234a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.feed.c.c */
public class C38072c {

    /* renamed from: a */
    protected String f97690a;

    /* renamed from: b */
    protected String f97691b;

    /* renamed from: c */
    protected String f97692c;

    /* renamed from: d */
    protected StringBuilder f97693d = new StringBuilder();

    /* renamed from: e */
    protected Map<String, Long> f97694e = new ConcurrentHashMap();

    /* renamed from: f */
    protected Map<String, Long> f97695f = new ConcurrentHashMap();

    /* renamed from: c */
    public String mo139365c() {
        return this.f97692c;
    }

    /* renamed from: d */
    public void mo139367d() {
        boolean z = false;
        for (String str : this.f97694e.keySet()) {
            if (this.f97695f.get(str) != null) {
                if (!z) {
                    this.f97693d.append("\n");
                    z = true;
                }
                long longValue = this.f97694e.get(str).longValue();
                long longValue2 = this.f97695f.get(str).longValue();
                this.f97693d.append("[");
                this.f97693d.append(str);
                this.f97693d.append(", (");
                this.f97693d.append(longValue);
                this.f97693d.append(",");
                this.f97693d.append(longValue2);
                this.f97693d.append("),duration:");
                this.f97693d.append(longValue2 - longValue);
                this.f97693d.append("ms");
                this.f97693d.append("]");
            }
        }
        if (!TextUtils.isEmpty(this.f97692c)) {
            StringBuilder sb = this.f97693d;
            sb.append("[context:");
            sb.append(this.f97692c);
            sb.append("]");
        }
        if (!TextUtils.isEmpty(this.f97691b)) {
            mo139363a("error", this.f97691b);
            Log.m165383e(this.f97690a, this.f97693d.toString());
            return;
        }
        Log.m165389i(this.f97690a, this.f97693d.toString());
    }

    /* renamed from: d */
    public void mo139368d(String str) {
        this.f97691b = str;
    }

    /* renamed from: a */
    public void mo139361a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f97692c = C53234a.m205877a();
        } else {
            this.f97692c = str;
        }
    }

    /* renamed from: b */
    public void mo139364b(String str) {
        this.f97694e.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: c */
    public void mo139366c(String str) {
        this.f97695f.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public C38072c(String str) {
        this.f97690a = str;
    }

    /* renamed from: a */
    public void mo139362a(String str, long j) {
        mo139363a(str, String.valueOf(j));
    }

    /* renamed from: a */
    public void mo139363a(String str, String str2) {
        this.f97693d.append("[");
        this.f97693d.append(str);
        this.f97693d.append(", ");
        this.f97693d.append(str2);
        this.f97693d.append("]");
    }
}
