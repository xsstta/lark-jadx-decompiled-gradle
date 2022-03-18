package com.ss.android.lark.time.format.helper;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.common.FormatUtil;
import com.ss.android.lark.time.format.common.OptionsUtil;
import com.ss.android.lark.time.format.common.TimeUtil;
import com.ss.android.lark.time.format.common.TimezoneUtil;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.utils.UIHelper;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J0\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J&\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rJ&\u0010\u0016\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rJ&\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ&\u0010\u0019\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/time/format/helper/FormatTimeHelper;", "", "()V", "TAG", "", "getTimeFormatForMinuteOrHour", "timePreciseness", "Lcom/ss/android/lark/time/format/entity/TimePreciseness;", "context", "Landroid/content/Context;", "minute", "", "opt", "Lcom/ss/android/lark/time/format/Options;", "isRemoveMeridiem", "", "getTimeFormatForSecond", "second", "getTimeRangeStrWithMeridiem", "startDate", "Ljava/util/Date;", "endDate", "getTimeRangeStrWithRemovePartMeridiem", "getTimeStrByDate", "date", "getTimeStrByGC", "gregorianCalendar", "Ljava/util/GregorianCalendar;", "time-format_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.time.format.b.c */
public final class FormatTimeHelper {

    /* renamed from: a */
    public static final FormatTimeHelper f139156a = new FormatTimeHelper();

    private FormatTimeHelper() {
    }

    /* renamed from: a */
    public final String mo191634a(Context context, Date date, boolean z, Options aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "date");
        Intrinsics.checkParameterIsNotNull(aVar, "opt");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(OptionsUtil.f139149a.mo191619a(aVar.mo191598b()));
        gregorianCalendar.setTime(date);
        return mo191635a(context, gregorianCalendar, z, aVar);
    }

    /* renamed from: b */
    public final String mo191636b(Context context, Date date, Date date2, Options aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "startDate");
        Intrinsics.checkParameterIsNotNull(date2, "endDate");
        Intrinsics.checkParameterIsNotNull(aVar, "opt");
        HashMap hashMap = new HashMap();
        hashMap.put("startTime", TimeFormatUtils.m219287d(context, date, aVar));
        hashMap.put("endTime", TimeFormatUtils.m219287d(context, date2, aVar));
        String mustacheFormat = UIHelper.mustacheFormat(UIUtils.getString(context, R.string.Calendar_StandardTime_GeneralDateTimeRangeWithoutWrap), hashMap);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…rgetTplString, formatMap)");
        return mustacheFormat;
    }

    /* renamed from: a */
    public final String mo191633a(Context context, Date date, Date date2, Options aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "startDate");
        Intrinsics.checkParameterIsNotNull(date2, "endDate");
        Intrinsics.checkParameterIsNotNull(aVar, "opt");
        HashMap hashMap = new HashMap();
        hashMap.put("startTime", mo191634a(context, date, !TimezoneUtil.f139151a.mo191626a(context), aVar));
        hashMap.put("endTime", mo191634a(context, date2, TimezoneUtil.f139151a.mo191626a(context), aVar));
        String mustacheFormat = UIHelper.mustacheFormat(UIUtils.getString(context, R.string.Calendar_StandardTime_GeneralDateTimeRangeWithoutWrap), hashMap);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…rgetTplString, formatMap)");
        return mustacheFormat;
    }

    /* renamed from: a */
    public final String mo191635a(Context context, GregorianCalendar gregorianCalendar, boolean z, Options aVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(gregorianCalendar, "gregorianCalendar");
        Intrinsics.checkParameterIsNotNull(aVar, "opt");
        TimeZone a = OptionsUtil.f139149a.mo191619a(aVar.mo191598b());
        int i = gregorianCalendar.get(12);
        int i2 = gregorianCalendar.get(13);
        int i3 = C56222d.f139157a[aVar.mo191606f().ordinal()];
        if (i3 == 1) {
            str = m219301a(context, i, i2, aVar, z);
        } else if (i3 == 2) {
            str = m219302a(TimePreciseness.MINUTE, context, i, aVar, z);
        } else if (i3 == 3) {
            TimeUtil.f139150a.mo191621a(gregorianCalendar, 0);
            str = m219302a(TimePreciseness.HOUR, context, i, aVar, z);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (!TextUtils.isEmpty(str)) {
            return FormatUtil.f139147a.mo191616a(new Date(gregorianCalendar.getTimeInMillis()), a, str, aVar.mo191611j(), aVar.mo191590a());
        }
        Log.m165383e("FormatTimePart", "formatTime formatStr is illegal!");
        return "";
    }

    /* renamed from: a */
    private final String m219302a(TimePreciseness timePreciseness, Context context, int i, Options aVar, boolean z) {
        boolean z2;
        if (aVar.mo191608h()) {
            if ((timePreciseness == TimePreciseness.MINUTE && i == 0) || timePreciseness == TimePreciseness.HOUR) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 || !aVar.mo191610i()) {
                if (z) {
                    String string = UIUtils.getString(context, R.string.Calendar_StandardTime_TwelveHourMinuteFormatWithoutMeridiemIndicator);
                    Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(contex…WithoutMeridiemIndicator)");
                    return string;
                }
                String string2 = UIUtils.getString(context, R.string.Calendar_StandardTime_TwelveHourMinuteFormatWithMeridiemIndicator);
                Intrinsics.checkExpressionValueIsNotNull(string2, "UIUtils.getString(contex…matWithMeridiemIndicator)");
                return string2;
            } else if (z) {
                String string3 = UIUtils.getString(context, R.string.Calendar_StandardTime_TwelveHourOnTheHourWithoutMeridiemIndicator);
                Intrinsics.checkExpressionValueIsNotNull(string3, "UIUtils.getString(contex…WithoutMeridiemIndicator)");
                return string3;
            } else {
                String string4 = UIUtils.getString(context, R.string.Calendar_StandardTime_TwelveHourOnTheHourWithMeridiemIndicator);
                Intrinsics.checkExpressionValueIsNotNull(string4, "UIUtils.getString(contex…ourWithMeridiemIndicator)");
                return string4;
            }
        } else {
            String string5 = UIUtils.getString(context, R.string.Calendar_StandardTime_TwentyFourHourWithMinute);
            Intrinsics.checkExpressionValueIsNotNull(string5, "UIUtils.getString(contex…TwentyFourHourWithMinute)");
            return string5;
        }
    }

    /* renamed from: a */
    private final String m219301a(Context context, int i, int i2, Options aVar, boolean z) {
        if (aVar.mo191608h()) {
            if (i2 == 0 && i == 0 && aVar.mo191610i()) {
                if (z) {
                    String string = UIUtils.getString(context, R.string.Calendar_StandardTime_TwelveHourOnTheHourWithoutMeridiemIndicator);
                    Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(contex…WithoutMeridiemIndicator)");
                    return string;
                }
                String string2 = UIUtils.getString(context, R.string.Calendar_StandardTime_TwelveHourOnTheHourWithMeridiemIndicator);
                Intrinsics.checkExpressionValueIsNotNull(string2, "UIUtils.getString(contex…ourWithMeridiemIndicator)");
                return string2;
            } else if (i2 != 0 || !aVar.mo191610i()) {
                if (z) {
                    String string3 = UIUtils.getString(context, R.string.Calendar_StandardTime_TwelveHourSecondFormatWithoutMeridiemIndicator);
                    Intrinsics.checkExpressionValueIsNotNull(string3, "UIUtils.getString(contex…WithoutMeridiemIndicator)");
                    return string3;
                }
                String string4 = UIUtils.getString(context, R.string.Calendar_StandardTime_TwelveHourSecondFormatWithMeridiemIndicator);
                Intrinsics.checkExpressionValueIsNotNull(string4, "UIUtils.getString(contex…matWithMeridiemIndicator)");
                return string4;
            } else if (z) {
                String string5 = UIUtils.getString(context, R.string.Calendar_StandardTime_TwelveHourMinuteFormatWithoutMeridiemIndicator);
                Intrinsics.checkExpressionValueIsNotNull(string5, "UIUtils.getString(contex…WithoutMeridiemIndicator)");
                return string5;
            } else {
                String string6 = UIUtils.getString(context, R.string.Calendar_StandardTime_TwelveHourMinuteFormatWithMeridiemIndicator);
                Intrinsics.checkExpressionValueIsNotNull(string6, "UIUtils.getString(contex…matWithMeridiemIndicator)");
                return string6;
            }
        } else if (i2 != 0 || !aVar.mo191610i()) {
            String string7 = UIUtils.getString(context, R.string.Calendar_StandardTime_TwentyFourHourWithSecond);
            Intrinsics.checkExpressionValueIsNotNull(string7, "UIUtils.getString(contex…TwentyFourHourWithSecond)");
            return string7;
        } else {
            String string8 = UIUtils.getString(context, R.string.Calendar_StandardTime_TwentyFourHourWithMinute);
            Intrinsics.checkExpressionValueIsNotNull(string8, "UIUtils.getString(contex…TwentyFourHourWithMinute)");
            return string8;
        }
    }
}
