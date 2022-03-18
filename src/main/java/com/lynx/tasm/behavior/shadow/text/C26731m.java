package com.lynx.tasm.behavior.shadow.text;

import com.lynx.tasm.behavior.shadow.MeasureMode;

/* renamed from: com.lynx.tasm.behavior.shadow.text.m */
public class C26731m {

    /* renamed from: a */
    final C26732a f66163a;

    /* renamed from: b */
    final MeasureMode f66164b;

    /* renamed from: c */
    final MeasureMode f66165c;

    /* renamed from: d */
    public final float f66166d;

    /* renamed from: e */
    public final float f66167e;

    /* renamed from: f */
    final int f66168f;

    /* renamed from: a */
    public C26722i mo94904a() {
        return this.f66163a.f66170b;
    }

    /* renamed from: com.lynx.tasm.behavior.shadow.text.m$a */
    public static class C26732a {

        /* renamed from: a */
        final CharSequence f66169a;

        /* renamed from: b */
        final C26722i f66170b;

        public int hashCode() {
            int i;
            CharSequence charSequence = this.f66169a;
            int i2 = 0;
            if (charSequence == null) {
                i = 0;
            } else {
                i = charSequence.hashCode();
            }
            int i3 = i * 31;
            C26722i iVar = this.f66170b;
            if (iVar != null) {
                i2 = iVar.hashCode();
            }
            return i3 + i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C26732a)) {
                return false;
            }
            C26732a aVar = (C26732a) obj;
            CharSequence charSequence = this.f66169a;
            if (charSequence == null && aVar.f66169a != null) {
                return false;
            }
            if (charSequence != null && !charSequence.equals(aVar.f66169a)) {
                return false;
            }
            C26722i iVar = this.f66170b;
            if (iVar == null && aVar.f66170b != null) {
                return false;
            }
            if (iVar == null || iVar.equals(aVar.f66170b)) {
                return true;
            }
            return false;
        }

        C26732a(CharSequence charSequence, C26722i iVar) {
            this.f66169a = charSequence;
            this.f66170b = iVar;
        }
    }

    public int hashCode() {
        return (((((((((this.f66163a.hashCode() * 31) + this.f66164b.hashCode()) * 31) + this.f66165c.hashCode()) * 31) + Float.floatToIntBits(this.f66166d)) * 31) + Float.floatToIntBits(this.f66167e)) * 31) + this.f66168f;
    }

    public String toString() {
        return ((Object) this.f66163a.f66169a) + " " + this.f66166d + " " + this.f66167e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C26731m)) {
            return false;
        }
        C26731m mVar = (C26731m) obj;
        if (this.f66163a.equals(mVar.f66163a) && this.f66164b == mVar.f66164b && this.f66165c == mVar.f66165c && this.f66166d == mVar.f66166d && this.f66167e == mVar.f66167e && this.f66168f == mVar.f66168f) {
            return true;
        }
        return false;
    }

    public C26731m(CharSequence charSequence, C26722i iVar, MeasureMode measureMode, MeasureMode measureMode2, float f, float f2, int i) {
        this.f66163a = new C26732a(charSequence, iVar);
        this.f66166d = f;
        this.f66167e = f2;
        this.f66164b = measureMode;
        this.f66165c = measureMode2;
        this.f66168f = i;
    }
}
