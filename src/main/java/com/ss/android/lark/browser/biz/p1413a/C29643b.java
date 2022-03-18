package com.ss.android.lark.browser.biz.p1413a;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.lark.browser.C29638a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.browser.biz.a.b */
public class C29643b {

    /* renamed from: a */
    private static HashMap<String, String> f74312a;

    /* renamed from: b */
    private static String[] f74313b = {"api.zjurl.cn", "api.larksuite.com", "api.feishu.cn", "oapi.zjurl.cn", "oapi.larksuite.com", "oapi.feishu.cn", "ee.bytedance.net", "file.zjurl.cn", "file.larksuite.com", "file.feishu.cn", "test-api.zjurl.cn", "test-api.larksuite.com", "test-api.feishu.cn", "bear-test.bytedance.net", "feishu-staging.cn", "api-staging.zjurl.cn", "api-staging.feishu.cn"};

    /* renamed from: c */
    private static volatile List<String> f74314c;

    /* renamed from: d */
    private static volatile List<String> f74315d;

    /* renamed from: a */
    public static List<String> m109716a() {
        if (f74314c != null) {
            return f74314c;
        }
        String docsDomain = C29638a.m109622a().getDocsDomain(C29638a.m109622a().getLoginDependency().mo107686f());
        ArrayList arrayList = new ArrayList();
        arrayList.add(docsDomain);
        for (String str : f74312a.keySet()) {
            arrayList.add(str);
        }
        f74314c = arrayList;
        return arrayList;
    }

    /* renamed from: b */
    public static List<String> m109717b() {
        if (f74315d != null) {
            return f74315d;
        }
        String docsDomain = C29638a.m109622a().getDocsDomain(C29638a.m109622a().getLoginDependency().mo107686f());
        ArrayList arrayList = new ArrayList();
        arrayList.add(docsDomain);
        for (String str : f74313b) {
            arrayList.add(str);
        }
        String a = C29638a.m109622a().getManisDependency().mo107691a(DomainSettings.Alias.SUITE_MAIN_DOMAIN);
        if (!TextUtils.isEmpty(a)) {
            arrayList.add(a);
        }
        f74315d = arrayList;
        return arrayList;
    }

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f74312a = hashMap;
        hashMap.put("api.zjurl.cn", "session");
        f74312a.put("oapi.zjurl.cn", "session");
        f74312a.put("ee.bytedance.net", "session");
        f74312a.put("file.zjurl.cn", "session");
        f74312a.put("test-api.zjurl.cn", "session");
        f74312a.put("bear-test.bytedance.net", "session");
        f74312a.put("feishu-staging.cn", "session");
        f74312a.put("api-staging.zjurl.cn", "session");
        f74312a.put("open-staging.bytedance.net", "osession");
        f74312a.put("open.zjurl.cn", "osession");
        f74312a.put("open.larksuite.com", "osession");
        f74312a.put("open.feishu.cn", "osession");
    }

    /* renamed from: a */
    public static String m109715a(String str) {
        String str2 = f74312a.get(str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return "session";
    }
}
