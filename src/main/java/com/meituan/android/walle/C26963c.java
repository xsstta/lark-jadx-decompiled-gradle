package com.meituan.android.walle;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.meituan.android.walle.c */
public final class C26963c {
    /* renamed from: c */
    public static String m97993c(File file) {
        return C26965e.m97996a(file, 1903654775);
    }

    /* renamed from: a */
    public static C26962b m97991a(File file) {
        Map<String, String> b = m97992b(file);
        if (b == null) {
            return null;
        }
        b.remove("channel");
        return new C26962b(b.get("channel"), b);
    }

    /* renamed from: b */
    public static Map<String, String> m97992b(File file) {
        try {
            String c = m97993c(file);
            if (c == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(c);
            Iterator<String> keys = jSONObject.keys();
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                hashMap.put(obj, jSONObject.getString(obj));
            }
            return hashMap;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
