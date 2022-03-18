package com.ss.android.lark.mm.utils;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.utils.ResString;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\nH\u0002J\b\u0010\u0018\u001a\u00020\nH\u0002J\b\u0010\u0019\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mm/utils/FormatUtil;", "", "()V", "HOURS_2", "", "HOUR_1", "MINUTES_2", "MINUTE_1", "dateFormatter", "", "", "dateFormatterOfCreated", "dateFormatterOfThisYear", "formatDate", "timestamp", "", "(Ljava/lang/Long;)Ljava/lang/String;", "formatDateCreated", "formatDuration", "seconds", "formatSpeed", "speed", "", "getDateFormatter", "getDateFormatterCreated", "getDateFormatterOfThisYear", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.utils.c */
public final class FormatUtil {

    /* renamed from: a */
    public static final FormatUtil f118607a = new FormatUtil();

    /* renamed from: b */
    private static final int f118608b = 60000;

    /* renamed from: c */
    private static final int f118609c = f118609c;

    /* renamed from: d */
    private static final int f118610d = f118610d;

    /* renamed from: e */
    private static final int f118611e = f118611e;

    /* renamed from: f */
    private static final Map<String, String> f118612f;

    /* renamed from: g */
    private static final Map<String, String> f118613g;

    /* renamed from: h */
    private static final Map<String, String> f118614h;

    private FormatUtil() {
    }

    /* renamed from: a */
    private final String m186527a() {
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45882j languageDependency = a.getLanguageDependency();
        Intrinsics.checkExpressionValueIsNotNull(languageDependency, "MmDepend.impl().languageDependency");
        Locale b = languageDependency.mo144666b();
        Intrinsics.checkExpressionValueIsNotNull(b, "MmDepend.impl().languageDependency.languageSetting");
        String language = b.getLanguage();
        Map<String, String> map = f118614h;
        String str = map.get(language);
        if (str != null) {
            return str;
        }
        Locale locale = Locale.CHINESE;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.CHINESE");
        String str2 = map.get(locale.getLanguage());
        if (str2 != null) {
            return str2;
        }
        return "";
    }

    /* renamed from: b */
    private final String m186528b() {
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45882j languageDependency = a.getLanguageDependency();
        Intrinsics.checkExpressionValueIsNotNull(languageDependency, "MmDepend.impl().languageDependency");
        Locale b = languageDependency.mo144666b();
        Intrinsics.checkExpressionValueIsNotNull(b, "MmDepend.impl().languageDependency.languageSetting");
        String language = b.getLanguage();
        Map<String, String> map = f118612f;
        String str = map.get(language);
        if (str != null) {
            return str;
        }
        Locale locale = Locale.CHINESE;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.CHINESE");
        String str2 = map.get(locale.getLanguage());
        if (str2 != null) {
            return str2;
        }
        return "";
    }

    /* renamed from: c */
    private final String m186529c() {
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45882j languageDependency = a.getLanguageDependency();
        Intrinsics.checkExpressionValueIsNotNull(languageDependency, "MmDepend.impl().languageDependency");
        Locale b = languageDependency.mo144666b();
        Intrinsics.checkExpressionValueIsNotNull(b, "MmDepend.impl().languageDependency.languageSetting");
        String language = b.getLanguage();
        Map<String, String> map = f118613g;
        String str = map.get(language);
        if (str != null) {
            return str;
        }
        Locale locale = Locale.CHINESE;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.CHINESE");
        String str2 = map.get(locale.getLanguage());
        if (str2 != null) {
            return str2;
        }
        return "";
    }

    static {
        Locale locale = Locale.CHINESE;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.CHINESE");
        Locale locale2 = Locale.ENGLISH;
        Intrinsics.checkExpressionValueIsNotNull(locale2, "Locale.ENGLISH");
        Locale locale3 = Locale.JAPANESE;
        Intrinsics.checkExpressionValueIsNotNull(locale3, "Locale.JAPANESE");
        f118612f = MapsKt.mapOf(new Pair(locale.getLanguage(), "M月d日 H:mm"), new Pair(locale2.getLanguage(), "MMM d, H:mm"), new Pair(locale3.getLanguage(), "M月d日 H:mm"));
        Locale locale4 = Locale.CHINESE;
        Intrinsics.checkExpressionValueIsNotNull(locale4, "Locale.CHINESE");
        Locale locale5 = Locale.ENGLISH;
        Intrinsics.checkExpressionValueIsNotNull(locale5, "Locale.ENGLISH");
        Locale locale6 = Locale.JAPANESE;
        Intrinsics.checkExpressionValueIsNotNull(locale6, "Locale.JAPANESE");
        f118613g = MapsKt.mapOf(new Pair(locale4.getLanguage(), "yyyy年M月d日"), new Pair(locale5.getLanguage(), "MMM d, yyyy"), new Pair(locale6.getLanguage(), "yyyy年M月d日"));
        Locale locale7 = Locale.CHINESE;
        Intrinsics.checkExpressionValueIsNotNull(locale7, "Locale.CHINESE");
        Locale locale8 = Locale.ENGLISH;
        Intrinsics.checkExpressionValueIsNotNull(locale8, "Locale.ENGLISH");
        Locale locale9 = Locale.JAPANESE;
        Intrinsics.checkExpressionValueIsNotNull(locale9, "Locale.JAPANESE");
        f118614h = MapsKt.mapOf(new Pair(locale7.getLanguage(), "yyyy年M月d日 a h:mm"), new Pair(locale8.getLanguage(), "MMM d, yyyy h:mm a"), new Pair(locale9.getLanguage(), "yyyy年M月d日 a h:mm"));
    }

    /* renamed from: a */
    public final String mo165482a(float f) {
        DecimalFormat decimalFormat;
        if (f == 1.0f) {
            decimalFormat = new DecimalFormat("0.0");
        } else {
            decimalFormat = new DecimalFormat("0.##");
        }
        decimalFormat.setRoundingMode(RoundingMode.FLOOR);
        String format = decimalFormat.format(Float.valueOf(f));
        Intrinsics.checkExpressionValueIsNotNull(format, "format.format(speed)");
        return format;
    }

    /* renamed from: a */
    public final String mo165483a(Long l) {
        if (l != null && l.longValue() > 0) {
            try {
                return new SimpleDateFormat(m186527a()).format(new Date(l.longValue()));
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* renamed from: b */
    public final String mo165484b(Long l) {
        if (l != null && l.longValue() > 0) {
            Date date = new Date(l.longValue());
            Date date2 = new Date();
            try {
                if (date2.getYear() != date.getYear()) {
                    return new SimpleDateFormat(m186529c()).format(date);
                }
                int month = date2.getMonth() - date.getMonth();
                int date3 = date2.getDate() - date.getDate();
                if (month <= 0) {
                    if (date3 < 2) {
                        if (date3 == 1) {
                            return ResString.f118656a.mo165504a(R.string.MMWeb_G_Yesterday) + new SimpleDateFormat(" H:mm").format(date);
                        }
                        long time = date2.getTime() - l.longValue();
                        int i = f118608b;
                        if (time < ((long) i)) {
                            IMmDepend a = C45899c.m181859a();
                            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
                            IMmDepend.AbstractC45871b contextDepend = a.getContextDepend();
                            Intrinsics.checkExpressionValueIsNotNull(contextDepend, "MmDepend.impl().contextDepend");
                            Context a2 = contextDepend.mo144557a();
                            Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl().contextDepend.context");
                            return a2.getResources().getString(R.string.MMWeb_G_JustNow);
                        } else if (time < ((long) f118609c)) {
                            return new ResString.Editor(R.string.MMWeb_G_MinutesAgoSingular).mo165506a("number", "1").mo165507a();
                        } else {
                            int i2 = f118610d;
                            if (time < ((long) i2)) {
                                return new ResString.Editor(R.string.MMWeb_G_MinutesAgo).mo165506a("number", String.valueOf(time / ((long) i))).mo165507a();
                            }
                            if (time < ((long) f118611e)) {
                                return new ResString.Editor(R.string.MMWeb_G_HoursAgoSingular).mo165506a("number", "1").mo165507a();
                            }
                            return new ResString.Editor(R.string.MMWeb_G_HoursAgo).mo165506a("number", String.valueOf(time / ((long) i2))).mo165507a();
                        }
                    }
                }
                return new SimpleDateFormat(m186528b()).format(date);
            } catch (Exception unused) {
            }
        }
        return "";
    }
}
