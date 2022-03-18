package org.apache.commons.lang3.text;

import java.util.Arrays;

/* renamed from: org.apache.commons.lang3.text.b */
public abstract class AbstractC69888b {

    /* renamed from: a */
    private static final AbstractC69888b f174729a = new C69889a(',');

    /* renamed from: b */
    private static final AbstractC69888b f174730b = new C69889a('\t');

    /* renamed from: c */
    private static final AbstractC69888b f174731c = new C69889a(' ');

    /* renamed from: d */
    private static final AbstractC69888b f174732d = new C69890b(" \t\n\r\f".toCharArray());

    /* renamed from: e */
    private static final AbstractC69888b f174733e = new C69892d();

    /* renamed from: f */
    private static final AbstractC69888b f174734f = new C69889a('\'');

    /* renamed from: g */
    private static final AbstractC69888b f174735g = new C69889a('\"');

    /* renamed from: h */
    private static final AbstractC69888b f174736h = new C69890b("'\"".toCharArray());

    /* renamed from: i */
    private static final AbstractC69888b f174737i = new C69891c();

    /* renamed from: a */
    public abstract int mo245622a(char[] cArr, int i, int i2, int i3);

    /* renamed from: org.apache.commons.lang3.text.b$c */
    static final class C69891c extends AbstractC69888b {
        @Override // org.apache.commons.lang3.text.AbstractC69888b
        /* renamed from: a */
        public int mo245622a(char[] cArr, int i, int i2, int i3) {
            return 0;
        }

        C69891c() {
        }
    }

    /* renamed from: org.apache.commons.lang3.text.b$d */
    static final class C69892d extends AbstractC69888b {
        C69892d() {
        }

        @Override // org.apache.commons.lang3.text.AbstractC69888b
        /* renamed from: a */
        public int mo245622a(char[] cArr, int i, int i2, int i3) {
            if (cArr[i] <= ' ') {
                return 1;
            }
            return 0;
        }
    }

    protected AbstractC69888b() {
    }

    /* renamed from: a */
    public static AbstractC69888b m268191a() {
        return f174729a;
    }

    /* renamed from: b */
    public static AbstractC69888b m268192b() {
        return f174730b;
    }

    /* renamed from: c */
    public static AbstractC69888b m268193c() {
        return f174732d;
    }

    /* renamed from: d */
    public static AbstractC69888b m268194d() {
        return f174733e;
    }

    /* renamed from: e */
    public static AbstractC69888b m268195e() {
        return f174735g;
    }

    /* renamed from: f */
    public static AbstractC69888b m268196f() {
        return f174737i;
    }

    /* renamed from: org.apache.commons.lang3.text.b$a */
    static final class C69889a extends AbstractC69888b {

        /* renamed from: a */
        private final char f174738a;

        C69889a(char c) {
            this.f174738a = c;
        }

        @Override // org.apache.commons.lang3.text.AbstractC69888b
        /* renamed from: a */
        public int mo245622a(char[] cArr, int i, int i2, int i3) {
            if (this.f174738a == cArr[i]) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: org.apache.commons.lang3.text.b$b */
    static final class C69890b extends AbstractC69888b {

        /* renamed from: a */
        private final char[] f174739a;

        C69890b(char[] cArr) {
            char[] cArr2 = (char[]) cArr.clone();
            this.f174739a = cArr2;
            Arrays.sort(cArr2);
        }

        @Override // org.apache.commons.lang3.text.AbstractC69888b
        /* renamed from: a */
        public int mo245622a(char[] cArr, int i, int i2, int i3) {
            if (Arrays.binarySearch(this.f174739a, cArr[i]) >= 0) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: a */
    public int mo245621a(char[] cArr, int i) {
        return mo245622a(cArr, i, 0, cArr.length);
    }
}
