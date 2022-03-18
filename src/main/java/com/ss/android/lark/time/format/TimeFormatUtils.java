package com.ss.android.lark.time.format;

import android.content.Context;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.time.format.common.ContextUtil;
import com.ss.android.lark.time.format.common.FormatUtil;
import com.ss.android.lark.time.format.common.OptionsUtil;
import com.ss.android.lark.time.format.common.TimeUtil;
import com.ss.android.lark.time.format.common.TimezoneUtil;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.helper.FormatDateHelper;
import com.ss.android.lark.time.format.helper.FormatTimeHelper;
import com.ss.android.lark.utils.UIHelper;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J*\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\"\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J*\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\"\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J*\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\"\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\"\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\"\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J8\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000bH\u0002J(\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u000bH\u0002J\"\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J*\u0010 \u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J(\u0010!\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002J\"\u0010#\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/time/format/TimeFormatUtils;", "", "()V", "TAG", "", "formatDate", "context", "Landroid/content/Context;", "date", "Ljava/util/Date;", "options", "Lcom/ss/android/lark/time/format/Options;", "formatDateRange", "startDate", "endDate", "formatDateTime", "formatDateTimeRange", "formatDateTimeStr", "dateFormatString", "timeFormatString", "formatFullDate", "formatFullDateRange", "formatFullDateTime", "formatMeridiem", "formatMonth", "formatNotSameDayRange", "startGC", "Ljava/util/GregorianCalendar;", "endGC", "opt", "formatSameDayRange", "formatTime", "formatTimeRange", "formatTimeZoneString", "dateTimeString", "formatWeekDay", "time-format_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.time.format.b */
public final class TimeFormatUtils {

    /* renamed from: a */
    public static final TimeFormatUtils f139152a = new TimeFormatUtils();

    private TimeFormatUtils() {
    }

    @JvmStatic
    /* renamed from: d */
    public static final String m219287d(Context context, Date date, Options aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "date");
        Options a = OptionsUtil.f139149a.mo191618a(aVar);
        return FormatTimeHelper.f139156a.mo191634a(ContextUtil.f139146a.mo191613a(context, a.mo191590a()), date, false, a);
    }

    @JvmStatic
    /* renamed from: e */
    public static final String m219289e(Context context, Date date, Options aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "date");
        Options a = OptionsUtil.f139149a.mo191618a(aVar);
        Context a2 = ContextUtil.f139146a.mo191613a(context, a.mo191590a());
        TimeZone a3 = OptionsUtil.f139149a.mo191619a(a.mo191598b());
        if (a.mo191600c() == DisplayPattern.RELATIVE) {
            return FormatDateHelper.f139153a.mo191630b(a2, date, a, a3);
        }
        return FormatDateHelper.f139153a.mo191627a(a2, date, a, a3);
    }

    @JvmStatic
    /* renamed from: f */
    public static final String m219291f(Context context, Date date, Options aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "date");
        Options a = OptionsUtil.f139149a.mo191618a(aVar);
        Context a2 = ContextUtil.f139146a.mo191613a(context, a.mo191590a());
        TimeZone a3 = OptionsUtil.f139149a.mo191619a(a.mo191598b());
        if (a.mo191600c() == DisplayPattern.RELATIVE) {
            return FormatDateHelper.f139153a.mo191632d(a2, date, a, a3);
        }
        return FormatDateHelper.f139153a.mo191631c(a2, date, a, a3);
    }

    /* renamed from: a */
    private final String m219279a(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("relativeDate", str);
        hashMap.put("time", str2);
        String mustacheFormat = UIHelper.mustacheFormat(UIUtils.getString(context, R.string.Calendar_StandardTime_RelativeDateTimeCombineFormat), hashMap);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…etTplString, datetimeMap)");
        return mustacheFormat;
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m219283b(Context context, Date date, Options aVar) {
        String[] strArr;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "date");
        Options a = OptionsUtil.f139149a.mo191618a(aVar);
        Context a2 = ContextUtil.f139146a.mo191613a(context, a.mo191590a());
        GregorianCalendar gregorianCalendar = new GregorianCalendar(OptionsUtil.f139149a.mo191619a(a.mo191598b()));
        gregorianCalendar.setTime(date);
        int i = C56223c.f139158a[a.mo191602d().ordinal()];
        if (i == 1) {
            strArr = UIUtils.getStringArray(a2, R.array.week_min);
        } else if (i == 2) {
            strArr = UIUtils.getStringArray(a2, R.array.week_short);
        } else if (i == 3) {
            strArr = UIUtils.getStringArray(a2, R.array.week_long);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (strArr != null && strArr.length >= 7) {
            return strArr[gregorianCalendar.get(7) - 1];
        }
        Log.m165383e("TimeFormatUtils", "formatWeekDay weekArray is illegal!");
        return "";
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m219285c(Context context, Date date, Options aVar) {
        String[] strArr;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "date");
        Options a = OptionsUtil.f139149a.mo191618a(aVar);
        Context a2 = ContextUtil.f139146a.mo191613a(context, a.mo191590a());
        GregorianCalendar gregorianCalendar = new GregorianCalendar(OptionsUtil.f139149a.mo191619a(a.mo191598b()));
        gregorianCalendar.setTime(date);
        int i = C56223c.f139159b[a.mo191602d().ordinal()];
        if (i == 1) {
            strArr = UIUtils.getStringArray(a2, R.array.month_short);
        } else if (i != 2) {
            Log.m165383e("TimeFormatUtils", "formatMonth lengthType cannot support min");
            strArr = UIUtils.getStringArray(a2, R.array.month_long);
        } else {
            strArr = UIUtils.getStringArray(a2, R.array.month_long);
        }
        if (strArr != null && strArr.length >= 12) {
            return strArr[gregorianCalendar.get(2)];
        }
        Log.m165383e("TimeFormatUtils", "formatMonth monthArray is illegal!");
        return "";
    }

    @JvmStatic
    /* renamed from: h */
    public static final String m219293h(Context context, Date date, Options aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "date");
        Options a = OptionsUtil.f139149a.mo191618a(aVar);
        Context a2 = ContextUtil.f139146a.mo191613a(context, a.mo191590a());
        a.mo191591a(DatePreciseness.DAY);
        HashMap hashMap = new HashMap();
        hashMap.put("relativeDate", m219291f(a2, date, a));
        hashMap.put("time", m219287d(a2, date, a));
        String mustacheFormat = UIHelper.mustacheFormat(UIUtils.getString(a2, R.string.Calendar_StandardTime_RelativeDateTimeCombineFormat), hashMap);
        if (a.mo191607g()) {
            TimeFormatUtils bVar = f139152a;
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "dateTimeStr");
            return bVar.m219278a(a2, mustacheFormat, a, date);
        }
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "dateTimeStr");
        return mustacheFormat;
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m219280a(Context context, Date date, Options aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "date");
        Options a = OptionsUtil.f139149a.mo191618a(aVar);
        Context a2 = ContextUtil.f139146a.mo191613a(context, a.mo191590a());
        FormatUtil bVar = FormatUtil.f139147a;
        TimeZone a3 = OptionsUtil.f139149a.mo191619a(a.mo191598b());
        String string = UIUtils.getString(a2, R.string.Calendar_StandardTime_MeridiemFormat);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(locale…ndardTime_MeridiemFormat)");
        return bVar.mo191616a(date, a3, string, a.mo191611j(), a.mo191590a());
    }

    @JvmStatic
    /* renamed from: g */
    public static final String m219292g(Context context, Date date, Options aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "date");
        Options a = OptionsUtil.f139149a.mo191618a(aVar);
        Context a2 = ContextUtil.f139146a.mo191613a(context, a.mo191590a());
        a.mo191591a(DatePreciseness.DAY);
        HashMap hashMap = new HashMap();
        String string = UIUtils.getString(a2, R.string.Calendar_StandardTime_RelativeDateTimeCombineFormat);
        if (a.mo191600c() == DisplayPattern.ABSOLUTE) {
            HashMap hashMap2 = hashMap;
            hashMap2.put("relativeDate", m219289e(a2, date, a));
            hashMap2.put("time", m219287d(a2, date, a));
            String mustacheFormat = UIHelper.mustacheFormat(string, hashMap2);
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…rgetTplString, formatMap)");
            return mustacheFormat;
        }
        TimeZone a3 = OptionsUtil.f139149a.mo191619a(a.mo191598b());
        GregorianCalendar gregorianCalendar = new GregorianCalendar(a3);
        gregorianCalendar.setTime(date);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(a3);
        if (TimeUtil.f139150a.mo191623c(gregorianCalendar, gregorianCalendar2)) {
            return FormatTimeHelper.f139156a.mo191635a(a2, gregorianCalendar, false, a);
        }
        if (a.mo191602d() != LengthType.LONG) {
            return FormatDateHelper.f139153a.mo191628a(a2, date, a3, gregorianCalendar, gregorianCalendar2, a.mo191611j(), a.mo191590a());
        }
        HashMap hashMap3 = hashMap;
        hashMap3.put("relativeDate", m219289e(a2, date, a));
        hashMap3.put("time", m219287d(a2, date, a));
        String mustacheFormat2 = UIHelper.mustacheFormat(string, hashMap3);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat2, "UIHelper.mustacheFormat(…rgetTplString, formatMap)");
        return mustacheFormat2;
    }

    /* renamed from: a */
    private final String m219278a(Context context, String str, Options aVar, Date date) {
        Context a = ContextUtil.f139146a.mo191613a(context, aVar.mo191590a());
        HashMap hashMap = new HashMap();
        hashMap.put("timeString", str);
        hashMap.put("GMT", TimezoneUtil.f139151a.mo191625a(a, OptionsUtil.f139149a.mo191619a(aVar.mo191598b()), date));
        String mustacheFormat = UIHelper.mustacheFormat(UIUtils.getString(a, R.string.Calendar_StandardTime_TimeStringWithGMT), hashMap);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…etTplString, timezoneMap)");
        return mustacheFormat;
    }

    @JvmStatic
    /* renamed from: d */
    public static final String m219288d(Context context, Date date, Date date2, Options aVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "startDate");
        Intrinsics.checkParameterIsNotNull(date2, "endDate");
        Options a = OptionsUtil.f139149a.mo191618a(aVar);
        Context a2 = ContextUtil.f139146a.mo191613a(context, a.mo191590a());
        GregorianCalendar gregorianCalendar = new GregorianCalendar(OptionsUtil.f139149a.mo191619a(a.mo191598b()));
        gregorianCalendar.setTime(date);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(OptionsUtil.f139149a.mo191619a(a.mo191598b()));
        gregorianCalendar2.setTime(date2);
        a.mo191591a(DatePreciseness.DAY);
        if (TimeUtil.f139150a.mo191623c(gregorianCalendar, gregorianCalendar2)) {
            str = f139152a.m219290e(a2, date, date2, a);
        } else {
            str = f139152a.m219282a(a2, date, gregorianCalendar, date2, gregorianCalendar2, a);
        }
        if (a.mo191607g()) {
            return f139152a.m219278a(a2, str, a, date);
        }
        return str;
    }

    /* renamed from: e */
    private final String m219290e(Context context, Date date, Date date2, Options aVar) {
        Context a = ContextUtil.f139146a.mo191613a(context, aVar.mo191590a());
        HashMap hashMap = new HashMap();
        hashMap.put("relativeDate", m219291f(a, date, aVar));
        hashMap.put("time", m219281a(a, date, date2, aVar));
        String mustacheFormat = UIHelper.mustacheFormat(UIUtils.getString(a, R.string.Calendar_StandardTime_RelativeDateTimeCombineFormat), hashMap);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…getTplString, sameDayMap)");
        return mustacheFormat;
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m219284b(Context context, Date date, Date date2, Options aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "startDate");
        Intrinsics.checkParameterIsNotNull(date2, "endDate");
        Options a = OptionsUtil.f139149a.mo191618a(aVar);
        Context a2 = ContextUtil.f139146a.mo191613a(context, a.mo191590a());
        a.mo191592a(DisplayPattern.ABSOLUTE);
        HashMap hashMap = new HashMap();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(OptionsUtil.f139149a.mo191619a(a.mo191598b()));
        gregorianCalendar.setTime(date);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(OptionsUtil.f139149a.mo191619a(a.mo191598b()));
        gregorianCalendar2.setTime(date2);
        if (TimeUtil.f139150a.mo191623c(gregorianCalendar, gregorianCalendar2)) {
            return m219289e(a2, date, a);
        }
        if (a.mo191602d() == LengthType.SHORT && !TimeUtil.f139150a.mo191622b(gregorianCalendar, gregorianCalendar2)) {
            a.mo191593a(LengthType.LONG);
        }
        HashMap hashMap2 = hashMap;
        hashMap2.put("startTime", m219289e(a2, date, a));
        hashMap2.put("endTime", m219289e(a2, date2, a));
        String mustacheFormat = UIHelper.mustacheFormat(UIUtils.getString(a2, R.string.Calendar_StandardTime_GeneralDateTimeRangeWithoutWrap), hashMap2);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…rgetTplString, formatMap)");
        return mustacheFormat;
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m219281a(Context context, Date date, Date date2, Options aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "startDate");
        Intrinsics.checkParameterIsNotNull(date2, "endDate");
        Options a = OptionsUtil.f139149a.mo191618a(aVar);
        Context a2 = ContextUtil.f139146a.mo191613a(context, a.mo191590a());
        GregorianCalendar gregorianCalendar = new GregorianCalendar(OptionsUtil.f139149a.mo191619a(a.mo191598b()));
        gregorianCalendar.setTime(date);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(OptionsUtil.f139149a.mo191619a(a.mo191598b()));
        gregorianCalendar2.setTime(date2);
        if (TimeUtil.f139150a.mo191623c(gregorianCalendar, gregorianCalendar2) && TimeUtil.f139150a.mo191624d(gregorianCalendar, gregorianCalendar2) && a.mo191608h()) {
            return FormatTimeHelper.f139156a.mo191633a(a2, date, date2, a);
        }
        if (TimeUtil.f139150a.mo191623c(gregorianCalendar, gregorianCalendar2)) {
            return FormatTimeHelper.f139156a.mo191636b(a2, date, date2, a);
        }
        return m219288d(a2, date, date2, a);
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m219286c(Context context, Date date, Date date2, Options aVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "startDate");
        Intrinsics.checkParameterIsNotNull(date2, "endDate");
        Options a = OptionsUtil.f139149a.mo191618a(aVar);
        Context a2 = ContextUtil.f139146a.mo191613a(context, a.mo191590a());
        HashMap hashMap = new HashMap();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(OptionsUtil.f139149a.mo191619a(a.mo191598b()));
        gregorianCalendar.setTime(date);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(OptionsUtil.f139149a.mo191619a(a.mo191598b()));
        gregorianCalendar2.setTime(date2);
        if (TimeUtil.f139150a.mo191623c(gregorianCalendar, gregorianCalendar2)) {
            return m219291f(a2, date, a);
        }
        String string = UIUtils.getString(a2, R.string.Calendar_StandardTime_GeneralDateTimeRangeWithoutWrap);
        if (a.mo191600c() == DisplayPattern.ABSOLUTE) {
            if (a.mo191602d() == LengthType.SHORT && !TimeUtil.f139150a.mo191622b(gregorianCalendar, gregorianCalendar2)) {
                a.mo191593a(LengthType.LONG);
            }
            HashMap hashMap2 = hashMap;
            hashMap2.put("startTime", m219291f(a2, date, a));
            hashMap2.put("endTime", m219291f(a2, date2, a));
            String mustacheFormat = UIHelper.mustacheFormat(string, hashMap2);
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…rgetTplString, formatMap)");
            return mustacheFormat;
        }
        TimeZone a3 = OptionsUtil.f139149a.mo191619a(a.mo191598b());
        GregorianCalendar gregorianCalendar3 = new GregorianCalendar(a3);
        if (!TimeUtil.f139150a.mo191622b(gregorianCalendar, gregorianCalendar3) || !TimeUtil.f139150a.mo191622b(gregorianCalendar2, gregorianCalendar3)) {
            z = true;
        } else {
            z = false;
        }
        HashMap hashMap3 = hashMap;
        hashMap3.put("startTime", FormatDateHelper.f139153a.mo191629a(a2, a3, z, gregorianCalendar, gregorianCalendar3, a.mo191611j(), a.mo191590a()));
        hashMap3.put("endTime", FormatDateHelper.f139153a.mo191629a(a2, a3, z, gregorianCalendar2, gregorianCalendar3, a.mo191611j(), a.mo191590a()));
        String mustacheFormat2 = UIHelper.mustacheFormat(string, hashMap3);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat2, "UIHelper.mustacheFormat(…rgetTplString, formatMap)");
        return mustacheFormat2;
    }

    /* renamed from: a */
    private final String m219282a(Context context, Date date, GregorianCalendar gregorianCalendar, Date date2, GregorianCalendar gregorianCalendar2, Options aVar) {
        String str;
        String str2;
        boolean z;
        Context a = ContextUtil.f139146a.mo191613a(context, aVar.mo191590a());
        String d = m219287d(a, date, aVar);
        String d2 = m219287d(a, date2, aVar);
        if (aVar.mo191600c() == DisplayPattern.ABSOLUTE) {
            if (aVar.mo191602d() == LengthType.SHORT && !TimeUtil.f139150a.mo191622b(gregorianCalendar, gregorianCalendar2)) {
                aVar.mo191593a(LengthType.LONG);
            }
            str2 = m219291f(a, date, aVar);
            str = m219291f(a, date2, aVar);
        } else {
            TimeZone a2 = OptionsUtil.f139149a.mo191619a(aVar.mo191598b());
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(a2);
            if (!TimeUtil.f139150a.mo191622b(gregorianCalendar, gregorianCalendar3) || !TimeUtil.f139150a.mo191622b(gregorianCalendar2, gregorianCalendar3)) {
                z = true;
            } else {
                z = false;
            }
            String a3 = FormatDateHelper.f139153a.mo191629a(a, a2, z, gregorianCalendar, gregorianCalendar3, aVar.mo191611j(), aVar.mo191590a());
            str = FormatDateHelper.f139153a.mo191629a(a, a2, z, gregorianCalendar2, gregorianCalendar3, aVar.mo191611j(), aVar.mo191590a());
            str2 = a3;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("startTime", m219279a(a, str2, d));
        hashMap.put("endTime", m219279a(a, str, d2));
        String mustacheFormat = UIHelper.mustacheFormat(UIUtils.getString(a, R.string.Calendar_StandardTime_GeneralDateTimeRangeWithoutWrap), hashMap);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…rgetTplString, formatMap)");
        return mustacheFormat;
    }
}
