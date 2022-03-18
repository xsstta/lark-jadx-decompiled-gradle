package com.ss.android.lark.time.format.common;

import android.text.TextUtils;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/time/format/common/LocaleUtil;", "", "()V", "checkSupportLocale", "Ljava/util/Locale;", "locale", "time-format_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.time.format.a.c */
public final class LocaleUtil {

    /* renamed from: a */
    public static final LocaleUtil f139148a = new LocaleUtil();

    private LocaleUtil() {
    }

    /* renamed from: a */
    public final Locale mo191617a(Locale locale) {
        String str;
        if (locale == null) {
            return null;
        }
        Locale locale2 = new Locale("en", "US");
        if (!TextUtils.isEmpty(locale.getCountry())) {
            str = locale.getLanguage() + "_" + locale.getCountry();
        } else {
            str = locale.getLanguage();
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "tag");
        if (StringsKt.startsWith$default(str, "zh", false, 2, (Object) null)) {
            return new Locale("zh", "CN");
        }
        if (StringsKt.startsWith$default(str, "ja", false, 2, (Object) null)) {
            return new Locale("ja", "JP");
        }
        if (StringsKt.startsWith$default(str, "in", false, 2, (Object) null) || StringsKt.startsWith$default(str, "id", false, 2, (Object) null)) {
            return new Locale("id", "ID");
        }
        if (StringsKt.startsWith$default(str, "de", false, 2, (Object) null)) {
            return new Locale("de", "DE");
        }
        if (StringsKt.startsWith$default(str, "en", false, 2, (Object) null)) {
            return new Locale("en", "US");
        }
        if (StringsKt.startsWith$default(str, "es", false, 2, (Object) null)) {
            return new Locale("es", "ES");
        }
        if (StringsKt.startsWith$default(str, "fr", false, 2, (Object) null)) {
            return new Locale("fr", "FR");
        }
        if (StringsKt.startsWith$default(str, "it", false, 2, (Object) null)) {
            return new Locale("it", "IT");
        }
        if (StringsKt.startsWith$default(str, "pt", false, 2, (Object) null)) {
            return new Locale("pt", "BR");
        }
        if (StringsKt.startsWith$default(str, "vi", false, 2, (Object) null)) {
            return new Locale("vi", "VN");
        }
        if (StringsKt.startsWith$default(str, "ru", false, 2, (Object) null)) {
            return new Locale("ru", "RU");
        }
        if (StringsKt.startsWith$default(str, "hi", false, 2, (Object) null)) {
            return new Locale("hi", "IN");
        }
        if (StringsKt.startsWith$default(str, "th", false, 2, (Object) null)) {
            return new Locale("th", "TH");
        }
        if (StringsKt.startsWith$default(str, "ko", false, 2, (Object) null)) {
            return new Locale("ko", "KR");
        }
        return locale2;
    }
}
