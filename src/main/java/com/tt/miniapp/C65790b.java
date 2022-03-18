package com.tt.miniapp;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.cookie.AppCookieJarMgr;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.larksuite.component.openplatform.core.container.p1118a.p1119a.AbstractC24460a;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.event.C66037e;
import com.tt.miniapp.p3293h.C66194c;
import com.tt.miniapp.preload.PreloadManager;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.refer.common.meta.AbstractC67796c;
import com.tt.refer.common.pkg.AbstractC67830g;
import com.tt.refer.common.pkg.C67834k;
import com.tt.refer.common.pkg.IPkgMgrService;
import com.tt.refer.common.pkg.PackageEntity;
import com.tt.refer.impl.business.meta.GadgetAppInfo;
import com.tt.refer.impl.business.meta.GadgetBeanConverter;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tt.miniapp.b */
public class C65790b implements AbstractC24460a {

    /* renamed from: a */
    public TimeMeter f165812a;

    /* renamed from: b */
    private ConcurrentHashMap<String, AppbrandFragment> f165813b = new ConcurrentHashMap<>();

    @Override // com.larksuite.component.openplatform.core.container.p1118a.p1119a.AbstractC24460a
    /* renamed from: a */
    public void mo87276a(String str, AppbrandFragment appbrandFragment) {
        this.f165813b.put(str, appbrandFragment);
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.p1119a.AbstractC24460a
    /* renamed from: b */
    public AppbrandFragment mo87277b(Context context, String str, IAppContext iAppContext) {
        AppbrandFragment remove;
        if (str == null) {
            return mo87275a(context, str, iAppContext);
        }
        if (TextUtils.isEmpty(str) || (remove = this.f165813b.remove(str)) == null) {
            return mo87275a(context, str, iAppContext);
        }
        return remove;
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.p1119a.AbstractC24460a
    /* renamed from: a */
    public AppbrandFragment mo87275a(Context context, String str, final IAppContext iAppContext) {
        AppCookieJarMgr.m52757a(context, iAppContext);
        boolean featureGating = LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.subpackage.enabled");
        boolean isSubPackageModeSettingsOpen = ((IPkgMgrService) iAppContext.findServiceByInterface(IPkgMgrService.class)).isSubPackageModeSettingsOpen(iAppContext.getAppId());
        AppBrandLogger.m52830i("AppbrandFragmentFetcher", "AppbrandFragment create subPackageOpenFg:" + featureGating + " subPackageOpenSettingsEnable:" + isSubPackageModeSettingsOpen);
        if (featureGating && isSubPackageModeSettingsOpen) {
            this.f165812a = TimeMeter.newAndStart();
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final boolean[] zArr = new boolean[1];
            String str2 = null;
            AbstractC67796c cVar = (AbstractC67796c) iAppContext.findServiceByInterface(AbstractC67796c.class);
            if (cVar != null && (cVar.mo88670a() instanceof GadgetAppInfo)) {
                PackageEntity convertAppInfoEntityToPackageEntity = GadgetBeanConverter.convertAppInfoEntityToPackageEntity((GadgetAppInfo) cVar.mo88670a(), iAppContext);
                if (convertAppInfoEntityToPackageEntity.getRootPaths() != null) {
                    int i = 0;
                    while (true) {
                        if (i >= convertAppInfoEntityToPackageEntity.getRootPaths().size()) {
                            break;
                        } else if (str.startsWith(convertAppInfoEntityToPackageEntity.getRootPaths().get(i))) {
                            str2 = convertAppInfoEntityToPackageEntity.getRootPaths().get(i);
                            AppBrandLogger.m52830i("AppbrandFragmentFetcher", "pagePathRoot:" + str2);
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    AppBrandLogger.m52830i("AppbrandFragmentFetcher", "AppbrandFragment create is subpackage page path :" + str2);
                    SubPackageDownloadManager subPackageDownloadManager = (SubPackageDownloadManager) AppbrandApplicationImpl.getInst(iAppContext).getService(SubPackageDownloadManager.class);
                    subPackageDownloadManager.setOnSubPageInstallListener(new AbstractC67830g() {
                        /* class com.tt.miniapp.C65790b.C657911 */

                        @Override // com.tt.refer.common.pkg.AbstractC67830g
                        /* renamed from: a */
                        public void mo230467a(int i, String str, String str2) {
                            AppBrandLogger.m52830i("AppbrandFragmentFetcher", "onInstallPkgSuccess requestType:" + i + " installPath:" + str + " pagePathRoot:" + str2);
                            zArr[0] = true;
                            if (countDownLatch.getCount() != 0) {
                                countDownLatch.countDown();
                            }
                        }

                        @Override // com.tt.refer.common.pkg.AbstractC67830g
                        /* renamed from: a */
                        public void mo230468a(int i, String str, String str2, String str3) {
                            AppBrandLogger.m52830i("AppbrandFragmentFetcher", "onFailed requestType:" + i + " code:" + str + " reason:" + str2 + " pagePathRoot:" + str3);
                            if (countDownLatch.getCount() != 0) {
                                countDownLatch.countDown();
                            }
                            long stop = TimeMeter.stop(C65790b.this.f165812a);
                            C66036d.m258579a(stop, "download_fail", "miniAppDownloadInstallFail " + str2, TimeMeter.stop(C65790b.this.f165812a), C66037e.m258610a(iAppContext).mo231114a(), iAppContext);
                            new C67500a("app_download_fail", C67501b.aj, iAppContext).setErrorMessage(str).setResultTypeFail().flush();
                            C66194c.m259173a(ErrorCode.DOWNLOAD.UNKNOWN.getCode(), iAppContext);
                        }
                    });
                    subPackageDownloadManager.downloadAndInstallSubPackage(iAppContext, convertAppInfoEntityToPackageEntity, str, str2);
                    if (!zArr[0]) {
                        try {
                            countDownLatch.await(5, TimeUnit.SECONDS);
                        } catch (Exception e) {
                            AppBrandLogger.m52829e("AppbrandFragmentFetcher", "InterruptedException", e);
                            C66036d.m258579a(TimeMeter.stop(this.f165812a), "download_fail", "miniAppDownloadInstallFail exception", TimeMeter.stop(this.f165812a), C66037e.m258610a(iAppContext).mo231114a(), iAppContext);
                            new C67500a("app_download_fail", C67501b.aj, iAppContext).setErrorMessage(ApiHandler.API_CALLBACK_EXCEPTION).setResultTypeFail().flush();
                            C66194c.m259173a(ErrorCode.DOWNLOAD.UNKNOWN.getCode(), iAppContext);
                        }
                    }
                } else {
                    AppBrandLogger.m52830i("AppbrandFragmentFetcher", "AppbrandFragment create is main page path");
                    C67834k kVar = (C67834k) C67485a.m262488a(iAppContext).mo234280a().f170175b.get("__APP__");
                    if (kVar != null) {
                        C67485a.m262488a(iAppContext).mo234280a().f170176c = kVar;
                    } else {
                        AppBrandLogger.m52829e("AppbrandFragmentFetcher", "mainPkgStreamLoader is null");
                    }
                }
            }
        }
        return ((PreloadManager) AppbrandApplicationImpl.getInst(iAppContext).getService(PreloadManager.class)).takePreloadFragment(context, str);
    }
}
