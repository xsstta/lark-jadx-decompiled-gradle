package com.bytedance.apm6.p160b.p161a.p165d;

import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p160b.p161a.C3159a;
import com.bytedance.apm6.p160b.p161a.p162a.C3160a;
import com.bytedance.apm6.util.C3356f;
import com.bytedance.apm6.util.p195b.C3350b;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.apm6.b.a.d.c */
public class C3190c {

    /* renamed from: a */
    private static final long[] f10213a = {120000, 300000, 600000, 1800000, 3600000};

    /* renamed from: b */
    private volatile int f10214b;

    /* renamed from: c */
    private volatile int f10215c;

    /* renamed from: d */
    private volatile int f10216d;

    /* renamed from: e */
    private volatile int f10217e;

    /* renamed from: f */
    private volatile int f10218f;

    /* renamed from: g */
    private List<String> f10219g;

    /* renamed from: h */
    private List<String> f10220h;

    /* renamed from: i */
    private List<String> f10221i;

    /* renamed from: j */
    private volatile boolean f10222j;

    /* renamed from: k */
    private AtomicLong f10223k;

    /* renamed from: l */
    private AtomicLong f10224l;

    /* renamed from: m */
    private C3160a f10225m;

    /* renamed from: n */
    private volatile boolean f10226n;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.apm6.b.a.d.c$a */
    public static class C3192a {

        /* renamed from: a */
        static C3190c f10227a = new C3190c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo13261g() {
        this.f10226n = false;
    }

    /* renamed from: a */
    public static C3190c m13326a() {
        return C3192a.f10227a;
    }

    /* renamed from: m */
    private void m13327m() {
        this.f10222j = false;
        this.f10223k.set(System.currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo13260f() {
        mo13254b();
        this.f10226n = true;
        this.f10224l.set(System.currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo13266l() {
        C3160a aVar = this.f10225m;
        if (aVar != null) {
            return aVar.mo13126d();
        }
        return true;
    }

    /* renamed from: n */
    private long m13328n() {
        int i;
        if (this.f10215c > this.f10217e) {
            i = this.f10215c;
        } else {
            i = this.f10217e;
        }
        long j = (long) i;
        if (j > ((long) this.f10218f)) {
            return j;
        }
        return (long) this.f10218f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo13258d() {
        this.f10222j = true;
        this.f10226n = false;
        this.f10214b = 0;
        this.f10215c = 0;
        this.f10216d = 0;
        this.f10217e = 0;
        this.f10218f = 0;
        this.f10224l.set(0);
        this.f10223k.set(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo13259e() {
        if (this.f10222j || System.currentTimeMillis() - this.f10223k.get() > m13328n()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo13262h() {
        if (!this.f10226n) {
            return this.f10226n;
        }
        if (System.currentTimeMillis() - this.f10224l.get() <= m13328n()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public List<String> mo13263i() {
        C3160a aVar = this.f10225m;
        if (aVar == null || C3356f.m13964a(aVar.mo13114a())) {
            return this.f10219g;
        }
        return this.f10225m.mo13114a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public List<String> mo13264j() {
        C3160a aVar = this.f10225m;
        if (aVar == null || C3356f.m13964a(aVar.mo13120b())) {
            return this.f10220h;
        }
        return this.f10225m.mo13120b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public List<String> mo13265k() {
        C3160a aVar = this.f10225m;
        if (aVar == null || C3356f.m13964a(aVar.mo13125c())) {
            return this.f10221i;
        }
        return this.f10225m.mo13125c();
    }

    private C3190c() {
        this.f10222j = true;
        this.f10219g = new ArrayList();
        this.f10220h = new ArrayList();
        this.f10221i = new ArrayList();
        this.f10223k = new AtomicLong(0);
        this.f10224l = new AtomicLong();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo13254b() {
        if (this.f10214b == 0) {
            this.f10214b = 1;
            this.f10215c = 300000;
        } else if (this.f10214b == 1) {
            this.f10214b = 2;
            this.f10215c = 900000;
        } else if (this.f10214b == 2) {
            this.f10214b = 3;
            this.f10215c = 1800000;
        } else {
            this.f10214b = 4;
            this.f10215c = 1800000;
        }
        if (C3318a.m13915u()) {
            String str = C3159a.f10110a;
            C3350b.m13932a(str, "longBackOff:" + this.f10215c + " netFailCount:" + this.f10214b);
        }
        m13327m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo13256c() {
        if (this.f10216d == 0) {
            this.f10216d = 1;
            this.f10217e = 30000;
        } else if (this.f10216d == 1) {
            this.f10216d = 2;
            this.f10217e = CalendarSearchResultRv.f82652c;
        } else if (this.f10216d == 2) {
            this.f10216d = 3;
            this.f10217e = 120000;
        } else if (this.f10216d == 3) {
            this.f10216d = 4;
            this.f10217e = 240000;
        } else {
            this.f10216d = 5;
            this.f10217e = 300000;
        }
        if (C3318a.m13915u()) {
            String str = C3159a.f10110a;
            C3350b.m13932a(str, "shortStopInterval:" + this.f10217e + " shortFailCount:" + this.f10216d);
        }
        m13327m();
    }

    /* renamed from: a */
    public void mo13252a(C3160a aVar) {
        this.f10225m = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13251a(long j) {
        this.f10218f = (int) (j * 1000);
        m13327m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo13250a(int i) {
        int i2 = i - 1;
        if (i2 < 0) {
            return 0;
        }
        long[] jArr = f10213a;
        if (i2 >= jArr.length) {
            return jArr[jArr.length - 1];
        }
        return jArr[i2];
    }

    /* renamed from: b */
    public void mo13255b(List<String> list) {
        if (!C3356f.m13964a(list)) {
            this.f10221i.clear();
            this.f10221i.addAll(list);
        }
    }

    /* renamed from: c */
    public void mo13257c(List<String> list) {
        if (!C3356f.m13964a(list)) {
            this.f10220h.clear();
            this.f10220h.addAll(list);
        }
    }

    /* renamed from: a */
    public void mo13253a(List<String> list) {
        if (!C3356f.m13964a(list)) {
            this.f10219g.clear();
            this.f10219g.addAll(list);
        }
    }
}
