package com.ss.android.lark.time.format.common;

import com.larksuite.framework.utils.C26280j;
import com.ss.android.lark.log.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ0\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J&\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ \u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/time/format/common/FormatUtil;", "", "()V", "TAG", "", "formatDateStr", "sdf", "Ljava/text/SimpleDateFormat;", "date", "Ljava/util/Date;", "generateStrByLocale", "tz", "Ljava/util/TimeZone;", "format", "isTimeOptimize", "", "locale", "Ljava/util/Locale;", "generateStrByTzAndFormat", "getFormatStrWithTimeOptimize", "time-format_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.time.format.a.b */
public final class FormatUtil {

    /* renamed from: a */
    public static final FormatUtil f139147a = new FormatUtil();

    private FormatUtil() {
    }

    /* renamed from: a */
    public final String mo191614a(SimpleDateFormat simpleDateFormat, Date date) {
        Intrinsics.checkParameterIsNotNull(simpleDateFormat, "sdf");
        Intrinsics.checkParameterIsNotNull(date, "date");
        try {
            String format = simpleDateFormat.format(date);
            Intrinsics.checkExpressionValueIsNotNull(format, "sdf.format(date)");
            return format;
        } catch (Exception unused) {
            Log.m165383e("FormatUtil", "format error!");
            return "";
        }
    }

    /* renamed from: a */
    private final String m219263a(Date date, TimeZone timeZone, String str) {
        String a = C26280j.m95170a(str, date.getTime(), timeZone);
        Intrinsics.checkExpressionValueIsNotNull(a, "Dates.format(format, date.time, tz)");
        return a;
    }

    /* renamed from: a */
    public final String mo191615a(Date date, TimeZone timeZone, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(date, "date");
        Intrinsics.checkParameterIsNotNull(timeZone, "tz");
        Intrinsics.checkParameterIsNotNull(str, "format");
        if (z) {
            return m219263a(date, timeZone, str);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        simpleDateFormat.setTimeZone(timeZone);
        return mo191614a(simpleDateFormat, date);
    }

    /* renamed from: a */
    public final String mo191616a(Date date, TimeZone timeZone, String str, boolean z, Locale locale) {
        String str2;
        Intrinsics.checkParameterIsNotNull(date, "date");
        Intrinsics.checkParameterIsNotNull(timeZone, "tz");
        Intrinsics.checkParameterIsNotNull(str, "format");
        if (locale == null) {
            return mo191615a(date, timeZone, str, z);
        }
        if (!z) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
            simpleDateFormat.setTimeZone(timeZone);
            str2 = mo191614a(simpleDateFormat, date);
        } else {
            str2 = C26280j.m95171a(str, date.getTime(), timeZone, locale);
        }
        Intrinsics.checkExpressionValueIsNotNull(str2, "if (!isTimeOptimize) {\n …tz, locale)\n            }");
        return str2;
    }
}
