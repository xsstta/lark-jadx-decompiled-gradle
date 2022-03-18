package com.ss.android.lark.reaction.widget.flowlayout.p2562a;

import java.util.Objects;

/* renamed from: com.ss.android.lark.reaction.widget.flowlayout.a.b */
public class C53062b {

    /* renamed from: a */
    public String f131136a;

    /* renamed from: b */
    public String f131137b;

    /* renamed from: c */
    private boolean f131138c = true;

    /* renamed from: d */
    private boolean f131139d = true;

    /* renamed from: a */
    public boolean mo181233a() {
        return this.f131138c;
    }

    /* renamed from: b */
    public boolean mo181235b() {
        return this.f131139d;
    }

    public C53062b() {
    }

    public int hashCode() {
        return Objects.hash(this.f131136a, this.f131137b, Boolean.valueOf(this.f131138c));
    }

    /* renamed from: a */
    public void mo181232a(boolean z) {
        this.f131138c = z;
    }

    /* renamed from: b */
    public void mo181234b(boolean z) {
        this.f131139d = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53062b)) {
            return false;
        }
        C53062b bVar = (C53062b) obj;
        if (this.f131138c != bVar.f131138c || !Objects.equals(this.f131136a, bVar.f131136a) || !Objects.equals(this.f131137b, bVar.f131137b)) {
            return false;
        }
        return true;
    }

    public C53062b(String str, String str2) {
        this.f131136a = str;
        this.f131137b = str2;
    }
}
