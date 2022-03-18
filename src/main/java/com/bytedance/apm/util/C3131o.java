package com.bytedance.apm.util;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm6.util.C3355e;
import com.bytedance.apm6.util.C3356f;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.util.o */
public class C3131o {
    /* renamed from: a */
    public static JSONObject m13019a(JSONObject jSONObject, String str) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return jSONObject.optJSONObject(str);
    }

    /* renamed from: a */
    public static boolean m13020a(String str, List<String> list) {
        if (!C3356f.m13964a(list) && !TextUtils.isEmpty(str)) {
            try {
                String host = Uri.parse(str).getHost();
                for (String str2 : list) {
                    if (host.equalsIgnoreCase(str2)) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static List<String> m13022b(JSONObject jSONObject, String str) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (C3355e.m13955a(optJSONArray)) {
                return null;
            }
            int length = optJSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                String string = optJSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(string);
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static List<String> m13023c(JSONObject jSONObject, String str) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (C3355e.m13956a(optJSONObject)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (optJSONObject.optInt(next) == 1) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static List<Pattern> m13024d(JSONObject jSONObject, String str) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return null;
            }
            int length = optJSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                String string = optJSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(Pattern.compile(string));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static List<Pattern> m13025e(JSONObject jSONObject, String str) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (C3355e.m13956a(optJSONObject)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (optJSONObject.optInt(next) == 1) {
                    arrayList.add(Pattern.compile(next));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m13021a(String str, List<String> list, List<Pattern> list2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!C3356f.m13964a(list)) {
            for (String str2 : list) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        try {
            String path = new URI(str).getPath();
            if (!C3356f.m13964a(list2)) {
                for (Pattern pattern : list2) {
                    if (pattern.matcher(path).matches()) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
