package com.ss.android.lark.platform.applink;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.lark.applink.AbstractC29180a;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.applink.C29187c;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.p1774k.C36187a;
import com.ss.android.lark.core.p1775l.AbstractC36232b;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.larkconfig.export.p2103a.C41152a;
import com.ss.android.lark.larkconfig.export.p2105c.AbstractC41160a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.ae.C51677a;
import com.ss.android.lark.platform.applink.p2474a.C51711a;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.ug.invitation.C57532a;
import com.ss.android.lark.utils.LarkContext;
import ee.android.framework.manis.C68183b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.applink.a */
public class C51707a {

    /* renamed from: a */
    private static C29187c f128589a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.applink.a$a */
    public static class C51709a extends C41152a {

        /* renamed from: a */
        private final long f128590a;

        /* renamed from: a */
        public long mo177797a() {
            return this.f128590a;
        }

        C51709a(long j) {
            this.f128590a = j;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.applink.a$b */
    public static class C51710b implements AbstractC41160a {
        private C51710b() {
        }

        /* renamed from: a */
        public C51709a mo103073b(String str) {
            try {
                return new C51709a(new JSONObject(str).getLong("net_timeout"));
            } catch (Exception e) {
                Log.m165384e("ApplinkModuleProvider", "Applink config parse error", e);
                return new C51709a(500);
            }
        }
    }

    /* renamed from: b */
    private static long m200498b() {
        return ((C51709a) C51677a.m200443a().mo148569c().mo148555a("short_applink_to_long_applink", new C51710b())).mo177797a();
    }

    /* renamed from: a */
    public static C29187c m200495a() {
        if (f128589a == null) {
            synchronized (C51707a.class) {
                if (f128589a == null) {
                    C29187c a = C29187c.m107300a();
                    f128589a = a;
                    a.mo103465a(LarkContext.getApplication(), new AbstractC29180a() {
                        /* class com.ss.android.lark.platform.applink.C51707a.C517081 */

                        @Override // com.ss.android.lark.applink.AbstractC29180a
                        /* renamed from: a */
                        public boolean mo103452a(String str) {
                            boolean a = C37239a.m146648b().mo136952a(str, C51707a.m200497a(str));
                            Log.m165389i("ApplinkModuleProvider", "getFgValue key = " + str + ", value = " + a);
                            return a;
                        }

                        @Override // com.ss.android.lark.applink.AbstractC29180a
                        /* renamed from: a */
                        public void mo103449a(String str, String str2) {
                            Log.m165379d(str, str2);
                        }

                        @Override // com.ss.android.lark.applink.AbstractC29180a
                        /* renamed from: b */
                        public void mo103453b(String str, String str2) {
                            Log.m165389i(str, str2);
                        }

                        @Override // com.ss.android.lark.applink.AbstractC29180a
                        /* renamed from: c */
                        public void mo103454c(String str, String str2) {
                            Log.m165397w(str, str2);
                        }

                        @Override // com.ss.android.lark.applink.AbstractC29180a
                        /* renamed from: d */
                        public void mo103455d(String str, String str2) {
                            Log.m165383e(str, str2);
                        }

                        @Override // com.ss.android.lark.applink.AbstractC29180a
                        /* renamed from: a */
                        public void mo103447a(Context context, String str) {
                            BrowserModuleProvider.m200667a().mo106842a(context, str);
                        }

                        @Override // com.ss.android.lark.applink.AbstractC29180a
                        /* renamed from: a */
                        public void mo103450a(String str, JSONObject jSONObject) {
                            Statistics.sendEvent(str, jSONObject);
                        }

                        @Override // com.ss.android.lark.applink.AbstractC29180a
                        /* renamed from: a */
                        public void mo103448a(Context context, String str, AppLink appLink) {
                            AppLinkProxy appLinkProxy = (AppLinkProxy) C68183b.m264839a().mo237086a(context, AppLinkProxy.class);
                            if (appLinkProxy != null) {
                                appLinkProxy.handle(str, appLink);
                            }
                        }

                        @Override // com.ss.android.lark.applink.AbstractC29180a
                        /* renamed from: a */
                        public void mo103451a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
                            C36083a.m141486a().getOpenPlatformDependency().mo133020a(str, jSONObject, jSONObject2, jSONObject3);
                        }
                    });
                    f128589a.mo103466a(m200496a(LarkContext.getApplication()));
                    f128589a.mo103463a(m200498b());
                    f128589a.mo103473b(DynamicConfigModule.m145551a(DomainSettings.Alias.OPEN));
                }
            }
        }
        return f128589a;
    }

    /* renamed from: a */
    public static boolean m200497a(String str) {
        Boolean bool = C29187c.m107308b().get(str);
        if (bool == null) {
            Log.m165397w("ApplinkModuleProvider", "getFgDefault " + str + "not in the map so return true");
            bool = Boolean.TRUE;
        }
        return bool.booleanValue();
    }

    /* renamed from: a */
    private static Map<String, AbstractC29186b> m200496a(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(C36083a.m141486a().getHelpdeskDependency().mo132778a(context));
        hashMap.putAll(AbstractC36232b.m142703a().mo178821b().mo105563a(context));
        hashMap.putAll(C57532a.m223304a().getAppLinkHandlers(context));
        hashMap.putAll(C51711a.m200511a());
        hashMap.putAll(C36083a.m141486a().getIMDependency().mo132813a(context));
        hashMap.putAll(C36187a.m142438a().mo160270b(context));
        hashMap.putAll(C36083a.m141486a().getIMDependency().mo132906c(context));
        hashMap.putAll(C36083a.m141486a().getIMDependency().mo132925e(context));
        C36083a.m141486a().getOpenFeatureDependency().mo132992a(context, hashMap);
        return hashMap;
    }
}
