package com.ss.android.lark.time.format.common;

import android.content.Context;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/time/format/common/TimezoneUtil;", "", "()V", "getTimeZoneStr", "", "context", "Landroid/content/Context;", "timezone", "Ljava/util/TimeZone;", "date", "Ljava/util/Date;", "isTimeZoneFormatAtBegin", "", "time-format_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.time.format.a.f */
public final class TimezoneUtil {

    /* renamed from: a */
    public static final TimezoneUtil f139151a = new TimezoneUtil();

    private TimezoneUtil() {
    }

    /* renamed from: a */
    public final boolean mo191626a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String string = UIUtils.getString(context, R.string.Calendar_StandardTime_TwelveHourOnTheHourWithMeridiemIndicator);
        Intrinsics.checkExpressionValueIsNotNull(string, "formatStr");
        String string2 = UIUtils.getString(context, R.string.Calendar_StandardTime_MeridiemFormat);
        Intrinsics.checkExpressionValueIsNotNull(string2, "UIUtils.getString(contex…ndardTime_MeridiemFormat)");
        return StringsKt.startsWith$default(string, string2, false, 2, (Object) null);
    }

    /* renamed from: a */
    public final String mo191625a(Context context, TimeZone timeZone, Date date) {
        int i;
        int i2;
        int i3;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(timeZone, "timezone");
        Intrinsics.checkParameterIsNotNull(date, "date");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(UIUtils.getString(context, R.string.Calendar_StandardTime_GMTFormatForAndroid), Locale.CHINA);
        simpleDateFormat.setTimeZone(timeZone);
        String a = FormatUtil.f139147a.mo191614a(simpleDateFormat, date);
        String str = a;
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "+", false, 2, (Object) null)) {
            i = StringsKt.indexOf$default((CharSequence) str, '+', 0, false, 6, (Object) null);
        } else if (StringsKt.contains$default((CharSequence) str, (CharSequence) "-", false, 2, (Object) null)) {
            i = StringsKt.indexOf$default((CharSequence) str, '-', 0, false, 6, (Object) null);
        } else {
            i = -1;
        }
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, ':', 0, false, 6, (Object) null);
        if (indexOf$default != -1 && (i3 = indexOf$default + 1) < a.length() && a.charAt(i3) == '0') {
            if (a != null) {
                a = a.substring(0, indexOf$default);
                Intrinsics.checkExpressionValueIsNotNull(a, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        StringBuilder sb = new StringBuilder(a);
        if (i != -1 && (i2 = i + 1) < a.length() && sb.charAt(i2) == '0') {
            sb.deleteCharAt(i2);
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "stringBuilder.toString()");
        return sb2;
    }
}
