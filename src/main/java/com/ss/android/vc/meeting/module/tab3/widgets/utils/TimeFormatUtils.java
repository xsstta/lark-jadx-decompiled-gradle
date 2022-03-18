package com.ss.android.vc.meeting.module.tab3.widgets.utils;

import android.content.Context;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.common.ContextUtil;
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
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ0\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u000bJ(\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ0\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rJ(\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rJ \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rJ0\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u000bJ@\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\rH\u0002J0\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\rH\u0002J \u0010 \u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rJ \u0010!\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rJ@\u0010\"\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\rH\u0002J0\u0010#\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\rH\u0002J \u0010$\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rJ0\u0010%\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ(\u0010&\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0002J \u0010(\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rJJ\u0010)\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u000101H\u0002J(\u00102\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab3/widgets/utils/TimeFormatUtils;", "", "()V", "TAG", "", "formatDate", "context", "Landroid/content/Context;", "date", "Ljava/util/Date;", "isShowWeek", "", "options", "Lcom/ss/android/lark/time/format/Options;", "formatDateRange", "startDate", "endDate", "formatDateTime", "formatDateTimeRange", "formatDateTimeStr", "dateFormatString", "timeFormatString", "formatFullDate", "formatFullDateRange", "formatFullDateTime", "formatFullDateTimeRange", "formatFullNotSameDayRange", "startGC", "Ljava/util/GregorianCalendar;", "endGC", "opt", "formatFullSameDayRange", "formatMeridiem", "formatMonth", "formatNotSameDayRange", "formatSameDayRange", "formatTime", "formatTimeRange", "formatTimeZoneString", "dateTimeString", "formatWeekDay", "getRelativeFullDateStr", "timezone", "Ljava/util/TimeZone;", "isShowYear", "comparedGC", "currentGC", "isTimeOptimize", "locale", "Ljava/util/Locale;", "getRelativeWeekStr", "currentDate", "comparedDate", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.tab3.widgets.a.d */
public final class TimeFormatUtils {

    /* renamed from: a */
    public static final TimeFormatUtils f160211a = new TimeFormatUtils();

    private TimeFormatUtils() {
    }

    /* renamed from: a */
    public final String mo219468a(Context context, Date date, boolean z, Options aVar) {
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

    /* renamed from: b */
    public final String mo219469b(Context context, Date date, Options aVar) {
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
    private final String m248543a(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("relativeDate", str);
        hashMap.put("time", str2);
        String mustacheFormat = UIHelper.mustacheFormat(UIUtils.getString(context, R.string.Calendar_StandardTime_RelativeDateTimeCombineFormat), hashMap);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…etTplString, datetimeMap)");
        return mustacheFormat;
    }

    /* renamed from: c */
    public final String mo219472c(Context context, Date date, Options aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "date");
        Options a = OptionsUtil.f139149a.mo191618a(aVar);
        Context a2 = ContextUtil.f139146a.mo191613a(context, a.mo191590a());
        a.mo191591a(DatePreciseness.DAY);
        HashMap hashMap = new HashMap();
        hashMap.put("relativeDate", mo219469b(a2, date, a));
        hashMap.put("time", mo219466a(a2, date, a));
        String mustacheFormat = UIHelper.mustacheFormat(UIUtils.getString(a2, R.string.Calendar_StandardTime_RelativeDateTimeCombineFormat), hashMap);
        if (a.mo191607g()) {
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "dateTimeStr");
            return m248542a(a2, mustacheFormat, a, date);
        }
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "dateTimeStr");
        return mustacheFormat;
    }

    /* renamed from: a */
    public final String mo219466a(Context context, Date date, Options aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "date");
        Options a = OptionsUtil.f139149a.mo191618a(aVar);
        return FormatTimeHelper.f139156a.mo191634a(ContextUtil.f139146a.mo191613a(context, a.mo191590a()), date, false, a);
    }

    /* renamed from: a */
    private final String m248542a(Context context, String str, Options aVar, Date date) {
        Context a = ContextUtil.f139146a.mo191613a(context, aVar.mo191590a());
        HashMap hashMap = new HashMap();
        hashMap.put("timeString", str);
        hashMap.put("GMT", TimezoneUtil.f139151a.mo191625a(a, OptionsUtil.f139149a.mo191619a(aVar.mo191598b()), date));
        String mustacheFormat = UIHelper.mustacheFormat(UIUtils.getString(a, R.string.Calendar_StandardTime_TimeStringWithGMT), hashMap);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…etTplString, timezoneMap)");
        return mustacheFormat;
    }

    /* renamed from: b */
    public final String mo219471b(Context context, Date date, boolean z, Options aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "date");
        Options a = OptionsUtil.f139149a.mo191618a(aVar);
        Context a2 = ContextUtil.f139146a.mo191613a(context, a.mo191590a());
        a.mo191591a(DatePreciseness.DAY);
        HashMap hashMap = new HashMap();
        String string = UIUtils.getString(a2, R.string.Calendar_StandardTime_RelativeDateTimeCombineFormat);
        if (a.mo191600c() == DisplayPattern.ABSOLUTE) {
            HashMap hashMap2 = hashMap;
            hashMap2.put("relativeDate", mo219468a(a2, date, z, a));
            hashMap2.put("time", mo219466a(a2, date, a));
            String mustacheFormat = UIHelper.mustacheFormat(string, hashMap2);
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…rgetTplString, formatMap)");
            return mustacheFormat;
        }
        TimeZone a3 = OptionsUtil.f139149a.mo191619a(a.mo191598b());
        GregorianCalendar gregorianCalendar = new GregorianCalendar(a3);
        gregorianCalendar.setTime(date);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(a3);
        if (a.mo191602d() != LengthType.LONG) {
            return FormatDateHelper.f139153a.mo191628a(a2, date, a3, gregorianCalendar, gregorianCalendar2, a.mo191611j(), a.mo191590a());
        }
        HashMap hashMap3 = hashMap;
        hashMap3.put("relativeDate", mo219468a(a2, date, z, a));
        hashMap3.put("time", mo219466a(a2, date, a));
        String mustacheFormat2 = UIHelper.mustacheFormat(string, hashMap3);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat2, "UIHelper.mustacheFormat(…rgetTplString, formatMap)");
        return mustacheFormat2;
    }

    /* renamed from: a */
    private final String m248545a(Context context, GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2, TimeZone timeZone) {
        int a = TimeUtil.f139150a.mo191620a(gregorianCalendar, gregorianCalendar2);
        if (a == -1) {
            String string = UIUtils.getString(context, R.string.Calendar_StandardTime_RelativeDayTomorrow);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(contex…Time_RelativeDayTomorrow)");
            return string;
        } else if (a == 0) {
            String string2 = UIUtils.getString(context, R.string.Calendar_StandardTime_RelativeDayToday);
            Intrinsics.checkExpressionValueIsNotNull(string2, "UIUtils.getString(contex…ardTime_RelativeDayToday)");
            return string2;
        } else if (a != 1) {
            Date date = new Date(gregorianCalendar2.getTimeInMillis());
            String id = timeZone.getID();
            Intrinsics.checkExpressionValueIsNotNull(id, "timezone.id");
            return com.ss.android.lark.time.format.TimeFormatUtils.m219283b(context, date, new Options(id, null, LengthType.SHORT, null, null, false, false, false, false, 506, null));
        } else {
            String string3 = UIUtils.getString(context, R.string.Calendar_StandardTime_RelativeDayYesterday);
            Intrinsics.checkExpressionValueIsNotNull(string3, "UIUtils.getString(contex…ime_RelativeDayYesterday)");
            return string3;
        }
    }

    /* renamed from: c */
    private final String m248547c(Context context, Date date, Date date2, boolean z, Options aVar) {
        Context a = ContextUtil.f139146a.mo191613a(context, aVar.mo191590a());
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put("relativeDate", mo219469b(a, date, aVar));
        } else {
            hashMap.put("relativeDate", mo219468a(a, date, z, aVar));
        }
        HashMap hashMap2 = hashMap;
        hashMap2.put("time", mo219467a(a, date, date2, z, aVar));
        String mustacheFormat = UIHelper.mustacheFormat(UIUtils.getString(a, R.string.Calendar_StandardTime_RelativeDateTimeCombineFormat), hashMap2);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…getTplString, sameDayMap)");
        return mustacheFormat;
    }

    /* renamed from: b */
    public final String mo219470b(Context context, Date date, Date date2, boolean z, Options aVar) {
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
            str = m248547c(a2, date, date2, z, a);
        } else {
            str = m248544a(a2, date, gregorianCalendar, date2, gregorianCalendar2, z, a);
        }
        if (a.mo191607g()) {
            return m248542a(a2, str, a, date);
        }
        return str;
    }

    /* renamed from: a */
    public final String mo219467a(Context context, Date date, Date date2, boolean z, Options aVar) {
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
        return mo219470b(a2, date, date2, z, a);
    }

    /* renamed from: a */
    private final String m248544a(Context context, Date date, GregorianCalendar gregorianCalendar, Date date2, GregorianCalendar gregorianCalendar2, boolean z, Options aVar) {
        String str;
        String str2;
        boolean z2;
        Context a = ContextUtil.f139146a.mo191613a(context, aVar.mo191590a());
        String a2 = mo219466a(a, date, aVar);
        String a3 = mo219466a(a, date2, aVar);
        if (aVar.mo191600c() == DisplayPattern.ABSOLUTE) {
            if (aVar.mo191602d() == LengthType.SHORT && !TimeUtil.f139150a.mo191622b(gregorianCalendar, gregorianCalendar2)) {
                aVar.mo191593a(LengthType.LONG);
            }
            str2 = mo219468a(a, date, z, aVar);
            str = mo219468a(a, date2, z, aVar);
        } else {
            TimeZone a4 = OptionsUtil.f139149a.mo191619a(aVar.mo191598b());
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(a4);
            if (!TimeUtil.f139150a.mo191622b(gregorianCalendar, gregorianCalendar3) || !TimeUtil.f139150a.mo191622b(gregorianCalendar2, gregorianCalendar3)) {
                z2 = true;
            } else {
                z2 = false;
            }
            String a5 = m248546a(a, a4, z2, z, gregorianCalendar, gregorianCalendar3, aVar.mo191611j(), aVar.mo191590a());
            str = m248546a(a, a4, z2, z, gregorianCalendar2, gregorianCalendar3, aVar.mo191611j(), aVar.mo191590a());
            str2 = a5;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("startTime", m248543a(a, str2, a2));
        hashMap.put("endTime", m248543a(a, str, a3));
        String mustacheFormat = UIHelper.mustacheFormat(UIUtils.getString(a, R.string.Calendar_StandardTime_GeneralDateTimeRangeWithoutWrap), hashMap);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…rgetTplString, formatMap)");
        return mustacheFormat;
    }

    /* renamed from: a */
    private final String m248546a(Context context, TimeZone timeZone, boolean z, boolean z2, GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2, boolean z3, Locale locale) {
        LengthType lengthType;
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "timezone.id");
        DisplayPattern displayPattern = DisplayPattern.ABSOLUTE;
        if (z) {
            lengthType = LengthType.LONG;
        } else {
            lengthType = LengthType.SHORT;
        }
        Options aVar = new Options(id, displayPattern, lengthType, DatePreciseness.DAY, null, false, false, false, z3, locale, 240, null);
        HashMap hashMap = new HashMap();
        hashMap.put("date", FormatDateHelper.f139153a.mo191627a(context, new Date(gregorianCalendar.getTimeInMillis()), aVar, timeZone));
        hashMap.put("relativeDay", m248545a(context, gregorianCalendar2, gregorianCalendar, timeZone));
        String string = UIUtils.getString(context, R.string.Calendar_StandardTime_DateRelativeDayCombineFormat);
        if (!z2) {
            return FormatDateHelper.f139153a.mo191627a(context, new Date(gregorianCalendar.getTimeInMillis()), aVar, timeZone);
        }
        String mustacheFormat = UIHelper.mustacheFormat(string, hashMap);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…rgetTplString, formatMap)");
        return mustacheFormat;
    }
}
