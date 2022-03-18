package com.bytedance.apm.block;

import org.json.JSONObject;

/* renamed from: com.bytedance.apm.block.c */
class C2864c {

    /* renamed from: a */
    boolean f9142a = true;

    /* renamed from: b */
    String f9143b;

    /* renamed from: c */
    boolean f9144c;

    /* renamed from: d */
    boolean f9145d;

    /* renamed from: e */
    boolean f9146e;

    /* renamed from: f */
    boolean f9147f;

    /* renamed from: g */
    long f9148g = -1;

    /* renamed from: h */
    long f9149h = -1;

    /* renamed from: i */
    long f9150i;

    /* renamed from: j */
    boolean f9151j;

    /* renamed from: k */
    boolean f9152k;

    /* renamed from: l */
    volatile boolean f9153l;

    /* renamed from: m */
    boolean f9154m;

    /* renamed from: n */
    long f9155n;

    /* renamed from: o */
    long f9156o;

    /* renamed from: p */
    StackTraceElement[] f9157p;

    /* renamed from: q */
    StackTraceElement[] f9158q;

    /* renamed from: r */
    String f9159r;

    /* renamed from: s */
    String f9160s;

    /* renamed from: t */
    String f9161t;

    /* renamed from: u */
    JSONObject f9162u;

    /* renamed from: v */
    JSONObject f9163v;

    /* renamed from: w */
    JSONObject f9164w;

    /* renamed from: x */
    JSONObject f9165x;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12310b() {
        this.f9142a = true;
        this.f9144c = false;
        this.f9145d = false;
        this.f9146e = false;
        this.f9147f = false;
        this.f9150i = 0;
        this.f9151j = false;
        this.f9153l = false;
        this.f9152k = false;
        this.f9154m = false;
        this.f9155n = 0;
        this.f9156o = 0;
        this.f9157p = null;
        this.f9158q = null;
        this.f9159r = null;
        this.f9160s = null;
        this.f9161t = null;
        this.f9162u = null;
        this.f9163v = null;
        this.f9164w = null;
        this.f9165x = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2864c mo12308a() {
        C2864c cVar = new C2864c(this.f9148g, this.f9143b);
        cVar.f9149h = this.f9149h;
        cVar.f9142a = this.f9142a;
        cVar.f9144c = this.f9144c;
        cVar.f9145d = this.f9145d;
        cVar.f9146e = this.f9146e;
        cVar.f9147f = this.f9147f;
        cVar.f9150i = this.f9150i;
        cVar.f9151j = this.f9151j;
        cVar.f9152k = this.f9152k;
        cVar.f9155n = this.f9155n;
        cVar.f9156o = this.f9156o;
        cVar.f9157p = this.f9157p;
        cVar.f9158q = this.f9158q;
        cVar.f9159r = this.f9159r;
        cVar.f9160s = this.f9160s;
        cVar.f9161t = this.f9161t;
        cVar.f9162u = this.f9162u;
        cVar.f9163v = this.f9163v;
        cVar.f9164w = this.f9164w;
        cVar.f9165x = this.f9165x;
        cVar.f9154m = this.f9154m;
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12309a(long j, String str) {
        this.f9148g = j;
        this.f9143b = str;
        this.f9149h = -1;
        this.f9142a = false;
    }

    C2864c(long j, String str) {
        this.f9148g = j;
        this.f9143b = str;
    }
}
