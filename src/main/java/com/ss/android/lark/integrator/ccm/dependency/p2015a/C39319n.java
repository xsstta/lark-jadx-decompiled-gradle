package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import android.content.Context;
import com.bytedance.ee.bear.dto.DocAppUserConfig;
import com.bytedance.ee.bear.lark.p414b.AbstractC7993f;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.biz.core.api.C29550b;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dynamicconfig.C36882a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.n */
public class C39319n implements AbstractC7993f {
    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC7993f
    /* renamed from: a */
    public Context mo30986a() {
        return LarkContext.getApplication();
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC7993f
    /* renamed from: b */
    public String mo30988b() {
        return C36882a.m145561e();
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC7993f
    /* renamed from: c */
    public DocAppUserConfig mo30990c() {
        C29550b appConfig = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getAppConfig();
        if (appConfig == null) {
            return null;
        }
        return new DocAppUserConfig(appConfig.mo105625a(), appConfig.mo105657l());
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC7993f
    /* renamed from: e */
    public boolean mo30993e() {
        if (!PackageChannelManager.isKABuildPackage(mo30986a()) || PackageChannelManager.getDeployMode(mo30986a()) == 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC7993f
    /* renamed from: d */
    public DocAppUserConfig mo30992d() {
        DocAppUserConfig docAppUserConfig = new DocAppUserConfig();
        C29550b appConfig = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getAppConfig();
        if (appConfig != null) {
            List<String> a = appConfig.mo105625a();
            Map<Integer, String> l = appConfig.mo105657l();
            docAppUserConfig.setDocDomains(a);
            docAppUserConfig.setUrlRegex(l);
        } else {
            C13479a.m54775e("EnvDependencyImpl", "getCachedDocsDomainsConfig() appUserConfig is null");
        }
        return docAppUserConfig;
    }

    /* renamed from: d */
    public String mo143165d(String str) {
        return C36882a.m145557a(str);
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC7993f
    /* renamed from: a */
    public String mo30987a(String str) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).decodeQRCode(str);
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC7993f
    /* renamed from: b */
    public void mo30989b(String str) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).parseQRCode(mo30986a(), str);
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC7993f
    /* renamed from: c */
    public String mo30991c(String str) {
        return String.format("https://%s/folder/", mo143165d(str));
    }
}
