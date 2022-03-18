package androidx.core.os;

import java.util.HashSet;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: androidx.core.os.f */
public final class C0801f implements AbstractC0802g {

    /* renamed from: c */
    private static final Locale[] f3205c = new Locale[0];

    /* renamed from: d */
    private static final Locale f3206d = new Locale("en", "XA");

    /* renamed from: e */
    private static final Locale f3207e = new Locale("ar", "XB");

    /* renamed from: f */
    private static final Locale f3208f = C0800e.m3886a("en-Latn");

    /* renamed from: a */
    private final Locale[] f3209a;

    /* renamed from: b */
    private final String f3210b;

    @Override // androidx.core.os.AbstractC0802g
    /* renamed from: a */
    public Object mo4395a() {
        return null;
    }

    public int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f3209a;
            if (i2 >= localeArr.length) {
                return i;
            }
            i = (i * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f3209a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.f3209a.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    @Override // androidx.core.os.AbstractC0802g
    /* renamed from: a */
    public Locale mo4396a(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f3209a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0801f)) {
            return false;
        }
        Locale[] localeArr = ((C0801f) obj).f3209a;
        if (this.f3209a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f3209a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    C0801f(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f3209a = f3205c;
            this.f3210b = "";
            return;
        }
        Locale[] localeArr2 = new Locale[localeArr.length];
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale == null) {
                throw new NullPointerException("list[" + i + "] is null");
            } else if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                localeArr2[i] = locale2;
                m3888a(sb, locale2);
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            } else {
                throw new IllegalArgumentException("list[" + i + "] is a repetition");
            }
        }
        this.f3209a = localeArr2;
        this.f3210b = sb.toString();
    }

    /* renamed from: a */
    static void m3888a(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }
}
