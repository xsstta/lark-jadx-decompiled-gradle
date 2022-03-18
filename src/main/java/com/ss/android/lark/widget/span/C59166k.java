package com.ss.android.lark.widget.span;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import java.util.Objects;

/* renamed from: com.ss.android.lark.widget.span.k */
public class C59166k implements LineHeightSpan {

    /* renamed from: a */
    private final C59169b f146860a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.span.k$b */
    public static class C59169b {

        /* renamed from: a */
        public float f146862a;

        private C59169b() {
        }

        public int hashCode() {
            return Objects.hash(Float.valueOf(this.f146862a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass() && this.f146862a == ((C59169b) obj).f146862a) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.lark.widget.span.k$a */
    public static class C59168a {

        /* renamed from: a */
        private C59169b f146861a = new C59169b();

        /* renamed from: a */
        public C59166k mo201115a() {
            return new C59166k(this.f146861a);
        }

        /* renamed from: a */
        public C59168a mo201114a(float f) {
            this.f146861a.f146862a = f;
            return this;
        }
    }

    public int hashCode() {
        return Objects.hash(this.f146860a);
    }

    private C59166k(C59169b bVar) {
        this.f146860a = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f146860a.equals(((C59166k) obj).f146860a);
    }

    /* renamed from: a */
    private static boolean m229840a(int i, CharSequence charSequence, Object obj) {
        int spanEnd = ((Spanned) charSequence).getSpanEnd(obj);
        if (spanEnd == i || spanEnd == i - 1) {
            return true;
        }
        return false;
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (m229840a(i2, charSequence, this)) {
            int i5 = (int) (((double) (this.f146860a.f146862a - ((float) (fontMetricsInt.bottom - fontMetricsInt.top)))) + 0.5d);
            fontMetricsInt.descent += i5;
            fontMetricsInt.bottom += i5;
        }
    }
}
