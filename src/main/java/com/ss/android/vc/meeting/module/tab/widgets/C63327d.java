package com.ss.android.vc.meeting.module.tab.widgets;

import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3083e.C60774p;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.module.calendar.CalendarDate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ss.android.vc.meeting.module.tab.widgets.d */
public final class C63327d {
    /* renamed from: c */
    public static boolean m248055c(long j) {
        if (new Date(j).getYear() == new Date(System.currentTimeMillis()).getYear()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static String m248056d(long j) {
        long j2 = j * 1000;
        if (new CalendarDate(new Date(j2), TimeZone.getDefault()).dayDiff(new CalendarDate()) == 0) {
            return C60774p.m236134b(j2, VideoChatModuleDependency.getSettingDependency().is24Hour(), TimeZone.getDefault());
        }
        return C60774p.m236131a(j2, TimeZone.getDefault());
    }

    /* renamed from: a */
    public static String m248050a(long j) {
        long j2 = j / 3600;
        long j3 = (j % 3600) / 60;
        long j4 = j % 60;
        if (j2 == 0) {
            return String.format(Locale.getDefault(), "%02d:%02d", Long.valueOf(j3), Long.valueOf(j4));
        }
        return String.format(Locale.getDefault(), "%02d:%02d:%02d", Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4));
    }

    /* renamed from: b */
    public static String m248053b(long j) {
        long j2 = j / 3600;
        long j3 = (j % 3600) / 60;
        long j4 = j % 60;
        HashMap hashMap = new HashMap();
        if (j2 != 0) {
            hashMap.put("durationTimeHour", Long.toString(j2));
            hashMap.put("durationTimeMin", Long.toString(j3));
            hashMap.put("durationTimeSec", Long.toString(j4));
            return UIHelper.mustacheFormat((int) R.string.View_G_DurationHourMinSecBraces, hashMap);
        } else if (j3 != 0) {
            hashMap.put("durationTimeMin", Long.toString(j3));
            hashMap.put("durationTimeSec", Long.toString(j4));
            return UIHelper.mustacheFormat((int) R.string.View_G_DurationMinSecBraces, hashMap);
        } else {
            hashMap.put("durationTimeSec", Long.toString(Math.max(1L, j4)));
            return UIHelper.mustacheFormat((int) R.string.View_G_DurationSecBraces, hashMap);
        }
    }

    /* renamed from: b */
    public static String m248054b(long j, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat;
        long j2 = j * 1000;
        if (m248055c(j2)) {
            simpleDateFormat = new SimpleDateFormat(ar.m236694a().getString(R.string.Lark_Timeformat_DateFormatThisYear));
        } else {
            simpleDateFormat = new SimpleDateFormat(ar.m236694a().getString(R.string.Lark_Timeformat_DateFormatOtherYear));
        }
        return simpleDateFormat.format(new CalendarDate(new Date(j2), timeZone).getDate());
    }

    /* renamed from: a */
    public static String m248051a(long j, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat;
        long j2 = j * 1000;
        Date date = new Date(System.currentTimeMillis());
        Date date2 = new Date(j2);
        if (date.getYear() == date2.getYear()) {
            if (date.getMonth() == date2.getMonth() && date.getDay() == date2.getDay()) {
                return UIHelper.getString(R.string.View_G_TimeFormatToday);
            }
            Date date3 = new Date(86400000 + j2);
            if (date.getMonth() == date3.getMonth() && date.getDay() == date3.getDay()) {
                return UIHelper.getString(R.string.View_G_TimeFormatYesterday);
            }
            simpleDateFormat = new SimpleDateFormat(ar.m236694a().getString(R.string.Lark_Timeformat_DateFormatThisYear));
        } else if (m248055c(j2)) {
            simpleDateFormat = new SimpleDateFormat(ar.m236694a().getString(R.string.Lark_Timeformat_DateFormatThisYear));
        } else {
            simpleDateFormat = new SimpleDateFormat(ar.m236694a().getString(R.string.Lark_Timeformat_DateFormatOtherYear));
        }
        return simpleDateFormat.format(new CalendarDate(new Date(j2), timeZone).getDate());
    }

    /* renamed from: a */
    public static String m248052a(long j, boolean z, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat;
        long j2 = j * 1000;
        if (z) {
            simpleDateFormat = new SimpleDateFormat(ar.m236694a().getString(R.string.Lark_Timeformat_24HrTimeFormat));
        } else {
            simpleDateFormat = new SimpleDateFormat(ar.m236694a().getString(R.string.Lark_Timeformat_12HrTimeFormat));
        }
        return simpleDateFormat.format(new CalendarDate(new Date(j2), timeZone).getDate());
    }
}
