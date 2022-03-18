package com.bytedance.applog.p200d;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.applog.C3368a;
import com.bytedance.applog.network.RangersHttpException;
import com.bytedance.applog.util.C3458g;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.d.a */
public class C3396a {

    /* renamed from: a */
    public static JSONObject f10761a;

    /* renamed from: b */
    static final String[] f10762b = {"aid", "version_code", "ab_version", "iid", "device_platform"};

    /* renamed from: c */
    public static final String[] f10763c = {"tt_data", "device_platform"};

    /* renamed from: d */
    protected static String f10764d = "https://databyterangers.com.cn";

    /* renamed from: e */
    private static final String[] f10765e = {"GET", "POST"};

    /* renamed from: f */
    private static final String[] f10766f = {"aid", "app_version", "tt_data", "device_id"};

    /* renamed from: a */
    public static boolean m14183a(int i) {
        return i >= 500 && i < 600;
    }

    /* renamed from: a */
    private static void m14182a(JSONObject jSONObject) {
        try {
            long optLong = jSONObject.optLong("server_time");
            if (optLong > 0) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("server_time", optLong);
                jSONObject2.put("local_time", System.currentTimeMillis() / 1000);
                f10761a = jSONObject2;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static HashMap<String, String> m14179a() {
        HashMap<String, String> hashMap = new HashMap<>(2);
        if (C3368a.m14043f()) {
            hashMap.put("Content-Type", "application/octet-stream;tt-data=a");
        } else {
            hashMap.put("Content-Type", "application/json; charset=utf-8");
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.applog.d.a$a */
    public static class C3397a {

        /* renamed from: a */
        int f10767a;

        /* renamed from: b */
        String f10768b;

        /* renamed from: c */
        byte[] f10769c;

        C3397a(int i) {
            this.f10767a = i;
        }
    }

    /* renamed from: a */
    private static String m14177a(String str) {
        if (TextUtils.isEmpty(str) || !C3368a.m14043f()) {
            return str;
        }
        Uri parse = Uri.parse(str);
        String query = parse.getQuery();
        ArrayList<Pair> arrayList = new ArrayList();
        String[] strArr = f10766f;
        for (String str2 : strArr) {
            String queryParameter = parse.getQueryParameter(str2);
            if (!TextUtils.isEmpty(queryParameter)) {
                arrayList.add(new Pair(str2, queryParameter));
            }
        }
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        for (Pair pair : arrayList) {
            buildUpon.appendQueryParameter((String) pair.first, (String) pair.second);
        }
        buildUpon.appendQueryParameter("tt_info", new String(Base64.encode(C3458g.m14603a(query), 8)));
        return buildUpon.build().toString();
    }

    /* renamed from: a */
    public static JSONObject m14180a(String str, JSONObject jSONObject) {
        String str2;
        JSONException e;
        JSONObject jSONObject2 = null;
        try {
            str2 = C3368a.m14053p().mo13887a(m14177a(str), C3458g.m14603a(jSONObject.toString()), m14179a());
        } catch (Exception e2) {
            e2.printStackTrace();
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        try {
            JSONObject jSONObject3 = new JSONObject(str2);
            try {
                m14182a(jSONObject3);
                return jSONObject3;
            } catch (JSONException e3) {
                e = e3;
                jSONObject2 = jSONObject3;
                e.printStackTrace();
                return jSONObject2;
            }
        } catch (JSONException e4) {
            e = e4;
            e.printStackTrace();
            return jSONObject2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m14187d(java.lang.String r3, org.json.JSONObject r4) {
        /*
            r0 = 0
            com.bytedance.applog.network.b r1 = com.bytedance.applog.C3368a.m14053p()     // Catch:{ Exception -> 0x0014 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0014 }
            byte[] r4 = com.bytedance.applog.util.C3458g.m14603a(r4)     // Catch:{ Exception -> 0x0014 }
            java.lang.String r2 = "application/json; charset=utf-8"
            java.lang.String r3 = r1.mo13886a(r3, r4, r2)     // Catch:{ Exception -> 0x0014 }
            goto L_0x0019
        L_0x0014:
            r3 = move-exception
            r3.printStackTrace()
            r3 = r0
        L_0x0019:
            if (r3 == 0) goto L_0x002c
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0026 }
            r4.<init>(r3)     // Catch:{ JSONException -> 0x0026 }
            m14182a(r4)     // Catch:{ JSONException -> 0x0024 }
            goto L_0x002d
        L_0x0024:
            r3 = move-exception
            goto L_0x0028
        L_0x0026:
            r3 = move-exception
            r4 = r0
        L_0x0028:
            r3.printStackTrace()
            goto L_0x002d
        L_0x002c:
            r4 = r0
        L_0x002d:
            if (r4 == 0) goto L_0x0041
            java.lang.String r3 = "message"
            java.lang.String r1 = ""
            java.lang.String r3 = r4.optString(r3, r1)
            java.lang.String r1 = "success"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0041
            r3 = 1
            goto L_0x0042
        L_0x0041:
            r3 = 0
        L_0x0042:
            if (r3 == 0) goto L_0x004b
            java.lang.String r3 = "data"
            org.json.JSONObject r3 = r4.optJSONObject(r3)
            return r3
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.p200d.C3396a.m14187d(java.lang.String, org.json.JSONObject):org.json.JSONObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m14184b(java.lang.String r9, org.json.JSONObject r10) {
        /*
        // Method dump skipped, instructions count: 202
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.p200d.C3396a.m14184b(java.lang.String, org.json.JSONObject):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064 A[SYNTHETIC, Splitter:B:25:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093 A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m14186c(java.lang.String r8, org.json.JSONObject r9) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.p200d.C3396a.m14186c(java.lang.String, org.json.JSONObject):org.json.JSONObject");
    }

    /* renamed from: a */
    public static String m14178a(String str, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        HashMap hashMap = new HashMap(strArr.length);
        for (String str2 : strArr) {
            String queryParameter = parse.getQueryParameter(str2);
            if (!TextUtils.isEmpty(queryParameter)) {
                hashMap.put(str2, queryParameter);
            }
        }
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        for (String str3 : hashMap.keySet()) {
            buildUpon.appendQueryParameter(str3, (String) hashMap.get(str3));
        }
        return buildUpon.build().toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m14174a(java.lang.String[] r10, byte[] r11, com.bytedance.applog.manager.C3435g r12) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.p200d.C3396a.m14174a(java.lang.String[], byte[], com.bytedance.applog.manager.g):int");
    }

    /* renamed from: a */
    protected static void m14181a(StringBuilder sb, String str, String str2) {
        if (sb != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (sb.toString().indexOf(63) < 0) {
                sb.append("?");
            } else {
                sb.append(ContainerUtils.FIELD_DELIMITER);
            }
            sb.append(str);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(Uri.encode(str2));
        }
    }

    /* renamed from: a */
    public static String m14176a(int i, String str, HashMap<String, String> hashMap, byte[] bArr) throws RangersHttpException {
        return m14175a(i, str, hashMap, bArr, 0).f10768b;
    }

    /* renamed from: b */
    public static byte[] m14185b(int i, String str, HashMap<String, String> hashMap, byte[] bArr) throws RangersHttpException {
        return m14175a(i, str, hashMap, bArr, 1).f10769c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01fc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.applog.p200d.C3396a.C3397a m14175a(int r8, java.lang.String r9, java.util.HashMap<java.lang.String, java.lang.String> r10, byte[] r11, int r12) throws com.bytedance.applog.network.RangersHttpException {
        /*
        // Method dump skipped, instructions count: 525
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.p200d.C3396a.m14175a(int, java.lang.String, java.util.HashMap, byte[], int):com.bytedance.applog.d.a$a");
    }
}
