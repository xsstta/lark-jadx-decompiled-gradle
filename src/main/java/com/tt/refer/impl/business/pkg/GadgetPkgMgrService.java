package com.tt.refer.impl.business.pkg;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.manager.C66437h;
import com.tt.miniapp.manager.C66464n;
import com.tt.miniapphost.data.C67485a;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.download.p3418a.C67756a;
import com.tt.refer.common.pkg.AbsPkgMgrService;
import com.tt.refer.common.pkg.PackageEntity;
import com.tt.refer.impl.business.meta.PackageComponent;
import java.io.File;

public class GadgetPkgMgrService extends AbsPkgMgrService {
    private static String TAG = "gadget_app_start_load_pkg_mgr_service";

    @Override // com.tt.refer.common.pkg.AbsPkgMgrService
    public String getPkgSuffix() {
        if (this.mAppContext.getAppType() == AppType.GadgetAPP) {
            return ".pkg";
        }
        return ".zip";
    }

    public GadgetPkgMgrService(IAppContext iAppContext) {
        super(iAppContext);
        if (iAppContext.getAppType() == AppType.WebGadgetAPP) {
            TAG = "h5gadget_app_start_load_pkg_mgr_service";
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.pkg.AbsPkgMgrService
    public boolean tryFindOtherTypeAndInstallPkg(Context context, PackageEntity packageEntity) {
        boolean tryFindOtherTypeAndInstallPkg = super.tryFindOtherTypeAndInstallPkg(context, packageEntity);
        if (!tryFindOtherTypeAndInstallPkg) {
            AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg:new pkg not found,try find it in old dir! identify:", packageEntity.getIdentifier());
            if (C66437h.m259719b(context, packageEntity, 0)) {
                File a = C66437h.m259712a(context, packageEntity, 0);
                if (new C67756a(packageEntity.getMd5()).mo235151a(a) == 0) {
                    IOUtils.copyFile(a, new File(getDownloadDir(context, packageEntity), getPkgFileName(packageEntity, 0)), true);
                    AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg: find legacy normal package, identify:", packageEntity.getIdentifier());
                    return true;
                }
            }
            if (C66437h.m259719b(context, packageEntity, 3)) {
                File a2 = C66437h.m259712a(context, packageEntity, 3);
                if (new C67756a(packageEntity.getMd5()).mo235151a(a2) == 0) {
                    IOUtils.copyFile(a2, new File(getDownloadDir(context, packageEntity), getPkgFileName(packageEntity, 0)), true);
                    AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg: find legacy async package, identify:", packageEntity.getIdentifier());
                    return true;
                }
            }
            if (C66437h.m259719b(context, packageEntity, 1)) {
                File a3 = C66437h.m259712a(context, packageEntity, 1);
                if (new C67756a(packageEntity.getMd5()).mo235151a(a3) == 0) {
                    IOUtils.copyFile(a3, new File(getDownloadDir(context, packageEntity), getPkgFileName(packageEntity, 0)), true);
                    AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg: find legacy preload package, identify:", packageEntity.getIdentifier());
                    return true;
                }
            }
            AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg: no legacy package!", packageEntity.getIdentifier());
        } else {
            AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg: no need legacy package!", packageEntity.getIdentifier());
        }
        return tryFindOtherTypeAndInstallPkg;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.pkg.AbsPkgMgrService
    public void onStreamDownloadFailed(PackageEntity packageEntity, String str, String str2, int i) {
        super.onStreamDownloadFailed(packageEntity, str, str2, i);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.pkg.AbsPkgMgrService
    public void onStreamDownloadSuccess(PackageEntity packageEntity, int i, boolean z, int i2) {
        if (i == 1 && !z) {
            C66464n.C66465a aVar = C67485a.m262488a(this.mAppContext).mo234280a().f170184k;
            aVar.f167770a = getPkgFile(this.mAppContext.getApplicationContext(), packageEntity).getAbsolutePath();
            synchronized (C66464n.AbstractC66466b.class) {
                AppBrandLogger.m52830i(TAG, "localPackageReady......");
                if (aVar.f167771b != null) {
                    aVar.f167771b.localPackageReady(aVar.f167770a);
                    aVar.f167771b = null;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.pkg.AbsPkgMgrService
    public void onSubPackageStreamDownloadSuccess(PackageEntity packageEntity, int i, boolean z, int i2, PackageComponent packageComponent) {
        if (i == 1 && !z) {
            C66464n.C66465a aVar = C67485a.m262488a(this.mAppContext).mo234280a().f170184k;
            aVar.f167770a = getSubPkgFile(this.mAppContext.getApplicationContext(), packageEntity, packageComponent).getAbsolutePath();
            synchronized (C66464n.AbstractC66466b.class) {
                AppBrandLogger.m52830i(TAG, "localPackageReady......");
                if (aVar.f167771b != null) {
                    aVar.f167771b.localPackageReady(aVar.f167770a);
                    aVar.f167771b = null;
                }
            }
        }
    }
}
