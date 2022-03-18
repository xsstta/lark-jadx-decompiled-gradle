package com.ss.android.lark.time.format.helper;

import android.content.Context;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.common.FormatUtil;
import com.ss.android.lark.time.format.common.TimeUtil;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.utils.UIHelper;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ&\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ&\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ@\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J@\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J(\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0002J&\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/time/format/helper/FormatDateHelper;", "", "()V", "getAbsoluteDateStr", "", "context", "Landroid/content/Context;", "date", "Ljava/util/Date;", "opt", "Lcom/ss/android/lark/time/format/Options;", "timezone", "Ljava/util/TimeZone;", "getAbsoluteFullDateStr", "getRelativeDateStr", "comparedGC", "Ljava/util/GregorianCalendar;", "currentGC", "isOptimize", "", "locale", "Ljava/util/Locale;", "getRelativeFullDateStr", "isShowYear", "isTimeOptimize", "getRelativeWeekStr", "currentDate", "comparedDate", "getSingleRelativeFullDateStr", "time-format_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.time.format.b.a */
public final class FormatDateHelper {

    /* renamed from: a */
    public static final FormatDateHelper f139153a = new FormatDateHelper();

    private FormatDateHelper() {
    }

    /* renamed from: b */
    public final String mo191630b(Context context, Date date, Options aVar, TimeZone timeZone) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "date");
        Intrinsics.checkParameterIsNotNull(aVar, "opt");
        Intrinsics.checkParameterIsNotNull(timeZone, "timezone");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.setTime(date);
        return mo191628a(context, date, timeZone, gregorianCalendar, new GregorianCalendar(timeZone), aVar.mo191611j(), aVar.mo191590a());
    }

    /* renamed from: d */
    public final String mo191632d(Context context, Date date, Options aVar, TimeZone timeZone) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "date");
        Intrinsics.checkParameterIsNotNull(aVar, "opt");
        Intrinsics.checkParameterIsNotNull(timeZone, "timezone");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.setTime(date);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
        return mo191629a(context, timeZone, !TimeUtil.f139150a.mo191622b(gregorianCalendar, gregorianCalendar2), gregorianCalendar, gregorianCalendar2, aVar.mo191611j(), aVar.mo191590a());
    }

    /* renamed from: a */
    private final String m219294a(Context context, GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2, TimeZone timeZone) {
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
            return TimeFormatUtils.m219283b(context, date, new Options(id, null, LengthType.SHORT, null, null, false, false, false, false, 506, null));
        } else {
            String string3 = UIUtils.getString(context, R.string.Calendar_StandardTime_RelativeDayYesterday);
            Intrinsics.checkExpressionValueIsNotNull(string3, "UIUtils.getString(contex…ime_RelativeDayYesterday)");
            return string3;
        }
    }

    /* renamed from: a */
    public final String mo191627a(Context context, Date date, Options aVar, TimeZone timeZone) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "date");
        Intrinsics.checkParameterIsNotNull(aVar, "opt");
        Intrinsics.checkParameterIsNotNull(timeZone, "timezone");
        if (aVar.mo191602d() == LengthType.SHORT) {
            int i = C56221b.f139154a[aVar.mo191604e().ordinal()];
            if (i == 1) {
                aVar.mo191593a(LengthType.LONG);
                return TimeFormatUtils.m219285c(context, date, aVar);
            } else if (i == 2) {
                FormatUtil bVar = FormatUtil.f139147a;
                String string = UIUtils.getString(context, R.string.Calendar_StandardTime_MonthDayCombineFormat);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(contex…me_MonthDayCombineFormat)");
                return bVar.mo191616a(date, timeZone, string, aVar.mo191611j(), aVar.mo191590a());
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int i2 = C56221b.f139155b[aVar.mo191604e().ordinal()];
            if (i2 == 1) {
                FormatUtil bVar2 = FormatUtil.f139147a;
                String string2 = UIUtils.getString(context, R.string.Calendar_StandardTime_YearMonthCombineFormat);
                Intrinsics.checkExpressionValueIsNotNull(string2, "UIUtils.getString(contex…e_YearMonthCombineFormat)");
                return bVar2.mo191616a(date, timeZone, string2, aVar.mo191611j(), aVar.mo191590a());
            } else if (i2 == 2) {
                FormatUtil bVar3 = FormatUtil.f139147a;
                String string3 = UIUtils.getString(context, R.string.Calendar_StandardTime_YearMonthDayCombineFormat);
                Intrinsics.checkExpressionValueIsNotNull(string3, "UIUtils.getString(contex…earMonthDayCombineFormat)");
                return bVar3.mo191616a(date, timeZone, string3, aVar.mo191611j(), aVar.mo191590a());
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* renamed from: c */
    public final String mo191631c(Context context, Date date, Options aVar, TimeZone timeZone) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "date");
        Intrinsics.checkParameterIsNotNull(aVar, "opt");
        Intrinsics.checkParameterIsNotNull(timeZone, "timezone");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "timezone.id");
        String a = mo191627a(context, date, new Options(id, null, aVar.mo191602d(), DatePreciseness.DAY, null, false, false, false, aVar.mo191611j(), aVar.mo191590a(), 242, null), timeZone);
        String id2 = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id2, "timezone.id");
        String b = TimeFormatUtils.m219283b(context, date, new Options(id2, null, LengthType.SHORT, null, null, false, false, false, false, aVar.mo191590a(), 506, null));
        HashMap hashMap = new HashMap();
        hashMap.put("date", a);
        hashMap.put("relativeDay", b);
        String mustacheFormat = UIHelper.mustacheFormat(UIUtils.getString(context, R.string.Calendar_StandardTime_DateRelativeDayCombineFormat), hashMap);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…rgetTplString, formatMap)");
        return mustacheFormat;
    }

    /* renamed from: a */
    public final String mo191628a(Context context, Date date, TimeZone timeZone, GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2, boolean z, Locale locale) {
        LengthType lengthType;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "date");
        Intrinsics.checkParameterIsNotNull(timeZone, "timezone");
        Intrinsics.checkParameterIsNotNull(gregorianCalendar, "comparedGC");
        Intrinsics.checkParameterIsNotNull(gregorianCalendar2, "currentGC");
        int a = TimeUtil.f139150a.mo191620a(gregorianCalendar2, gregorianCalendar);
        if (a == -1) {
            String string = UIUtils.getString(context, R.string.Calendar_StandardTime_RelativeDayTomorrow);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(contex…Time_RelativeDayTomorrow)");
            return string;
        } else if (a == 0) {
            String string2 = UIUtils.getString(context, R.string.Calendar_StandardTime_RelativeDayToday);
            Intrinsics.checkExpressionValueIsNotNull(string2, "UIUtils.getString(contex…ardTime_RelativeDayToday)");
            return string2;
        } else if (a != 1) {
            if (TimeUtil.f139150a.mo191622b(gregorianCalendar, gregorianCalendar2)) {
                lengthType = LengthType.SHORT;
            } else {
                lengthType = LengthType.LONG;
            }
            String id = timeZone.getID();
            Intrinsics.checkExpressionValueIsNotNull(id, "timezone.id");
            return mo191627a(context, date, new Options(id, null, lengthType, DatePreciseness.DAY, null, false, false, false, z, locale, 242, null), timeZone);
        } else {
            String string3 = UIUtils.getString(context, R.string.Calendar_StandardTime_RelativeDayYesterday);
            Intrinsics.checkExpressionValueIsNotNull(string3, "UIUtils.getString(contex…ime_RelativeDayYesterday)");
            return string3;
        }
    }

    /* renamed from: a */
    public final String mo191629a(Context context, TimeZone timeZone, boolean z, GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2, boolean z2, Locale locale) {
        LengthType lengthType;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(timeZone, "timezone");
        Intrinsics.checkParameterIsNotNull(gregorianCalendar, "comparedGC");
        Intrinsics.checkParameterIsNotNull(gregorianCalendar2, "currentGC");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "timezone.id");
        DisplayPattern displayPattern = DisplayPattern.ABSOLUTE;
        if (z) {
            lengthType = LengthType.LONG;
        } else {
            lengthType = LengthType.SHORT;
        }
        Options aVar = new Options(id, displayPattern, lengthType, DatePreciseness.DAY, null, false, false, false, z2, locale, 240, null);
        HashMap hashMap = new HashMap();
        hashMap.put("date", mo191627a(context, new Date(gregorianCalendar.getTimeInMillis()), aVar, timeZone));
        hashMap.put("relativeDay", m219294a(context, gregorianCalendar2, gregorianCalendar, timeZone));
        String mustacheFormat = UIHelper.mustacheFormat(UIUtils.getString(context, R.string.Calendar_StandardTime_DateRelativeDayCombineFormat), hashMap);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…rgetTplString, formatMap)");
        return mustacheFormat;
    }
}
