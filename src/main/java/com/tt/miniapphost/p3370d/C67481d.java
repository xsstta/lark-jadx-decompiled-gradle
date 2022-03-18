package com.tt.miniapphost.p3370d;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.tt.miniapphost.d.d */
public class C67481d {
    /* renamed from: a */
    public static Locale m262479a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!m262480b(str)) {
            return new Locale(str, "");
        }
        String[] split = str.split("_");
        if (split[0].equalsIgnoreCase("zh-hant")) {
            return new Locale("zh", split[1], "#Hant");
        }
        return new Locale(split[0], split[1]);
    }

    /* renamed from: b */
    public static boolean m262480b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] split = str.split("_");
        if (split.length != 2 || TextUtils.isEmpty(split[0]) || TextUtils.isEmpty(split[1])) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m262478a(Locale locale) {
        if (locale == null) {
            return null;
        }
        if (locale.toString().equalsIgnoreCase("zh_TW") || locale.toString().equalsIgnoreCase("zh_TW_#Hant")) {
            return "zh-Hant_TW";
        }
        if (locale.toString().equalsIgnoreCase("zh_HK") || locale.toString().equalsIgnoreCase("zh_HK_#Hant")) {
            return "zh-Hant_HK";
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        if (!TextUtils.isEmpty(country)) {
            sb.append("_");
            sb.append(country);
        }
        return sb.toString();
    }
}
