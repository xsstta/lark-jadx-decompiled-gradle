package com.larksuite.component.universe_design.util;

import android.content.Context;
import com.samskivert.mustache.C27035d;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J(\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0007¨\u0006\u0014"}, d2 = {"Lcom/larksuite/component/universe_design/util/ResUtil;", "", "()V", "getStringArray", "", "", "context", "Landroid/content/Context;", "stringResId", "", "(Landroid/content/Context;I)[Ljava/lang/String;", "isJp", "", "locale", "Ljava/util/Locale;", "isKo", "isZh", "mustacheFormat", "key", "value", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.util.c */
public final class ResUtil {

    /* renamed from: a */
    public static final ResUtil f63883a = new ResUtil();

    private ResUtil() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m93303b(Locale locale) {
        Intrinsics.checkParameterIsNotNull(locale, "locale");
        String language = locale.getLanguage();
        Intrinsics.checkExpressionValueIsNotNull(language, "locale.language");
        if (language != null) {
            String lowerCase = language.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            return Intrinsics.areEqual("zh", lowerCase);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @JvmStatic
    /* renamed from: c */
    public static final boolean m93304c(Locale locale) {
        Intrinsics.checkParameterIsNotNull(locale, "locale");
        String language = locale.getLanguage();
        Intrinsics.checkExpressionValueIsNotNull(language, "locale.language");
        if (language != null) {
            String lowerCase = language.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            return Intrinsics.areEqual("ko", lowerCase);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m93301a(Locale locale) {
        Intrinsics.checkParameterIsNotNull(locale, "locale");
        String language = locale.getLanguage();
        Intrinsics.checkExpressionValueIsNotNull(language, "locale.language");
        if (language != null) {
            String lowerCase = language.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            return Intrinsics.areEqual("ja", lowerCase);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @JvmStatic
    /* renamed from: a */
    public static final String[] m93302a(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String[] stringArray = context.getResources().getStringArray(i);
        Intrinsics.checkExpressionValueIsNotNull(stringArray, "context.resources.getStringArray(stringResId)");
        return stringArray;
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m93300a(Context context, int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "value");
        String string = context.getResources().getString(i);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.resources.getString(stringResId)");
        HashMap hashMap = new HashMap(1);
        hashMap.put(str, str2);
        try {
            String a = C27035d.m98270a().mo96184a(false).mo96186a(string).mo96212a(hashMap);
            Intrinsics.checkExpressionValueIsNotNull(a, "tmpl.execute(dataMap)");
            return a;
        } catch (Exception unused) {
            return string;
        }
    }
}
