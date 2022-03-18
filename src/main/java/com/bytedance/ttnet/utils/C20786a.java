package com.bytedance.ttnet.utils;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.exception.CdnCacheVerifyException;
import com.bytedance.frameworks.baselib.network.http.util.C14091i;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.Response;
import com.bytedance.ttnet.http.HttpRequestInfo;
import com.bytedance.ttnet.utils.C20790c;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.utils.a */
public class C20786a {

    /* renamed from: a */
    private static volatile boolean f50947a;

    /* renamed from: b */
    private static List<C20788b> f50948b = new ArrayList();

    /* renamed from: c */
    private static ReentrantReadWriteLock f50949c;

    /* renamed from: d */
    private static Lock f50950d;

    /* renamed from: e */
    private static Lock f50951e = f50949c.writeLock();

    /* renamed from: com.bytedance.ttnet.utils.a$a */
    public static class C20787a {

        /* renamed from: a */
        public int f50952a;

        /* renamed from: b */
        public String f50953b;
    }

    /* renamed from: a */
    private static String m75718a() {
        return UUID.randomUUID().toString();
    }

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        f50949c = reentrantReadWriteLock;
        f50950d = reentrantReadWriteLock.readLock();
    }

    /* renamed from: a */
    public static void m75725a(boolean z) {
        f50947a = z;
    }

    /* renamed from: com.bytedance.ttnet.utils.a$b */
    public static class C20788b {

        /* renamed from: a */
        private Pattern f50954a;

        /* renamed from: a */
        public boolean mo70066a(String str) {
            try {
                this.f50954a = Pattern.compile(str);
                return true;
            } catch (PatternSyntaxException e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: a */
        public boolean mo70067a(URI uri) {
            if (uri == null || TextUtils.isEmpty(uri.getHost()) || this.f50954a == null) {
                return false;
            }
            String host = uri.getHost();
            if (!TextUtils.isEmpty(uri.getPath())) {
                host = host + uri.getPath();
            }
            return this.f50954a.matcher(host).matches();
        }
    }

    /* renamed from: a */
    private static String m75719a(URI uri) {
        if (m75728b(uri)) {
            return m75718a();
        }
        return null;
    }

    /* renamed from: a */
    public static C20787a m75717a(JSONObject jSONObject) {
        String str;
        int optInt = jSONObject.optInt("ttnet_response_verify_enabled", -1);
        JSONArray optJSONArray = jSONObject.optJSONArray("ttnet_response_verify");
        if (optJSONArray != null) {
            str = optJSONArray.toString();
        } else {
            str = "";
        }
        m75720a(optInt, optJSONArray);
        C20787a aVar = new C20787a();
        aVar.f50952a = optInt;
        aVar.f50953b = str;
        return aVar;
    }

    /* renamed from: b */
    private static boolean m75728b(URI uri) {
        try {
            f50950d.lock();
            for (C20788b bVar : f50948b) {
                if (bVar.mo70067a(uri)) {
                    return true;
                }
            }
            f50950d.unlock();
            return false;
        } finally {
            f50950d.unlock();
        }
    }

    /* renamed from: a */
    public static void m75721a(SharedPreferences sharedPreferences) {
        JSONArray jSONArray;
        int i = sharedPreferences.getInt("ttnet_response_verify_enabled", -1);
        String string = sharedPreferences.getString("ttnet_response_verify", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                jSONArray = new JSONArray(string);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            m75720a(i, jSONArray);
        }
        jSONArray = null;
        m75720a(i, jSONArray);
    }

    /* renamed from: a */
    public static void m75724a(List<C20788b> list) {
        try {
            f50951e.lock();
            f50948b = list;
        } finally {
            f50951e.unlock();
        }
    }

    /* renamed from: b */
    private static void m75727b(String str, List<Header> list) {
        try {
            String a = m75719a(C14091i.m57053a(str));
            if (!TextUtils.isEmpty(a)) {
                list.add(new Header("X-TT-VERIFY-ID", a));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m75720a(int i, JSONArray jSONArray) {
        if (i > 0) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    String optString = jSONArray.optString(i2);
                    if (!TextUtils.isEmpty(optString)) {
                        C20788b bVar = new C20788b();
                        if (bVar.mo70066a(optString)) {
                            arrayList.add(bVar);
                        }
                    }
                }
                m75724a(arrayList);
            }
            m75725a(true);
            return;
        }
        m75725a(false);
    }

    /* renamed from: a */
    public static void m75723a(String str, List<Header> list) {
        if (f50947a) {
            m75727b(str, list);
        }
    }

    /* renamed from: b */
    private static void m75726b(Request request, Response response, HttpRequestInfo httpRequestInfo) throws IOException {
        String str;
        Header firstHeader = request.getFirstHeader("X-TT-VERIFY-ID");
        String str2 = null;
        if (firstHeader != null) {
            str = firstHeader.getValue();
        } else {
            str = null;
        }
        Header firstHeader2 = response.getFirstHeader("X-TT-VERIFY-ID");
        if (firstHeader2 != null) {
            str2 = firstHeader2.getValue();
        }
        if (str != null) {
            if (str2 == null) {
                httpRequestInfo.cdnVerifyValue = 1;
                Logger.m15181w("CDN_CACHE_VERIFY", "Cdn cache verify accessible");
            } else if (str.equals(str2)) {
                httpRequestInfo.cdnVerifyValue = 2;
                Logger.m15181w("CDN_CACHE_VERIFY", "Cdn cache verify success");
            } else {
                httpRequestInfo.cdnVerifyValue = 3;
                Logger.m15181w("CDN_CACHE_VERIFY", "Cdn cache verify fail");
                try {
                    response.getBody().in().close();
                } catch (Throwable th) {
                    th.printStackTrace();
                    Logger.m15181w("CDN_CACHE_VERIFY", "Cdn cache verify stream close fail:" + th.toString());
                }
            }
            C20790c.AbstractC20791a b = C20790c.m75739b();
            if (b != null) {
                b.mo70068a(request.getUrl(), httpRequestInfo);
            }
            if (httpRequestInfo.cdnVerifyValue == 3) {
                throw new CdnCacheVerifyException("Fail to verify cdn cache");
            }
        }
    }

    /* renamed from: a */
    public static void m75722a(Request request, Response response, HttpRequestInfo httpRequestInfo) throws IOException {
        if (f50947a) {
            if (httpRequestInfo == null) {
                Logger.m15181w("CDN_CACHE_VERIFY", "Req info is null");
            } else {
                m75726b(request, response, httpRequestInfo);
            }
        }
    }
}
