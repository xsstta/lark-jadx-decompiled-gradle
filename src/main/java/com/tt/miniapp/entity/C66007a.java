package com.tt.miniapp.entity;

import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.falcon.OPSSBPlugin;
import com.ss.android.lark.optrace.p2413c.C48936b;
import com.tt.miniapp.process.info.api.ISandboxEnvInfo;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapp.process.p3316a.C66613b;
import com.tt.miniapphost.appbase.C67466a;
import com.tt.miniapphost.data.C67489c;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.entity.C67523c;
import com.tt.refer.common.util.C67866g;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: com.tt.miniapp.entity.a */
public class C66007a {

    /* renamed from: com.tt.miniapp.entity.a$a */
    public static class C66010a {

        /* renamed from: a */
        public final LinkedHashMap<String, C67523c> f166628a = new LinkedHashMap<>();

        /* renamed from: b */
        public volatile String f166629b;

        /* renamed from: c */
        public volatile String f166630c;
    }

    /* renamed from: d */
    private static C66010a m258497d() {
        return ContextSingletonInstance.getInstance().appJumpDataInstance;
    }

    /* renamed from: a */
    public static void m258485a() {
        C66010a d = m258497d();
        if (!TextUtils.isEmpty(d.f166630c)) {
            IAppSandboxEnvProcessor e = C66645a.m260337a().mo232363e(d.f166630c);
            if (e != null) {
                e.killSandBoxByAppId(d.f166630c);
            } else {
                C48936b.m192783a("processor == null");
            }
            d.f166630c = null;
        }
    }

    /* renamed from: b */
    public static String m258491b() {
        int i;
        SparseArray sparseArray = new SparseArray();
        C66010a d = m258497d();
        Iterator<String> it = d.f166628a.keySet().iterator();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (it.hasNext()) {
                String next = it.next();
                if (i3 < 3) {
                    C67523c cVar = d.f166628a.get(next);
                    if (cVar.mo234478d()) {
                        i4 = 10;
                    }
                    if (cVar.mo234477c()) {
                        i = i4 * 5;
                    } else {
                        i = i4 * 10;
                    }
                    int i5 = i + i3;
                    if (i2 == -1 || i2 > i5) {
                        i2 = i5;
                    }
                    sparseArray.put(i5, cVar.mo234474b());
                    i3++;
                }
            } else {
                String str = (String) sparseArray.get(i2);
                AppBrandLogger.m52830i("AppJumpListManager", "getNeedKillAppId: ", str);
                return str;
            }
        }
    }

    /* renamed from: c */
    public static synchronized void m258496c() {
        C67523c cVar;
        ISandboxEnvInfo a;
        synchronized (C66007a.class) {
            AppBrandLogger.m52828d("AppJumpListManager", "clearAppList");
            C66010a d = m258497d();
            LinkedHashMap linkedHashMap = new LinkedHashMap(d.f166628a);
            d.f166628a.clear();
            String str = "";
            for (String str2 : linkedHashMap.keySet()) {
                if (!TextUtils.isEmpty(str2) && (cVar = (C67523c) linkedHashMap.get(str2)) != null && (a = C66645a.m260337a().mo232354a(str2)) != null && a.isLaunchActivityInHostStack()) {
                    m258493b(str2, str, cVar.mo234477c(), cVar.mo234478d());
                    m258498d(str2);
                    str = str2;
                }
            }
            d.f166629b = str;
            linkedHashMap.clear();
        }
    }

    /* renamed from: b */
    public static boolean m258494b(String str) {
        return m258497d().f166628a.keySet().contains(str);
    }

    /* renamed from: c */
    public static synchronized String m258495c(String str) {
        synchronized (C66007a.class) {
            C66010a d = m258497d();
            if (!d.f166628a.isEmpty()) {
                if (!TextUtils.isEmpty(str)) {
                    C67523c cVar = d.f166628a.get(str);
                    if (cVar == null) {
                        return null;
                    }
                    return cVar.mo234471a();
                }
            }
            return null;
        }
    }

    /* renamed from: d */
    private static void m258498d(String str) {
        AppBrandLogger.m52828d("AppJumpListManager", "notifyUpdateSnapshot appId:", str);
        ISandboxEnvInfo a = C66645a.m260337a().mo232354a(str);
        if (a != null) {
            C66613b.m260243a(a.getProcessIdentity());
        }
    }

    /* renamed from: a */
    public static synchronized C67523c m258484a(String str) {
        synchronized (C66007a.class) {
            C66010a d = m258497d();
            AppBrandLogger.m52828d("AppJumpListManager", "removeApp() called with: appId = [", str, "]", "applist:", d.f166628a);
            C67523c remove = d.f166628a.remove(str);
            if (remove == null) {
                return null;
            }
            if (TextUtils.equals(d.f166629b, str)) {
                d.f166629b = remove.mo234471a();
            } else {
                for (String str2 : d.f166628a.keySet()) {
                    C67523c cVar = d.f166628a.get(str2);
                    if (cVar != null && TextUtils.equals(str, cVar.mo234471a())) {
                        cVar.mo234472a(remove.mo234471a());
                        m258498d(cVar.mo234474b());
                    }
                }
            }
            return remove;
        }
    }

    /* renamed from: b */
    private static synchronized void m258492b(String str, String str2, boolean z) {
        synchronized (C66007a.class) {
            if (TextUtils.isEmpty(str)) {
                AppBrandLogger.m52829e("AppJumpListManager", "addToList() called with: appId isEmpty");
                return;
            }
            C66010a d = m258497d();
            AppBrandLogger.m52828d("AppJumpListManager", "addToList() called with: appId = [", str, "], preAppId = [", str2, "] , applist:", d.f166628a);
            C67523c a = m258484a(str);
            if (a != null) {
                a.mo234472a(str2);
                AppBrandLogger.m52828d("AppJumpListManager", "addToList() updateEntity entity:", a);
                d.f166628a.put(str, a);
                d.f166629b = str;
                return;
            }
            if (z) {
                final String str3 = null;
                int i = 0;
                for (String str4 : d.f166628a.keySet()) {
                    if (d.f166628a.get(str4).mo234477c()) {
                        i++;
                        if (str3 == null) {
                            str3 = d.f166628a.get(str4).mo234474b();
                        }
                    }
                }
                if (i >= 2) {
                    C67866g.m264028a(new Runnable() {
                        /* class com.tt.miniapp.entity.C66007a.RunnableC660081 */

                        public void run() {
                            IAppSandboxEnvProcessor e = C66645a.m260337a().mo232363e(str3);
                            if (e != null) {
                                e.killSandBoxByAppId(str3);
                            } else {
                                C48936b.m192783a("processor is null");
                            }
                        }
                    }, 300);
                }
            }
            if (d.f166628a.size() >= 4) {
                final String b = m258491b();
                C67866g.m264028a(new Runnable() {
                    /* class com.tt.miniapp.entity.C66007a.RunnableC660092 */

                    public void run() {
                        IAppSandboxEnvProcessor e = C66645a.m260337a().mo232363e(b);
                        if (e != null) {
                            e.killSandBoxByAppId(b);
                        } else {
                            C48936b.m192783a("processor is null");
                        }
                    }
                }, 300);
            }
            m258493b(str, str2, z, false);
            d.f166629b = str;
        }
    }

    /* renamed from: a */
    public static synchronized void m258489a(String str, boolean z, boolean z2) {
        synchronized (C66007a.class) {
            AppBrandLogger.m52828d("AppJumpListManager", "updateJumpList() called with: appId = [", str, "],  isGame = [", Boolean.valueOf(z), "]  isSpecial = [", Boolean.valueOf(z2), "]");
            C66010a d = m258497d();
            if (!d.f166628a.containsKey(str)) {
                AppBrandLogger.m52828d("AppJumpListManager", "!applist.containsKey(appId) appId:", str, "currentApp:", d.f166629b, "applist:", d.f166628a);
                String str2 = d.f166629b;
                m258492b(str, d.f166629b, z);
                if (!TextUtils.isEmpty(str2)) {
                    AppBrandLogger.m52829e("AppJumpListManager", "applist invalid", d.f166628a);
                    m258498d(str);
                }
            }
            for (String str3 : d.f166628a.keySet()) {
                if (TextUtils.equals(str, str3) && d.f166628a.get(str3) != null) {
                    d.f166628a.get(str3).mo234476b(z2);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m258490a(java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 307
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.entity.C66007a.m258490a(java.lang.String, java.lang.String, boolean):boolean");
    }

    /* renamed from: a */
    public static void m258487a(String str, String str2, boolean z, boolean z2) {
        m258488a(str, str2, z, z2, null);
    }

    /* renamed from: b */
    private static synchronized void m258493b(String str, String str2, boolean z, boolean z2) {
        synchronized (C66007a.class) {
            if (TextUtils.isEmpty(str)) {
                AppBrandLogger.m52829e("AppJumpListManager", "addAppToList() called with: appId isEmpty");
                return;
            }
            AppBrandLogger.m52828d("AppJumpListManager", "addAppToList() called with: appId = [", str, "], preAppId = [", str2, "]");
            C67523c cVar = new C67523c();
            cVar.mo234475b(str);
            cVar.mo234472a(str2);
            cVar.mo234473a(z);
            cVar.mo234476b(z2);
            m258497d().f166628a.put(str, cVar);
        }
    }

    /* renamed from: a */
    public static void m258488a(String str, String str2, boolean z, boolean z2, C66011b bVar) {
        AppBrandLogger.m52828d("AppJumpListManager", "jumpToApp() called with: schema = [", str, "], preAppId = [", str2, "]");
        String queryParameter = Uri.parse(str).getQueryParameter("app_id");
        if (z2) {
            m258497d().f166630c = str2;
        }
        m258492b(queryParameter, str2, z);
        if (bVar != null && bVar.mo231057a()) {
            OPSSBPlugin.ConvertSchema.Request request = new OPSSBPlugin.ConvertSchema.Request();
            request.mAppIdentify = str2;
            request.mScheme = str;
            request.isFromNormalGadgetContainer = bVar.mo231059b();
            request.mFromSandboxType = bVar.mo231060c();
            OPSSBPlugin.ConvertSchema.Response convertSchemaInSSBIfNeed = OPSSBPlugin.get().convertSchemaInSSBIfNeed(request);
            if (convertSchemaInSSBIfNeed != null && !TextUtils.isEmpty(convertSchemaInSSBIfNeed.mScheme)) {
                str = convertSchemaInSSBIfNeed.mScheme;
            }
        }
        C67489c.m262538a().openAppbrand(new C67466a(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0082  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m258486a(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, java.lang.String r22, java.lang.String r23, int r24, java.lang.String r25) {
        /*
        // Method dump skipped, instructions count: 352
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.entity.C66007a.m258486a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, java.lang.String):void");
    }
}
