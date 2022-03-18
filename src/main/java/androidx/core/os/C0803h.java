package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: androidx.core.os.h */
public final class C0803h implements AbstractC0802g {

    /* renamed from: a */
    private final LocaleList f3211a;

    @Override // androidx.core.os.AbstractC0802g
    /* renamed from: a */
    public Object mo4395a() {
        return this.f3211a;
    }

    public int hashCode() {
        return this.f3211a.hashCode();
    }

    public String toString() {
        return this.f3211a.toString();
    }

    C0803h(LocaleList localeList) {
        this.f3211a = localeList;
    }

    @Override // androidx.core.os.AbstractC0802g
    /* renamed from: a */
    public Locale mo4396a(int i) {
        return this.f3211a.get(i);
    }

    public boolean equals(Object obj) {
        return this.f3211a.equals(((AbstractC0802g) obj).mo4395a());
    }
}
