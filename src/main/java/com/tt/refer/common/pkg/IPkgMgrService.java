package com.tt.refer.common.pkg;

import android.content.Context;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.tt.refer.impl.business.meta.PackageComponent;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

public interface IPkgMgrService extends IBaseService {
    void downloadAndInstallMainApp(Context context, PackageEntity packageEntity, int i, String str, IPkgDownloadInstallListener iPkgDownloadInstallListener);

    void downloadAndInstallMainOrSubPackage(Context context, PackageEntity packageEntity, int i, String str, IPkgDownloadInstallListener iPkgDownloadInstallListener);

    void downloadAndInstallPackage(Context context, PackageEntity packageEntity, int i, IPkgDownloadInstallListener iPkgDownloadInstallListener);

    void downloadAndInstallSubApp(Context context, PackageEntity packageEntity, int i, String str, IPkgDownloadInstallListener iPkgDownloadInstallListener);

    C67834k getCurrentLoadTask();

    C67834k getLoadTask();

    ConcurrentHashMap<String, IStreamLoader> getLoadTaskMap();

    File getPkgFile(Context context, PackageEntity packageEntity);

    File getSubPkgFile(Context context, PackageEntity packageEntity, PackageComponent packageComponent);

    boolean isPackageInstall(Context context, PackageEntity packageEntity);

    boolean isSubPackageModeSettingsOpen(String str);

    void unInstallAllPackage(Context context, String str);

    void unInstallOtherVersionPackage(Context context, PackageEntity packageEntity);

    void unInstallOtherVersionPackageWenProcessExit(Context context, PackageEntity packageEntity);

    void unInstallPackage(Context context, PackageEntity packageEntity);
}
