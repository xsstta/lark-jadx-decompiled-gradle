package com.ss.android.lark.helpdesk.kbtopextend;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ss.android.lark.helpdesk.C38732a;
import com.ss.android.lark.helpdesk.kbtopextend.bean.Action;
import com.ss.android.lark.helpdesk.kbtopextend.bean.MultiUrl;
import com.ss.android.lark.helpdesk.p1949a.AbstractC38736a;
import com.ss.android.lark.log.Log;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000bJ$\u0010\t\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u001c\u0010\t\u001a\u00020\u00042\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/helpdesk/kbtopextend/KbTopExtendUtils;", "", "()V", "TAG", "", "actionInValid", "", "action", "Lcom/ss/android/lark/helpdesk/kbtopextend/bean/Action;", "findLanguage", "i18n", "Lcom/google/gson/JsonObject;", "local", "i18nJson", "", "i18nMap", "im_helpdesk_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.helpdesk.kbtopextend.d */
public final class KbTopExtendUtils {

    /* renamed from: a */
    public static final KbTopExtendUtils f99692a = new KbTopExtendUtils();

    private KbTopExtendUtils() {
    }

    /* renamed from: a */
    public final String mo142052a(JsonObject jsonObject) {
        if (jsonObject == null) {
            return "";
        }
        AbstractC38736a a = C38732a.m152977a();
        Intrinsics.checkExpressionValueIsNotNull(a, "HelpdeskModule.getDependency()");
        Locale c = a.mo141950c();
        Intrinsics.checkExpressionValueIsNotNull(c, "originLanguage");
        Locale locale = new Locale(c.getLanguage(), c.getCountry());
        String languageTag = locale.toLanguageTag();
        Intrinsics.checkExpressionValueIsNotNull(languageTag, "wrapper.toLanguageTag()");
        String replace$default = StringsKt.replace$default(languageTag, "-", "_", false, 4, (Object) null);
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(locale2, "Locale.getDefault()");
        if (replace$default != null) {
            String lowerCase = replace$default.toLowerCase(locale2);
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            Log.m165389i("KbTopExtendUtils", "util getLocale = " + locale + " , result = " + lowerCase);
            KbTopExtendUtils dVar = f99692a;
            if (!TextUtils.isEmpty(dVar.m153050a(jsonObject, lowerCase))) {
                return dVar.m153050a(jsonObject, lowerCase);
            }
            return dVar.m153050a(jsonObject, "en_us");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public final String mo142053a(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        AbstractC38736a a = C38732a.m152977a();
        Intrinsics.checkExpressionValueIsNotNull(a, "HelpdeskModule.getDependency()");
        Locale c = a.mo141950c();
        Intrinsics.checkExpressionValueIsNotNull(c, "originLanguage");
        Locale locale = new Locale(c.getLanguage(), c.getCountry());
        String languageTag = locale.toLanguageTag();
        Intrinsics.checkExpressionValueIsNotNull(languageTag, "wrapper.toLanguageTag()");
        String replace$default = StringsKt.replace$default(languageTag, "-", "_", false, 4, (Object) null);
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(locale2, "Locale.getDefault()");
        if (replace$default != null) {
            String lowerCase = replace$default.toLowerCase(locale2);
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            Log.m165389i("KbTopExtendUtils", "util getLocale = " + locale + " , result = " + lowerCase);
            KbTopExtendUtils dVar = f99692a;
            if (!TextUtils.isEmpty(dVar.m153051a(map, lowerCase))) {
                return dVar.m153051a(map, lowerCase);
            }
            return dVar.m153051a(map, "en_us");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public final boolean mo142054a(Action action) {
        if (action == null || (action.getMulti_url() == null && action.getValue() == null)) {
            return true;
        }
        if (action.getMulti_url() == null) {
            return false;
        }
        MultiUrl multi_url = action.getMulti_url();
        Intrinsics.checkExpressionValueIsNotNull(multi_url, "action.multi_url");
        if (!TextUtils.isEmpty(multi_url.getAndroid_url())) {
            return false;
        }
        MultiUrl multi_url2 = action.getMulti_url();
        Intrinsics.checkExpressionValueIsNotNull(multi_url2, "action.multi_url");
        if (!TextUtils.isEmpty(multi_url2.getUrl()) || !TextUtils.isEmpty(action.getValue()) || !TextUtils.isEmpty(action.getValue())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final String m153050a(JsonObject jsonObject, String str) {
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            Intrinsics.checkExpressionValueIsNotNull(key, "mutableEntry.key");
            String str2 = key;
            Locale locale = Locale.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
            if (str2 != null) {
                String lowerCase = str2.toLowerCase(locale);
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (Intrinsics.areEqual(lowerCase, str)) {
                    JsonElement value = entry.getValue();
                    Intrinsics.checkExpressionValueIsNotNull(value, "mutableEntry.value");
                    String asString = value.getAsString();
                    Intrinsics.checkExpressionValueIsNotNull(asString, "mutableEntry.value.asString");
                    return asString;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return "";
    }

    /* renamed from: a */
    private final String m153051a(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            Locale locale = Locale.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
            if (key != null) {
                String lowerCase = key.toLowerCase(locale);
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (Intrinsics.areEqual(lowerCase, str)) {
                    return entry.getValue();
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return "";
    }
}
