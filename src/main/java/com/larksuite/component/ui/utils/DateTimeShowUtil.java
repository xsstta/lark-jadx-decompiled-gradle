package com.larksuite.component.ui.utils;

import com.larksuite.framework.utils.C26280j;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/larksuite/component/ui/utils/DateTimeShowUtil;", "", "()V", "LONG_TIME_FORMAT", "", "getLONG_TIME_FORMAT", "()Ljava/lang/String;", "TWELVE_TIME_FORMAT_LONG_CHI", "getTWELVE_TIME_FORMAT_LONG_CHI", "TWELVE_TIME_FORMAT_LONG_ENG", "getTWELVE_TIME_FORMAT_LONG_ENG", "generateStrByTime", "date", "", "tz", "Ljava/util/TimeZone;", "is24Hour", "", "isEn", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.f.a */
public final class DateTimeShowUtil {

    /* renamed from: a */
    public static final DateTimeShowUtil f62632a = new DateTimeShowUtil();

    /* renamed from: b */
    private static final String f62633b = f62633b;

    /* renamed from: c */
    private static final String f62634c = f62634c;

    /* renamed from: d */
    private static final String f62635d = f62635d;

    private DateTimeShowUtil() {
    }

    /* renamed from: a */
    public final String mo89315a(long j, TimeZone timeZone, boolean z, boolean z2) {
        String str;
        Intrinsics.checkParameterIsNotNull(timeZone, "tz");
        if (z) {
            str = f62635d;
        } else if (z2) {
            str = f62633b;
        } else {
            str = f62634c;
        }
        String a = C26280j.m95170a(str, j, timeZone);
        Intrinsics.checkExpressionValueIsNotNull(a, "Dates.format(format, date, tz)");
        return a;
    }
}
