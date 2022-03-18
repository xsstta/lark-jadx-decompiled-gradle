package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.C21804a;
import com.google.android.gms.common.util.C21811e;
import com.google.firebase.FirebaseException;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.platforminfo.AbstractC22923g;
import com.huawei.hms.android.HwBuildEx;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.installations.remote.c */
public class C22882c {

    /* renamed from: a */
    private static final Pattern f56554a = Pattern.compile("[0-9]+s");

    /* renamed from: b */
    private static final Charset f56555b = Charset.forName("UTF-8");

    /* renamed from: c */
    private final Context f56556c;

    /* renamed from: d */
    private final AbstractC22923g f56557d;

    /* renamed from: e */
    private final HeartBeatInfo f56558e;

    /* renamed from: a */
    public InstallationResponse mo79455a(String str, String str2, String str3, String str4, String str5) throws IOException {
        int i = 0;
        URL url = new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", String.format("projects/%s/installations", str3)));
        while (i <= 1) {
            HttpURLConnection a = m83121a(url, str);
            try {
                a.setRequestMethod("POST");
                a.setDoOutput(true);
                if (str5 != null) {
                    a.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                }
                m83125a(a, str2, str4);
                int responseCode = a.getResponseCode();
                if (responseCode == 200) {
                    InstallationResponse b = m83129b(a);
                    a.disconnect();
                    return b;
                }
                m83126a(a, str4, str, str3);
                if (responseCode == 429 || (responseCode >= 500 && responseCode < 600)) {
                    i++;
                    a.disconnect();
                } else {
                    m83130b();
                    return InstallationResponse.m83081f().mo79436a(InstallationResponse.ResponseCode.BAD_CONFIG).mo79439a();
                }
            } finally {
                a.disconnect();
            }
        }
        throw new IOException();
    }

    /* renamed from: a */
    private static byte[] m83128a(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: a */
    private static void m83127a(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    /* renamed from: a */
    public void mo79456a(String str, String str2, String str3, String str4) throws FirebaseException, IOException {
        int i = 0;
        URL url = new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", String.format("projects/%s/installations/%s", str3, str2)));
        while (i <= 1) {
            HttpURLConnection a = m83121a(url, str);
            try {
                a.setRequestMethod("DELETE");
                a.addRequestProperty("Authorization", "FIS_v2 " + str4);
                int responseCode = a.getResponseCode();
                if (!(responseCode == 200 || responseCode == 401)) {
                    if (responseCode != 404) {
                        m83126a(a, (String) null, str, str3);
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                m83130b();
                                throw new FirebaseInstallationsException("Bad config while trying to delete FID", FirebaseInstallationsException.Status.BAD_CONFIG);
                            }
                        }
                        i++;
                    }
                }
                a.disconnect();
                return;
            } finally {
                a.disconnect();
            }
        }
        throw new IOException();
    }

    /* renamed from: b */
    private static void m83130b() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: a */
    private static JSONObject m83122a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:16.3.2");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    private String m83132c() {
        try {
            Context context = this.f56556c;
            byte[] a = C21804a.m79076a(context, context.getPackageName());
            if (a != null) {
                return C21811e.m79089a(a, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f56556c.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ContentValues", "No such package: " + this.f56556c.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: a */
    private void m83124a(HttpURLConnection httpURLConnection) throws IOException {
        m83127a(httpURLConnection, m83128a(m83122a()));
    }

    /* renamed from: a */
    static long m83119a(String str) {
        Preconditions.checkArgument(f56554a.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: c */
    private TokenResult m83131c(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f56555b));
        TokenResult.AbstractC22875a d = TokenResult.m83093d();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                d.mo79447a(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                d.mo79445a(m83119a(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return d.mo79446a(TokenResult.ResponseCode.OK).mo79448a();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m83133d(java.net.HttpURLConnection r7) {
        /*
            java.io.InputStream r0 = r7.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = com.google.firebase.installations.remote.C22882c.f56555b
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r0.<init>()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
        L_0x0019:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            if (r3 == 0) goto L_0x0028
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            goto L_0x0019
        L_0x0028:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 0
            int r6 = r7.getResponseCode()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r6     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 1
            java.lang.String r7 = r7.getResponseMessage()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r7     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r7 = 2
            r4[r7] = r0     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.String r7 = java.lang.String.format(r3, r4)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r2.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r7
        L_0x004a:
            r7 = move-exception
            r2.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r7
        L_0x004f:
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.C22882c.m83133d(java.net.HttpURLConnection):java.lang.String");
    }

    /* renamed from: b */
    private InstallationResponse m83129b(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f56555b));
        TokenResult.AbstractC22875a d = TokenResult.m83093d();
        InstallationResponse.AbstractC22874a f = InstallationResponse.m83081f();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                f.mo79438a(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                f.mo79440b(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                f.mo79441c(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        d.mo79447a(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        d.mo79445a(m83119a(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                f.mo79437a(d.mo79448a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return f.mo79436a(InstallationResponse.ResponseCode.OK).mo79439a();
    }

    /* renamed from: a */
    private HttpURLConnection m83121a(URL url, String str) throws IOException {
        HeartBeatInfo.HeartBeat a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
        httpURLConnection.addRequestProperty("Content-Type", "application/json");
        httpURLConnection.addRequestProperty("Accept", "application/json");
        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
        httpURLConnection.addRequestProperty("X-Android-Package", this.f56556c.getPackageName());
        HeartBeatInfo heartBeatInfo = this.f56558e;
        if (!(heartBeatInfo == null || this.f56557d == null || (a = heartBeatInfo.mo79223a("fire-installations-id")) == HeartBeatInfo.HeartBeat.NONE)) {
            httpURLConnection.addRequestProperty("x-firebase-client", this.f56557d.mo79557a());
            httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(a.getCode()));
        }
        httpURLConnection.addRequestProperty("X-Android-Cert", m83132c());
        httpURLConnection.addRequestProperty("x-goog-api-key", str);
        return httpURLConnection;
    }

    /* renamed from: a */
    private static JSONObject m83123a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:16.3.2");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public C22882c(Context context, AbstractC22923g gVar, HeartBeatInfo heartBeatInfo) {
        this.f56556c = context;
        this.f56557d = gVar;
        this.f56558e = heartBeatInfo;
    }

    /* renamed from: a */
    private static String m83120a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: a */
    private void m83125a(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        m83127a(httpURLConnection, m83128a(m83123a(str, str2)));
    }

    /* renamed from: b */
    public TokenResult mo79457b(String str, String str2, String str3, String str4) throws IOException {
        int i = 0;
        URL url = new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", String.format("projects/%s/installations/%s/authTokens:generate", str3, str2)));
        while (i <= 1) {
            HttpURLConnection a = m83121a(url, str);
            try {
                a.setRequestMethod("POST");
                a.addRequestProperty("Authorization", "FIS_v2 " + str4);
                m83124a(a);
                int responseCode = a.getResponseCode();
                if (responseCode == 200) {
                    TokenResult c = m83131c(a);
                    a.disconnect();
                    return c;
                }
                m83126a(a, (String) null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    TokenResult a2 = TokenResult.m83093d().mo79446a(TokenResult.ResponseCode.AUTH_ERROR).mo79448a();
                    a.disconnect();
                    return a2;
                } else if (responseCode == 429 || (responseCode >= 500 && responseCode < 600)) {
                    i++;
                    a.disconnect();
                } else {
                    m83130b();
                    return TokenResult.m83093d().mo79446a(TokenResult.ResponseCode.BAD_CONFIG).mo79448a();
                }
            } finally {
                a.disconnect();
            }
        }
        throw new IOException();
    }

    /* renamed from: a */
    private static void m83126a(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String d = m83133d(httpURLConnection);
        if (!TextUtils.isEmpty(d)) {
            Log.w("Firebase-Installations", d);
            Log.w("Firebase-Installations", m83120a(str, str2, str3));
        }
    }
}
