package com.huawei.hms.site;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;

/* renamed from: com.huawei.hms.site.l */
public class C23760l {

    /* renamed from: a */
    public static Gson f58832a = new GsonBuilder().enableComplexMapKeySerialization().serializeSpecialFloatingPointValues().disableHtmlEscaping().setLenient().create();

    /* renamed from: b */
    public static JsonParser f58833b = new JsonParser();

    /* renamed from: a */
    public static <T> T m86929a(String str, Class<T> cls) {
        if (!TextUtils.isEmpty(str) && cls != null) {
            try {
                return (T) m86928a().fromJson(str, (Class) cls);
            } catch (JsonParseException unused) {
                C23761m.m86935b("JsonUtils", "JsonParseException");
            }
        }
        return null;
    }

    /* renamed from: a */
    public static <T> String m86930a(T t) {
        if (t == null) {
            return null;
        }
        try {
            return m86928a().toJson((Object) t);
        } catch (JsonParseException unused) {
            C23761m.m86935b("JsonUtils", "JsonParseException");
            return null;
        }
    }

    /* renamed from: a */
    public static Gson m86928a() {
        if (f58832a == null) {
            f58832a = new GsonBuilder().enableComplexMapKeySerialization().serializeSpecialFloatingPointValues().disableHtmlEscaping().setLenient().create();
            f58833b = new JsonParser();
        }
        return f58832a;
    }
}
