package com.bytedance.reader_apk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.bytedance.reader_apk.p892a.C20564a;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.reader_apk.c */
public class C20566c {

    /* renamed from: a */
    private static String[] f50140a = new String[3];

    /* renamed from: b */
    private static volatile boolean f50141b;

    /* renamed from: d */
    private static String m74898d(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            return applicationInfo.sourceDir;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m74894a(Context context) {
        if (!f50141b) {
            m74897c(context);
            f50141b = true;
        }
        Map<String, String> a = m74895a(m74896b(context));
        if (a == null || a.size() <= 0) {
            return "";
        }
        return a.get("meta_umeng_channel");
    }

    /* renamed from: b */
    public static String m74896b(Context context) {
        if (!f50141b) {
            m74897c(context);
            f50141b = true;
        }
        if (!TextUtils.isEmpty(f50140a[0])) {
            return f50140a[0];
        }
        if (!TextUtils.isEmpty(f50140a[1])) {
            return f50140a[1];
        }
        return "";
    }

    /* renamed from: a */
    private static Map<String, String> m74895a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
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
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    private static void m74897c(Context context) {
        int[] iArr = {-1721342362, 1903654775, 1903654776};
        String d = m74898d(context);
        if (TextUtils.isEmpty(d)) {
            f50140a = new String[]{"", "", ""};
        }
        File file = new File(d);
        String[] a = C20567d.m74901a(file, iArr);
        if (a == null) {
            a = f50140a;
        }
        f50140a = a;
        if (a.length >= 2 && TextUtils.isEmpty(a[0]) && TextUtils.isEmpty(f50140a[1])) {
            String a2 = C20564a.m74889a(file);
            String[] strArr = f50140a;
            if (a2 == null) {
                a2 = "";
            }
            strArr[0] = a2;
        }
        String[] strArr2 = f50140a;
        if (strArr2.length >= 3 && !TextUtils.isEmpty(strArr2[2])) {
            int length = f50140a[2].length();
            if (length > 4) {
                String[] strArr3 = f50140a;
                strArr3[2] = strArr3[2].substring(2, length - 2);
                return;
            }
            f50140a[2] = "";
        }
    }
}
