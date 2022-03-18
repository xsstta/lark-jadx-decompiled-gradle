package com.bytedance.ttnet.clientkey;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.util.C14091i;
import com.bytedance.frameworks.baselib.network.http.util.UrlUtils;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.C20639k;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.Response;
import com.bytedance.ttnet.TTNetInit;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class ClientKeyManager {

    /* renamed from: a */
    private static volatile ClientKeyManager f50779a = null;

    /* renamed from: b */
    private static Keva f50780b = null;

    /* renamed from: e */
    private static volatile boolean f50781e = false;

    /* renamed from: j */
    private static boolean f50782j = true;

    /* renamed from: k */
    private static Map<String, String> f50783k = null;

    /* renamed from: l */
    private static final String f50784l = "ClientKeyManager";

    /* renamed from: c */
    private List<String> f50785c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private List<String> f50786d = new CopyOnWriteArrayList();

    /* renamed from: f */
    private String f50787f = "";

    /* renamed from: g */
    private String f50788g = "";

    /* renamed from: h */
    private String f50789h = "";

    /* renamed from: i */
    private String f50790i = "";

    /* renamed from: a */
    public void mo70012a(boolean z) {
        f50782j = z;
        try {
            f50780b = Keva.getRepo("ttnet_client_key_config", 1);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        Keva keva = f50780b;
        if (keva != null) {
            String string = keva.getString("client_key_config", "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    m75588a(new JSONObject(string));
                } catch (Throwable unused) {
                }
            }
            if (f50781e) {
                String string2 = f50780b.getString("session_id", "");
                long j = f50780b.getLong("session_time", 0);
                this.f50789h = f50780b.getString("session_url", "");
                this.f50787f = f50780b.getString("client_key", "");
                String string3 = f50780b.getString("kms_version", "");
                this.f50790i = string3;
                f50783k = m75586a(this.f50787f, string3);
                if (!string2.isEmpty() && !this.f50789h.isEmpty()) {
                    String[] split = string2.split(";");
                    if (split != null && split.length > 0) {
                        this.f50788g = split[0].trim();
                    }
                    if (!TextUtils.isEmpty(this.f50788g)) {
                        String a = m75585a(split, j, string2);
                        if (!TextUtils.isEmpty(a)) {
                            string2 = a;
                        }
                        String str = f50784l;
                        Logger.m15167d(str, "client key: " + this.f50787f + " | kms version: " + this.f50790i + " | session cookie: " + string2 + " | sessionid: " + this.f50788g + " | session time: " + j + " session url: " + this.f50789h + " config: " + string);
                        m75589b(string2);
                    }
                }
            }
        }
    }

    private ClientKeyManager() {
    }

    /* renamed from: a */
    public static ClientKeyManager m75584a() {
        if (f50779a == null) {
            synchronized (ClientKeyManager.class) {
                if (f50779a == null) {
                    f50779a = new ClientKeyManager();
                }
            }
        }
        return f50779a;
    }

    public static Map<String, String> getClientKeyHeaders() {
        if (f50780b == null || !f50781e) {
            return null;
        }
        if (f50782j) {
            return f50783k;
        }
        return m75586a(f50780b.getString("client_key", ""), f50780b.getString("kms_version", ""));
    }

    /* renamed from: c */
    private void m75590c(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("report_time", System.currentTimeMillis() + "");
            jSONObject.put("cookie_line", str);
            jSONObject.put("session_id", this.f50788g);
            jSONObject.put("url", this.f50789h);
            TTNetInit.getTTNetDepend().mo69990a("cookie_mismatch", jSONObject);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private void m75589b(String str) {
        Map<String, List<String>> map;
        CookieHandler cookieHandler = CookieHandler.getDefault();
        if (cookieHandler != null) {
            try {
                URI a = C14091i.m57053a(this.f50789h);
                if (a != null && (map = cookieHandler.get(a, null)) != null && !map.isEmpty() && map.containsKey("Cookie")) {
                    String obj = map.get("Cookie").toString();
                    String str2 = f50784l;
                    Logger.m15167d(str2, "cookieStr: " + obj + " sessionId: " + this.f50788g);
                    if (TextUtils.isEmpty(obj)) {
                        m75587a(str, cookieHandler, a);
                        m75590c("empty");
                    } else if (!obj.contains(this.f50788g)) {
                        m75587a(str, cookieHandler, a);
                        m75590c(obj);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private void m75588a(JSONObject jSONObject) throws Exception {
        boolean z;
        if (jSONObject.optInt("client_key_sign_enabled", 0) > 0) {
            z = true;
        } else {
            z = false;
        }
        f50781e = z;
        if (!f50781e) {
            Logger.m15167d(f50784l, "clear client key storage.");
            f50780b.clear();
            return;
        }
        this.f50785c.clear();
        String optString = jSONObject.optString("update_host_list", null);
        if (!TextUtils.isEmpty(optString)) {
            JSONArray jSONArray = new JSONArray(optString);
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    this.f50785c.add(string);
                }
            }
        }
        this.f50786d.clear();
        String optString2 = jSONObject.optString("update_path_list", null);
        if (!TextUtils.isEmpty(optString2)) {
            JSONArray jSONArray2 = new JSONArray(optString2);
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String string2 = jSONArray2.getString(i2);
                if (!TextUtils.isEmpty(string2)) {
                    this.f50786d.add(string2);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo70010a(String str) {
        if (f50780b != null && !TextUtils.isEmpty(str)) {
            try {
                JSONObject optJSONObject = new JSONObject(str).getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).optJSONObject("client_key_config");
                if (optJSONObject == null) {
                    Logger.m15167d(f50784l, "clear client key storage.");
                    f50781e = false;
                    f50780b.clear();
                    return;
                }
                String jSONObject = optJSONObject.toString();
                String str2 = f50784l;
                Logger.m15167d(str2, "config: " + jSONObject);
                f50780b.storeString("client_key_config", jSONObject);
                m75588a(optJSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static Map<String, String> m75586a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("x-bd-client-key", str);
        hashMap.put("x-bd-kmsv", str2);
        return hashMap;
    }

    /* renamed from: a */
    public synchronized void mo70009a(Request request, Response response) {
        boolean z;
        if (f50780b != null) {
            if (f50781e) {
                Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
                URI uri = null;
                try {
                    uri = C14091i.m57053a(request.getUrl());
                } catch (Throwable unused) {
                }
                if (uri != null && uri.getScheme().equals("https")) {
                    boolean z2 = true;
                    if (!this.f50785c.isEmpty()) {
                        Iterator<String> it = this.f50785c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            if (UrlUtils.matchPattern(uri.getHost(), it.next())) {
                                z = true;
                                break;
                            }
                        }
                        if (!z) {
                            return;
                        }
                    }
                    if (!this.f50786d.isEmpty()) {
                        Iterator<String> it2 = this.f50786d.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (UrlUtils.matchPattern(uri.getPath(), it2.next())) {
                                break;
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                        String str = "";
                        String str2 = "";
                        List<Header> headers = response.headers("Set-Cookie");
                        if (headers != null && !headers.isEmpty()) {
                            Iterator<Header> it3 = headers.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                String trim = it3.next().getValue().trim();
                                if (trim.toLowerCase().startsWith("sessionid=")) {
                                    str = trim;
                                    break;
                                }
                            }
                        }
                        String[] split = str.split(";");
                        if (split != null && split.length > 0) {
                            str2 = split[0].trim();
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            String str3 = f50784l;
                            Logger.m15167d(str3, "original sessionid: " + this.f50788g + " new sessionid: " + str2);
                            String str4 = "";
                            String str5 = "";
                            Header firstHeader = response.getFirstHeader("x-bd-lanusk");
                            Header firstHeader2 = response.getFirstHeader("x-bd-lanusv");
                            if (firstHeader != null && firstHeader2 != null) {
                                str4 = firstHeader.getValue();
                                str5 = firstHeader2.getValue();
                                if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
                                    this.f50787f = "";
                                    this.f50790i = "";
                                }
                            } else if (str2.equals(this.f50788g)) {
                                str4 = this.f50787f;
                                str5 = this.f50790i;
                            }
                            this.f50787f = str4;
                            this.f50790i = str5;
                            String url = request.getUrl();
                            this.f50789h = url;
                            this.f50788g = str2;
                            f50780b.storeString("session_url", url);
                            f50780b.storeString("session_id", str);
                            f50780b.storeString("client_key", this.f50787f);
                            f50780b.storeString("kms_version", this.f50790i);
                            f50780b.storeLong("session_time", System.currentTimeMillis());
                            f50783k = m75586a(this.f50787f, this.f50790i);
                            if (request.getMetrics() != null) {
                                request.getMetrics().f50263I = SystemClock.uptimeMillis() - valueOf.longValue();
                            }
                            Logger.m15167d(str3, "save session url: " + this.f50789h + " session cookie: " + str + " client key: " + this.f50787f + " kms version: " + this.f50790i);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo70011a(List<Header> list, C20639k kVar) {
        if (f50780b != null && f50781e && !TextUtils.isEmpty(this.f50787f) && !TextUtils.isEmpty(this.f50790i)) {
            Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
            list.add(new Header("x-bd-client-key", this.f50787f));
            list.add(new Header("x-bd-kmsv", this.f50790i));
            if (kVar != null) {
                kVar.f50262H = SystemClock.uptimeMillis() - valueOf.longValue();
            }
        }
    }

    /* renamed from: a */
    private static String m75585a(String[] strArr, long j, String str) {
        String[] strArr2;
        String str2;
        if (strArr != null && strArr.length >= 2) {
            long j2 = 0;
            if (j > 0) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        strArr2 = null;
                        str2 = null;
                        break;
                    }
                    str2 = strArr[i];
                    if (!TextUtils.isEmpty(str2) && str2.toLowerCase().trim().startsWith("Max-Age=".toLowerCase())) {
                        strArr2 = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                        break;
                    }
                    i++;
                }
                if (strArr2 != null && strArr2.length == 2) {
                    try {
                        long parseLong = Long.parseLong(strArr2[1]);
                        if (parseLong <= 0) {
                            return null;
                        }
                        long currentTimeMillis = parseLong - ((System.currentTimeMillis() - j) / 1000);
                        if (currentTimeMillis > 0) {
                            j2 = currentTimeMillis;
                        }
                        return str.replaceFirst(str2.trim(), "Max-Age=" + j2);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m75587a(String str, CookieHandler cookieHandler, URI uri) throws IOException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        linkedHashMap.put("Set-Cookie", arrayList);
        cookieHandler.put(uri, linkedHashMap);
        String str2 = f50784l;
        Logger.m15167d(str2, "Refresh session cookie: " + str);
    }
}
