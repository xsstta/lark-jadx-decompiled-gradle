package com.tt.miniapp.manager;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.bytedance.ee.lark.infra.storage.sp.biz.Storage;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.manager.C66375a;
import com.tt.miniapp.p3327s.AbstractC66745e;
import com.tt.miniapp.settings.v2.handler.C66777i;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.refer.common.meta.IAppMetaService;
import com.tt.refer.common.pkg.IPkgDownloadInstallListener;
import com.tt.refer.common.pkg.IPkgMgrService;
import com.tt.refer.common.pkg.PackageEntity;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.impl.business.meta.GadgetBeanConverter;
import com.tt.refer.impl.business.meta.GadgetMonitorCreator;

public class UpdateAppManager {

    /* renamed from: com.tt.miniapp.manager.UpdateAppManager$a */
    public interface AbstractC66373a {
        void onCheckForUpdate(AppInfoEntity appInfoEntity);

        void onUpdateFailed();

        void onUpdateReady();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.manager.UpdateAppManager$b */
    public static class C66374b {

        /* renamed from: a */
        long f167570a;

        /* renamed from: b */
        int f167571b;

        /* renamed from: c */
        long f167572c;

        /* renamed from: d */
        long f167573d;

        /* renamed from: e */
        long f167574e;

        /* renamed from: f */
        boolean f167575f;

        /* renamed from: g */
        boolean f167576g;

        /* renamed from: h */
        boolean f167577h;

        private C66374b() {
        }
    }

    public static String getDebugUpdateInfo() {
        return HostDependManager.getInst().getSpPrefixPath() + "debug_update_app_info";
    }

    public static String getUpdateAppInfo() {
        return HostDependManager.getInst().getSpPrefixPath() + "update_app_info_v2";
    }

    private static SharedPreferences getDebugUpdateInfoSP(Context context) {
        return C12899a.m53203a(context, getDebugUpdateInfo());
    }

    private static SharedPreferences getUpdateInfoSP(Context context) {
        return C12899a.m53203a(context, getUpdateAppInfo());
    }

    private static String getUserUpdateTime(Context context) {
        return Storage.getStorageByName(context, Storage.getStorageFilePrefix("force_update_info")).getString("user_update_time", "");
    }

    private static long getLastUserUpdateTime(Context context) {
        String userUpdateTime = getUserUpdateTime(context);
        if (TextUtils.isEmpty(userUpdateTime)) {
            return 0;
        }
        if (!userUpdateTime.contains(",")) {
            return Long.parseLong(userUpdateTime);
        }
        return Long.parseLong(userUpdateTime.split(",")[0]);
    }

    private static Long getUpdateTime(Context context, String str) {
        SharedPreferences storageByName = Storage.getStorageByName(context, Storage.getStorageFilePrefix("force_update_info"));
        return Long.valueOf(storageByName.getLong(str + "save_time", 0));
    }

    private static boolean isUserForbidden(Context context, C66777i.C66779a aVar) {
        if (aVar.f168522a == 0) {
            return false;
        }
        String userUpdateTime = getUserUpdateTime(context);
        if (TextUtils.isEmpty(userUpdateTime)) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (userUpdateTime.contains(",")) {
            String[] split = userUpdateTime.split(",");
            if (split.length >= aVar.f168523b && currentTimeMillis - Long.parseLong(split[aVar.f168523b - 1]) <= aVar.f168522a) {
                return true;
            }
            return false;
        } else if (aVar.f168523b <= 1 && currentTimeMillis - Long.parseLong(userUpdateTime) <= aVar.f168522a) {
            return true;
        } else {
            return false;
        }
    }

    public static void setUserUpdateTime(Context context, String str) {
        C66777i.C66779a a = C66777i.m260625a().mo232682a(str);
        long currentTimeMillis = System.currentTimeMillis();
        String userUpdateTime = getUserUpdateTime(context);
        StringBuilder sb = new StringBuilder(currentTimeMillis + "");
        if (!TextUtils.isEmpty(userUpdateTime)) {
            if (userUpdateTime.contains(",")) {
                String[] split = userUpdateTime.split(",");
                int min = Math.min(split.length, a.f168523b);
                for (int i = 0; i < min; i++) {
                    sb.append(",");
                    sb.append(split[i]);
                }
            } else if (a.f168523b > 1) {
                sb.append(",");
                sb.append(userUpdateTime);
            }
        }
        Storage.getStorageByName(context, Storage.getStorageFilePrefix("force_update_info")).edit().putString("user_update_time", sb.toString()).commit();
    }

    public static void clearLegacyJsonData(Context context, String str, boolean z) {
        if (!z) {
            if (!TextUtils.isEmpty(getUpdateInfoSP(context).getString(str, ""))) {
                getUpdateInfoSP(context).edit().clear().commit();
            }
        } else if (!TextUtils.isEmpty(getDebugUpdateInfoSP(context).getString(str, ""))) {
            getDebugUpdateInfoSP(context).edit().clear().commit();
        }
    }

    private static boolean isAppForbidden(Context context, String str, C66374b bVar) {
        long b = C66777i.m260625a().mo232684b(str);
        if (b == 0) {
            return false;
        }
        long longValue = getUpdateTime(context, str).longValue();
        if (longValue == 0 && C66777i.m260625a().mo232685c()) {
            bVar.f167575f = true;
            setUpdateTime(context, str, 1);
            return true;
        } else if (System.currentTimeMillis() - longValue <= b) {
            return true;
        } else {
            return false;
        }
    }

    public static void setUpdateTime(Context context, String str, long j) {
        SharedPreferences.Editor edit = Storage.getStorageByName(context, Storage.getStorageFilePrefix("force_update_info")).edit();
        edit.putLong(str + "save_time", j).commit();
    }

    public static boolean isUpdateForbidden(IAppContext iAppContext, Context context, String str, boolean z) {
        boolean z2;
        C66374b bVar = new C66374b();
        C66777i.C66779a a = C66777i.m260625a().mo232682a(str);
        bVar.f167570a = a.f168522a;
        bVar.f167571b = a.f168523b;
        if (isUserForbidden(context, a) || isAppForbidden(context, str, bVar)) {
            z2 = true;
        } else {
            z2 = false;
        }
        bVar.f167577h = !z2;
        if (z) {
            sendUpdateOPEvent(iAppContext, context, str, bVar);
        }
        return z2;
    }

    private static void sendUpdateOPEvent(IAppContext iAppContext, Context context, String str, C66374b bVar) {
        bVar.f167572c = getLastUserUpdateTime(context);
        bVar.f167573d = C66777i.m260625a().mo232684b(str);
        bVar.f167574e = getUpdateTime(context, str).longValue();
        bVar.f167576g = C66777i.m260625a().mo232685c();
        C67500a aVar = new C67500a("op_analysis_onUpdateReady", iAppContext);
        aVar.addCategoryValue("trigger_on_update_ready_event", Boolean.valueOf(bVar.f167577h));
        aVar.addCategoryValue("user_max_age", Long.valueOf(bVar.f167570a));
        aVar.addCategoryValue("user_frequency", Integer.valueOf(bVar.f167571b));
        aVar.addCategoryValue("last_apply_update_success_for_user", Long.valueOf(bVar.f167572c));
        aVar.addCategoryValue("app_max_age", Long.valueOf(bVar.f167573d));
        aVar.addCategoryValue("last_apply_update_success", Long.valueOf(bVar.f167574e));
        aVar.addCategoryValue("is_app_first_trigger", Boolean.valueOf(bVar.f167575f));
        aVar.addCategoryValue("first_update_control", Boolean.valueOf(bVar.f167576g));
        aVar.flush();
    }

    public static void asyncUpdateApp(Context context, AppInfoEntity appInfoEntity, AbstractC66745e eVar, AbstractC66373a aVar, IAppContext iAppContext) {
        AppBrandLogger.m52830i("gadget_app_update_app_manager", "asyncUpdateApp use new meta&pkg...");
        newAsyncUpdateApp(context, appInfoEntity, eVar, aVar, iAppContext);
    }

    private static void newAsyncUpdateApp(final Context context, final AppInfoEntity appInfoEntity, final AbstractC66745e eVar, final AbstractC66373a aVar, final IAppContext iAppContext) {
        final String str = appInfoEntity.launchFrom;
        final String str2 = appInfoEntity.scene;
        final String str3 = appInfoEntity.subScene;
        final String str4 = appInfoEntity.version;
        final String str5 = appInfoEntity.md5;
        final long j = appInfoEntity.versionCode;
        final GadgetMonitorCreator gadgetMonitorCreator = new GadgetMonitorCreator(iAppContext);
        final TimeMeter newAndStart = TimeMeter.newAndStart();
        LarkInnerEventHelper.mpInstallUpdateStart(gadgetMonitorCreator, appInfoEntity.appId, 1);
        GadgetBeanConverter.requestAppMeta(context, iAppContext, GadgetBeanConverter.convertAppInfoEntityToSchemaEntity(appInfoEntity), 1, new C66375a.AbstractC66376a() {
            /* class com.tt.miniapp.manager.UpdateAppManager.C663671 */

            @Override // com.tt.miniapp.manager.C66375a.AbstractC66376a
            /* renamed from: a */
            public void mo148970a(int i, AppInfoEntity appInfoEntity) {
                UpdateAppManager.newPrepareAsyncDownloadApp(context, appInfoEntity, str4, j, str5, str, str2, str3, aVar, iAppContext, gadgetMonitorCreator, newAndStart);
            }

            @Override // com.tt.miniapp.manager.C66375a.AbstractC66376a
            /* renamed from: a */
            public void mo148972a(int i, String str, String str2) {
                LarkInnerEventHelper.mpInstallUpdateResult(gadgetMonitorCreator, appInfoEntity.appId, i, false, TimeMeter.stop(newAndStart), str, str2, 0);
                AbstractC66373a aVar = aVar;
                if (aVar != null) {
                    aVar.onUpdateFailed();
                }
            }

            @Override // com.tt.miniapp.manager.C66375a.AbstractC66376a
            /* renamed from: a */
            public void mo148971a(int i, AppInfoEntity appInfoEntity, int i2) {
                if (i2 == 1) {
                    LarkInnerEventHelper.mpInstallUpdateResult(gadgetMonitorCreator, appInfoEntity.appId, i, false, TimeMeter.stop(newAndStart), ErrorCode.META.OFFLINE.getCode(), ErrorCode.META.OFFLINE.getDesc(), 0);
                    C67866g.m264027a(new Runnable() {
                        /* class com.tt.miniapp.manager.UpdateAppManager.C663671.RunnableC663681 */

                        public void run() {
                            if (eVar != null) {
                                eVar.offline();
                            }
                        }
                    });
                    return;
                }
                UpdateAppManager.newPrepareAsyncDownloadApp(context, appInfoEntity, str4, j, str5, str, str2, str3, aVar, iAppContext, gadgetMonitorCreator, newAndStart);
            }
        });
    }

    public static void newPrepareAsyncDownloadApp(final Context context, final AppInfoEntity appInfoEntity, final String str, long j, String str2, String str3, String str4, String str5, final AbstractC66373a aVar, final IAppContext iAppContext, final IMonitorCreator iMonitorCreator, final TimeMeter timeMeter) {
        if (TextUtils.isEmpty(appInfoEntity.version)) {
            appInfoEntity.version = str;
        }
        if (aVar != null) {
            aVar.onCheckForUpdate(appInfoEntity);
        }
        AppbrandApplicationImpl.getInst(iAppContext).setUpdateAppInfo(appInfoEntity);
        if (TextUtils.equals(appInfoEntity.md5, str2) || appInfoEntity.versionCode == j) {
            LarkInnerEventHelper.mpInstallUpdateResult(iMonitorCreator, appInfoEntity.appId, 1, true, TimeMeter.stop(timeMeter), null, null, 0);
            return;
        }
        appInfoEntity.launchFrom = str3;
        appInfoEntity.scene = str4;
        appInfoEntity.subScene = str5;
        final PackageEntity convertAppInfoEntityToPackageEntity = GadgetBeanConverter.convertAppInfoEntityToPackageEntity(appInfoEntity, iAppContext);
        boolean featureGating = LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.subpackage.enabled");
        boolean isSubPackageModeSettingsOpen = ((IPkgMgrService) iAppContext.findServiceByInterface(IPkgMgrService.class)).isSubPackageModeSettingsOpen(iAppContext.getAppId());
        if (!featureGating || !isSubPackageModeSettingsOpen || !convertAppInfoEntityToPackageEntity.isValidSubPackage()) {
            ((IPkgMgrService) iAppContext.findServiceByInterface(IPkgMgrService.class)).downloadAndInstallPackage(context, convertAppInfoEntityToPackageEntity, 1, new IPkgDownloadInstallListener() {
                /* class com.tt.miniapp.manager.UpdateAppManager.C663713 */

                @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
                public void onDownloading(int i, float f) {
                    if (DebugUtil.debug()) {
                        AppBrandLogger.m52830i("gadget_app_update_app_manager", "onDownloading:requestType->", Integer.valueOf(i), "progress:", Float.valueOf(f));
                    }
                }

                @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
                public void onDownloadSuccess(int i, boolean z) {
                    AppBrandLogger.m52830i("gadget_app_update_app_manager", "onDownloadSuccess:requestType->", Integer.valueOf(i), "fromLocal:", Boolean.valueOf(z));
                    ((IAppMetaService) iAppContext.findServiceByInterface(IAppMetaService.class)).mo235256a(context, appInfoEntity.appId, appInfoEntity.version);
                    if (aVar != null) {
                        C67866g.m264027a(new Runnable() {
                            /* class com.tt.miniapp.manager.UpdateAppManager.C663713.RunnableC663721 */

                            public void run() {
                                aVar.onUpdateReady();
                            }
                        });
                        C66036d.m258601b(appInfoEntity.version, str, iAppContext);
                    }
                }

                @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
                public void onFailed(int i, String str, String str2) {
                    LarkInnerEventHelper.mpInstallUpdateResult(iMonitorCreator, appInfoEntity.appId, i, false, TimeMeter.stop(timeMeter), str, str2, 0);
                    AbstractC66373a aVar = aVar;
                    if (aVar != null) {
                        aVar.onUpdateFailed();
                    }
                }

                @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
                public void onInstallPkgSuccess(int i, String str, String str2) {
                    AppBrandLogger.m52830i("gadget_app_update_app_manager", "onInstallSuccess appId:", convertAppInfoEntityToPackageEntity.getIdentifier());
                    LarkInnerEventHelper.mpInstallUpdateResult(iMonitorCreator, appInfoEntity.appId, i, true, TimeMeter.stop(timeMeter), null, null, 1);
                }
            });
        } else {
            ((IPkgMgrService) iAppContext.findServiceByInterface(IPkgMgrService.class)).downloadAndInstallMainApp(context, convertAppInfoEntityToPackageEntity, 1, "__APP__", new IPkgDownloadInstallListener() {
                /* class com.tt.miniapp.manager.UpdateAppManager.C663692 */

                @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
                public void onDownloading(int i, float f) {
                    if (DebugUtil.debug()) {
                        AppBrandLogger.m52830i("gadget_app_update_app_manager", "onDownloading:requestType->", Integer.valueOf(i), "progress:", Float.valueOf(f));
                    }
                }

                @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
                public void onDownloadSuccess(int i, boolean z) {
                    AppBrandLogger.m52830i("gadget_app_update_app_manager", "onDownloadSuccess:requestType->", Integer.valueOf(i), "fromLocal:", Boolean.valueOf(z));
                    ((IAppMetaService) iAppContext.findServiceByInterface(IAppMetaService.class)).mo235256a(context, appInfoEntity.appId, appInfoEntity.version);
                    if (aVar != null) {
                        C67866g.m264027a(new Runnable() {
                            /* class com.tt.miniapp.manager.UpdateAppManager.C663692.RunnableC663701 */

                            public void run() {
                                aVar.onUpdateReady();
                            }
                        });
                        C66036d.m258601b(appInfoEntity.version, str, iAppContext);
                    }
                }

                @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
                public void onFailed(int i, String str, String str2) {
                    LarkInnerEventHelper.mpInstallUpdateResult(iMonitorCreator, appInfoEntity.appId, i, false, TimeMeter.stop(timeMeter), str, str2, 0);
                    AbstractC66373a aVar = aVar;
                    if (aVar != null) {
                        aVar.onUpdateFailed();
                    }
                }

                @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
                public void onInstallPkgSuccess(int i, String str, String str2) {
                    AppBrandLogger.m52830i("gadget_app_update_app_manager", "onInstallSuccess appId:", convertAppInfoEntityToPackageEntity.getIdentifier());
                    LarkInnerEventHelper.mpInstallUpdateResult(iMonitorCreator, appInfoEntity.appId, i, true, TimeMeter.stop(timeMeter), null, null, 1);
                }
            });
        }
    }
}
