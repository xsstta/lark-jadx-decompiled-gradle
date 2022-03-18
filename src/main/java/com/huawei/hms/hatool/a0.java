package com.huawei.hms.hatool;

import android.text.TextUtils;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public abstract class a0 {

    /* renamed from: com.huawei.hms.hatool.a0$a */
    public static class C23595a extends Exception {
        public C23595a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static b0 m85604a(String str, byte[] bArr, Map<String, String> map) {
        return m85605a(str, bArr, map, "POST");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005d, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005f, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0061, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0063, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0064, code lost:
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0078, code lost:
        r4 = r9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0063 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:17:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[ExcHandler: a (unused com.huawei.hms.hatool.a0$a), SYNTHETIC, Splitter:B:17:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x00dc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.huawei.hms.hatool.b0 m85605a(java.lang.String r6, byte[] r7, java.util.Map<java.lang.String, java.lang.String> r8, java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 332
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hatool.a0.m85605a(java.lang.String, byte[], java.util.Map, java.lang.String):com.huawei.hms.hatool.b0");
    }

    /* renamed from: a */
    public static HttpURLConnection m85606a(String str, int i, Map<String, String> map, String str2) {
        if (TextUtils.isEmpty(str)) {
            C23625y.m85974b("hmsSdk", "CreateConnection: invalid urlPath.");
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        m85607a(httpURLConnection);
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(i));
        httpURLConnection.setRequestProperty("Connection", "close");
        if (map != null && map.size() >= 1) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null && !TextUtils.isEmpty(key)) {
                    httpURLConnection.setRequestProperty(key, entry.getValue());
                }
            }
        }
        return httpURLConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m85607a(java.net.HttpURLConnection r3) {
        /*
            java.lang.String r0 = "hmsSdk"
            boolean r1 = r3 instanceof javax.net.ssl.HttpsURLConnection
            if (r1 == 0) goto L_0x0039
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3
            r1 = 0
            android.content.Context r2 = com.huawei.hms.hatool.AbstractC23596b.m85619f()     // Catch:{ NoSuchAlgorithmException -> 0x001e, KeyStoreException -> 0x001b, GeneralSecurityException -> 0x0018, IOException -> 0x0015, IllegalAccessException -> 0x0012 }
            com.huawei.secure.android.common.ssl.d r1 = com.huawei.secure.android.common.ssl.C23825d.m87087a(r2)     // Catch:{ NoSuchAlgorithmException -> 0x001e, KeyStoreException -> 0x001b, GeneralSecurityException -> 0x0018, IOException -> 0x0015, IllegalAccessException -> 0x0012 }
            goto L_0x0023
        L_0x0012:
            java.lang.String r2 = "getSocketFactory(): Illegal Access Exception "
            goto L_0x0020
        L_0x0015:
            java.lang.String r2 = "getSocketFactory(): IO Exception!"
            goto L_0x0020
        L_0x0018:
            java.lang.String r2 = "getSocketFactory(): General Security Exception"
            goto L_0x0020
        L_0x001b:
            java.lang.String r2 = "getSocketFactory(): Key Store exception"
            goto L_0x0020
        L_0x001e:
            java.lang.String r2 = "getSocketFactory(): Algorithm Exception!"
        L_0x0020:
            com.huawei.hms.hatool.C23625y.m85982f(r0, r2)
        L_0x0023:
            if (r1 == 0) goto L_0x0031
            r3.setSSLSocketFactory(r1)
            com.huawei.secure.android.common.ssl.a.a r0 = new com.huawei.secure.android.common.ssl.a.a
            r0.<init>()
            r3.setHostnameVerifier(r0)
            goto L_0x0039
        L_0x0031:
            com.huawei.hms.hatool.a0$a r3 = new com.huawei.hms.hatool.a0$a
            java.lang.String r0 = "No ssl socket factory set"
            r3.<init>(r0)
            throw r3
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hatool.a0.m85607a(java.net.HttpURLConnection):void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:1:0x0001 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        com.huawei.hms.hatool.r0.m85905a((java.io.Closeable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r4 = r4.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        com.huawei.hms.hatool.C23625y.m85982f("hmsSdk", "When Response Content From Connection inputStream operation exception! " + r4);
        com.huawei.hms.hatool.r0.m85905a((java.io.Closeable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        return "";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000f */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m85608b(java.net.HttpURLConnection r4) {
        /*
            r0 = 0
            java.io.InputStream r0 = r4.getInputStream()     // Catch:{ IOException -> 0x000f }
            java.lang.String r4 = com.huawei.hms.hatool.r0.m85904a(r0)     // Catch:{ IOException -> 0x000f }
            com.huawei.hms.hatool.r0.m85905a(r0)
            return r4
        L_0x000d:
            r4 = move-exception
            goto L_0x002f
        L_0x000f:
            int r4 = r4.getResponseCode()     // Catch:{ all -> 0x000d }
            java.lang.String r1 = "hmsSdk"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "When Response Content From Connection inputStream operation exception! "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.huawei.hms.hatool.C23625y.m85982f(r1, r4)
            com.huawei.hms.hatool.r0.m85905a(r0)
            java.lang.String r4 = ""
            return r4
        L_0x002f:
            com.huawei.hms.hatool.r0.m85905a(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hatool.a0.m85608b(java.net.HttpURLConnection):java.lang.String");
    }
}
