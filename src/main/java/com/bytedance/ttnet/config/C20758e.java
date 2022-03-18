package com.bytedance.ttnet.config;

import android.webkit.CookieManager;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.NetworkParams;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f;
import com.bytedance.frameworks.baselib.network.http.impl.C14003a;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.C14055o;
import com.bytedance.frameworks.baselib.network.p740a.C13939c;
import com.bytedance.frameworks.core.p747a.C14092a;
import com.bytedance.ttnet.HttpClient;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.p913d.C20766b;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ttnet.config.e */
public class C20758e implements NetworkParams.AbstractC13973g, C13998f.AbstractC13999a, C13998f.AbstractC14000b, C14092a.AbstractC14093a, HttpClient.AbstractC20719b {

    /* renamed from: g */
    private static volatile C20758e f50847g;

    /* renamed from: a */
    private String f50848a;

    /* renamed from: b */
    private int f50849b;

    /* renamed from: c */
    private int f50850c;

    /* renamed from: d */
    private int f50851d;

    /* renamed from: e */
    private int f50852e;

    /* renamed from: f */
    private int f50853f;

    private C20758e() {
        mo70038h();
    }

    @Override // com.bytedance.frameworks.core.p747a.C14092a.AbstractC14093a
    /* renamed from: c */
    public boolean mo51824c() {
        if (this.f50849b > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.frameworks.core.p747a.C14092a.AbstractC14093a
    /* renamed from: d */
    public boolean mo51825d() {
        if (this.f50850c > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.frameworks.core.p747a.C14092a.AbstractC14093a
    /* renamed from: e */
    public boolean mo51826e() {
        if (this.f50851d > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f.AbstractC14000b
    /* renamed from: b */
    public boolean mo51562b() {
        if (!C20748a.f50799e && this.f50852e > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static C20758e m75635g() {
        if (f50847g == null) {
            synchronized (C20758e.class) {
                if (f50847g == null) {
                    f50847g = new C20758e();
                }
            }
        }
        return f50847g;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f.AbstractC13999a
    /* renamed from: a */
    public boolean mo51561a() {
        if (!C20748a.f50798d && TTNetInit.getTTNetDepend().mo69983a(TTNetInit.getTTNetDepend().mo69984a(), "chromium_boot_failures", 0) > 5) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ttnet.HttpClient.AbstractC20719b
    /* renamed from: f */
    public boolean mo69956f() {
        if (C20748a.f50799e) {
            C14055o.m56892a(0);
            return false;
        } else if (C20748a.f50800f) {
            C14055o.m56892a(8);
            return false;
        } else if (C20748a.m75599i()) {
            return false;
        } else {
            if (!C20748a.f50798d && this.f50853f > 5) {
                C14055o.m56892a(3);
                Logger.m15170e("SyncMainProcessConfig", "After five consecutive crashes of cronet on subprocess, you must reinstall app to enable cronet, or wait until several hours");
                return false;
            } else if (TTNetInit.getTTNetDepend().mo69991b()) {
                return true;
            } else {
                C14055o.m56892a(6);
                return false;
            }
        }
    }

    /* renamed from: h */
    public void mo70038h() {
        Logger.m15181w("SyncMainProcessConfig", "Sync main process config in current process.");
        this.f50848a = TTNetInit.getTTNetDepend().mo69985a(TTNetInit.getTTNetDepend().mo69984a(), "share_cookie_host_list", "");
        TTNetInit.getTTNetDepend().mo69989a(this.f50848a);
        boolean z = false;
        this.f50849b = TTNetInit.getTTNetDepend().mo69983a(TTNetInit.getTTNetDepend().mo69984a(), "add_ss_queries_open", 0);
        int a = TTNetInit.getTTNetDepend().mo69983a(TTNetInit.getTTNetDepend().mo69984a(), "add_ss_queries_header_open", 0);
        this.f50850c = a;
        if (this.f50849b > 0 || a > 0) {
            C20766b.m75669a(true);
        }
        this.f50851d = TTNetInit.getTTNetDepend().mo69983a(TTNetInit.getTTNetDepend().mo69984a(), "add_ss_queries_plaintext_open", 1);
        this.f50852e = TTNetInit.getTTNetDepend().mo69983a(TTNetInit.getTTNetDepend().mo69984a(), "http_dns_enabled", 0);
        this.f50853f = TTNetInit.getTTNetDepend().mo69983a(TTNetInit.getTTNetDepend().mo69984a(), "chromium_boot_failures", 0);
        int a2 = TTNetInit.getTTNetDepend().mo69983a(TTNetInit.getTTNetDepend().mo69984a(), "query_filter_enabled", Integer.MIN_VALUE);
        String a3 = TTNetInit.getTTNetDepend().mo69985a(TTNetInit.getTTNetDepend().mo69984a(), "query_filter_actions", "");
        C13939c.m56420a().mo51301b(TTNetInit.getTTNetDepend().mo69985a(TTNetInit.getTTNetDepend().mo69984a(), "L0_params", ""));
        if (a2 != Integer.MIN_VALUE) {
            C13939c a4 = C13939c.m56420a();
            if (a2 > 0) {
                z = true;
            }
            a4.mo51300a(z);
            C13939c.m56420a().mo51299a(a3);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.NetworkParams.AbstractC13973g
    /* renamed from: b */
    public List<String> mo51378b(String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = this.f50848a.split(",");
        for (String str2 : split) {
            if (!StringUtils.isEmpty(str2)) {
                arrayList.add(str2);
            }
        }
        String g = TTNetInit.getTTNetDepend().mo69996g();
        if (!StringUtils.isEmpty(g) && !m75634a(g, arrayList)) {
            arrayList.add(g);
        }
        if (m75634a(str, arrayList)) {
            return arrayList;
        }
        return null;
    }

    /* renamed from: a */
    private boolean m75634a(String str, List<String> list) {
        if (!StringUtils.isEmpty(str) && !Lists.isEmpty(list)) {
            for (String str2 : list) {
                if (str.endsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.NetworkParams.AbstractC13973g
    /* renamed from: a */
    public List<String> mo51377a(CookieManager cookieManager, C14003a aVar, URI uri) {
        String str;
        if (uri == null) {
            return null;
        }
        if (cookieManager == null && aVar == null) {
            return null;
        }
        try {
            str = uri.getHost();
        } catch (Exception unused) {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        String[] split = this.f50848a.split(",");
        for (String str2 : split) {
            if (!StringUtils.isEmpty(str2)) {
                arrayList.add(str2);
            }
        }
        if (StringUtils.isEmpty(str) || !m75634a(str, arrayList)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (cookieManager != null) {
            String cookie = cookieManager.getCookie(TTNetInit.getTTNetDepend().mo69996g());
            if (!StringUtils.isEmpty(cookie)) {
                arrayList2.add(cookie);
            }
        }
        if (!Lists.isEmpty(arrayList2) || aVar == null) {
            return arrayList2;
        }
        try {
            Map<String, List<String>> map = aVar.get(URI.create(uri.getScheme() + "://" + TTNetInit.getTTNetDepend().mo69996g()), new LinkedHashMap());
            if (map == null || map.isEmpty()) {
                return arrayList2;
            }
            return map.get("Cookie");
        } catch (Throwable th) {
            th.printStackTrace();
            return arrayList2;
        }
    }
}
