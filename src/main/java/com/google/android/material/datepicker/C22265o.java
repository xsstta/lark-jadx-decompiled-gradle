package com.google.android.material.datepicker;

import android.content.res.Resources;
import com.larksuite.suite.R;
import com.ss.android.vc.statistics.p3180a.C63690d;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.material.datepicker.o */
class C22265o {

    /* renamed from: a */
    static AtomicReference<C22264n> f54444a = new AtomicReference<>();

    /* renamed from: f */
    private static TimeZone m80556f() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: g */
    private static android.icu.util.TimeZone m80557g() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: c */
    static Calendar m80550c() {
        return m80544a((Calendar) null);
    }

    /* renamed from: e */
    static SimpleDateFormat m80554e() {
        return m80559h(Locale.getDefault());
    }

    /* renamed from: b */
    static Calendar m80547b() {
        Calendar b = m80540a().mo77439b();
        b.set(11, 0);
        b.set(12, 0);
        b.set(13, 0);
        b.set(14, 0);
        b.setTimeZone(m80556f());
        return b;
    }

    /* renamed from: d */
    static SimpleDateFormat m80552d() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) DateFormat.getDateInstance(3, Locale.getDefault())).toLocalizedPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(m80556f());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* renamed from: a */
    static C22264n m80540a() {
        C22264n nVar = f54444a.get();
        if (nVar == null) {
            return C22264n.m80533a();
        }
        return nVar;
    }

    /* renamed from: a */
    static android.icu.text.DateFormat m80539a(Locale locale) {
        return m80538a("yMMMd", locale);
    }

    /* renamed from: b */
    static android.icu.text.DateFormat m80545b(Locale locale) {
        return m80538a("MMMd", locale);
    }

    /* renamed from: c */
    static android.icu.text.DateFormat m80549c(Locale locale) {
        return m80538a("MMMEd", locale);
    }

    /* renamed from: d */
    static android.icu.text.DateFormat m80551d(Locale locale) {
        return m80538a("yMMMEd", locale);
    }

    /* renamed from: e */
    static DateFormat m80553e(Locale locale) {
        return m80543a(2, locale);
    }

    /* renamed from: h */
    private static SimpleDateFormat m80559h(Locale locale) {
        return m80546b("LLLL, yyyy", locale);
    }

    /* renamed from: a */
    static long m80537a(long j) {
        Calendar c = m80550c();
        c.setTimeInMillis(j);
        return m80548b(c).getTimeInMillis();
    }

    /* renamed from: g */
    static DateFormat m80558g(Locale locale) {
        return m80543a(0, locale);
    }

    /* renamed from: b */
    static Calendar m80548b(Calendar calendar) {
        Calendar a = m80544a(calendar);
        Calendar c = m80550c();
        c.set(a.get(1), a.get(2), a.get(5));
        return c;
    }

    /* renamed from: f */
    static DateFormat m80555f(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) m80553e(locale);
        simpleDateFormat.applyPattern(m80542a(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    /* renamed from: a */
    private static String m80542a(String str) {
        int a = m80536a(str, "yY", 1, 0);
        if (a >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int a2 = m80536a(str, str2, 1, a);
        if (a2 < str.length()) {
            str2 = str2 + ",";
        }
        return str.replace(str.substring(m80536a(str, str2, -1, a) + 1, a2), " ").trim();
    }

    /* renamed from: a */
    static Calendar m80544a(Calendar calendar) {
        Calendar instance = Calendar.getInstance(m80556f());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    /* renamed from: b */
    private static SimpleDateFormat m80546b(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(m80556f());
        return simpleDateFormat;
    }

    /* renamed from: a */
    private static android.icu.text.DateFormat m80538a(String str, Locale locale) {
        android.icu.text.DateFormat instanceForSkeleton = android.icu.text.DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m80557g());
        return instanceForSkeleton;
    }

    /* renamed from: a */
    static String m80541a(Resources resources, SimpleDateFormat simpleDateFormat) {
        String localizedPattern = simpleDateFormat.toLocalizedPattern();
        return localizedPattern.replaceAll(C63690d.f160779a, resources.getString(R.string.mtrl_picker_text_input_day_abbr)).replaceAll("M", resources.getString(R.string.mtrl_picker_text_input_month_abbr)).replaceAll("y", resources.getString(R.string.mtrl_picker_text_input_year_abbr));
    }

    /* renamed from: a */
    private static DateFormat m80543a(int i, Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m80556f());
        return dateInstance;
    }

    /* renamed from: a */
    private static int m80536a(String str, String str2, int i, int i2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 < 0 || i2 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i2) != '\'');
            }
            i2 += i;
        }
        return i2;
    }
}
