package org.apache.commons.text.p3505a;

import java.util.Arrays;

/* renamed from: org.apache.commons.text.a.a */
abstract class AbstractC69967a implements AbstractC69972b {

    /* access modifiers changed from: package-private */
    /* renamed from: org.apache.commons.text.a.a$c */
    public static final class C69970c extends AbstractC69967a {
        @Override // org.apache.commons.text.p3505a.AbstractC69972b
        /* renamed from: a */
        public int mo246198a(char[] cArr, int i, int i2, int i3) {
            return 0;
        }

        C69970c() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.apache.commons.text.a.a$d */
    public static final class C69971d extends AbstractC69967a {
        C69971d() {
        }

        @Override // org.apache.commons.text.p3505a.AbstractC69972b
        /* renamed from: a */
        public int mo246198a(char[] cArr, int i, int i2, int i3) {
            if (cArr[i] <= ' ') {
                return 1;
            }
            return 0;
        }
    }

    protected AbstractC69967a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.apache.commons.text.a.a$a */
    public static final class C69968a extends AbstractC69967a {

        /* renamed from: a */
        private final char f174833a;

        C69968a(char c) {
            this.f174833a = c;
        }

        @Override // org.apache.commons.text.p3505a.AbstractC69972b
        /* renamed from: a */
        public int mo246198a(char[] cArr, int i, int i2, int i3) {
            if (this.f174833a == cArr[i]) {
                return 1;
            }
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.apache.commons.text.a.a$b */
    public static final class C69969b extends AbstractC69967a {

        /* renamed from: a */
        private final char[] f174834a;

        C69969b(char[] cArr) {
            char[] cArr2 = (char[]) cArr.clone();
            this.f174834a = cArr2;
            Arrays.sort(cArr2);
        }

        @Override // org.apache.commons.text.p3505a.AbstractC69972b
        /* renamed from: a */
        public int mo246198a(char[] cArr, int i, int i2, int i3) {
            if (Arrays.binarySearch(this.f174834a, cArr[i]) >= 0) {
                return 1;
            }
            return 0;
        }
    }
}
