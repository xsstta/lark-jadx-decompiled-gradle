package com.ss.android.lark.passport.infra.util;

import android.os.Build;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.ss.android.lark.passport.infra.util.ad */
public class C49149ad {

    /* renamed from: a */
    private DateFormat f123423a;

    /* renamed from: b */
    private boolean f123424b;

    /* renamed from: c */
    private Throwable f123425c;

    /* renamed from: a */
    public String mo171630a() {
        return mo171631a(System.currentTimeMillis());
    }

    /* renamed from: a */
    public String mo171631a(long j) {
        String str;
        if (this.f123423a == null) {
            return null;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        String format = this.f123423a.format(instance.getTime());
        if (!this.f123424b) {
            return format;
        }
        int i = (instance.get(15) + instance.get(16)) / CalendarSearchResultRv.f82652c;
        if (i == 0) {
            return format + "Z";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(format);
        if (i >= 0) {
            str = "+";
        } else {
            str = "-";
        }
        sb.append(str);
        sb.append(m193809a(Math.abs(i) / 60, 2));
        sb.append(":");
        sb.append(m193809a(Math.abs(i) % 60, 2));
        return sb.toString();
    }

    /* renamed from: a */
    private String m193809a(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        int i3 = 10;
        for (int i4 = 2; i4 < i2; i4++) {
            i3 *= 10;
        }
        for (int i5 = 1; i5 < i2 && i < i3; i5++) {
            sb.append('0');
            i3 /= 10;
        }
        sb.append(i);
        return sb.toString();
    }

    public C49149ad(String str, boolean z) {
        if (z && Build.VERSION.SDK_INT >= 24) {
            try {
                this.f123423a = new SimpleDateFormat(str + "XXX", Locale.getDefault());
            } catch (Throwable th) {
                this.f123425c = th;
            }
        }
        if (this.f123423a == null) {
            try {
                this.f123423a = new SimpleDateFormat(str, Locale.getDefault());
                if (z) {
                    this.f123424b = true;
                }
            } catch (Throwable th2) {
                this.f123425c = th2;
            }
        }
    }
}
