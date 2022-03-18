package com.ss.android.appcenter.business.tab.fragmentv3.p1283a;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ss.android.appcenter.C27528a;
import com.ss.android.appcenter.common.util.C28183g;
import com.ss.android.appcenter.common.util.C28209p;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.a.c */
public class C28036c {

    /* renamed from: a */
    public static final String f70145a = null;

    /* renamed from: b */
    public static final C28031b f70146b = new C28031b();

    /* renamed from: b */
    protected static boolean m102467b(JsonObject jsonObject) {
        return jsonObject != null;
    }

    /* renamed from: a */
    protected static Context m102459a() {
        return C27528a.m100471a().mo98143b();
    }

    /* renamed from: a */
    public static String m102461a(JsonObject jsonObject) {
        return m102460a((JsonElement) jsonObject);
    }

    /* renamed from: a */
    private static String m102460a(JsonElement jsonElement) {
        if (jsonElement != null && (jsonElement instanceof JsonObject)) {
            try {
                JsonObject jsonObject = (JsonObject) jsonElement;
                JsonElement jsonElement2 = jsonObject.get(C28183g.m103240a());
                if (jsonElement2 != null) {
                    return jsonElement2.getAsString();
                }
                JsonElement jsonElement3 = jsonObject.get("en_us");
                if (jsonElement3 != null) {
                    return jsonElement3.getAsString();
                }
                JsonElement jsonElement4 = jsonObject.get("zh_cn");
                if (jsonElement4 != null) {
                    return jsonElement4.getAsString();
                }
                JsonElement jsonElement5 = jsonObject.get("ja_jp");
                if (jsonElement5 != null) {
                    return jsonElement5.getAsString();
                }
            } catch (NumberFormatException unused) {
                return f70145a;
            }
        }
        return f70145a;
    }

    /* renamed from: b */
    private static int m102464b(String str, String str2) {
        return f70146b.mo99870b(str, str2);
    }

    /* renamed from: c */
    private static int m102468c(String str, String str2) {
        return f70146b.mo99871c(str, str2);
    }

    /* renamed from: d */
    private static boolean m102470d(String str, String str2) {
        return f70146b.mo99872d(str, str2);
    }

    /* renamed from: a */
    protected static String m102462a(String str, JsonObject jsonObject) {
        if (!m102467b(jsonObject)) {
            return f70145a;
        }
        return m102460a(jsonObject.get(str));
    }

    /* renamed from: b */
    protected static String m102465b(String str, JsonObject jsonObject) {
        if (!m102467b(jsonObject)) {
            return f70145a;
        }
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null) {
            return f70145a;
        }
        try {
            return jsonElement.getAsString();
        } catch (NumberFormatException unused) {
            return f70145a;
        }
    }

    /* renamed from: a */
    private static String m102463a(String str, String str2) {
        return f70146b.mo99869a(str, str2);
    }

    /* renamed from: c */
    protected static int m102469c(String str, String str2, JsonObject jsonObject) {
        if (!m102467b(jsonObject)) {
            return m102464b(str, str2);
        }
        JsonElement jsonElement = jsonObject.get(str2);
        if (jsonElement == null) {
            return m102464b(str, str2);
        }
        try {
            return jsonElement.getAsInt();
        } catch (NumberFormatException unused) {
            return m102464b(str, str2);
        }
    }

    /* renamed from: d */
    protected static boolean m102471d(String str, String str2, JsonObject jsonObject) {
        if (!m102467b(jsonObject)) {
            return m102470d(str, str2);
        }
        JsonElement jsonElement = jsonObject.get(str2);
        if (jsonElement == null) {
            return m102470d(str, str2);
        }
        try {
            return jsonElement.getAsBoolean();
        } catch (NumberFormatException unused) {
            return m102470d(str, str2);
        }
    }

    /* renamed from: b */
    protected static String m102466b(String str, String str2, JsonObject jsonObject) {
        if (!m102467b(jsonObject)) {
            return m102463a(str, str2);
        }
        JsonElement jsonElement = jsonObject.get(str2);
        if (jsonElement == null) {
            return m102463a(str, str2);
        }
        try {
            return jsonElement.getAsString();
        } catch (NumberFormatException unused) {
            return m102463a(str, str2);
        }
    }

    /* renamed from: a */
    public static int m102458a(String str, String str2, JsonObject jsonObject) {
        if (!m102467b(jsonObject)) {
            return m102468c(str, str2);
        }
        JsonElement jsonElement = jsonObject.get(str2);
        if (jsonElement == null) {
            return m102468c(str, str2);
        }
        try {
            String asString = jsonElement.getAsString();
            if (TextUtils.equals(asString, "100%")) {
                return -1;
            }
            if (TextUtils.equals(asString, "auto")) {
                return -2;
            }
            return C28209p.m103293a(m102459a(), (float) Integer.parseInt(asString));
        } catch (NumberFormatException unused) {
            return m102468c(str, str2);
        }
    }
}
