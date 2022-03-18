package com.bytedance.frameworks.baselib.network.http.impl;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.concurrent.TTExecutors;
import com.bytedance.frameworks.baselib.network.http.NetworkParams;
import java.io.IOException;
import java.net.CookieManager;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.impl.g */
public class C14015g extends CookieManager {

    /* renamed from: a */
    public static boolean f36732a;

    /* renamed from: g */
    private static boolean f36733g;

    /* renamed from: b */
    public volatile C14003a f36734b;

    /* renamed from: c */
    private final android.webkit.CookieManager f36735c;

    /* renamed from: d */
    private Pattern f36736d = Pattern.compile("(?<=Domain=)([^;]*)", 2);

    /* renamed from: e */
    private final AbstractC14017a f36737e;

    /* renamed from: f */
    private ArrayList<String> f36738f;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.impl.g$a */
    public interface AbstractC14017a {
        /* renamed from: a */
        void mo51621a(String str, String str2, JSONObject jSONObject);
    }

    /* renamed from: a */
    private List<String> m56749a(Map<String, List<String>> map, String str) {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return map.get(str.toLowerCase());
        }
        return list;
    }

    /* renamed from: a */
    private Map<String, List<String>> m56750a(List<String> list, Map<String, List<String>> map) {
        Map<String, List<String>> emptyMap = Collections.emptyMap();
        if (f36732a) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (map != null) {
                List<String> a = m56749a(map, "Cookie");
                if (a == null || a.isEmpty()) {
                    linkedHashMap.put("Cookie", list);
                }
            } else {
                linkedHashMap.put("Cookie", list);
            }
            if (map != null) {
                List<String> a2 = m56749a(map, "X-SS-Cookie");
                if (a2 != null && !a2.isEmpty()) {
                    return linkedHashMap;
                }
                linkedHashMap.put("X-SS-Cookie", list);
                return linkedHashMap;
            }
            linkedHashMap.put("X-SS-Cookie", list);
            return linkedHashMap;
        } else if (map == null) {
            return Collections.singletonMap("Cookie", list);
        } else {
            List<String> a3 = m56749a(map, "Cookie");
            if (a3 == null || a3.isEmpty()) {
                return Collections.singletonMap("Cookie", list);
            }
            return emptyMap;
        }
    }

    /* renamed from: a */
    private void m56751a(String str, boolean z) {
        if (z) {
            android.webkit.CookieManager.getInstance().flush();
            Logger.m15167d("SSCookieHandler", "Force flush cookie: " + str);
            return;
        }
        ArrayList<String> arrayList = this.f36738f;
        if (arrayList != null && !arrayList.isEmpty() && Build.VERSION.SDK_INT >= 21) {
            Iterator<String> it = this.f36738f.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next())) {
                    android.webkit.CookieManager.getInstance().flush();
                    Logger.m15167d("SSCookieHandler", "Path match flush cookie: " + str);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m56753a(URI uri, String str) {
        if (uri != null && !StringUtils.isEmpty(str)) {
            try {
                String lowerCase = uri.getHost().toLowerCase();
                String str2 = "";
                Matcher matcher = this.f36736d.matcher(str);
                if (matcher.find()) {
                    str2 = matcher.group().toLowerCase();
                }
                if (TextUtils.isEmpty(str2) || !lowerCase.endsWith(str2)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0074  */
    @Override // java.net.CookieHandler, java.net.CookieManager
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> get(java.net.URI r7, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r8) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 278
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.impl.C14015g.get(java.net.URI, java.util.Map):java.util.Map");
    }

    @Override // java.net.CookieHandler, java.net.CookieManager
    public void put(URI uri, Map<String, List<String>> map) throws IOException {
        List<String> list;
        boolean z;
        String str;
        String[] strArr;
        String[] strArr2;
        int i;
        int i2;
        Iterator<String> it;
        NetworkParams.AbstractC13973g cookieShareInterceptor = NetworkParams.getCookieShareInterceptor();
        if (cookieShareInterceptor != null) {
            list = cookieShareInterceptor.mo51378b(uri.getHost());
        } else {
            list = null;
        }
        JSONObject jSONObject = new JSONObject();
        int i3 = 0;
        if (map == null || !map.containsKey("Set-Cookie")) {
            z = false;
        } else {
            z = true;
        }
        String str2 = "";
        if (list == null) {
            str = str2;
        } else {
            str = list.toString();
        }
        jSONObject.put("shareHostList", str);
        if (z) {
            jSONObject.put("responseHeaders", map.toString());
        }
        if (uri != null) {
            str2 = uri.toString();
        }
        jSONObject.put("url", str2);
        try {
            NetworkParams.AbstractC13970d appCookieStore = NetworkParams.getAppCookieStore();
            if (appCookieStore != null) {
                appCookieStore.mo51373b(uri, map);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (!f36733g) {
            if (uri == null || map == null || this.f36735c == null) {
                m56752a(jSONObject, "uri responseHeaders or mCookieMgr is null", z);
                return;
            }
            String uri2 = uri.toString();
            if (f36732a) {
                strArr = new String[]{"X-SS-Set-Cookie", "Set-Cookie"};
            } else {
                strArr = new String[]{"Set-Cookie"};
            }
            int length = strArr.length;
            boolean z2 = false;
            while (i3 < length) {
                String str3 = strArr[i3];
                List<String> list2 = map.get(str3);
                if ((list2 == null || list2.isEmpty()) && ((list2 = map.get(str3.toLowerCase())) == null || list2.isEmpty())) {
                    strArr2 = strArr;
                } else {
                    strArr2 = strArr;
                    try {
                        jSONObject.put("cookieMgrList", list2.toString());
                    } catch (JSONException unused) {
                    }
                    Iterator<String> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (next.toLowerCase().trim().contains("sessionid=")) {
                            z2 = true;
                        }
                        this.f36735c.setCookie(uri2, next);
                        try {
                            if (!(!Lists.isEmpty(list))) {
                                i = length;
                                it2 = it2;
                                length = i;
                            } else {
                                Iterator<String> it3 = list.iterator();
                                while (it3.hasNext()) {
                                    String next2 = it3.next();
                                    try {
                                        if (!StringUtils.isEmpty(next2)) {
                                            it = it3;
                                            try {
                                                if (!uri.getHost().endsWith(next2)) {
                                                    if (m56753a(uri, next)) {
                                                        String replaceFirst = this.f36736d.matcher(next).replaceFirst(next2);
                                                        if (!StringUtils.isEmpty(replaceFirst)) {
                                                            i2 = length;
                                                            try {
                                                                this.f36735c.setCookie(next2, replaceFirst);
                                                            } catch (Throwable unused2) {
                                                            }
                                                            it3 = it;
                                                            length = i2;
                                                        }
                                                        i2 = length;
                                                        it3 = it;
                                                        length = i2;
                                                    }
                                                }
                                                it3 = it;
                                            } catch (Throwable unused3) {
                                            }
                                        }
                                    } catch (Throwable unused4) {
                                        it = it3;
                                    }
                                }
                                i = length;
                                if (Logger.debug()) {
                                    Logger.m15178v("SSCookieHandler", "receive cookie: " + uri2 + " " + str3 + ": " + next);
                                }
                                it2 = it2;
                                length = i;
                            }
                        } catch (Throwable unused5) {
                        }
                    }
                }
                i3++;
                strArr = strArr2;
                length = length;
            }
            try {
                m56751a(uri.getPath(), z2);
            } catch (Throwable unused6) {
            }
        }
        if (this.f36734b == null) {
            m56752a(jSONObject, "mAppCookieMgr is null", z);
            return;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (f36732a && map.containsKey("X-SS-Set-Cookie") && !map.containsKey("Set-Cookie")) {
                linkedHashMap.put("Set-Cookie", map.get("X-SS-Set-Cookie"));
            }
            linkedHashMap.putAll(map);
            this.f36734b.put(uri, linkedHashMap);
            if (!(!Lists.isEmpty(list))) {
                m56752a(jSONObject, "isInShareCookieList is false", z);
                return;
            }
            for (String str4 : list) {
                try {
                    if (!StringUtils.isEmpty(str4)) {
                        if (!uri.getHost().endsWith(str4)) {
                            List<String> list3 = map.get("Set-Cookie");
                            if (list3 == null) {
                                m56752a(jSONObject, "cookieList is null", z);
                                return;
                            }
                            LinkedList linkedList = new LinkedList();
                            for (String str5 : list3) {
                                if (m56753a(uri, str5)) {
                                    String replaceFirst2 = this.f36736d.matcher(str5).replaceFirst(str4);
                                    if (!StringUtils.isEmpty(replaceFirst2)) {
                                        linkedList.add(replaceFirst2);
                                    }
                                }
                            }
                            linkedHashMap.put("Set-Cookie", linkedList);
                            C14003a aVar = this.f36734b;
                            aVar.put(URI.create(uri.getScheme() + "://" + str4), linkedHashMap);
                        }
                    }
                } catch (Throwable unused7) {
                }
            }
            m56752a(jSONObject, "last return", z);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m56752a(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null && this.f36737e != null && z) {
            try {
                jSONObject.put("return", str);
            } catch (JSONException unused) {
            }
            this.f36737e.mo51621a("TTNET-COOKIE", "put", jSONObject);
        }
    }

    public C14015g(final Context context, int i, android.webkit.CookieManager cookieManager, ArrayList<String> arrayList, AbstractC14017a aVar) {
        if (i > 0) {
            TTExecutors.getScheduledThreadPool().schedule(new Runnable() {
                /* class com.bytedance.frameworks.baselib.network.http.impl.C14015g.RunnableC140161 */

                public void run() {
                    C14015g.this.f36734b = new C14003a(new C14013f(context), AbstractC14004b.f36699a);
                }
            }, (long) i, TimeUnit.SECONDS);
        } else {
            this.f36734b = new C14003a(new C14013f(context), AbstractC14004b.f36699a);
        }
        this.f36735c = cookieManager;
        this.f36738f = arrayList;
        this.f36737e = aVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", "success");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        AbstractC14017a aVar2 = this.f36737e;
        if (aVar2 != null) {
            aVar2.mo51621a("TTNET-COOKIE", "init", jSONObject);
        }
    }
}
