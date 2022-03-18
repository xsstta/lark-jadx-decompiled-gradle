package com.ss.android.lark.integrator.ccm.dependency;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.config.DocDynamicConfig;
import com.bytedance.ee.bear.contract.config.InterfaceDomain;
import com.bytedance.ee.bear.contract.config.TenantInfo;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dynamicconfig.C36882a;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.d */
public class C39347d {

    /* renamed from: a */
    private static final IPassportApi f100656a = ((IPassportApi) ApiUtils.getApi(IPassportApi.class));

    /* renamed from: f */
    private static boolean m155100f() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isGlobalWaterMark();
    }

    /* renamed from: b */
    public static String m155096b() {
        LoginInfo a = f100656a.getAccountManager().mo172419a();
        if (a == null) {
            return "";
        }
        return a.getUserName();
    }

    /* renamed from: c */
    public static String m155097c() {
        LoginInfo a = f100656a.getAccountManager().mo172419a();
        if (a == null) {
            return "";
        }
        return a.getUserNameEn();
    }

    /* renamed from: d */
    public static String m155098d() {
        LoginInfo a = f100656a.getAccountManager().mo172419a();
        if (a == null) {
            return "";
        }
        return a.getTenantId();
    }

    /* renamed from: e */
    public static String m155099e() {
        LoginInfo a = f100656a.getAccountManager().mo172419a();
        if (a == null) {
            return "";
        }
        return a.getTenantName();
    }

    /* renamed from: g */
    private static String m155101g() {
        LoginInfo a = f100656a.getAccountManager().mo172419a();
        if (a == null) {
            return "";
        }
        return a.getAvatarUrl();
    }

    /* renamed from: h */
    private static String m155102h() {
        String session = f100656a.getSession();
        if (!TextUtils.isEmpty(session)) {
            return session;
        }
        Log.m165383e("DocDynamicConfigImpl", "preloadDocSdk().getAppKey() appToken is empty");
        return "";
    }

    /* renamed from: a */
    public static DocDynamicConfig m155095a() {
        String str;
        boolean z;
        boolean z2;
        IPassportApi iPassportApi = f100656a;
        int oldSdkEnv = iPassportApi.oldSdkEnv();
        com.bytedance.ee.bear.contract.config.LoginInfo loginInfo = new com.bytedance.ee.bear.contract.config.LoginInfo(iPassportApi.getUserId(), m155102h(), m155101g(), m155096b(), m155097c(), m155098d(), m155099e(), iPassportApi.getAccountManager().mo172423d());
        String deviceId = iPassportApi.getDeviceId();
        String a = C36882a.m145557a(iPassportApi.getTenantCode());
        boolean isOverseaTenantBrand = iPassportApi.isOverseaTenantBrand();
        InterfaceDomain interfaceDomain = new InterfaceDomain(DynamicConfigModule.m145551a(DomainSettings.Alias.DOCS_API), DynamicConfigModule.m145551a(DomainSettings.Alias.DOCS_DRIVE));
        String a2 = DynamicConfigModule.m145551a(DomainSettings.Alias.DOCS_LONG);
        List<String> b = DynamicConfigModule.m145553b(DomainSettings.Alias.DOCS_FRONTIER);
        if (b != null && !b.isEmpty()) {
            a2 = b.get(0);
        }
        String a3 = DynamicConfigModule.m145551a(DomainSettings.Alias.MINA);
        String a4 = DynamicConfigModule.m145551a(DomainSettings.Alias.DOCS_FE_RESOURCE_HOTFIX);
        int a5 = C29410a.m108287a().mo104277a();
        FrontierAppKeyConfig frontierAppKeyConfig = (FrontierAppKeyConfig) SettingManager.getInstance().get(FrontierAppKeyConfig.class);
        if (frontierAppKeyConfig != null) {
            str = frontierAppKeyConfig.f100613a;
        } else {
            str = null;
        }
        TenantInfo tenantInfo = new TenantInfo(a, "", isOverseaTenantBrand, interfaceDomain, a2, b, a3, a4, a5, str);
        boolean z3 = !m155100f();
        Application application = LarkContext.getApplication();
        if (!PackageChannelManager.isKABuildPackage(application) || PackageChannelManager.getDeployMode(application) == 1) {
            z = false;
        } else {
            z = true;
        }
        String buildPackageChannel = PackageChannelManager.getBuildPackageChannel(application);
        String userUnit = iPassportApi.getUserUnit();
        IPassportApi iPassportApi2 = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
        if (iPassportApi2 != null) {
            z2 = iPassportApi2.isUsPackage();
        } else {
            z2 = false;
        }
        Log.m165389i("DocDynamicConfigImpl", "getDocDynamicConfig: showDocWatermark= " + z3 + " isPrivateKaPkg= " + z + " buildPackageChannel= " + buildPackageChannel + "userUnit= " + userUnit + "isUsPackage=" + z2);
        return new DocDynamicConfig(oldSdkEnv, loginInfo, deviceId, tenantInfo, z3, z, buildPackageChannel, userUnit, z2);
    }
}
