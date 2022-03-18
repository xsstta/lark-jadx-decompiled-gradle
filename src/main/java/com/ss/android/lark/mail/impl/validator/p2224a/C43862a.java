package com.ss.android.lark.mail.impl.validator.p2224a;

import com.ss.android.lark.mail.impl.validator.base.AbstractC43868c;
import com.ss.android.lark.mail.impl.validator.base.C43885e;
import com.ss.android.lark.mail.impl.validator.base.C43886f;
import com.ss.android.lark.mail.impl.validator.base.C43888h;
import com.ss.android.lark.mail.impl.validator.base.C43889i;
import com.ss.android.lark.mail.impl.validator.base.Optional;
import com.ss.android.lark.mail.impl.validator.base.PublicSuffixType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.validator.a.a */
public final class C43862a {

    /* renamed from: a */
    private static final C43889i f111310a = C43889i.m173946a('.');

    /* renamed from: b */
    private static final C43885e f111311b = C43885e.m173930a('.');

    /* renamed from: g */
    private static final AbstractC43868c f111312g;

    /* renamed from: h */
    private static final AbstractC43868c f111313h;

    /* renamed from: c */
    private final String f111314c;

    /* renamed from: d */
    private final List<String> f111315d;

    /* renamed from: e */
    private final int f111316e;

    /* renamed from: f */
    private final int f111317f;

    public String toString() {
        return this.f111314c;
    }

    public int hashCode() {
        return this.f111314c.hashCode();
    }

    static {
        AbstractC43868c a = AbstractC43868c.m173878a("-_");
        f111312g = a;
        f111313h = AbstractC43868c.m173884e().mo156257a(a);
    }

    /* renamed from: b */
    public static boolean m173870b(String str) {
        try {
            m173865a(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static C43862a m173865a(String str) {
        return new C43862a((String) C43886f.m173939a(str));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C43862a) {
            return this.f111314c.equals(((C43862a) obj).f111314c);
        }
        return false;
    }

    /* renamed from: a */
    private int m173864a(Optional<PublicSuffixType> optional) {
        int size = this.f111315d.size();
        for (int i = 0; i < size; i++) {
            String a = f111311b.mo156269a((Iterable<?>) this.f111315d.subList(i, size));
            if (m173866a(optional, Optional.fromNullable(C43888h.f111340a.get(a)))) {
                return i;
            }
            if (C43888h.f111342c.containsKey(a)) {
                return i + 1;
            }
            if (m173867a(optional, a)) {
                return i;
            }
        }
        return -1;
    }

    C43862a(String str) {
        boolean z;
        boolean z2 = true;
        str = str.endsWith(".") ? str.substring(0, str.length() - 1) : str;
        if (str.length() <= 253) {
            z = true;
        } else {
            z = false;
        }
        C43886f.m173943a(z, "Domain name too long: '%s':", str);
        this.f111314c = str;
        ArrayList arrayList = new ArrayList(f111310a.mo156274b(str));
        this.f111315d = arrayList;
        C43886f.m173943a(arrayList.size() > 127 ? false : z2, "Domain has too many parts: '%s'", str);
        C43886f.m173943a(m173869a(arrayList), "Not a valid domain name: '%s'", str);
        this.f111316e = m173864a(Optional.absent());
        this.f111317f = m173864a(Optional.of(PublicSuffixType.REGISTRY));
    }

    /* renamed from: a */
    private static boolean m173869a(List<String> list) {
        int size = list.size() - 1;
        if (!m173868a(list.get(size), true)) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!m173868a(list.get(i), false)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m173866a(Optional<PublicSuffixType> optional, Optional<PublicSuffixType> optional2) {
        if (optional.isPresent()) {
            return optional.equals(optional2);
        }
        return optional2.isPresent();
    }

    /* renamed from: a */
    private static boolean m173867a(Optional<PublicSuffixType> optional, String str) {
        List<String> b = f111310a.mo156272a(2).mo156274b(str);
        if (b.size() != 2 || !m173866a(optional, Optional.fromNullable(C43888h.f111341b.get(b.get(1))))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m173868a(String str, boolean z) {
        if (str.length() >= 1 && str.length() <= 63) {
            if (!f111313h.mo156258b(AbstractC43868c.m173881c().mo156264f(str))) {
                return false;
            }
            AbstractC43868c cVar = f111312g;
            if (!cVar.mo156259c(str.charAt(0)) && !cVar.mo156259c(str.charAt(str.length() - 1))) {
                if (!z || !AbstractC43868c.m173882d().mo156259c(str.charAt(0))) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
