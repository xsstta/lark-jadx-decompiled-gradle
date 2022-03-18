package org.apache.commons.lang3.time;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.lang3.C69882g;

/* renamed from: org.apache.commons.lang3.time.b */
abstract class AbstractC69932b<F extends Format> {

    /* renamed from: b */
    private static final ConcurrentMap<C69933a, String> f174801b = new ConcurrentHashMap(7);

    /* renamed from: a */
    private final ConcurrentMap<C69933a, F> f174802a = new ConcurrentHashMap(7);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract F mo245676b(String str, TimeZone timeZone, Locale locale);

    AbstractC69932b() {
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.time.b$a */
    public static class C69933a {

        /* renamed from: a */
        private final Object[] f174803a;

        /* renamed from: b */
        private int f174804b;

        public int hashCode() {
            if (this.f174804b == 0) {
                Object[] objArr = this.f174803a;
                int i = 0;
                for (Object obj : objArr) {
                    if (obj != null) {
                        i = (i * 7) + obj.hashCode();
                    }
                }
                this.f174804b = i;
            }
            return this.f174804b;
        }

        C69933a(Object... objArr) {
            this.f174803a = objArr;
        }

        public boolean equals(Object obj) {
            return Arrays.equals(this.f174803a, ((C69933a) obj).f174803a);
        }
    }

    /* renamed from: a */
    public F mo245727a() {
        return mo245728a(3, 3, TimeZone.getDefault(), Locale.getDefault());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public F mo245730b(int i, TimeZone timeZone, Locale locale) {
        return m268306a((Integer) null, Integer.valueOf(i), timeZone, locale);
    }

    /* renamed from: c */
    public F mo245731c(String str, TimeZone timeZone, Locale locale) {
        C69882g.m268177a(str, "pattern must not be null", new Object[0]);
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        C69933a aVar = new C69933a(str, timeZone, locale);
        F f = this.f174802a.get(aVar);
        if (f != null) {
            return f;
        }
        F b = mo245676b(str, timeZone, locale);
        F putIfAbsent = this.f174802a.putIfAbsent(aVar, b);
        return putIfAbsent != null ? putIfAbsent : b;
    }

    /* renamed from: a */
    static String m268305a(Integer num, Integer num2, Locale locale) {
        DateFormat dateFormat;
        C69933a aVar = new C69933a(num, num2, locale);
        ConcurrentMap<C69933a, String> concurrentMap = f174801b;
        String str = concurrentMap.get(aVar);
        if (str != null) {
            return str;
        }
        if (num == null) {
            try {
                dateFormat = DateFormat.getTimeInstance(num2.intValue(), locale);
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException("No date time pattern for locale: " + locale);
            }
        } else if (num2 == null) {
            dateFormat = DateFormat.getDateInstance(num.intValue(), locale);
        } else {
            dateFormat = DateFormat.getDateTimeInstance(num.intValue(), num2.intValue(), locale);
        }
        String pattern = ((SimpleDateFormat) dateFormat).toPattern();
        String putIfAbsent = concurrentMap.putIfAbsent(aVar, pattern);
        return putIfAbsent != null ? putIfAbsent : pattern;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public F mo245729a(int i, TimeZone timeZone, Locale locale) {
        return m268306a(Integer.valueOf(i), (Integer) null, timeZone, locale);
    }

    /* renamed from: a */
    private F m268306a(Integer num, Integer num2, TimeZone timeZone, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return mo245731c(m268305a(num, num2, locale), timeZone, locale);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public F mo245728a(int i, int i2, TimeZone timeZone, Locale locale) {
        return m268306a(Integer.valueOf(i), Integer.valueOf(i2), timeZone, locale);
    }
}
