package com.ss.android.lark.guide.biz.onboarding.res;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/res/BaseDyRes;", "Lcom/ss/android/lark/guide/biz/onboarding/res/IDyRes;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "resLocale", "", "getResLocale", "()Ljava/lang/String;", "setResLocale", "(Ljava/lang/String;)V", "getLocale", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.res.c */
public abstract class BaseDyRes implements IDyRes {

    /* renamed from: a */
    private String f99160a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo141354a() {
        return this.f99160a;
    }

    public BaseDyRes(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f99160a = m152208a(context);
    }

    /* renamed from: a */
    private final String m152208a(Context context) {
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            Resources resources = context.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkExpressionValueIsNotNull(configuration, "context.resources.configuration");
            locale = configuration.getLocales().get(0);
            if (locale == null) {
                Resources resources2 = context.getResources();
                Intrinsics.checkExpressionValueIsNotNull(resources2, "context.resources");
                locale = resources2.getConfiguration().locale;
            }
        } else {
            Resources resources3 = context.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources3, "context.resources");
            locale = resources3.getConfiguration().locale;
        }
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkExpressionValueIsNotNull(locale, "locale");
        String language = locale.getLanguage();
        Intrinsics.checkExpressionValueIsNotNull(language, "locale.language");
        if (language != null) {
            String lowerCase = language.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            sb.append(lowerCase);
            sb.append("_");
            String country = locale.getCountry();
            Intrinsics.checkExpressionValueIsNotNull(country, "locale.country");
            if (country != null) {
                String upperCase = country.toUpperCase();
                Intrinsics.checkExpressionValueIsNotNull(upperCase, "(this as java.lang.String).toUpperCase()");
                sb.append(upperCase);
                return sb.toString();
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
