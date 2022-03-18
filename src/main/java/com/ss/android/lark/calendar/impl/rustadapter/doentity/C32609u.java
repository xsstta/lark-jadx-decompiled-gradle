package com.ss.android.lark.calendar.impl.rustadapter.doentity;

/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.u */
public class C32609u {

    /* renamed from: a */
    private String f83669a;

    /* renamed from: b */
    private String f83670b;

    /* renamed from: c */
    private long f83671c;

    /* renamed from: d */
    private long f83672d;

    /* renamed from: e */
    private int f83673e;

    /* renamed from: a */
    public String mo120220a() {
        return this.f83669a;
    }

    /* renamed from: b */
    public String mo120225b() {
        return this.f83670b;
    }

    /* renamed from: c */
    public long mo120228c() {
        return this.f83671c;
    }

    /* renamed from: d */
    public long mo120229d() {
        return this.f83672d;
    }

    /* renamed from: e */
    public int mo120230e() {
        return this.f83673e;
    }

    /* renamed from: a */
    public void mo120221a(int i) {
        this.f83673e = i;
    }

    /* renamed from: b */
    public void mo120226b(long j) {
        this.f83672d = j;
    }

    /* renamed from: a */
    public void mo120222a(long j) {
        this.f83671c = j;
    }

    /* renamed from: b */
    public void mo120227b(String str) {
        this.f83670b = str;
    }

    /* renamed from: a */
    public void mo120223a(String str) {
        this.f83669a = str;
    }

    /* renamed from: a */
    public boolean mo120224a(C32609u uVar) {
        if (uVar != null && this.f83669a.equals(uVar.mo120220a()) && this.f83670b.equals(uVar.mo120225b()) && this.f83671c == uVar.mo120228c() && this.f83672d == uVar.mo120229d()) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C32609u)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C32609u uVar = (C32609u) obj;
        if (this.f83669a.equals(uVar.mo120220a()) && this.f83670b.equals(uVar.mo120225b()) && this.f83671c == uVar.mo120228c() && this.f83672d == uVar.mo120229d() && this.f83673e == uVar.mo120230e()) {
            return true;
        }
        return false;
    }
}
