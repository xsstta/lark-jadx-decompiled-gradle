package com.ss.android.lark.mm.utils;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.utils.C57851l;
import com.ss.android.lark.utils.UIHelper;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0007J\u0006\u0010\r\u001a\u00020\nJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mm/utils/MmDateUtil;", "", "()V", "DAY_TS", "", "HOUR_TS", "MINUTE_TS", "formatCommentTime", "", "timeStamp", "", "formatRecordTime", "timeInMs", "getStartTimeOfTodayDay", "is24Hour", "", "isLocalEn", "transferTime", "timeInSec", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.utils.e */
public final class MmDateUtil {

    /* renamed from: a */
    public static final MmDateUtil f118615a = new MmDateUtil();

    private MmDateUtil() {
    }

    /* renamed from: a */
    private final boolean m186538a() {
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45895u userSettingDependency = a.getUserSettingDependency();
        Intrinsics.checkExpressionValueIsNotNull(userSettingDependency, "MmDepend.impl().userSettingDependency");
        return userSettingDependency.mo144668a();
    }

    /* renamed from: b */
    private final boolean m186540b() {
        String str;
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45882j languageDependency = a.getLanguageDependency();
        Intrinsics.checkExpressionValueIsNotNull(languageDependency, "MmDepend.impl().languageDependency");
        Locale b = languageDependency.mo144666b();
        if (b != null) {
            str = b.getLanguage();
        } else {
            str = null;
        }
        Locale locale = Locale.ENGLISH;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ENGLISH");
        return TextUtils.equals(str, locale.getLanguage());
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m186536a(int i) {
        int i2 = i / 3600;
        int i3 = (i % 3600) / 60;
        int i4 = i % 60;
        if (i2 > 0) {
            StringCompanionObject mVar = StringCompanionObject.f173215a;
            Locale locale = Locale.CHINA;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.CHINA");
            String format = String.format(locale, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, 3));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(locale, format, *args)");
            return format;
        }
        StringCompanionObject mVar2 = StringCompanionObject.f173215a;
        Locale locale2 = Locale.CHINA;
        Intrinsics.checkExpressionValueIsNotNull(locale2, "Locale.CHINA");
        String format2 = String.format(locale2, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)}, 2));
        Intrinsics.checkExpressionValueIsNotNull(format2, "java.lang.String.format(locale, format, *args)");
        return format2;
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m186539b(long j) {
        long j2 = j / 3600000;
        long j3 = j - (3600000 * j2);
        long j4 = j3 / 60000;
        long j5 = (j3 - (60000 * j4)) / 1000;
        if (j2 > 0) {
            StringCompanionObject mVar = StringCompanionObject.f173215a;
            Locale locale = Locale.CHINA;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.CHINA");
            String format = String.format(locale, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j4), Long.valueOf(j5)}, 3));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(locale, format, *args)");
            return format;
        }
        StringCompanionObject mVar2 = StringCompanionObject.f173215a;
        Locale locale2 = Locale.CHINA;
        Intrinsics.checkExpressionValueIsNotNull(locale2, "Locale.CHINA");
        String format2 = String.format(locale2, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j5)}, 2));
        Intrinsics.checkExpressionValueIsNotNull(format2, "java.lang.String.format(locale, format, *args)");
        return format2;
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m186537a(long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        long j2 = (long) CalendarSearchResultRv.f82652c;
        if (currentTimeMillis < j2) {
            String string = C45851c.m181646a().getString(R.string.MMWeb_G_JustNow);
            Intrinsics.checkExpressionValueIsNotNull(string, "MmContext.getContext().g…R.string.MMWeb_G_JustNow)");
            return string;
        }
        long j3 = (long) 3600000;
        if (currentTimeMillis <= j3) {
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.MMWeb_G_MinutesAgo, "number", String.valueOf(currentTimeMillis / j2));
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(… / MINUTE_TS).toString())");
            return mustacheFormat;
        } else if (currentTimeMillis <= ((long) 86400000)) {
            String mustacheFormat2 = UIHelper.mustacheFormat((int) R.string.MMWeb_G_HoursAgo, "number", String.valueOf(currentTimeMillis / j3));
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat2, "UIHelper.mustacheFormat(…ff / HOUR_TS).toString())");
            return mustacheFormat2;
        } else {
            Context a = C45851c.m181646a();
            Date date = new Date(j);
            MmDateUtil eVar = f118615a;
            String a2 = C57851l.m224547a(a, date, eVar.m186538a(), eVar.m186540b());
            Intrinsics.checkExpressionValueIsNotNull(a2, "DateTimeUtils.getChatWin…             isLocalEn())");
            return a2;
        }
    }
}
