package com.ss.android.vc.common.lifecycle;

/* renamed from: com.ss.android.vc.common.lifecycle.b */
public class C60793b {

    /* renamed from: a */
    public final String f151999a;

    /* renamed from: b */
    public final boolean f152000b;

    /* renamed from: c */
    public final boolean f152001c;

    /* renamed from: d */
    private String f152002d;

    private C60793b() {
        this(null, null, false, false);
    }

    public String toString() {
        return String.format("topPro:%s, topAct: %s, appFront: %s, proFront: %s", this.f151999a, this.f152002d, Boolean.valueOf(this.f152000b), Boolean.valueOf(this.f152001c));
    }

    public C60793b(String str, String str2, boolean z, boolean z2) {
        this.f151999a = str;
        this.f152002d = str2;
        this.f152000b = z;
        this.f152001c = z2;
    }
}
