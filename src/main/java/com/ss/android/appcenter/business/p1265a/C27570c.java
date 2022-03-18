package com.ss.android.appcenter.business.p1265a;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.WebView;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.appcenter.business.dto.AppInfo;
import com.ss.android.appcenter.business.dto.AppType;
import com.ss.android.appcenter.business.monitor.statistics.C27709a;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.p1262a.AbstractC27532a;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27537d;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.appcenter.business.a.c */
public final class C27570c {

    /* renamed from: a */
    public static final ConcurrentHashMap<String, Long> f68788a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static boolean f68789b = false;

    /* renamed from: c */
    private static AbstractC27537d.AbstractC27538a f68790c = new C27574a() {
        /* class com.ss.android.appcenter.business.p1265a.C27570c.C275711 */

        @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27537d.AbstractC27538a, com.ss.android.appcenter.business.p1265a.C27570c.C27574a
        /* renamed from: a */
        public void mo98180a(WebView webView, Context context, String str, Map<String, String> map) {
            if (map.get("app_id") != null && C27570c.f68788a.containsKey(map.get("app_id"))) {
                String str2 = map.get("app_id");
                C28184h.m103246a("AppItemClickHelper", "web app！ onPageFinished " + str2);
                long currentTimeMillis = System.currentTimeMillis() - C27570c.f68788a.get(str2).longValue();
                C28184h.m103246a("AppItemClickHelper", "success! duration： " + currentTimeMillis);
                new C27709a("appcenter_h5_app_on_start_cold").mo98866a(currentTimeMillis).mo98869b("success").mo98868a();
                C27570c.f68788a.remove(str2);
            }
        }

        @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27537d.AbstractC27538a, com.ss.android.appcenter.business.p1265a.C27570c.C27574a
        /* renamed from: a */
        public void mo98179a(WebView webView, Context context, String str, String str2, Map<String, String> map) {
            if (map.get("app_id") != null && C27570c.f68788a.containsKey(map.get("app_id"))) {
                String str3 = map.get("app_id");
                C28184h.m103246a("AppItemClickHelper", "web app！ onReceivedError " + str3);
                new C27709a("appcenter_h5_app_on_start_cold").mo98866a(System.currentTimeMillis() - C27570c.f68788a.get(str3).longValue()).mo98869b("fail").mo98867a(str2).mo98868a();
                C27570c.f68788a.remove(str3);
            }
        }
    };

    /* renamed from: d */
    private static AbstractC27537d.AbstractC27539b f68791d = new AbstractC27537d.AbstractC27539b() {
        /* class com.ss.android.appcenter.business.p1265a.C27570c.C275722 */

        /* renamed from: a */
        private String m100631a(int i) {
            switch (i) {
                case 1:
                    return "get meta info fail";
                case 2:
                    return "app download fail";
                case 3:
                    return "app offline";
                case 4:
                    return "js sdk is too old";
                case 5:
                    return "service is disabled";
                case 6:
                    return "environment is invalid";
                default:
                    return "unkown error";
            }
        }

        @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27537d.AbstractC27539b
        /* renamed from: b */
        public void mo98185b(String str) {
            if (!TextUtils.isEmpty(str)) {
                C28184h.m103246a("AppItemClickHelper", "Mini app！ onCancel " + str);
                C27570c.f68788a.remove(str);
            }
        }

        @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27537d.AbstractC27539b
        /* renamed from: a */
        public void mo98182a(String str) {
            if (!TextUtils.isEmpty(str) && C27570c.f68788a.containsKey(str)) {
                C28184h.m103246a("AppItemClickHelper", "Mini app！ onPageReady " + str);
                new C27709a("appcenter_mini_app_on_start_cold").mo98869b("success").mo98866a(System.currentTimeMillis() - C27570c.f68788a.get(str).longValue()).mo98868a();
                C27570c.f68788a.remove(str);
            }
        }

        @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27537d.AbstractC27539b
        /* renamed from: a */
        public void mo98184a(String str, boolean z) {
            if (z && !TextUtils.isEmpty(str)) {
                C27570c.f68788a.remove(str);
            }
        }

        @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27537d.AbstractC27539b
        /* renamed from: a */
        public void mo98183a(String str, int i) {
            if (!TextUtils.isEmpty(str) && C27570c.f68788a.containsKey(str)) {
                C28184h.m103246a("AppItemClickHelper", "Mini app！ onFailure " + str);
                new C27709a("appcenter_mini_app_on_start_cold").mo98869b("fail").mo98866a(System.currentTimeMillis() - C27570c.f68788a.get(str).longValue()).mo98867a(m100631a(i)).mo98868a();
                C27570c.f68788a.remove(str);
            }
        }
    };

    /* renamed from: com.ss.android.appcenter.business.a.c$a */
    private static class C27574a implements AbstractC27537d.AbstractC27538a {
        @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27537d.AbstractC27538a
        /* renamed from: a */
        public void mo98178a(WebView webView, Context context, String str, SslError sslError, Map<String, String> map) {
        }

        @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27537d.AbstractC27538a
        /* renamed from: a */
        public void mo98179a(WebView webView, Context context, String str, String str2, Map<String, String> map) {
        }

        @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27537d.AbstractC27538a
        /* renamed from: a */
        public void mo98180a(WebView webView, Context context, String str, Map<String, String> map) {
        }

        @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27537d.AbstractC27538a
        /* renamed from: b */
        public void mo98181b(WebView webView, Context context, String str, Map<String, String> map) {
        }

        private C27574a() {
        }
    }

    /* renamed from: a */
    public static void m100619a() {
        if (C27548m.m100547m().mo98223g() != null) {
            C27548m.m100547m().mo98223g().mo98176b(f68790c);
            C27548m.m100547m().mo98223g().mo98177b(f68791d);
        }
        f68789b = false;
    }

    /* renamed from: b */
    private static void m100626b() {
        if (C27548m.m100547m().mo98223g() == null) {
            f68789b = false;
        } else if (!f68789b) {
            C27548m.m100547m().mo98223g().mo98174a(f68790c);
            C27548m.m100547m().mo98223g().mo98175a(f68791d);
            f68789b = true;
        }
    }

    /* renamed from: a */
    private static boolean m100625a(AppInfo appInfo) {
        if (appInfo == null || TextUtils.isEmpty(appInfo.getAppId())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m100623a(String str) {
        m100626b();
        f68788a.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: b */
    private static void m100628b(String str) {
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("app_id");
            if (!TextUtils.isEmpty(queryParameter) && C27548m.m100547m().mo98223g() != null) {
                m100626b();
                f68788a.put(queryParameter, Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Exception e) {
            C28184h.m103248b("AppItemClickHelper", "logMiniAppStart: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m100624a(String str, AppType appType) {
        if (!TextUtils.isEmpty(str)) {
            final long currentTimeMillis = System.currentTimeMillis();
            C27548m.m100547m().mo98220d().mo98210a(str, appType, new AbstractC27532a<String>() {
                /* class com.ss.android.appcenter.business.p1265a.C27570c.C275733 */

                /* renamed from: a */
                public void mo98152a(String str) {
                    new C27709a("appcenter_put_recent_app").mo98869b("success").mo98866a(System.currentTimeMillis() - currentTimeMillis).mo98868a();
                }

                @Override // com.ss.android.appcenter.p1262a.AbstractC27532a
                /* renamed from: a */
                public void mo98151a(ErrorResult errorResult) {
                    String str;
                    int i;
                    long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                    C27709a aVar = new C27709a("appcenter_put_recent_app");
                    if (errorResult != null) {
                        str = errorResult.getErrorMsg();
                    } else {
                        str = "";
                    }
                    C27709a a = aVar.mo98867a(str).mo98869b("fail").mo98866a(currentTimeMillis);
                    if (errorResult != null) {
                        i = errorResult.getErrorCode();
                    } else {
                        i = 0;
                    }
                    a.mo98865a(i).mo98868a();
                }
            });
        }
    }

    /* renamed from: a */
    public static void m100621a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str) && C27548m.m100547m().mo98222f() != null) {
            m100624a(str2, AppType.APP);
            if (C27548m.m100547m().mo98225i().mo98187a("lark.feed.openapp.v2")) {
                C27548m.m100547m().mo98222f().mo98209f(context, str);
            } else {
                C27548m.m100547m().mo98222f().mo98207d(context, str);
            }
        }
    }

    /* renamed from: b */
    public static void m100627b(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str) && str.startsWith("sslocal")) {
            m100628b(str);
            if (C27548m.m100547m().mo98222f() != null) {
                C27548m.m100547m().mo98222f().mo98200a(context, str, CommonCode.StatusCode.API_CLIENT_EXPIRED);
            }
            m100624a(str2, AppType.APP);
        }
    }

    /* renamed from: a */
    public static void m100620a(Context context, AppInfo appInfo, int i, int i2) {
        boolean z;
        String str;
        String str2;
        String str3;
        if (appInfo != null) {
            String url = appInfo.getUrl();
            if (TextUtils.isEmpty(url)) {
                if (!TextUtils.isEmpty(appInfo.getBotId()) && C27548m.m100547m().mo98222f() != null) {
                    if (C27548m.m100547m().mo98225i().mo98187a("lark.feed.openapp.v2")) {
                        C27548m.m100547m().mo98222f().mo98209f(context, appInfo.getBotId());
                    } else {
                        C27548m.m100547m().mo98222f().mo98207d(context, appInfo.getBotId());
                    }
                }
            } else if (url.startsWith("sslocal")) {
                m100628b(url);
                if (C27548m.m100547m().mo98222f() != null) {
                    C27548m.m100547m().mo98222f().mo98200a(context, url, i2);
                } else {
                    C28184h.m103248b("AppItemClickHelper", "RouterProvider null!");
                }
            } else if (url.startsWith("http")) {
                if (url.contains("docs.bytedance.net")) {
                    if (!url.contains("?")) {
                        str3 = url + "?from=appcenter";
                    } else {
                        str3 = url + "&from=appcenter";
                    }
                    str = str3;
                    z = false;
                } else {
                    str = url;
                    z = true;
                }
                if (m100625a(appInfo) && C27548m.m100547m().mo98223g() != null) {
                    m100623a(appInfo.getAppId());
                }
                if (C27548m.m100547m().mo98222f() != null) {
                    if (m100625a(appInfo)) {
                        str2 = appInfo.getAppId();
                    } else {
                        str2 = null;
                    }
                    C27548m.m100547m().mo98222f().mo98202a(context, str, appInfo.getIcon_key(), z, appInfo.getName(), str2);
                    return;
                }
                C28184h.m103248b("AppItemClickHelper", "RouterProvider null!");
            } else if (!appInfo.getCategory_id().equals("102")) {
                C28184h.m103248b("AppItemClickHelper", "error:Unrecognized jump!");
            } else if (C27548m.m100547m().mo98222f() != null) {
                C27548m.m100547m().mo98222f().mo98203a(appInfo.getUrl());
            }
        }
    }

    /* renamed from: a */
    public static void m100622a(Context context, String str, String str2, String str3, String str4, String str5) {
        boolean z;
        String str6;
        String str7;
        if (!TextUtils.isEmpty(str) && str.startsWith("http")) {
            if (str.contains("docs.bytedance.net")) {
                if (!str.contains("?")) {
                    str7 = str + "?from=appcenter";
                } else {
                    str7 = str + "&from=appcenter";
                }
                str6 = str7;
                z = false;
            } else {
                str6 = str;
                z = true;
            }
            if (!(str2 == null || C27548m.m100547m().mo98223g() == null)) {
                m100623a(str2);
            }
            if (C27548m.m100547m().mo98222f() != null) {
                C27548m.m100547m().mo98222f().mo98202a(context, str6, str3, z, str4, str2);
            } else {
                C28184h.m103248b("AppItemClickHelper", "RouterProvider null!");
            }
            m100624a(str5, AppType.APP);
        }
    }
}
