package org.apache.commons.text;

import java.util.Arrays;

/* renamed from: org.apache.commons.text.c */
public abstract class AbstractC69975c {

    /* renamed from: a */
    private static final AbstractC69975c f174845a = new C69976a(',');

    /* renamed from: b */
    private static final AbstractC69975c f174846b = new C69976a('\t');

    /* renamed from: c */
    private static final AbstractC69975c f174847c = new C69976a(' ');

    /* renamed from: d */
    private static final AbstractC69975c f174848d = new C69977b(" \t\n\r\f".toCharArray());

    /* renamed from: e */
    private static final AbstractC69975c f174849e = new C69979d();

    /* renamed from: f */
    private static final AbstractC69975c f174850f = new C69976a('\'');

    /* renamed from: g */
    private static final AbstractC69975c f174851g = new C69976a('\"');

    /* renamed from: h */
    private static final AbstractC69975c f174852h = new C69977b("'\"".toCharArray());

    /* renamed from: i */
    private static final AbstractC69975c f174853i = new C69978c();

    /* renamed from: a */
    public abstract int mo246206a(char[] cArr, int i, int i2, int i3);

    /* renamed from: org.apache.commons.text.c$c */
    static final class C69978c extends AbstractC69975c {
        @Override // org.apache.commons.text.AbstractC69975c
        /* renamed from: a */
        public int mo246206a(char[] cArr, int i, int i2, int i3) {
            return 0;
        }

        C69978c() {
        }
    }

    /* renamed from: org.apache.commons.text.c$d */
    static final class C69979d extends AbstractC69975c {
        C69979d() {
        }

        @Override // org.apache.commons.text.AbstractC69975c
        /* renamed from: a */
        public int mo246206a(char[] cArr, int i, int i2, int i3) {
            if (cArr[i] <= ' ') {
                return 1;
            }
            return 0;
        }
    }

    protected AbstractC69975c() {
    }

    /* renamed from: a */
    public static AbstractC69975c m268372a() {
        return f174845a;
    }

    /* renamed from: b */
    public static AbstractC69975c m268373b() {
        return f174846b;
    }

    /* renamed from: c */
    public static AbstractC69975c m268374c() {
        return f174848d;
    }

    /* renamed from: d */
    public static AbstractC69975c m268375d() {
        return f174849e;
    }

    /* renamed from: e */
    public static AbstractC69975c m268376e() {
        return f174851g;
    }

    /* renamed from: f */
    public static AbstractC69975c m268377f() {
        return f174853i;
    }

    /* renamed from: org.apache.commons.text.c$a */
    static final class C69976a extends AbstractC69975c {

        /* renamed from: a */
        private final char f174854a;

        C69976a(char c) {
            this.f174854a = c;
        }

        @Override // org.apache.commons.text.AbstractC69975c
        /* renamed from: a */
        public int mo246206a(char[] cArr, int i, int i2, int i3) {
            if (this.f174854a == cArr[i]) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: org.apache.commons.text.c$b */
    static final class C69977b extends AbstractC69975c {

        /* renamed from: a */
        private final char[] f174855a;

        C69977b(char[] cArr) {
            char[] cArr2 = (char[]) cArr.clone();
            this.f174855a = cArr2;
            Arrays.sort(cArr2);
        }

        @Override // org.apache.commons.text.AbstractC69975c
        /* renamed from: a */
        public int mo246206a(char[] cArr, int i, int i2, int i3) {
            if (Arrays.binarySearch(this.f174855a, cArr[i]) >= 0) {
                return 1;
            }
            return 0;
        }
    }
}
