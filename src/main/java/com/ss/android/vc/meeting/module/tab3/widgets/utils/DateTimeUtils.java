package com.ss.android.vc.meeting.module.tab3.widgets.utils;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.aj;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.module.calendar.CalendarDate;
import com.ss.ttm.player.MediaPlayer;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\u0004H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u001a\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J$\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab3/widgets/utils/DateTimeUtils;", "", "()V", "MS_ONE_DAY", "", "MS_ONE_HOUER", "MS_ONE_MINUTES", "TIME_MS", "getCurrentTimeMilllis", "getDateTimeInTabList", "", "timestamp", "getDateTimeRangeInTabList", "startTime", "endTime", "getDay", "timeZone", "Ljava/util/TimeZone;", "getDurationEnd", "getDurationOngoing", "getFullDateTime", "getFullDateTimeRange", "getTime", "is24Hour", "", "isThisYear", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.tab3.widgets.a.c */
public final class DateTimeUtils {

    /* renamed from: a */
    public static final DateTimeUtils f160207a = new DateTimeUtils();

    /* renamed from: b */
    private static final long f160208b = f160208b;

    /* renamed from: c */
    private static final long f160209c = f160209c;

    /* renamed from: d */
    private static final long f160210d = f160210d;

    private DateTimeUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final long m248532a() {
        boolean a = VideoChatModuleDependency.getFeatureGatingDependency().mo196393a("byteview.android.ntptime.enable");
        aj settingDependency = VideoChatModuleDependency.getSettingDependency();
        if (settingDependency == null || !a) {
            return System.currentTimeMillis();
        }
        return settingDependency.getSyncNtpTimeMillis();
    }

    @JvmStatic
    /* renamed from: e */
    public static final boolean m248541e(long j) {
        if (new Date(j).getYear() == new Date(m248532a()).getYear()) {
            return true;
        }
        return false;
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m248533a(long j) {
        if (j == -1) {
            return "";
        }
        aj settingDependency = VideoChatModuleDependency.getSettingDependency();
        Intrinsics.checkExpressionValueIsNotNull(settingDependency, "VideoChatModuleDependency.getSettingDependency()");
        boolean is24Hour = settingDependency.is24Hour();
        Date date = new Date(j);
        Options aVar = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "TimeZone.getDefault().id");
        aVar.mo191595a(id);
        aVar.mo191594a(TimePreciseness.MINUTE);
        aVar.mo191592a(DisplayPattern.RELATIVE);
        aVar.mo191599b(!is24Hour);
        aVar.mo191601c(false);
        aVar.mo191597a(false);
        TimeFormatUtils dVar = TimeFormatUtils.f160211a;
        Context a = ar.m236694a();
        Intrinsics.checkExpressionValueIsNotNull(a, "VcContextDeps.getAppContext()");
        return dVar.mo219471b(a, date, false, aVar);
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m248537b(long j) {
        if (j == -1) {
            return "";
        }
        aj settingDependency = VideoChatModuleDependency.getSettingDependency();
        Intrinsics.checkExpressionValueIsNotNull(settingDependency, "VideoChatModuleDependency.getSettingDependency()");
        boolean is24Hour = settingDependency.is24Hour();
        Date date = new Date(j);
        Options aVar = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "TimeZone.getDefault().id");
        aVar.mo191595a(id);
        aVar.mo191594a(TimePreciseness.MINUTE);
        aVar.mo191592a(DisplayPattern.RELATIVE);
        aVar.mo191599b(!is24Hour);
        aVar.mo191601c(false);
        aVar.mo191597a(false);
        TimeFormatUtils dVar = TimeFormatUtils.f160211a;
        Context a = ar.m236694a();
        Intrinsics.checkExpressionValueIsNotNull(a, "VcContextDeps.getAppContext()");
        return dVar.mo219472c(a, date, aVar);
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m248539c(long j) {
        long j2 = f160209c;
        long j3 = j / j2;
        long j4 = f160208b;
        long j5 = (j % j2) / j4;
        long j6 = j % j4;
        if (j3 == 0) {
            StringCompanionObject mVar = StringCompanionObject.f173215a;
            Locale locale = Locale.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
            String format = String.format(locale, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5), Long.valueOf(j6)}, 2));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(locale, format, *args)");
            return format;
        }
        StringCompanionObject mVar2 = StringCompanionObject.f173215a;
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(locale2, "Locale.getDefault()");
        String format2 = String.format(locale2, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j5), Long.valueOf(j6)}, 3));
        Intrinsics.checkExpressionValueIsNotNull(format2, "java.lang.String.format(locale, format, *args)");
        return format2;
    }

    @JvmStatic
    /* renamed from: d */
    public static final String m248540d(long j) {
        long j2 = f160209c;
        long j3 = j / j2;
        long j4 = f160208b;
        long j5 = (j % j2) / j4;
        long j6 = j % j4;
        HashMap hashMap = new HashMap();
        if (j3 != 0) {
            HashMap hashMap2 = hashMap;
            String l = Long.toString(j3);
            Intrinsics.checkExpressionValueIsNotNull(l, "java.lang.Long.toString(hour)");
            hashMap2.put("durationTimeHour", l);
            String l2 = Long.toString(j5);
            Intrinsics.checkExpressionValueIsNotNull(l2, "java.lang.Long.toString(minute)");
            hashMap2.put("durationTimeMin", l2);
            String l3 = Long.toString(j6);
            Intrinsics.checkExpressionValueIsNotNull(l3, "java.lang.Long.toString(second)");
            hashMap2.put("durationTimeSec", l3);
            return UIHelper.mustacheFormat((int) R.string.View_G_DurationHourMinSecBraces, hashMap2);
        } else if (j5 != 0) {
            HashMap hashMap3 = hashMap;
            String l4 = Long.toString(j5);
            Intrinsics.checkExpressionValueIsNotNull(l4, "java.lang.Long.toString(minute)");
            hashMap3.put("durationTimeMin", l4);
            String l5 = Long.toString(j6);
            Intrinsics.checkExpressionValueIsNotNull(l5, "java.lang.Long.toString(second)");
            hashMap3.put("durationTimeSec", l5);
            return UIHelper.mustacheFormat((int) R.string.View_G_DurationMinSecBraces, hashMap3);
        } else {
            HashMap hashMap4 = hashMap;
            String l6 = Long.toString(Math.max(1L, j6));
            Intrinsics.checkExpressionValueIsNotNull(l6, "java.lang.Long.toString(Math.max(1, second))");
            hashMap4.put("durationTimeSec", l6);
            return UIHelper.mustacheFormat((int) R.string.View_G_DurationSecBraces, hashMap4);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m248534a(long j, long j2) {
        if (j == -1 || j2 == -1) {
            return "";
        }
        aj settingDependency = VideoChatModuleDependency.getSettingDependency();
        Intrinsics.checkExpressionValueIsNotNull(settingDependency, "VideoChatModuleDependency.getSettingDependency()");
        boolean is24Hour = settingDependency.is24Hour();
        Date date = new Date(j);
        Date date2 = new Date(j2);
        Options aVar = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "TimeZone.getDefault().id");
        aVar.mo191595a(id);
        aVar.mo191594a(TimePreciseness.MINUTE);
        aVar.mo191592a(DisplayPattern.RELATIVE);
        aVar.mo191599b(!is24Hour);
        aVar.mo191601c(false);
        aVar.mo191597a(false);
        TimeFormatUtils dVar = TimeFormatUtils.f160211a;
        Context a = ar.m236694a();
        Intrinsics.checkExpressionValueIsNotNull(a, "VcContextDeps.getAppContext()");
        return dVar.mo219470b(a, date, date2, false, aVar);
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m248538b(long j, long j2) {
        if (j == -1 || j2 == -1) {
            return "";
        }
        aj settingDependency = VideoChatModuleDependency.getSettingDependency();
        Intrinsics.checkExpressionValueIsNotNull(settingDependency, "VideoChatModuleDependency.getSettingDependency()");
        boolean is24Hour = settingDependency.is24Hour();
        Date date = new Date(j);
        Date date2 = new Date(j2);
        Options aVar = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "TimeZone.getDefault().id");
        aVar.mo191595a(id);
        aVar.mo191594a(TimePreciseness.MINUTE);
        aVar.mo191592a(DisplayPattern.RELATIVE);
        aVar.mo191599b(!is24Hour);
        aVar.mo191601c(false);
        aVar.mo191597a(false);
        TimeFormatUtils dVar = TimeFormatUtils.f160211a;
        Context a = ar.m236694a();
        Intrinsics.checkExpressionValueIsNotNull(a, "VcContextDeps.getAppContext()");
        return dVar.mo219470b(a, date, date2, true, aVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m248535a(long j, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat;
        long j2 = j * 1000;
        Date date = new Date(m248532a());
        Date date2 = new Date(j2);
        if (date.getYear() == date2.getYear()) {
            if (date.getMonth() == date2.getMonth() && date.getDay() == date2.getDay()) {
                return UIHelper.getString(R.string.View_G_TimeFormatToday);
            }
            Date date3 = new Date((f160210d * 1000) + j2);
            if (date.getMonth() == date3.getMonth() && date.getDay() == date3.getDay()) {
                return UIHelper.getString(R.string.View_G_TimeFormatYesterday);
            }
            simpleDateFormat = new SimpleDateFormat(ar.m236694a().getString(R.string.Lark_Timeformat_DateFormatThisYear));
        } else if (m248541e(j2)) {
            simpleDateFormat = new SimpleDateFormat(ar.m236694a().getString(R.string.Lark_Timeformat_DateFormatThisYear));
        } else {
            simpleDateFormat = new SimpleDateFormat(ar.m236694a().getString(R.string.Lark_Timeformat_DateFormatOtherYear));
        }
        return simpleDateFormat.format(new CalendarDate(new Date(j2), timeZone).getDate());
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m248536a(long j, boolean z, TimeZone timeZone) {
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
