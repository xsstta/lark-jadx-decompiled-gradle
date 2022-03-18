package com.bytedance.ee.bear.middleground.drive.export;

import java.util.List;

/* renamed from: com.bytedance.ee.bear.middleground.drive.export.b */
public class C9361b {

    /* renamed from: a */
    public String f25172a = "";

    /* renamed from: b */
    public String f25173b = "";

    /* renamed from: c */
    public String f25174c = "";

    /* renamed from: d */
    public List<C9362a> f25175d;

    /* renamed from: e */
    public long f25176e;

    /* renamed from: f */
    public String f25177f = "";

    /* renamed from: g */
    public int f25178g;

    /* renamed from: h */
    public String f25179h;

    /* renamed from: i */
    public DownloadRangeCallback f25180i;

    public C9361b() {
    }

    /* renamed from: com.bytedance.ee.bear.middleground.drive.export.b$a */
    public static class C9362a {

        /* renamed from: a */
        public long f25181a = -1;

        /* renamed from: b */
        public long f25182b = -1;

        public String toString() {
            return "{" + this.f25181a + "," + this.f25182b + '}';
        }

        public C9362a(long j, long j2) {
            this.f25181a = j;
            this.f25182b = j2;
        }
    }

    public C9361b(String str, String str2, String str3, List<C9362a> list, long j, String str4, int i, String str5) {
        this.f25172a = str;
        this.f25173b = str2;
        this.f25174c = str3;
        this.f25175d = list;
        this.f25176e = j;
        this.f25177f = str4;
        this.f25178g = i;
        this.f25179h = str5;
    }
}
