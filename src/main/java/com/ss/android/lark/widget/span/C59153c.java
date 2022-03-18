package com.ss.android.lark.widget.span;

import java.util.Objects;

/* renamed from: com.ss.android.lark.widget.span.c */
public class C59153c {

    /* renamed from: a */
    private int f146822a;

    /* renamed from: b */
    private int f146823b;

    /* renamed from: c */
    private int f146824c;

    /* renamed from: a */
    public int mo201080a() {
        return this.f146822a;
    }

    /* renamed from: b */
    public int mo201081b() {
        return this.f146823b;
    }

    /* renamed from: c */
    public int mo201082c() {
        return this.f146824c;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f146822a), Integer.valueOf(this.f146823b), Integer.valueOf(this.f146824c));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C59153c)) {
            return false;
        }
        C59153c cVar = (C59153c) obj;
        if (this.f146823b == cVar.f146823b && this.f146824c == cVar.f146824c && this.f146822a == cVar.f146822a) {
            return true;
        }
        return false;
    }

    public C59153c(int i, int i2, int i3) {
        this.f146822a = i;
        this.f146823b = i2;
        this.f146824c = i3;
    }
}
