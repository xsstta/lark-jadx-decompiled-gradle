package com.bytedance.apm.p143i.p147c;

/* renamed from: com.bytedance.apm.i.c.h */
public class C2980h implements Comparable {

    /* renamed from: a */
    public String f9576a;

    /* renamed from: b */
    public String f9577b;

    /* renamed from: c */
    public long f9578c;

    /* renamed from: d */
    public int f9579d = 1;

    /* renamed from: e */
    public long f9580e = System.currentTimeMillis();

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        long j = this.f9578c;
        long j2 = ((C2980h) obj).f9578c;
        if (j == j2) {
            return 0;
        }
        if (j > j2) {
            return 1;
        }
        return -1;
    }

    public C2980h(String str, long j, String str2) {
        this.f9576a = str;
        this.f9578c = j;
        this.f9577b = str2;
    }
}
