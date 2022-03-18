package com.bytedance.ee.util.p705h;

import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.bytedance.ee.util.h.b */
public class C13667b {

    /* renamed from: a */
    private static final Map<String, String> f35855a;

    static {
        HashMap hashMap = new HashMap();
        f35855a = hashMap;
        hashMap.put(Locale.ENGLISH.getLanguage(), "en-US");
        hashMap.put(Locale.JAPANESE.getLanguage(), "ja-JP");
        hashMap.put(Locale.CHINA.getLanguage(), "zh-CN");
        hashMap.put("hi", "hi-IN");
        hashMap.put("ru", "ru-RU");
        hashMap.put("ko", "ko-KR");
        hashMap.put("th", "th-TH");
        hashMap.put("vi", "vi-VN");
        hashMap.put("id", "id-ID");
        hashMap.put("in", "id-ID");
        hashMap.put("pt", "pt-BR");
        hashMap.put("fr", "fr-FR");
        hashMap.put("de", "de-DE");
        hashMap.put("it", "it-IT");
        hashMap.put("es", "es-ES");
        hashMap.put("hk", "zh-HK");
        hashMap.put("tw", "zh-TW");
        hashMap.put("cn", "zh-CN");
    }

    /* renamed from: a */
    public static String m55444a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            C13479a.m54758a("LanguageUtil", "convertLan(): lan is Null");
            return "";
        }
        if (str2.equals("zh") && str != null) {
            str2 = str.toLowerCase();
        }
        Map<String, String> map = f35855a;
        String str3 = map.get(str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = map.get(Locale.ENGLISH.getLanguage());
        }
        C13479a.m54764b("LanguageUtil", "convertLan(): origin = " + str2 + ",result = " + str3);
        return str3;
    }
}
