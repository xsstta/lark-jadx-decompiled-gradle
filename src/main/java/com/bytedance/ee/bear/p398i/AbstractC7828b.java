package com.bytedance.ee.bear.p398i;

import android.text.SpannableStringBuilder;
import com.bytedance.ee.bear.p519p.AbstractC10466g;

/* renamed from: com.bytedance.ee.bear.i.b */
public interface AbstractC7828b {

    /* renamed from: com.bytedance.ee.bear.i.b$a */
    public static class C7829a {

        /* renamed from: a */
        private C7830a[] f21137a;

        /* renamed from: b */
        private int f21138b;

        /* renamed from: c */
        private int f21139c;

        /* renamed from: d */
        private CharSequence f21140d;

        /* renamed from: e */
        private CharSequence f21141e;

        /* renamed from: com.bytedance.ee.bear.i.b$a$a */
        public static class C7830a {

            /* renamed from: a */
            private final AbstractC10466g f21142a;

            /* renamed from: b */
            private final int f21143b;

            /* renamed from: c */
            private final int f21144c;

            /* renamed from: a */
            public AbstractC10466g mo30608a() {
                return this.f21142a;
            }

            public C7830a(AbstractC10466g gVar, int i, int i2) {
                this.f21142a = gVar;
                this.f21143b = i;
                this.f21144c = i2;
            }
        }

        /* renamed from: a */
        public int mo30599a() {
            return this.f21138b;
        }

        /* renamed from: b */
        public int mo30602b() {
            return this.f21139c;
        }

        /* renamed from: c */
        public CharSequence mo30605c() {
            return this.f21140d;
        }

        /* renamed from: d */
        public C7830a[] mo30606d() {
            return this.f21137a;
        }

        public String toString() {
            int i;
            C7830a[] aVarArr = this.f21137a;
            if (aVarArr == null) {
                i = 0;
            } else {
                i = aVarArr.length;
            }
            return "CommmentAction [ action = " + this.f21138b + " | start = " + this.f21139c + " | before = " + ((Object) this.f21140d) + " | after = " + ((Object) this.f21141e) + " | spans = " + i + " ]";
        }

        /* renamed from: a */
        public void mo30600a(int i) {
            this.f21139c = i;
        }

        /* renamed from: b */
        public void mo30603b(int i) {
            this.f21138b = i;
        }

        /* renamed from: a */
        public void mo30601a(CharSequence charSequence) {
            this.f21141e = charSequence;
        }

        /* renamed from: b */
        public void mo30604b(CharSequence charSequence) {
            this.f21140d = charSequence;
        }

        public C7829a(C7830a[] aVarArr, int i, int i2, CharSequence charSequence, CharSequence charSequence2) {
            this.f21137a = aVarArr;
            this.f21138b = i;
            this.f21139c = i2;
            this.f21141e = charSequence2;
            this.f21140d = charSequence;
        }
    }

    /* renamed from: a */
    void mo30598a(SpannableStringBuilder spannableStringBuilder, C7829a aVar);
}
