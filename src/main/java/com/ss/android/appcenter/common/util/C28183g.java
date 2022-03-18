package com.ss.android.appcenter.common.util;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27536c;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import java.util.Locale;

/* renamed from: com.ss.android.appcenter.common.util.g */
public class C28183g {
    /* renamed from: a */
    public static String m103240a() {
        AbstractC27536c b = C27548m.m100547m().mo98218b();
        String str = "en_us";
        if (!(b == null || b.mo98170a() == null)) {
            Locale a = b.mo98170a();
            try {
                str = a.toLanguageTag().replace("-", "_").toLowerCase();
            } catch (Exception e) {
                e.printStackTrace();
                C28184h.m103248b("AppCenter_LocaleUtil", " get languageTag error " + e);
            }
            C28184h.m103250d("AppCenter_LocaleUtil", "util getLocale = " + a + " , result = " + str);
        }
        return str;
    }

    /* renamed from: b */
    public static boolean m103244b(Locale locale) {
        if (locale == null) {
            return false;
        }
        return TextUtils.equals(locale.getLanguage(), "en");
    }

    /* renamed from: a */
    public static boolean m103243a(Locale locale) {
        if (locale == null) {
            return false;
        }
        return TextUtils.equals(locale.getLanguage(), "zh");
    }

    /* renamed from: a */
    public static String m103241a(JsonObject jsonObject) {
        try {
            return m103242a(jsonObject, m103240a());
        } catch (JsonIOException e) {
            C28184h.m103248b("AppCenter_LocaleUtil", "getI18n json exception " + e);
            e.printStackTrace();
        } catch (Exception e2) {
            C28184h.m103248b("AppCenter_LocaleUtil", "getI18n exception " + e2);
            e2.printStackTrace();
        }
        return "";
    }

    /* renamed from: a */
    private static String m103242a(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement != null) {
            return jsonElement.getAsString();
        }
        return "";
    }
}
