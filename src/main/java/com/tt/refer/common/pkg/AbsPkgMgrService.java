package com.tt.refer.common.pkg;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.he.jsbinding.snapshot.ISnapshotService;
import com.he.jsbinding.snapshot.SnapshotServiceImpl;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.p3293h.C66194c;
import com.tt.miniapp.settings.v2.handler.C66798s;
import com.tt.miniapp.settings.v2.model.ConfigSplitPackageModel;
import com.tt.miniapp.ttapkgdecoder.TTAPkgInfo;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.KotlinIOUtil;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.refer.common.download.AbsDownloadListener;
import com.tt.refer.common.download.C67752a;
import com.tt.refer.common.download.IDownloadListener;
import com.tt.refer.common.download.engine.model.DownloadRequest;
import com.tt.refer.common.download.p3418a.C67756a;
import com.tt.refer.impl.business.meta.PackageComponent;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import java.io.FileFilter;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbsPkgMgrService implements IPkgMgrService {
    public static String TAG = "app_start_load_pkg_mgr_service";
    protected IAppContext mAppContext;
    protected C67752a mFileDownloader = new C67752a();
    protected IMonitorCreator mPkgMonitorCreator;

    /* access modifiers changed from: protected */
    public int getDownloadPriorityByRequestType(int i) {
        return (i == 0 || i == 4) ? 2 : 1;
    }

    /* access modifiers changed from: protected */
    public abstract String getPkgSuffix();

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public IAppContext getAppContext() {
        return this.mAppContext;
    }

    @Override // com.tt.refer.common.pkg.IPkgMgrService
    public C67834k getCurrentLoadTask() {
        return (C67834k) C67485a.m262488a(this.mAppContext).mo234280a().f170176c;
    }

    @Override // com.tt.refer.common.pkg.IPkgMgrService
    public C67834k getLoadTask() {
        return (C67834k) C67485a.m262488a(this.mAppContext).mo234280a().f170174a;
    }

    @Override // com.tt.refer.common.pkg.IPkgMgrService
    public ConcurrentHashMap<String, IStreamLoader> getLoadTaskMap() {
        return C67485a.m262488a(this.mAppContext).mo234280a().f170175b;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
        AppBrandLogger.m52830i(TAG, "release execute....");
    }

    public void clearSubLoadTaskMap() {
        C67485a.m262488a(getAppContext()).mo234280a().f170175b.clear();
    }

    public void setPkgMonitorCreator(IMonitorCreator iMonitorCreator) {
        this.mPkgMonitorCreator = iMonitorCreator;
    }

    public AbsPkgMgrService(IAppContext iAppContext) {
        this.mAppContext = iAppContext;
    }

    /* access modifiers changed from: protected */
    public boolean needInstall(PackageEntity packageEntity) {
        return getPkgSuffix().equals(".zip");
    }

    public void setCurrentLoadTask(C67834k kVar) {
        C67485a.m262488a(getAppContext()).mo234280a().f170176c = kVar;
    }

    public void setLoadTask(C67834k kVar) {
        C67485a.m262488a(getAppContext()).mo234280a().f170174a = kVar;
    }

    private void notifyPkgTypeChanged(int i) {
        IAppContext iAppContext = this.mAppContext;
        if (iAppContext != null && !iAppContext.isDestroyed()) {
            this.mAppContext.putExtra("installed_pkg_type", Integer.valueOf(i));
        }
    }

    public C67834k getSubLoadTask(String str) {
        return (C67834k) C67485a.m262488a(getAppContext()).mo234280a().f170175b.get(str);
    }

    private String generateUniqueNameByPackageEntity(PackageEntity packageEntity) {
        String str;
        int lastIndexOf;
        String defaultDownloadUrl = packageEntity.getDefaultDownloadUrl();
        if (TextUtils.isEmpty(defaultDownloadUrl) || (lastIndexOf = defaultDownloadUrl.lastIndexOf(47)) <= 0) {
            str = "";
        } else {
            str = defaultDownloadUrl.substring(lastIndexOf + 1);
            int indexOf = str.indexOf(46);
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
        }
        if (TextUtils.isEmpty(str)) {
            return packageEntity.getPackageName();
        }
        return str;
    }

    private boolean isStreamPkgFileLoaded(PackageEntity packageEntity) {
        if (getLoadTask() == null || !Objects.equals(getLoadTask().getAppInfo(), packageEntity) || !getLoadTask().isReady()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public int getDownloadWayByRequest(int i) {
        if (getPkgSuffix().equals(".zip") || !getPkgSuffix().equals(".pkg")) {
            return 0;
        }
        if (i == 0 || i == 3 || i == 4) {
            return 1;
        }
        return 2;
    }

    @Override // com.tt.refer.common.pkg.IPkgMgrService
    public boolean isSubPackageModeSettingsOpen(String str) {
        ConfigSplitPackageModel b = C66798s.m260670a().mo232706b();
        if (b == null || b.disabledAppIdList == null || b.enabledAppIdList == null) {
            return false;
        }
        if (b.enabled) {
            return !b.disabledAppIdList.contains(str);
        }
        return b.enabledAppIdList.contains(str);
    }

    protected static String getFileNameSuffixByRequestType(int i) {
        if (i == 1) {
            return "" + "-async";
        } else if (i == 2) {
            return "" + "-preload";
        } else if (i != 4) {
            return "";
        } else {
            return "" + "-subpackage";
        }
    }

    /* renamed from: com.tt.refer.common.pkg.AbsPkgMgrService$a */
    public static class C67818a implements IPkgDownloadInstallListener {

        /* renamed from: a */
        private final IAppContext f170819a;

        /* renamed from: b */
        private final IPkgDownloadInstallListener f170820b;

        /* renamed from: c */
        private final IMonitorCreator f170821c;

        /* renamed from: d */
        private final PackageEntity f170822d;

        /* renamed from: e */
        private final TimeMeter f170823e;

        /* renamed from: f */
        private final int f170824f;

        @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
        public void onDownloading(int i, float f) {
            this.f170820b.onDownloading(i, f);
        }

        @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
        public void onDownloadSuccess(int i, boolean z) {
            this.f170820b.onDownloadSuccess(i, z);
            LarkInnerEventHelper.mpLoadPackageResult(this.f170821c, this.f170822d.getIdentifier(), i, true, TimeMeter.stop(this.f170823e), null, null, z ? 1 : 0, this.f170819a);
        }

        @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
        public void onFailed(int i, String str, String str2) {
            this.f170820b.onFailed(i, str, str2);
            if (str != null && str.startsWith("10")) {
                IMonitorCreator iMonitorCreator = this.f170821c;
                String identifier = this.f170822d.getIdentifier();
                long stop = TimeMeter.stop(this.f170823e);
                LarkInnerEventHelper.mpLoadPackageResult(iMonitorCreator, identifier, i, false, stop, str, str2 + this.f170822d.getJsonMeta(), 0, this.f170819a);
            }
        }

        @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
        public void onInstallPkgSuccess(int i, String str, String str2) {
            this.f170820b.onInstallPkgSuccess(i, str, str2);
            String packageName = this.f170822d.getPackageName();
            int i2 = this.f170824f;
            if (i2 != 0 && i2 != 3 && i2 != 4 && !TextUtils.isEmpty(packageName)) {
                ISnapshotService iSnapshotService = (ISnapshotService) AppbrandApplicationImpl.getInst(this.f170819a).getService(SnapshotServiceImpl.class);
                if (iSnapshotService.enableSnapshot(packageName, false) && !iSnapshotService.checkSnapshotExist(packageName)) {
                    iSnapshotService.startCreatingNewVersionAppSnapshot(packageName);
                }
            }
        }

        public C67818a(IAppContext iAppContext, IPkgDownloadInstallListener iPkgDownloadInstallListener, IMonitorCreator iMonitorCreator, PackageEntity packageEntity, TimeMeter timeMeter, int i) {
            this.f170819a = iAppContext;
            this.f170820b = iPkgDownloadInstallListener;
            this.f170822d = packageEntity;
            this.f170821c = iMonitorCreator;
            this.f170823e = timeMeter;
            this.f170824f = i;
        }
    }

    @Override // com.tt.refer.common.pkg.IPkgMgrService
    public boolean isPackageInstall(Context context, PackageEntity packageEntity) {
        return isPackageInstall(context, packageEntity, 0);
    }

    @Override // com.tt.refer.common.pkg.IPkgMgrService
    public void unInstallOtherVersionPackage(Context context, PackageEntity packageEntity) {
        uninstallOldPackage(context, packageEntity, true);
    }

    @Override // com.tt.refer.common.pkg.IPkgMgrService
    public final void unInstallOtherVersionPackageWenProcessExit(Context context, PackageEntity packageEntity) {
        uninstallOldPackage(context, packageEntity, false);
    }

    @Override // com.tt.refer.common.pkg.IPkgMgrService
    public File getPkgFile(Context context, PackageEntity packageEntity) {
        return new File(getInstallRootDir(context, packageEntity), getPkgFileName(packageEntity, 0));
    }

    private boolean hasAvailableLocalPkg(Context context, PackageEntity packageEntity) {
        if (isPackageInstall(context, packageEntity, 0) || isPackageInstall(context, packageEntity, 1) || isPackageInstall(context, packageEntity, 2)) {
            return true;
        }
        return false;
    }

    private boolean isStreamSubPkgFileLoaded(PackageEntity packageEntity, C67834k kVar) {
        if (kVar == null || !Objects.equals(kVar.getAppInfo(), packageEntity) || !kVar.isReady()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public String getInstallDirName(PackageEntity packageEntity, int i) {
        String generateUniqueNameByPackageEntity = generateUniqueNameByPackageEntity(packageEntity);
        String fileNameSuffixByRequestType = getFileNameSuffixByRequestType(i);
        return generateUniqueNameByPackageEntity + fileNameSuffixByRequestType;
    }

    /* access modifiers changed from: protected */
    public String getPkgFileName(PackageEntity packageEntity, int i) {
        String generateUniqueNameByPackageEntity = generateUniqueNameByPackageEntity(packageEntity);
        String fileNameSuffixByRequestType = getFileNameSuffixByRequestType(i);
        return generateUniqueNameByPackageEntity + fileNameSuffixByRequestType + getPkgSuffix();
    }

    public void setSubLoadTaskMap(String str, C67834k kVar) {
        C67485a.m262488a(getAppContext()).mo234280a().f170175b.put(str, kVar);
    }

    @Override // com.tt.refer.common.pkg.IPkgMgrService
    public void unInstallPackage(Context context, PackageEntity packageEntity) {
        AppBrandLogger.m52830i(TAG, "unInstallPackage>>", packageEntity);
        IOUtils.delete(getInstallRootDir(context, packageEntity));
    }

    private String generateUniqueNameBySubPackageEntity(PackageEntity packageEntity, PackageComponent packageComponent) {
        String str;
        int lastIndexOf;
        String b = packageComponent.mo235796b();
        if (TextUtils.isEmpty(b) || (lastIndexOf = b.lastIndexOf(47)) <= 0) {
            str = "";
        } else {
            str = b.substring(lastIndexOf + 1);
            int indexOf = str.indexOf(46);
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
        }
        if (TextUtils.isEmpty(str)) {
            return packageEntity.getPackageName();
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public File getDownloadDir(Context context, PackageEntity packageEntity) {
        File g = ((AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235095g();
        File file = new File(g, "download" + File.separator + packageEntity.getIdentifier() + File.separator + packageEntity.getPackageName() + "_" + getPkgSuffix().substring(1));
        if (!file.exists()) {
            file.mkdirs();
        }
        AppBrandLogger.m52830i(TAG, ">>downloadDir>>>", file.getAbsolutePath());
        return file;
    }

    /* access modifiers changed from: protected */
    public File getInstallRootDir(Context context, PackageEntity packageEntity) {
        if (!needInstall(packageEntity)) {
            return getDownloadDir(context, packageEntity);
        }
        File g = ((AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235095g();
        File file = new File(g, "install" + File.separator + packageEntity.getIdentifier() + File.separator + packageEntity.getPackageName() + "_" + getPkgSuffix().substring(1));
        if (!file.exists()) {
            file.mkdirs();
        }
        AppBrandLogger.m52830i(TAG, ">>installDir>>>", file.getAbsolutePath(), "exist:", Boolean.valueOf(file.exists()));
        return file;
    }

    /* access modifiers changed from: protected */
    public boolean tryFindOtherTypeAndInstallPkg(Context context, PackageEntity packageEntity) {
        AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg:>>", packageEntity);
        File installRootDir = getInstallRootDir(context, packageEntity);
        File pkgFile = getPkgFile(context, packageEntity);
        File file = new File(installRootDir, getPkgFileName(packageEntity, 1));
        if (!file.exists()) {
            AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg:>>asyncInstallFile not exist!>>", packageEntity);
        } else if (!pkgFile.exists()) {
            boolean renameTo = file.renameTo(pkgFile);
            if (renameTo) {
                notifyPkgTypeChanged(1);
                AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg:>> asyncInstallFile rename normalInstallFile success!", packageEntity);
            } else {
                AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg:>> asyncInstallFile rename normalInstallFile fail!", packageEntity);
            }
            return renameTo;
        } else {
            AppBrandLogger.m52829e(TAG, "tryFindOtherTypeAndInstallPkg:>> normalInstallFile exist!", packageEntity);
        }
        File file2 = new File(installRootDir, getPkgFileName(packageEntity, 2));
        if (!file2.exists()) {
            AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg:>>preloadInstallFile not  exist!>>", packageEntity);
        } else if (!pkgFile.exists()) {
            boolean renameTo2 = file2.renameTo(pkgFile);
            if (renameTo2) {
                notifyPkgTypeChanged(2);
                AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg:>> preloadInstallFile rename normalInstallFile success!", packageEntity);
            } else {
                AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg:>> preloadInstallFile rename normalInstallFile fail!", packageEntity);
            }
            return renameTo2;
        } else {
            AppBrandLogger.m52829e(TAG, "tryFindOtherTypeAndInstallPkg:>>>> normalInstallFile exist!", packageEntity);
        }
        AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg:>>no other type exist,download it>>", packageEntity);
        return false;
    }

    @Override // com.tt.refer.common.pkg.IPkgMgrService
    public void unInstallAllPackage(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e(TAG, "unInstallAllPackage->identifier is empty!");
            return;
        }
        File g = ((AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235095g();
        File file = new File(g, "download" + File.separator + str + File.separator);
        if (file.exists()) {
            IOUtils.delete(file);
            AppBrandLogger.m52830i(TAG, "download Dir clear->identifier:", str, "path:", file.getAbsolutePath());
        }
        File file2 = new File(g, "install" + File.separator + str + File.separator);
        if (file2.exists()) {
            IOUtils.delete(file2);
            AppBrandLogger.m52830i(TAG, "install Dir clear->identifier:", str, "path:", file2.getAbsolutePath());
        }
    }

    /* access modifiers changed from: protected */
    public boolean tryFindOtherTypeAndInstallZip(Context context, PackageEntity packageEntity) {
        AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallZip:>>", packageEntity);
        File installRootDir = getInstallRootDir(context, packageEntity);
        File installDir = getInstallDir(context, packageEntity, 0);
        File[] listFiles = installDir.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            AppBrandLogger.m52830i(TAG, "normalInstallDir is empty! so delete empty dir!");
            IOUtils.delete(installDir);
        }
        File file = new File(installRootDir, getInstallDirName(packageEntity, 1));
        if (file.exists()) {
            AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallZip:>>asyncInstallDir exist>>", packageEntity);
            File[] listFiles2 = file.listFiles();
            if (listFiles2 == null || listFiles2.length <= 0) {
                AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallZip:>>asyncInstallDir exist but empty,so delete it!>>", packageEntity);
                IOUtils.delete(file);
            } else if (!installDir.exists()) {
                boolean renameTo = file.renameTo(installDir);
                if (renameTo) {
                    notifyPkgTypeChanged(1);
                    AppBrandLogger.m52830i(TAG, "asyncInstallDir rename normalInstallDir success!");
                } else {
                    AppBrandLogger.m52830i(TAG, "asyncInstallDir rename normalInstallDir fail!");
                }
                return renameTo;
            } else {
                AppBrandLogger.m52829e(TAG, "tryFindOtherTypeAndInstallZip:>>normalInstallDir exist!>>", packageEntity);
            }
        } else {
            AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallZip:>>asyncInstallDir not exist!>>", packageEntity);
        }
        File file2 = new File(installRootDir, getInstallDirName(packageEntity, 2));
        if (file2.exists()) {
            AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallZip:>>preloadInstallDir exist>>", packageEntity);
            File[] listFiles3 = file2.listFiles();
            if (listFiles3 == null || listFiles3.length <= 0) {
                AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallZip:>>preloadInstallDir exist but empty,so delete it!>>", packageEntity);
                IOUtils.delete(file2);
            } else if (!installDir.exists()) {
                boolean renameTo2 = file2.renameTo(installDir);
                if (renameTo2) {
                    notifyPkgTypeChanged(2);
                    AppBrandLogger.m52830i(TAG, "preloadInstallDir rename normalInstallDir success!");
                } else {
                    AppBrandLogger.m52830i(TAG, "preloadInstallDir rename normalInstallDir fail!");
                }
                return renameTo2;
            } else {
                AppBrandLogger.m52829e(TAG, "tryFindOtherTypeAndInstallZip:>>>>normalInstallDir exist!>>", packageEntity);
            }
        } else {
            AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallZip:>>preloadInstallDir not exist>>", packageEntity);
        }
        AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallZip:>> no other type local pkg exist!", packageEntity);
        return false;
    }

    /* access modifiers changed from: protected */
    public File getInstallDir(Context context, PackageEntity packageEntity, int i) {
        return new File(getInstallRootDir(context, packageEntity), getInstallDirName(packageEntity, i));
    }

    @Override // com.tt.refer.common.pkg.IPkgMgrService
    public File getSubPkgFile(Context context, PackageEntity packageEntity, PackageComponent packageComponent) {
        return new File(getInstallRootDir(context, packageEntity), getSubPkgFileName(packageEntity, 4, packageComponent));
    }

    private boolean hasAvailableLocalSubPkg(Context context, PackageEntity packageEntity, PackageComponent packageComponent) {
        if (isSubPackageInstall(context, packageEntity, 0, packageComponent) || isSubPackageInstall(context, packageEntity, 1, packageComponent) || isSubPackageInstall(context, packageEntity, 2, packageComponent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public String getSubPackageInstallDirName(PackageEntity packageEntity, PackageComponent packageComponent, int i) {
        String generateUniqueNameBySubPackageEntity = generateUniqueNameBySubPackageEntity(packageEntity, packageComponent);
        String fileNameSuffixByRequestType = getFileNameSuffixByRequestType(i);
        return generateUniqueNameBySubPackageEntity + fileNameSuffixByRequestType;
    }

    /* access modifiers changed from: protected */
    public String getSubPkgFileName(PackageEntity packageEntity, int i, PackageComponent packageComponent) {
        String generateUniqueNameBySubPackageEntity = generateUniqueNameBySubPackageEntity(packageEntity, packageComponent);
        String fileNameSuffixByRequestType = getFileNameSuffixByRequestType(i);
        return generateUniqueNameBySubPackageEntity + fileNameSuffixByRequestType + getPkgSuffix();
    }

    private void uninstallOldPackage(Context context, final PackageEntity packageEntity, boolean z) {
        AppBrandLogger.m52830i(TAG, "unInstallOtherVersionPackage>>>", packageEntity);
        try {
            File[] listFiles = getInstallRootDir(context, packageEntity).getParentFile().listFiles(new FileFilter() {
                /* class com.tt.refer.common.pkg.AbsPkgMgrService.C678071 */

                public boolean accept(File file) {
                    if (TextUtils.isEmpty(packageEntity.getPackageName()) || file.getName().startsWith(packageEntity.getPackageName())) {
                        return false;
                    }
                    return true;
                }
            });
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (z) {
                        IOUtils.delete(file);
                    } else {
                        KotlinIOUtil.m263056a(file);
                    }
                    AppBrandLogger.m52830i(TAG, "uninstall package success:", file.getAbsolutePath());
                }
                return;
            }
            AppBrandLogger.m52830i(TAG, "don't need uninstall package!");
        } catch (SecurityException e) {
            AppBrandLogger.m52829e(TAG, "unInstallOtherVersionPackage failed>>", e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public boolean isPackageInstall(Context context, PackageEntity packageEntity, int i) {
        if (needInstall(packageEntity)) {
            File[] listFiles = getInstallDir(context, packageEntity, i).listFiles();
            if (listFiles != null && listFiles.length > 0) {
                notifyPkgTypeChanged(0);
                AppBrandLogger.m52830i(TAG, "isPackageInstall:>>>> already install:", packageEntity);
                return true;
            }
        } else if (getPkgFile(context, packageEntity).exists()) {
            notifyPkgTypeChanged(0);
            AppBrandLogger.m52830i(TAG, "isPackageInstall:>> already install:", packageEntity);
            return true;
        }
        AppBrandLogger.m52830i(TAG, "isPackageInstall>>not install:", packageEntity);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean tryFindOtherTypeAndInstall(Context context, PackageEntity packageEntity, int i) {
        if (i != 0 && i != 4) {
            AppBrandLogger.m52830i(TAG, "tryFindOtherTypePkg->requestType is not normal", packageEntity);
            return false;
        } else if (getPkgSuffix().equals(".zip")) {
            return tryFindOtherTypeAndInstallZip(context, packageEntity);
        } else {
            if (getPkgSuffix().equals(".pkg")) {
                return tryFindOtherTypeAndInstallPkg(context, packageEntity);
            }
            AppBrandLogger.m52830i(TAG, "tryFindOtherTypePkg:unknown suffix!");
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean tryFindOtherTypeAndInstallSubPkg(Context context, PackageEntity packageEntity, PackageComponent packageComponent) {
        AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg:>>", packageEntity);
        File installRootDir = getInstallRootDir(context, packageEntity);
        File subPkgFile = getSubPkgFile(context, packageEntity, packageComponent);
        File file = new File(installRootDir, getSubPkgFileName(packageEntity, 1, packageComponent));
        if (!file.exists()) {
            AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg:>>asyncInstallFile not exist!>>", packageEntity);
        } else if (!subPkgFile.exists()) {
            boolean renameTo = file.renameTo(subPkgFile);
            if (renameTo) {
                AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg:>> asyncInstallFile rename normalInstallFile success!", packageEntity);
            } else {
                AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg:>> asyncInstallFile rename normalInstallFile fail!", packageEntity);
            }
            return renameTo;
        } else {
            AppBrandLogger.m52829e(TAG, "tryFindOtherTypeAndInstallPkg:>> normalInstallFile exist!", packageEntity);
        }
        File file2 = new File(installRootDir, getSubPkgFileName(packageEntity, 2, packageComponent));
        if (!file2.exists()) {
            AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg:>>preloadInstallFile not  exist!>>", packageEntity);
        } else if (!subPkgFile.exists()) {
            boolean renameTo2 = file2.renameTo(subPkgFile);
            if (renameTo2) {
                AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg:>> preloadInstallFile rename normalInstallFile success!", packageEntity);
            } else {
                AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg:>> preloadInstallFile rename normalInstallFile fail!", packageEntity);
            }
            return renameTo2;
        } else {
            AppBrandLogger.m52829e(TAG, "tryFindOtherTypeAndInstallPkg:>>>> normalInstallFile exist!", packageEntity);
        }
        AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstallPkg:>>no other type exist,download it>>", packageEntity);
        return false;
    }

    /* access modifiers changed from: protected */
    public File getSubPackageInstallDir(Context context, PackageEntity packageEntity, int i, PackageComponent packageComponent) {
        return new File(getInstallRootDir(context, packageEntity), getSubPackageInstallDirName(packageEntity, packageComponent, i));
    }

    /* access modifiers changed from: protected */
    public void onStreamDownloadSuccess(PackageEntity packageEntity, int i, boolean z, int i2) {
        AppBrandLogger.m52830i(TAG, "onStreamDownloadSuccess->", packageEntity, "downloadWay:", Integer.valueOf(i), "fromNet:", Boolean.valueOf(z));
    }

    /* access modifiers changed from: protected */
    public void streamDecodeWithLocalFile(Context context, final PackageEntity packageEntity, final int i, final IPkgDownloadInstallListener iPkgDownloadInstallListener) {
        if (getLoadTask() == null) {
            iPkgDownloadInstallListener.onFailed(i, "-4", "getLoadTask is null");
            return;
        }
        final File pkgFile = getPkgFile(context, packageEntity);
        getLoadTask().mo235467a(pkgFile, new AbstractC67851p() {
            /* class com.tt.refer.common.pkg.AbsPkgMgrService.C678082 */

            @Override // com.tt.refer.common.pkg.AbstractC67851p
            /* renamed from: a */
            public void mo235377a() {
                AppBrandLogger.m52830i(AbsPkgMgrService.TAG, "streamDecodeWithLocalFile-->onHeadInfoLoadSuccess", packageEntity);
                iPkgDownloadInstallListener.onInstallPkgSuccess(i, pkgFile.getAbsolutePath(), packageEntity.getPackageName());
            }

            @Override // com.tt.refer.common.pkg.AbstractC67851p
            /* renamed from: a */
            public void mo235378a(float f) {
                iPkgDownloadInstallListener.onDownloading(i, f);
            }

            @Override // com.tt.refer.common.pkg.AbstractC67851p
            /* renamed from: a */
            public void mo235379a(TTAPkgInfo tTAPkgInfo) {
                AppBrandLogger.m52830i(AbsPkgMgrService.TAG, "streamDecodeWithLocalFile--->onStreamLoadFinish:", packageEntity);
                iPkgDownloadInstallListener.onDownloadSuccess(i, true);
                AbsPkgMgrService.this.onStreamDownloadSuccess(packageEntity, 1, false, i);
            }

            @Override // com.tt.refer.common.pkg.AbstractC67851p
            /* renamed from: a */
            public void mo235380a(String str, String str2) {
                AppBrandLogger.m52829e(AbsPkgMgrService.TAG, "streamDecodeWithLocalFile-->onStreamLoadError", "code:", str, "errMsg:", str2, packageEntity);
                AbsPkgMgrService.this.onStreamDownloadFailed(packageEntity, str, str2, i);
                iPkgDownloadInstallListener.onFailed(i, str, str2);
            }
        }, getAppContext());
    }

    /* access modifiers changed from: package-private */
    public final boolean tryFindOtherTypeAndInstallSubPackage(Context context, PackageEntity packageEntity, int i, PackageComponent packageComponent) {
        if (i != 0 && i != 4) {
            AppBrandLogger.m52830i(TAG, "tryFindOtherTypePkg->requestType is not normal", packageEntity);
            return false;
        } else if (getPkgSuffix().equals(".pkg")) {
            return tryFindOtherTypeAndInstallSubPkg(context, packageEntity, packageComponent);
        } else {
            AppBrandLogger.m52830i(TAG, "tryFindOtherTypePkg:unknown suffix!");
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean isSubPackageInstall(Context context, PackageEntity packageEntity, int i, PackageComponent packageComponent) {
        if (needInstall(packageEntity)) {
            File[] listFiles = getSubPackageInstallDir(context, packageEntity, i, packageComponent).listFiles();
            if (listFiles != null && listFiles.length > 0) {
                AppBrandLogger.m52830i(TAG, "isPackageInstall:>>>> already install:", packageEntity);
                return true;
            }
        } else if (getSubPkgFile(context, packageEntity, packageComponent).exists()) {
            AppBrandLogger.m52830i(TAG, "isPackageInstall:>> already install:", packageEntity);
            return true;
        }
        AppBrandLogger.m52830i(TAG, "isPackageInstall>>not install:", packageEntity);
        return false;
    }

    /* access modifiers changed from: protected */
    public void onStreamDownloadFailed(PackageEntity packageEntity, String str, String str2, int i) {
        AppBrandLogger.m52829e(TAG, "onStreamDownloadFailed->", packageEntity, "errCode:", str, "errMsg:", str2);
        if (i != 0 && i != 4) {
            return;
        }
        if (this.mAppContext.getCurrentActivity() == null || TextUtils.isEmpty(C67432a.m262319a(this.mAppContext).getSchema()) || !HostDependManager.getInst().handleAppbrandDisablePage(this.mAppContext.getCurrentActivity(), C67432a.m262319a(this.mAppContext).getSchema())) {
            C66194c.m259173a(C67485a.m262488a(this.mAppContext).mo234280a().mo234306a(), this.mAppContext);
            return;
        }
        String str3 = TAG;
        AppBrandLogger.m52829e(str3, "onDownloadPkgFail, getIdentifier: " + packageEntity + ", error: " + str2 + ", finish activity");
        this.mAppContext.getCurrentActivity().finish();
    }

    @Override // com.tt.refer.common.pkg.IPkgMgrService
    public final void downloadAndInstallPackage(Context context, PackageEntity packageEntity, int i, IPkgDownloadInstallListener iPkgDownloadInstallListener) {
        AppBrandLogger.m52830i(TAG, "downloadAndInstallPackage>>", packageEntity, "requestType:", Integer.valueOf(i));
        IAppContext iAppContext = this.mAppContext;
        if ((iAppContext instanceof AbstractC67433a) && (i == 4 || i == 3)) {
            ((AbstractC67433a) iAppContext).mo234161a(false);
        }
        TimeMeter newAndStart = TimeMeter.newAndStart();
        LarkInnerEventHelper.mpLoadPackageStart(this.mPkgMonitorCreator, packageEntity.getIdentifier(), i);
        C67818a aVar = new C67818a(this.mAppContext, iPkgDownloadInstallListener, this.mPkgMonitorCreator, packageEntity, newAndStart, i);
        if (TextUtils.isEmpty(packageEntity.getIdentifier())) {
            AppBrandLogger.m52829e(TAG, "downloadAndInstallPackage>>identify is empty!");
            aVar.onFailed(i, C67831h.f170840g.mo235454b(), C67831h.f170840g.mo235453a());
            return;
        }
        int downloadPriorityByRequestType = getDownloadPriorityByRequestType(i);
        if (i == 0 || i == 3 || !hasAvailableLocalPkg(context, packageEntity)) {
            int downloadWayByRequest = getDownloadWayByRequest(i);
            if (downloadWayByRequest != 0) {
                if (downloadWayByRequest != 1) {
                    if (downloadWayByRequest != 2) {
                        throw new RuntimeException("unSupport Download way!:" + downloadWayByRequest);
                    } else if (isPackageInstall(context, packageEntity) || tryFindOtherTypeAndInstall(context, packageEntity, i)) {
                        AppBrandLogger.m52830i(TAG, "downloadAndInstallPackage >> stream download mode >> download already.", packageEntity);
                        aVar.onDownloadSuccess(i, true);
                        aVar.onInstallPkgSuccess(i, getInstallDir(context, packageEntity, i).getAbsolutePath(), packageEntity.getPackageName());
                    } else {
                        AppBrandLogger.m52830i(TAG, "downloadAndInstallPackage >> stream download mode >> stream download online.", packageEntity.getIdentifier());
                        downloadAndInstallPackageFromNet(downloadWayByRequest, context, packageEntity, downloadPriorityByRequestType, i, aVar);
                    }
                } else if (!isStreamPkgFileLoaded(packageEntity) || !(i == 0 || i == 3)) {
                    C67834k loadTask = getLoadTask();
                    if (loadTask != null) {
                        loadTask.release();
                        AppBrandLogger.m52830i(TAG, "release old stream load task....");
                        setLoadTask(null);
                    }
                    C67834k kVar = new C67834k(packageEntity, this.mFileDownloader, getDownloadDir(context, packageEntity), getPkgFileName(packageEntity, i), getInstallDir(context, packageEntity, i).getAbsolutePath(), 10485760, getAppContext());
                    kVar.mo235465a(this.mPkgMonitorCreator);
                    setLoadTask(kVar);
                    if (isPackageInstall(context, packageEntity) || tryFindOtherTypeAndInstall(context, packageEntity, i)) {
                        unInstallOtherVersionPackage(context, packageEntity);
                        AppBrandLogger.m52830i(TAG, "downloadAndInstallPackage >> stream decode local file!", packageEntity);
                        streamDecodeWithLocalFile(context, packageEntity, i, aVar);
                        return;
                    }
                    AppBrandLogger.m52830i(TAG, "downloadAndInstallPackage >> stream decode online.", packageEntity.getIdentifier());
                    downloadAndInstallPackageFromNet(downloadWayByRequest, context, packageEntity, downloadPriorityByRequestType, i, aVar);
                } else {
                    AppBrandLogger.m52830i(TAG, "downloadAndInstallPackage >> stream decode mode >> package is already loaded!", packageEntity);
                    onStreamDownloadSuccess(packageEntity, 1, !getLoadTask().isUseLocalPkg(), i);
                    aVar.onDownloadSuccess(i, true);
                    aVar.onInstallPkgSuccess(i, getInstallDir(context, packageEntity, i).getAbsolutePath(), packageEntity.getPackageName());
                }
            } else if (isPackageInstall(context, packageEntity) || tryFindOtherTypeAndInstall(context, packageEntity, i)) {
                AppBrandLogger.m52830i(TAG, "downloadAndInstallPackage >> cdn mode >> package is already install", packageEntity);
                aVar.onDownloadSuccess(i, true);
                aVar.onInstallPkgSuccess(i, getInstallDir(context, packageEntity, i).getAbsolutePath(), packageEntity.getPackageName());
                unInstallOtherVersionPackage(context, packageEntity);
            } else {
                AppBrandLogger.m52830i(TAG, "tryFindOtherTypeAndInstall fail!", packageEntity);
                downloadAndInstallPackageFromNet(downloadWayByRequest, context, packageEntity, downloadPriorityByRequestType, i, aVar);
            }
        } else {
            AppBrandLogger.m52830i(TAG, "downloadAndInstallPackage >> request type is not normal>>has local pkg!");
            aVar.onDownloadSuccess(i, true);
            aVar.onInstallPkgSuccess(i, getInstallDir(context, packageEntity, i).getAbsolutePath(), packageEntity.getPackageName());
        }
    }

    /* access modifiers changed from: protected */
    public void downloadAndInstallWithStreamDecodeMode(Context context, final PackageEntity packageEntity, int i, final int i2, final IPkgDownloadInstallListener iPkgDownloadInstallListener) {
        if (getLoadTask() == null) {
            iPkgDownloadInstallListener.onFailed(i2, "-4", "getLoadTask is null");
        } else {
            getLoadTask().mo235464a(i, new AbstractC67851p() {
                /* class com.tt.refer.common.pkg.AbsPkgMgrService.C678146 */

                @Override // com.tt.refer.common.pkg.AbstractC67851p
                /* renamed from: a */
                public void mo235377a() {
                    AppBrandLogger.m52830i(AbsPkgMgrService.TAG, "onHeadInfoLoadSuccess success!", packageEntity);
                    IPkgDownloadInstallListener iPkgDownloadInstallListener = iPkgDownloadInstallListener;
                    int i = i2;
                    iPkgDownloadInstallListener.onInstallPkgSuccess(i, AbsPkgMgrService.this.getPkgFileName(packageEntity, i), packageEntity.getPackageName());
                }

                @Override // com.tt.refer.common.pkg.AbstractC67851p
                /* renamed from: a */
                public void mo235378a(float f) {
                    iPkgDownloadInstallListener.onDownloading(i2, f);
                }

                @Override // com.tt.refer.common.pkg.AbstractC67851p
                /* renamed from: a */
                public void mo235379a(TTAPkgInfo tTAPkgInfo) {
                    AppBrandLogger.m52830i(AbsPkgMgrService.TAG, "onStreamLoadFinish >>", packageEntity);
                    iPkgDownloadInstallListener.onDownloadSuccess(i2, false);
                    AbsPkgMgrService.this.onStreamDownloadSuccess(packageEntity, 1, true, i2);
                }

                @Override // com.tt.refer.common.pkg.AbstractC67851p
                /* renamed from: a */
                public void mo235380a(String str, String str2) {
                    AppBrandLogger.m52829e(AbsPkgMgrService.TAG, "downloadAndInstallWithStreamDecodeMode>>onStreamLoadError:", "code:", str, "errMsg:", str2, packageEntity);
                    iPkgDownloadInstallListener.onFailed(i2, str, str2);
                    AbsPkgMgrService.this.onStreamDownloadFailed(packageEntity, str, str2, i2);
                }
            }, this.mAppContext);
        }
    }

    /* access modifiers changed from: protected */
    public void onSubPackageStreamDownloadSuccess(PackageEntity packageEntity, int i, boolean z, int i2, PackageComponent packageComponent) {
        AppBrandLogger.m52830i(TAG, "onStreamDownloadSuccess->", packageEntity, "downloadWay:", Integer.valueOf(i), "fromNet:", Boolean.valueOf(z));
    }

    @Override // com.tt.refer.common.pkg.IPkgMgrService
    public final void downloadAndInstallMainApp(Context context, PackageEntity packageEntity, int i, String str, IPkgDownloadInstallListener iPkgDownloadInstallListener) {
        IAppContext iAppContext = this.mAppContext;
        if ((iAppContext instanceof AbstractC67433a) && (i == 4 || i == 3)) {
            ((AbstractC67433a) iAppContext).mo234161a(true);
        }
        C67834k subLoadTask = getSubLoadTask("__APP__");
        if ("__APP__".equals(str) || subLoadTask == null) {
            downloadAndInstallMainOrSubPackage(context, packageEntity, i, "__APP__", iPkgDownloadInstallListener);
            return;
        }
        String str2 = TAG;
        AppBrandLogger.m52830i(str2, "downloadAndInstallMainApp return pagePath :" + str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        if (r1.contains(r12) == false) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006e  */
    @Override // com.tt.refer.common.pkg.IPkgMgrService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void downloadAndInstallSubApp(android.content.Context r9, com.tt.refer.common.pkg.PackageEntity r10, int r11, java.lang.String r12, com.tt.refer.common.pkg.IPkgDownloadInstallListener r13) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.refer.common.pkg.AbsPkgMgrService.downloadAndInstallSubApp(android.content.Context, com.tt.refer.common.pkg.PackageEntity, int, java.lang.String, com.tt.refer.common.pkg.IPkgDownloadInstallListener):void");
    }

    /* access modifiers changed from: protected */
    public void downloadAndInstallWithDefaultMode(final Context context, final PackageEntity packageEntity, int i, final int i2, final IPkgDownloadInstallListener iPkgDownloadInstallListener) {
        final TimeMeter newAndStart = TimeMeter.newAndStart();
        LarkInnerEventHelper.mpDownloadStart(this.mPkgMonitorCreator, packageEntity.getIdentifier(), i2);
        File downloadDir = getDownloadDir(context, packageEntity);
        String pkgFileName = getPkgFileName(packageEntity, i2);
        DownloadRequest.C67778a aVar = new DownloadRequest.C67778a(packageEntity.getDefaultDownloadUrl());
        aVar.mo235242b(new File(downloadDir, pkgFileName).getAbsolutePath()).mo235239a(pkgFileName).mo235238a(new C67756a(packageEntity.getMd5())).mo235235a(i);
        this.mFileDownloader.mo235135a(aVar.mo235240a(), (IDownloadListener<DownloadRequest>) new AbsDownloadListener<DownloadRequest>() {
            /* class com.tt.refer.common.pkg.AbsPkgMgrService.C678168 */

            /* renamed from: b */
            public void onDownloading(DownloadRequest downloadRequest) {
                float downloadPercent = downloadRequest.getDownloadPercent();
                if (DebugUtil.debug()) {
                    AppBrandLogger.m52830i(AbsPkgMgrService.TAG, "downloadAndInstallWithCdnMode:onDownloading->", Float.valueOf(downloadPercent));
                }
                iPkgDownloadInstallListener.onDownloading(i2, downloadPercent);
            }

            /* renamed from: c */
            public void onComplete(DownloadRequest downloadRequest) {
                AppBrandLogger.m52830i(AbsPkgMgrService.TAG, "downloadAndInstallWithCdnMode >> onComplete", packageEntity.getIdentifier());
                LarkInnerEventHelper.mpDownloadResult(AbsPkgMgrService.this.mPkgMonitorCreator, packageEntity.getIdentifier(), i2, true, downloadRequest.getDownloadUrl(), TimeMeter.stop(newAndStart), null, null);
                iPkgDownloadInstallListener.onDownloadSuccess(i2, false);
                AbsPkgMgrService.this.installPackage(context, packageEntity, downloadRequest.getDownloadPath(), new AbstractC67827e() {
                    /* class com.tt.refer.common.pkg.AbsPkgMgrService.C678168.C678171 */

                    @Override // com.tt.refer.common.pkg.AbstractC67827e
                    /* renamed from: a */
                    public void mo50217a(String str) {
                        AppBrandLogger.m52830i(AbsPkgMgrService.TAG, "downloadAndInstallWithCdnMode >> onInstallPkgSuccess", packageEntity);
                        iPkgDownloadInstallListener.onInstallPkgSuccess(i2, str, packageEntity.getPackageName());
                    }

                    @Override // com.tt.refer.common.pkg.AbstractC67827e
                    /* renamed from: a */
                    public void mo50218a(String str, String str2) {
                        AppBrandLogger.m52829e(AbsPkgMgrService.TAG, "downloadAndInstallWithCdnMode >> onInstallFail:code", str, "reason:", str2, packageEntity);
                        iPkgDownloadInstallListener.onFailed(i2, str, str2);
                    }
                }, i2);
            }

            /* renamed from: a */
            public void onError(DownloadRequest downloadRequest) {
                AppBrandLogger.m52829e(AbsPkgMgrService.TAG, "downloadAndInstallWithCdnMode error:>>code:", downloadRequest.getDownloadError().f170701a, "errorMsg:", downloadRequest.getDownloadError().f170702b, "identify:", packageEntity, "download_url:", downloadRequest.getDownloadUrl());
                IMonitorCreator iMonitorCreator = AbsPkgMgrService.this.mPkgMonitorCreator;
                String identifier = packageEntity.getIdentifier();
                int i = i2;
                String downloadUrl = downloadRequest.getDownloadUrl();
                long stop = TimeMeter.stop(newAndStart);
                String str = downloadRequest.getDownloadError().f170701a;
                LarkInnerEventHelper.mpDownloadResult(iMonitorCreator, identifier, i, false, downloadUrl, stop, str, downloadRequest.getDownloadError().f170702b + packageEntity.getJsonMeta());
                iPkgDownloadInstallListener.onFailed(i2, downloadRequest.getDownloadError().f170701a, downloadRequest.getDownloadError().f170702b);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void downloadAndInstallWithStreamDownloadMode(final Context context, final PackageEntity packageEntity, int i, final int i2, final IPkgDownloadInstallListener iPkgDownloadInstallListener) {
        final TimeMeter newAndStart = TimeMeter.newAndStart();
        LarkInnerEventHelper.mpDownloadStart(this.mPkgMonitorCreator, packageEntity.getIdentifier(), i2);
        File downloadDir = getDownloadDir(context, packageEntity);
        String pkgFileName = getPkgFileName(packageEntity, i2);
        DownloadRequest.C67778a aVar = new DownloadRequest.C67778a(packageEntity.getDefaultDownloadUrl());
        aVar.mo235237a(new C67850o(this.mAppContext)).mo235242b(new File(downloadDir, pkgFileName).getAbsolutePath()).mo235239a(pkgFileName).mo235238a(new C67756a(packageEntity.getMd5())).mo235235a(i);
        this.mFileDownloader.mo235135a(aVar.mo235240a(), (IDownloadListener<DownloadRequest>) new AbsDownloadListener<DownloadRequest>() {
            /* class com.tt.refer.common.pkg.AbsPkgMgrService.C678104 */

            /* renamed from: b */
            public void onDownloading(DownloadRequest downloadRequest) {
                super.onDownloading(downloadRequest);
                iPkgDownloadInstallListener.onDownloading(i2, downloadRequest.getDownloadPercent());
            }

            /* renamed from: c */
            public void onComplete(DownloadRequest downloadRequest) {
                AppBrandLogger.m52830i(AbsPkgMgrService.TAG, "downloadAndInstallWithStreamDownloadMode:success>>identify:", packageEntity);
                LarkInnerEventHelper.mpDownloadResult(AbsPkgMgrService.this.mPkgMonitorCreator, packageEntity.getIdentifier(), i2, true, downloadRequest.getDownloadUrl(), TimeMeter.stop(newAndStart), null, null);
                iPkgDownloadInstallListener.onDownloadSuccess(i2, false);
                AbsPkgMgrService.this.onStreamDownloadSuccess(packageEntity, 2, true, i2);
                final TimeMeter newAndStart = TimeMeter.newAndStart();
                LarkInnerEventHelper.mpInstallStart(AbsPkgMgrService.this.mPkgMonitorCreator, packageEntity.getIdentifier(), i2);
                AbsPkgMgrService.this.installPackage(context, packageEntity, downloadRequest.getDownloadPath(), new AbstractC67827e() {
                    /* class com.tt.refer.common.pkg.AbsPkgMgrService.C678104.C678111 */

                    @Override // com.tt.refer.common.pkg.AbstractC67827e
                    /* renamed from: a */
                    public void mo50217a(String str) {
                        AppBrandLogger.m52830i(AbsPkgMgrService.TAG, "onInstallPkgSuccess>>", str);
                        LarkInnerEventHelper.mpInstallResult(AbsPkgMgrService.this.mPkgMonitorCreator, packageEntity.getIdentifier(), i2, true, TimeMeter.stop(newAndStart), null, null);
                        iPkgDownloadInstallListener.onInstallPkgSuccess(i2, str, packageEntity.getPackageName());
                    }

                    @Override // com.tt.refer.common.pkg.AbstractC67827e
                    /* renamed from: a */
                    public void mo50218a(String str, String str2) {
                        AppBrandLogger.m52829e(AbsPkgMgrService.TAG, "onInstallFail>>code,", str, "reason:", str2);
                        IMonitorCreator iMonitorCreator = AbsPkgMgrService.this.mPkgMonitorCreator;
                        String identifier = packageEntity.getIdentifier();
                        int i = i2;
                        long stop = TimeMeter.stop(newAndStart);
                        LarkInnerEventHelper.mpInstallResult(iMonitorCreator, identifier, i, false, stop, str, str2 + packageEntity.getJsonMeta());
                        iPkgDownloadInstallListener.onFailed(i2, str, str2);
                    }
                }, i2);
            }

            /* renamed from: a */
            public void onError(DownloadRequest downloadRequest) {
                AppBrandLogger.m52829e(AbsPkgMgrService.TAG, "downloadAndInstallWithStreamDownloadMode error:>>code:", downloadRequest.getDownloadError().f170701a, "errorMsg:", downloadRequest.getDownloadError().f170702b, "identify:", packageEntity, "requestType:", Integer.valueOf(i2));
                IMonitorCreator iMonitorCreator = AbsPkgMgrService.this.mPkgMonitorCreator;
                String identifier = packageEntity.getIdentifier();
                int i = i2;
                String downloadUrl = downloadRequest.getDownloadUrl();
                long stop = TimeMeter.stop(newAndStart);
                String str = downloadRequest.getDownloadError().f170701a;
                LarkInnerEventHelper.mpDownloadResult(iMonitorCreator, identifier, i, false, downloadUrl, stop, str, downloadRequest.getDownloadError().f170702b + packageEntity.getJsonMeta());
                iPkgDownloadInstallListener.onFailed(i2, downloadRequest.getDownloadError().f170701a, downloadRequest.getDownloadError().f170702b);
                AbsPkgMgrService.this.onStreamDownloadFailed(packageEntity, downloadRequest.getDownloadError().f170701a, downloadRequest.getDownloadError().f170702b, i2);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void installPackage(Context context, PackageEntity packageEntity, String str, AbstractC67827e eVar, int i) {
        File file = new File(str);
        if (!file.exists()) {
            eVar.mo50218a(C67831h.f170841h.mo235454b(), C67831h.f170841h.mo235453a());
        } else if (!needInstall(packageEntity)) {
            eVar.mo50217a(str);
        } else {
            File installDir = getInstallDir(context, packageEntity, i);
            if (installDir.exists()) {
                IOUtils.delete(installDir);
            }
            installDir.mkdirs();
            try {
                IOUtils.unZipFolder(file.getAbsolutePath(), installDir.getAbsolutePath());
                IOUtils.delete(file);
                eVar.mo50217a(installDir.getAbsolutePath());
            } catch (Exception e) {
                IOUtils.delete(installDir);
                AppBrandLogger.m52829e(TAG, "install fail:", e.getMessage());
                eVar.mo50218a(C67831h.f170839f.mo235454b(), Log.getStackTraceString(e));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ca  */
    @Override // com.tt.refer.common.pkg.IPkgMgrService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void downloadAndInstallMainOrSubPackage(android.content.Context r23, com.tt.refer.common.pkg.PackageEntity r24, int r25, java.lang.String r26, com.tt.refer.common.pkg.IPkgDownloadInstallListener r27) {
        /*
        // Method dump skipped, instructions count: 610
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.refer.common.pkg.AbsPkgMgrService.downloadAndInstallMainOrSubPackage(android.content.Context, com.tt.refer.common.pkg.PackageEntity, int, java.lang.String, com.tt.refer.common.pkg.IPkgDownloadInstallListener):void");
    }

    public void downloadAndInstallPackageFromNet(int i, Context context, PackageEntity packageEntity, int i2, int i3, IPkgDownloadInstallListener iPkgDownloadInstallListener) {
        if (i == 0) {
            downloadAndInstallWithDefaultMode(context, packageEntity, i2, i3, iPkgDownloadInstallListener);
        } else if (i == 1) {
            downloadAndInstallWithStreamDecodeMode(context, packageEntity, i2, i3, iPkgDownloadInstallListener);
        } else if (i == 2) {
            downloadAndInstallWithStreamDownloadMode(context, packageEntity, i2, i3, iPkgDownloadInstallListener);
        } else {
            throw new RuntimeException("unSupport Download way!:" + i);
        }
    }

    /* access modifiers changed from: protected */
    public void subPkgStreamDecodeWithLocalFile(Context context, final PackageEntity packageEntity, final int i, final PackageComponent packageComponent, C67834k kVar, final IPkgDownloadInstallListener iPkgDownloadInstallListener) {
        if (kVar != null || iPkgDownloadInstallListener == null) {
            final File subPkgFile = getSubPkgFile(context, packageEntity, packageComponent);
            kVar.mo235467a(subPkgFile, new AbstractC67851p() {
                /* class com.tt.refer.common.pkg.AbsPkgMgrService.C678093 */

                @Override // com.tt.refer.common.pkg.AbstractC67851p
                /* renamed from: a */
                public void mo235377a() {
                    AppBrandLogger.m52830i(AbsPkgMgrService.TAG, "streamDecodeWithLocalFile-->onHeadInfoLoadSuccess", packageEntity);
                    IPkgDownloadInstallListener iPkgDownloadInstallListener = iPkgDownloadInstallListener;
                    if (iPkgDownloadInstallListener != null) {
                        iPkgDownloadInstallListener.onInstallPkgSuccess(i, subPkgFile.getAbsolutePath(), packageEntity.getPackageName());
                    }
                }

                @Override // com.tt.refer.common.pkg.AbstractC67851p
                /* renamed from: a */
                public void mo235378a(float f) {
                    IPkgDownloadInstallListener iPkgDownloadInstallListener = iPkgDownloadInstallListener;
                    if (iPkgDownloadInstallListener != null) {
                        iPkgDownloadInstallListener.onDownloading(i, f);
                    }
                }

                @Override // com.tt.refer.common.pkg.AbstractC67851p
                /* renamed from: a */
                public void mo235379a(TTAPkgInfo tTAPkgInfo) {
                    AppBrandLogger.m52830i(AbsPkgMgrService.TAG, "streamDecodeWithLocalFile--->onStreamLoadFinish:", packageEntity);
                    IPkgDownloadInstallListener iPkgDownloadInstallListener = iPkgDownloadInstallListener;
                    if (iPkgDownloadInstallListener != null) {
                        iPkgDownloadInstallListener.onDownloadSuccess(i, true);
                    }
                    AbsPkgMgrService.this.onSubPackageStreamDownloadSuccess(packageEntity, 1, false, i, packageComponent);
                }

                @Override // com.tt.refer.common.pkg.AbstractC67851p
                /* renamed from: a */
                public void mo235380a(String str, String str2) {
                    AppBrandLogger.m52829e(AbsPkgMgrService.TAG, "streamDecodeWithLocalFile-->onStreamLoadError", "code:", str, "errMsg:", str2, packageEntity);
                    AbsPkgMgrService.this.onStreamDownloadFailed(packageEntity, str, str2, i);
                    IPkgDownloadInstallListener iPkgDownloadInstallListener = iPkgDownloadInstallListener;
                    if (iPkgDownloadInstallListener != null) {
                        iPkgDownloadInstallListener.onFailed(i, str, str2);
                    }
                }
            }, getAppContext());
            return;
        }
        iPkgDownloadInstallListener.onFailed(i, "-4", "getLoadTask is null");
    }

    /* access modifiers changed from: protected */
    public void downloadAndInstallWithStreamDownloadMode(final Context context, final PackageEntity packageEntity, int i, final int i2, final PackageComponent packageComponent, final IPkgDownloadInstallListener iPkgDownloadInstallListener) {
        String str;
        final TimeMeter newAndStart = TimeMeter.newAndStart();
        LarkInnerEventHelper.mpDownloadStart(this.mPkgMonitorCreator, packageEntity.getIdentifier(), i2);
        File downloadDir = getDownloadDir(context, packageEntity);
        String subPkgFileName = getSubPkgFileName(packageEntity, 1, packageComponent);
        DownloadRequest.C67778a aVar = new DownloadRequest.C67778a(packageComponent.mo235796b());
        if (packageComponent != null) {
            str = packageComponent.mo235792a();
        } else {
            str = packageEntity.getMd5();
        }
        aVar.mo235237a(new C67850o(this.mAppContext)).mo235242b(new File(downloadDir, subPkgFileName).getAbsolutePath()).mo235239a(subPkgFileName).mo235238a(new C67756a(str)).mo235235a(i);
        this.mFileDownloader.mo235135a(aVar.mo235240a(), (IDownloadListener<DownloadRequest>) new AbsDownloadListener<DownloadRequest>() {
            /* class com.tt.refer.common.pkg.AbsPkgMgrService.C678125 */

            /* renamed from: b */
            public void onDownloading(DownloadRequest downloadRequest) {
                super.onDownloading(downloadRequest);
                iPkgDownloadInstallListener.onDownloading(i2, downloadRequest.getDownloadPercent());
            }

            /* renamed from: a */
            public void onError(DownloadRequest downloadRequest) {
                AppBrandLogger.m52829e(AbsPkgMgrService.TAG, "downloadAndInstallWithStreamDownloadMode error:>>code:", downloadRequest.getDownloadError().f170701a, "errorMsg:", downloadRequest.getDownloadError().f170702b, "identify:", packageEntity, "requestType:", Integer.valueOf(i2));
                iPkgDownloadInstallListener.onFailed(i2, downloadRequest.getDownloadError().f170701a, downloadRequest.getDownloadError().f170702b);
                AbsPkgMgrService.this.onStreamDownloadFailed(packageEntity, downloadRequest.getDownloadError().f170701a, downloadRequest.getDownloadError().f170702b, i2);
            }

            /* renamed from: c */
            public void onComplete(DownloadRequest downloadRequest) {
                AppBrandLogger.m52830i(AbsPkgMgrService.TAG, "downloadAndInstallWithStreamDownloadMode:success>>identify:", packageEntity);
                LarkInnerEventHelper.mpDownloadResult(AbsPkgMgrService.this.mPkgMonitorCreator, packageEntity.getIdentifier(), i2, true, downloadRequest.getDownloadUrl(), TimeMeter.stop(newAndStart), null, null);
                iPkgDownloadInstallListener.onDownloadSuccess(i2, false);
                AbsPkgMgrService.this.onSubPackageStreamDownloadSuccess(packageEntity, 2, true, i2, packageComponent);
                final TimeMeter newAndStart = TimeMeter.newAndStart();
                LarkInnerEventHelper.mpInstallStart(AbsPkgMgrService.this.mPkgMonitorCreator, packageEntity.getIdentifier(), i2);
                AbsPkgMgrService.this.installPackage(context, packageEntity, downloadRequest.getDownloadPath(), new AbstractC67827e() {
                    /* class com.tt.refer.common.pkg.AbsPkgMgrService.C678125.C678131 */

                    @Override // com.tt.refer.common.pkg.AbstractC67827e
                    /* renamed from: a */
                    public void mo50217a(String str) {
                        AppBrandLogger.m52830i(AbsPkgMgrService.TAG, "onInstallPkgSuccess>>", str);
                        LarkInnerEventHelper.mpInstallResult(AbsPkgMgrService.this.mPkgMonitorCreator, packageEntity.getIdentifier(), i2, true, TimeMeter.stop(newAndStart), null, null);
                        iPkgDownloadInstallListener.onInstallPkgSuccess(i2, str, packageEntity.getPackageName());
                    }

                    @Override // com.tt.refer.common.pkg.AbstractC67827e
                    /* renamed from: a */
                    public void mo50218a(String str, String str2) {
                        AppBrandLogger.m52829e(AbsPkgMgrService.TAG, "onInstallFail>>code,", str, "reason:", str2);
                        IMonitorCreator iMonitorCreator = AbsPkgMgrService.this.mPkgMonitorCreator;
                        String identifier = packageEntity.getIdentifier();
                        int i = i2;
                        long stop = TimeMeter.stop(newAndStart);
                        LarkInnerEventHelper.mpInstallResult(iMonitorCreator, identifier, i, false, stop, str, str2 + packageEntity.getJsonMeta());
                        iPkgDownloadInstallListener.onFailed(i2, str, str2);
                    }
                }, i2);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void downloadAndInstallSubPackageWithStreamDecodeMode(Context context, final PackageEntity packageEntity, int i, final int i2, final PackageComponent packageComponent, C67834k kVar, final IPkgDownloadInstallListener iPkgDownloadInstallListener) {
        if (kVar == null) {
            iPkgDownloadInstallListener.onFailed(i2, "-4", "getLoadTask is null");
        } else {
            kVar.mo235468b(i, new AbstractC67851p() {
                /* class com.tt.refer.common.pkg.AbsPkgMgrService.C678157 */

                @Override // com.tt.refer.common.pkg.AbstractC67851p
                /* renamed from: a */
                public void mo235377a() {
                    AppBrandLogger.m52830i(AbsPkgMgrService.TAG, "onHeadInfoLoadSuccess success!", packageEntity);
                    iPkgDownloadInstallListener.onInstallPkgSuccess(i2, AbsPkgMgrService.this.getSubPkgFileName(packageEntity, i2, packageComponent), packageEntity.getPackageName());
                }

                @Override // com.tt.refer.common.pkg.AbstractC67851p
                /* renamed from: a */
                public void mo235378a(float f) {
                    iPkgDownloadInstallListener.onDownloading(i2, f);
                }

                @Override // com.tt.refer.common.pkg.AbstractC67851p
                /* renamed from: a */
                public void mo235379a(TTAPkgInfo tTAPkgInfo) {
                    AppBrandLogger.m52830i(AbsPkgMgrService.TAG, "onStreamLoadFinish >>", packageEntity);
                    iPkgDownloadInstallListener.onDownloadSuccess(i2, false);
                    AbsPkgMgrService.this.onSubPackageStreamDownloadSuccess(packageEntity, 1, true, i2, packageComponent);
                }

                @Override // com.tt.refer.common.pkg.AbstractC67851p
                /* renamed from: a */
                public void mo235380a(String str, String str2) {
                    AppBrandLogger.m52829e(AbsPkgMgrService.TAG, "downloadAndInstallWithStreamDecodeMode>>onStreamLoadError:", "code:", str, "errMsg:", str2, packageEntity);
                    iPkgDownloadInstallListener.onFailed(i2, str, str2);
                    AbsPkgMgrService.this.onStreamDownloadFailed(packageEntity, str, str2, i2);
                }
            }, this.mAppContext);
        }
    }

    public void downloadAndInstallSubPackageFromNet(int i, Context context, PackageEntity packageEntity, int i2, int i3, PackageComponent packageComponent, C67834k kVar, IPkgDownloadInstallListener iPkgDownloadInstallListener) {
        if (i == 1) {
            downloadAndInstallSubPackageWithStreamDecodeMode(context, packageEntity, i2, i3, packageComponent, kVar, iPkgDownloadInstallListener);
        } else if (i == 2) {
            downloadAndInstallWithStreamDownloadMode(context, packageEntity, i2, i3, packageComponent, iPkgDownloadInstallListener);
        } else {
            throw new RuntimeException("unSupport Download way!:" + i);
        }
    }
}
