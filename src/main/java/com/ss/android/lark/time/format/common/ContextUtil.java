package com.ss.android.lark.time.format.common;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/time/format/common/ContextUtil;", "", "()V", "convertContext", "Landroid/content/Context;", "context", "locale", "Ljava/util/Locale;", "isLocaleNotSame", "", "time-format_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.time.format.a.a */
public final class ContextUtil {

    /* renamed from: a */
    public static final ContextUtil f139146a = new ContextUtil();

    private ContextUtil() {
    }

    /* renamed from: b */
    private final boolean m219261b(Context context, Locale locale) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24) {
            Resources resources = context.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkExpressionValueIsNotNull(configuration, "context.resources.configuration");
            z = Intrinsics.areEqual(configuration.getLocales().get(0), locale);
        } else {
            Resources resources2 = context.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources2, "context.resources");
            z = Intrinsics.areEqual(resources2.getConfiguration().locale, locale);
        }
        return !z;
    }

    /* renamed from: a */
    public final Context mo191613a(Context context, Locale locale) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (locale == null || !m219261b(context, locale)) {
            return context;
        }
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.setLocale(locale);
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        Intrinsics.checkExpressionValueIsNotNull(createConfigurationContext, "context.createConfigurat…text(localeConfiguration)");
        return createConfigurationContext;
    }
}
