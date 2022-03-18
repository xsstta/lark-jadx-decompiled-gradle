package com.ss.android.ugc.effectmanager.p3065f.p3066a.p3067a;

import java.net.URI;

/* renamed from: com.ss.android.ugc.effectmanager.f.a.a.a */
public class C60627a {

    /* renamed from: a */
    private String f151607a;

    /* renamed from: b */
    private String f151608b;

    /* renamed from: c */
    private int f151609c = -1;

    /* renamed from: d */
    private long f151610d;

    /* renamed from: a */
    public String mo208016a() {
        return this.f151607a;
    }

    /* renamed from: b */
    public String mo208017b() {
        return this.f151608b;
    }

    /* renamed from: c */
    public String mo208018c() {
        String str = mo208017b() + "://" + mo208016a();
        if (this.f151609c == -1) {
            return str;
        }
        return str + ":" + this.f151609c;
    }

    public String toString() {
        return "Host{weightTime=" + this.f151610d + ", schema='" + this.f151608b + '\'' + ", host='" + this.f151607a + '\'' + '}';
    }

    public C60627a(String str) {
        URI create = URI.create(str);
        this.f151607a = create.getHost();
        this.f151608b = create.getScheme();
        this.f151609c = create.getPort();
    }
}
