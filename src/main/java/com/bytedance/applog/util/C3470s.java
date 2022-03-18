package com.bytedance.applog.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.dr.C4000c;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.util.s */
public class C3470s {

    /* renamed from: a */
    private static String f10993a = null;

    /* renamed from: b */
    private static String f10994b = ":push";

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049 A[SYNTHETIC, Splitter:B:17:0x0049] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m14671a() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0046 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0046 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            r4.<init>()     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = "/proc/"
            r4.append(r5)     // Catch:{ all -> 0x0046 }
            int r5 = android.os.Process.myPid()     // Catch:{ all -> 0x0046 }
            r4.append(r5)     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0046 }
            r3.<init>(r4)     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0046 }
            r1.<init>(r2)     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            r2.<init>()     // Catch:{ all -> 0x0044 }
        L_0x0031:
            int r3 = r1.read()     // Catch:{ all -> 0x0044 }
            if (r3 <= 0) goto L_0x003c
            char r3 = (char) r3     // Catch:{ all -> 0x0044 }
            r2.append(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0031
        L_0x003c:
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0044 }
            r1.close()     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            return r0
        L_0x0044:
            goto L_0x0047
        L_0x0046:
            r1 = r0
        L_0x0047:
            if (r1 == 0) goto L_0x004c
            r1.close()     // Catch:{ Exception -> 0x004c }
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.util.C3470s.m14671a():java.lang.String");
    }

    /* renamed from: a */
    public static void m14674a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m14673a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        m14681b(jSONObject2, jSONObject);
        try {
            String a = C4000c.m16652a(jSONObject2.optJSONObject("oaid"));
            if (TextUtils.isEmpty(a)) {
                return jSONObject2;
            }
            jSONObject2.put("oaid", a);
            return jSONObject2;
        } catch (Exception e) {
            C3469r.m14667a(e);
            return jSONObject2;
        }
    }

    /* renamed from: a */
    public static String m14672a(Context context) {
        String str = f10993a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    f10993a = next.processName;
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        f10993a = m14671a();
        if (C3469r.f10990a) {
            C3469r.m14666a("getProcessName, " + f10993a, (Throwable) null);
        }
        return f10993a;
    }

    /* renamed from: a */
    public static boolean m14677a(String str) {
        int i;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        if (i < 13 || i > 128) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            char charAt = str.charAt(i2);
            if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && ((charAt < 'A' || charAt > 'F') && charAt != '-'))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m14676a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static String m14680b(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static boolean m14678a(String str, String str2) {
        if ((!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) && (str == null || !str.equals(str2))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static JSONObject m14681b(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, jSONObject2.opt(next));
            }
        } catch (JSONException e) {
            C3469r.m14667a(e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static boolean m14679a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return m14676a((Object) jSONObject, (Object) jSONObject2);
        }
        return jSONObject.toString().equals(jSONObject2.toString());
    }

    /* renamed from: a */
    public static void m14675a(StringBuilder sb, HashMap<String, String> hashMap, String str) {
        String str2;
        for (String str3 : hashMap.keySet()) {
            String b = m14680b(str3, str);
            String str4 = hashMap.get(str3);
            if (str4 != null) {
                str2 = m14680b(str4, str);
            } else {
                str2 = "";
            }
            if (sb.length() > 0) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
            }
            sb.append(b);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(str2);
        }
    }
}
