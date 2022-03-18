package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: androidx.core.os.e */
public final class C0800e {

    /* renamed from: a */
    private static final C0800e f3203a = m3885a(new Locale[0]);

    /* renamed from: b */
    private AbstractC0802g f3204b;

    public int hashCode() {
        return this.f3204b.hashCode();
    }

    public String toString() {
        return this.f3204b.toString();
    }

    private C0800e(AbstractC0802g gVar) {
        this.f3204b = gVar;
    }

    /* renamed from: a */
    public Locale mo4391a(int i) {
        return this.f3204b.mo4396a(i);
    }

    /* renamed from: a */
    public static C0800e m3884a(LocaleList localeList) {
        return new C0800e(new C0803h(localeList));
    }

    /* renamed from: a */
    public static C0800e m3885a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m3884a(new LocaleList(localeArr));
        }
        return new C0800e(new C0801f(localeArr));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0800e) || !this.f3204b.equals(((C0800e) obj).f3204b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static Locale m3886a(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }
}
