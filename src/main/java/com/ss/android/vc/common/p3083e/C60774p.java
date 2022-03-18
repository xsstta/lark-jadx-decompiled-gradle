package com.ss.android.vc.common.p3083e;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.module.calendar.CalendarDate;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ss.android.vc.common.e.p */
public final class C60774p {
    /* renamed from: b */
    private static boolean m236135b() {
        return TextUtils.equals(VideoChatModuleDependency.getLanguageDependency().getLanguageSetting().getLanguage(), Locale.ENGLISH.getLanguage());
    }

    /* renamed from: a */
    public static String m236129a() {
        int offset = Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()) / 3600000;
        if (offset >= 0) {
            return "GMT+" + Math.abs(offset);
        }
        return "GMT-" + Math.abs(offset);
    }

    /* renamed from: a */
    public static String m236130a(long j) {
        long j2 = j / 3600;
        long j3 = (j % 3600) / 60;
        long j4 = j % 60;
        if (j2 == 0) {
            return String.format(Locale.CHINA, "%02d:%02d", Long.valueOf(j3), Long.valueOf(j4));
        }
        return String.format(Locale.CHINA, "%02d:%02d:%02d", Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4));
    }

    /* renamed from: a */
    public static String m236131a(long j, TimeZone timeZone) {
        boolean z;
        CalendarDate calendarDate = new CalendarDate(new Date(j), timeZone);
        CalendarDate calendarDate2 = new CalendarDate();
        if (calendarDate.dayDiff(calendarDate2) == -1) {
            return ar.m236694a().getString(R.string.Calendar_TimeFormat_Yesterday);
        }
        if (calendarDate.getYear() != calendarDate2.getYear()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new SimpleDateFormat(ar.m236694a().getString(R.string.Calendar_Detail_ConflictTime)).format(calendarDate.getDate());
        }
        if (Math.abs(calendarDate.dayDiff(calendarDate2)) > 1) {
            return new SimpleDateFormat(ar.m236694a().getString(R.string.Calendar_Detail_ConflictTimeWithoutYear)).format(calendarDate.getDate());
        }
        if (calendarDate.dayDiff(calendarDate2) == 1) {
            return ar.m236694a().getString(R.string.Calendar_TimeFormat_Tomorrow);
        }
        return ar.m236694a().getString(R.string.Calendar_TimeFormat_Today);
    }

    /* renamed from: a */
    public static String m236132a(long j, boolean z, TimeZone timeZone) {
        return m236133a(j, z, timeZone, true, true);
    }

    /* renamed from: b */
    public static String m236134b(long j, boolean z, TimeZone timeZone) {
        CalendarDate calendarDate = new CalendarDate(new Date(j), timeZone);
        if (z) {
            return new SimpleDateFormat("HH:mm").format(calendarDate.getDate());
        }
        return new SimpleDateFormat(ar.m236694a().getString(R.string.View_G_TimeFormat12HourClock)).format(calendarDate.getDate());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0096  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m236133a(long r3, boolean r5, java.util.TimeZone r6, boolean r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.common.p3083e.C60774p.m236133a(long, boolean, java.util.TimeZone, boolean, boolean):java.lang.String");
    }
}
