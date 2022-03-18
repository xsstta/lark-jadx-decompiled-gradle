package com.larksuite.framework.utils;

import com.larksuite.framework.utils.C26286m;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.larksuite.framework.utils.j */
public class C26280j {

    /* renamed from: a */
    public static final C26324x<C26283a> f64903a = new C26324x<C26283a>(5) {
        /* class com.larksuite.framework.utils.C26280j.C262811 */

        /* renamed from: d */
        private TimeZone m95177d(Object... objArr) {
            TimeZone timeZone;
            if (objArr == null || objArr.length < 1 || !(objArr[0] instanceof TimeZone)) {
                timeZone = null;
            } else {
                timeZone = (TimeZone) objArr[0];
            }
            if (timeZone == null) {
                return TimeZone.getDefault();
            }
            return timeZone;
        }

        /* renamed from: e */
        private Locale m95178e(Object... objArr) {
            Locale locale;
            if (objArr == null || objArr.length < 2 || !(objArr[1] instanceof Locale)) {
                locale = null;
            } else {
                locale = (Locale) objArr[1];
            }
            if (locale == null) {
                return Locale.getDefault();
            }
            return locale;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C26283a mo93415b(Object... objArr) {
            TimeZone d = m95177d(objArr);
            Locale e = m95178e(objArr);
            return new C26283a(new C26286m.C26291e(d, e), Calendar.getInstance(d, e));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo93414a(C26283a aVar, Object... objArr) {
            if (objArr == null) {
                objArr = new Object[2];
            }
            if (objArr[0] == null) {
                objArr[0] = TimeZone.getDefault();
            }
            if (objArr[1] == null) {
                objArr[1] = Locale.getDefault();
            }
            return aVar.f64906a.mo93428a(objArr);
        }
    };

    /* renamed from: b */
    private static long f64904b;

    /* renamed from: a */
    public static long m95168a() {
        return m95174b() + 86400000;
    }

    /* renamed from: b */
    public static long m95174b() {
        if (f64904b <= 0 || System.currentTimeMillis() - f64904b > 86400000) {
            C26324x<C26283a> xVar = f64903a;
            C26283a c = xVar.mo93445c(null, null);
            Calendar calendar = c.f64907b;
            m95172a(calendar, System.currentTimeMillis());
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            f64904b = calendar.getTimeInMillis();
            xVar.mo93444a(c);
        }
        return f64904b;
    }

    /* renamed from: b */
    public static boolean m95175b(long j) {
        if (j > m95174b() || j <= m95174b() - 86400000) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m95176c(long j) {
        C26324x<C26283a> xVar = f64903a;
        C26283a c = xVar.mo93445c(null, null);
        Calendar calendar = c.f64907b;
        m95172a(calendar, System.currentTimeMillis());
        int i = calendar.get(1);
        m95172a(calendar, j);
        int i2 = calendar.get(1);
        xVar.mo93444a(c);
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m95173a(long j) {
        if (j >= m95168a() || j <= m95174b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.j$a */
    public static class C26283a {

        /* renamed from: a */
        C26286m.C26291e f64906a;

        /* renamed from: b */
        Calendar f64907b;

        public C26283a(C26286m.C26291e eVar, Calendar calendar) {
            this.f64906a = eVar;
            this.f64907b = calendar;
        }
    }

    /* renamed from: a */
    public static String m95169a(String str, long j) {
        return m95171a(str, j, null, null);
    }

    /* renamed from: a */
    public static int m95165a(long j, int i) {
        return m95166a(j, TimeZone.getDefault(), i);
    }

    /* renamed from: a */
    private static int m95167a(Calendar calendar, int i) {
        if (i == 5) {
            i = 5;
        }
        int i2 = calendar.get(i);
        if (i == 2) {
            i2++;
        }
        if (i == 10 && i2 == 0) {
            return 12;
        }
        return i2;
    }

    /* renamed from: a */
    private static void m95172a(Calendar calendar, long j) {
        calendar.add(14, (int) (j - calendar.getTimeInMillis()));
        if (calendar.getTimeInMillis() != j) {
            calendar.setTimeInMillis(j);
        }
    }

    /* renamed from: a */
    public static int m95166a(long j, TimeZone timeZone, int i) {
        C26324x<C26283a> xVar = f64903a;
        C26283a c = xVar.mo93445c(timeZone, null);
        Calendar calendar = c.f64907b;
        m95172a(calendar, j);
        int a = m95167a(calendar, i);
        xVar.mo93444a(c);
        return a;
    }

    /* renamed from: a */
    public static String m95170a(String str, long j, TimeZone timeZone) {
        return m95171a(str, j, timeZone, null);
    }

    /* renamed from: a */
    public static String m95171a(String str, long j, TimeZone timeZone, Locale locale) {
        return C26286m.m95189a(str, timeZone, locale).mo93419a(j, new C26286m.AbstractC26289c() {
            /* class com.larksuite.framework.utils.C26280j.C262822 */

            /* renamed from: a */
            C26283a f64905a;

            @Override // com.larksuite.framework.utils.C26286m.AbstractC26289c
            /* renamed from: a */
            public void mo93417a() {
                C26280j.f64903a.mo93444a(this.f64905a);
            }

            @Override // com.larksuite.framework.utils.C26286m.AbstractC26289c
            /* renamed from: a */
            public Calendar mo93416a(TimeZone timeZone, Locale locale) {
                C26283a c = C26280j.f64903a.mo93445c(timeZone, locale);
                this.f64905a = c;
                return c.f64907b;
            }
        });
    }
}
