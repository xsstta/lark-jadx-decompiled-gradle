package com.ss.android.lark.platform.network.ttnet;

import android.util.Pair;
import com.bytedance.ttnet.p910a.AbstractC20730a;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.utils.C57765ac;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.chromium.C70010c;
import org.chromium.C70011d;

/* renamed from: com.ss.android.lark.platform.network.ttnet.a */
public class C51875a extends AbstractC20730a {

    /* renamed from: a */
    public static final C51875a f128892a = new C51875a();

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getCarrierRegion() {
        return null;
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getHttpDnsRequestFlags() {
        return "128";
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getStoreIdc() {
        return null;
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getSysRegion() {
        return null;
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getTNCRequestFlags() {
        return "128";
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean isEnableBrotli() {
        return true;
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean isEnableHttp2() {
        return true;
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean isEnableQuic() {
        return true;
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void sendAppMonitorEvent(String str, String str2) {
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAppName() {
        return UIHelper.getAppName();
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDevicePlatform() {
        return super.getDevicePlatform();
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAppId() {
        return String.valueOf(C29410a.m108287a().mo104277a());
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getChannel() {
        return PackageChannelManager.getBuildPackageChannel(LarkContext.getApplication());
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDeviceId() {
        return ServiceFinder.m193762q().getDeviceId();
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getGetDomainDefaultJSON() {
        return SettingManager.getInstance().getString(TTNetConfig.class);
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public ArrayList<byte[]> getOpaqueData() {
        ArrayList<byte[]> a = LarkOpaqueData.f128893a.mo178052a();
        LarkOpaqueData.f128893a.mo178053a(a);
        return a;
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getUserId() {
        return C36083a.m141486a().getPassportDependency().mo133085d();
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getVersionName() {
        return C26246a.m94977a(LarkContext.getApplication());
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public boolean loggerDebug() {
        return C26284k.m95186b(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static void m201177a() {
        try {
            C70011d a = C70011d.m268581a();
            C51875a aVar = f128892a;
            a.setAdapter(aVar);
            C70010c.m268520a().mo246393a(aVar);
        } catch (Throwable th) {
            Log.m165385e("TTNET_CRONET_DEPEND", "inJect", th, true);
        }
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getManifestVersionCode() {
        return C26246a.m94978b(LarkContext.getApplication()) + "";
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, String> getTNCRequestQuery() {
        HashMap hashMap = new HashMap();
        hashMap.put("tenant_id", C36083a.m141486a().getPassportDependency().mo133094m().mo172419a().getTenantId());
        return hashMap;
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getUpdateVersionCode() {
        return C26246a.m94979c(LarkContext.getApplication()) + "";
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getVersionCode() {
        return C26246a.m94978b(LarkContext.getApplication()) + "";
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String[], Pair<byte[], byte[]>> getClientOpaqueData() {
        if (C37239a.m146648b().mo136952a("lark.browser.security.sealcert", false) && C57765ac.m224189c(LarkContext.getApplication())) {
            try {
                HashMap hashMap = new HashMap();
                m201178a(hashMap);
                return hashMap;
            } catch (Exception e) {
                Log.m165384e("TTNET_CRONET_DEPEND", "initWithCertificate", e);
            }
        }
        return super.getClientOpaqueData();
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getRegion() {
        if (C36083a.m141486a().getPassportDependency().mo133089h()) {
            return C36235a.m142710a().mo148282c().mo148304g().getCountry();
        }
        return null;
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, String> getTNCRequestHeader() {
        String str;
        HashMap hashMap = new HashMap();
        int a = C36083a.m141486a().getEnvDependency().mo132692a();
        if (a == 2) {
            str = "staging";
        } else if (a != 3) {
            str = "release";
        } else {
            str = "pre-release";
        }
        hashMap.put("x-env-v2", "type=" + str + ";unit=" + C36083a.m141486a().getEnvDependency().mo132694b() + ";brand=");
        hashMap.put("x-session", C36083a.m141486a().getPassportDependency().mo133086e());
        return hashMap;
    }

    @Override // com.bytedance.ttnet.p910a.AbstractC20730a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onEffectiveConnectionTypeChanged(int i) {
        C51879e.m201203a().mo178054a(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.Map<java.lang.String[], android.util.Pair<byte[], byte[]>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m201178a(java.util.Map<java.lang.String[], android.util.Pair<byte[], byte[]>> r9) {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.platform.network.ttnet.C51875a.m201178a(java.util.Map):void");
    }
}
