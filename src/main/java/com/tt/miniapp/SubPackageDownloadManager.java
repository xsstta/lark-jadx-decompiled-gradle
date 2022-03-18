package com.tt.miniapp;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandServiceManager;
import com.tt.miniapp.event.C66036d;
import com.tt.refer.common.pkg.AbstractC67825c;
import com.tt.refer.common.pkg.AbstractC67830g;
import com.tt.refer.common.pkg.IPkgDownloadInstallListener;
import com.tt.refer.common.pkg.IPkgMgrService;
import com.tt.refer.common.pkg.PackageEntity;

public class SubPackageDownloadManager extends AppbrandServiceManager.ServiceBase {
    public AbstractC67830g mInstallListener;
    public AbstractC67825c mListener;

    protected SubPackageDownloadManager(AppbrandApplicationImpl appbrandApplicationImpl) {
        super(appbrandApplicationImpl);
    }

    public void setOnSubPackageChangedListener(AbstractC67825c cVar) {
        this.mListener = cVar;
    }

    public void setOnSubPageInstallListener(AbstractC67830g gVar) {
        this.mInstallListener = gVar;
    }

    public void downloadAndInstallSubPackage(final IAppContext iAppContext, PackageEntity packageEntity, final String str, final String str2) {
        final long currentTimeMillis = System.currentTimeMillis();
        C66036d.m258598b(str, currentTimeMillis, iAppContext);
        ((IPkgMgrService) iAppContext.findServiceByInterface(IPkgMgrService.class)).downloadAndInstallSubApp(iAppContext.getApplicationContext(), packageEntity, 4, str, new IPkgDownloadInstallListener() {
            /* class com.tt.miniapp.SubPackageDownloadManager.C657151 */

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onDownloadSuccess(int i, boolean z) {
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onDownloading(int i, float f) {
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onFailed(int i, String str, String str2) {
                AppBrandLogger.m52830i("SubPackageDownloadManager", "downloadAndInstallSubPackage fail requestType:", Integer.valueOf(i), "reason:", str2, "code", str);
                C66036d.m258586a("fail", str, System.currentTimeMillis() - currentTimeMillis, iAppContext);
                if (SubPackageDownloadManager.this.mInstallListener != null) {
                    SubPackageDownloadManager.this.mInstallListener.mo230468a(i, str, str2, str2);
                }
                if (SubPackageDownloadManager.this.mListener != null) {
                    SubPackageDownloadManager.this.mListener.mo231042b(i, str, str2);
                }
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onInstallPkgSuccess(int i, String str, String str2) {
                AppBrandLogger.m52830i("SubPackageDownloadManager", "downloadAndInstallSubPackage onInstallPkgSuccess requestType:", Integer.valueOf(i), "installPath:", str, "packageVersion:", str2);
                C66036d.m258586a("success", str, System.currentTimeMillis() - currentTimeMillis, iAppContext);
                if (SubPackageDownloadManager.this.mInstallListener != null) {
                    SubPackageDownloadManager.this.mInstallListener.mo230467a(i, str, str2);
                }
                if (SubPackageDownloadManager.this.mListener != null) {
                    SubPackageDownloadManager.this.mListener.mo231041a(i, str, str2);
                }
            }
        });
    }
}
