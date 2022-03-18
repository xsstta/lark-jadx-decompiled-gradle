package com.lark.falcon.engine.p1058b;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.ref.impl.host.HostExtensionManager;
import com.bytedance.ee.ref.impl.host.HostInterface;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25558a;
import com.larksuite.framework.utils.CollectionUtils;
import com.tt.miniapp.manager.C66375a;
import com.tt.miniapp.manager.p3302a.C66377a;
import com.tt.miniapp.manager.p3302a.p3303a.C66386b;
import com.tt.miniapp.settings.v2.handler.C66792p;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.C67587d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.lark.falcon.engine.b.b */
public class C23950b {

    /* renamed from: a */
    private IJSComponentManager f59275a = new C66386b();

    /* renamed from: a */
    public static HandlerThread m87584a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: a */
    public Map<String, String> mo85965a(Context context) {
        HashMap hashMap = new HashMap();
        HostInterface hostInterface = HostExtensionManager.getInstance().getHostInterface();
        if (hostInterface == null) {
            AppBrandLogger.m52831w("JsWorkerBundleManager", "getComponentVersionMap, hostInterface is null");
            return hashMap;
        }
        List<AbstractC25558a> allBizWorkerProviders = hostInterface.getAllBizWorkerProviders();
        if (CollectionUtils.isEmpty(allBizWorkerProviders)) {
            AppBrandLogger.m52831w("JsWorkerBundleManager", "getComponentVersionMap, not exist workerProvider");
            return hashMap;
        }
        for (AbstractC25558a aVar : allBizWorkerProviders) {
            String c = aVar.mo88702c();
            String a = mo85963a(context, c);
            if (TextUtils.isEmpty(c) || TextUtils.isEmpty(a)) {
                AppBrandLogger.m52831w("JsWorkerBundleManager", "getComponentVersionMap, workerProvider key or version empty");
            } else {
                hashMap.put(c, a);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public String mo85963a(Context context, String str) {
        return C66377a.m259532a(context, str).getString("latest_version", "");
    }

    /* renamed from: b */
    public void mo85967b(final Context context, final String str) {
        final HandlerThread a = m87584a("JsWorkerBundleManager_" + str);
        a.start();
        new Handler(a.getLooper()).postDelayed(new Runnable() {
            /* class com.lark.falcon.engine.p1058b.C23950b.RunnableC239511 */

            public void run() {
                C23950b.this.mo85968c(context, str);
                a.quitSafely();
            }
        }, HostDependManager.getInst().getSettingsRequestDelayTime());
    }

    /* renamed from: c */
    public void mo85968c(Context context, String str) {
        String a = C66792p.m260660a(context).mo232702a(str);
        if (TextUtils.isEmpty(a)) {
            AppBrandLogger.m52829e("JsWorkerBundleManager", "checkUpdateBundle empty setting data, key = " + str);
            return;
        }
        try {
            this.f59275a.mo87406a(context, this.f59275a.mo87402a(context, str, new C67587d().mo234783a(str, new JSONObject(a)).mo234784a()), 2);
        } catch (Exception e) {
            AppBrandLogger.m52829e("JsWorkerBundleManager", "checkUpdateBundle error:", e);
        }
    }

    /* renamed from: a */
    private void m87585a(Context context, String str, String str2) {
        C66377a.m259532a(context, str).edit().putString("latest_version", str2).commit();
    }

    /* renamed from: a */
    public String mo85964a(IAppContext iAppContext, String str, String str2) {
        return C23949a.m87583b(iAppContext, str, str2, mo85963a(iAppContext.getApplicationContext(), str2));
    }

    /* renamed from: a */
    public void mo85966a(IAppContext iAppContext, String str, String str2, String str3) {
        String a = mo85963a(iAppContext.getApplicationContext(), str2);
        if (TextUtils.isEmpty(a) || C66375a.m259526b(str3, a)) {
            C23949a.m87582a(iAppContext, str, str2, str3);
            m87585a(iAppContext.getApplicationContext(), str2, str3);
        }
    }
}
