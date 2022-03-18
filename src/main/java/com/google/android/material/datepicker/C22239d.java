package com.google.android.material.datepicker;

import android.os.Build;
import androidx.core.util.C0844e;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.d */
public class C22239d {
    /* renamed from: e */
    static String m80489e(long j) {
        return m80481a(j, (SimpleDateFormat) null);
    }

    /* renamed from: a */
    static String m80480a(long j) {
        return m80482a(j, Locale.getDefault());
    }

    /* renamed from: b */
    static String m80483b(long j) {
        return m80484b(j, Locale.getDefault());
    }

    /* renamed from: c */
    static String m80485c(long j) {
        return m80486c(j, Locale.getDefault());
    }

    /* renamed from: d */
    static String m80487d(long j) {
        return m80488d(j, Locale.getDefault());
    }

    /* renamed from: a */
    static C0844e<String, String> m80478a(Long l, Long l2) {
        return m80479a(l, l2, null);
    }

    /* renamed from: a */
    static String m80481a(long j, SimpleDateFormat simpleDateFormat) {
        Calendar b = C22265o.m80547b();
        Calendar c = C22265o.m80550c();
        c.setTimeInMillis(j);
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j));
        }
        if (b.get(1) == c.get(1)) {
            return m80483b(j);
        }
        return m80480a(j);
    }

    /* renamed from: b */
    static String m80484b(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C22265o.m80545b(locale).format(new Date(j));
        }
        return C22265o.m80555f(locale).format(new Date(j));
    }

    /* renamed from: c */
    static String m80486c(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C22265o.m80549c(locale).format(new Date(j));
        }
        return C22265o.m80558g(locale).format(new Date(j));
    }

    /* renamed from: d */
    static String m80488d(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C22265o.m80551d(locale).format(new Date(j));
        }
        return C22265o.m80558g(locale).format(new Date(j));
    }

    /* renamed from: a */
    static String m80482a(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C22265o.m80539a(locale).format(new Date(j));
        }
        return C22265o.m80553e(locale).format(new Date(j));
    }

    /* renamed from: a */
    static C0844e<String, String> m80479a(Long l, Long l2, SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return C0844e.m3988a(null, null);
        }
        if (l == null) {
            return C0844e.m3988a(null, m80481a(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return C0844e.m3988a(m80481a(l.longValue(), simpleDateFormat), null);
        }
        Calendar b = C22265o.m80547b();
        Calendar c = C22265o.m80550c();
        c.setTimeInMillis(l.longValue());
        Calendar c2 = C22265o.m80550c();
        c2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return C0844e.m3988a(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        } else if (c.get(1) != c2.get(1)) {
            return C0844e.m3988a(m80482a(l.longValue(), Locale.getDefault()), m80482a(l2.longValue(), Locale.getDefault()));
        } else {
            if (c.get(1) == b.get(1)) {
                return C0844e.m3988a(m80484b(l.longValue(), Locale.getDefault()), m80484b(l2.longValue(), Locale.getDefault()));
            }
            return C0844e.m3988a(m80484b(l.longValue(), Locale.getDefault()), m80482a(l2.longValue(), Locale.getDefault()));
        }
    }
}
