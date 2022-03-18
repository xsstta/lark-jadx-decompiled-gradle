package com.he.jsbinding.snapshot;

import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.google.gson.Gson;
import com.he.jsbinding.JsContext;
import com.he.jsbinding.JsEngine;
import com.he.jsbinding.JsObject;
import com.he.jsbinding.JsScopedContext;
import com.he.v8_inspect.Inspect;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26278h;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.optrace.p2413c.C48936b;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.AppbrandServiceManager;
import com.tt.miniapp.debug.VConsoleManager;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.falcon.p3285a.AbstractC66047b;
import com.tt.miniapp.falcon.runtime.IJsRuntime;
import com.tt.miniapp.jsbridge.C66243e;
import com.tt.miniapp.jsbridge.C66244f;
import com.tt.miniapp.jsbridge.JsBridge;
import com.tt.miniapp.jsbridge.JsRuntimeManager;
import com.tt.miniapp.launchschedule.LaunchScheduler;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapp.settings.configs.SnapshotAppConfig;
import com.tt.miniapp.settings.configs.SnapshotConfig;
import com.tt.miniapp.settings.v2.handler.C66810y;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3370d.C67479c;
import com.tt.miniapphost.util.AppbrandUtil;
import com.tt.miniapphost.util.C67586c;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.ProcessUtil;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SnapshotServiceImpl extends AppbrandServiceManager.ServiceBase implements ISnapshotService {
    private boolean enableAB = false;
    private volatile Boolean enableSnapshot;
    private volatile Boolean enableStandardSnapshot;
    private SharedPreferences generatorSp;
    private final Gson gson = new Gson();
    private volatile boolean hasInitEngine;
    public final IAppContext iAppContext;
    private volatile boolean isRunningInSeparateProcess = false;
    private SnapshotAppConfig mCurrentSnapshotAppConfig;
    private SnapshotConfig mGrayscaleSnapshotConfig;
    private String mLaunchModelReason = "null";
    private final Map<String, String> snapshotFilePaths = new ConcurrentHashMap();
    private SharedPreferences snapshotLoadingStateSp;

    private boolean enableCreatingNewVersionAppSnapshot() {
        return false;
    }

    private boolean getSnapshotAB() {
        return this.enableAB;
    }

    @Override // com.he.jsbinding.snapshot.ISnapshotService
    public String getLaunchModelReason() {
        return this.mLaunchModelReason;
    }

    @Override // com.he.jsbinding.snapshot.ISnapshotService
    public boolean isRunningInSeparateProcess() {
        return this.isRunningInSeparateProcess;
    }

    @Override // com.he.jsbinding.snapshot.ISnapshotService
    public void cleanAllSnapshot() {
        C67586c.m263051b(new File(getSnapShotDir()));
    }

    public boolean isSnapshotHomePage() {
        SnapshotAppConfig currentSnapshotAppConfig = getCurrentSnapshotAppConfig();
        if (currentSnapshotAppConfig != null) {
            return currentSnapshotAppConfig.snapshotHomePage;
        }
        return false;
    }

    private String getSystemLanguage() {
        Locale c = C67479c.m262467a().mo234230c();
        if (c == null) {
            return "";
        }
        if (TextUtils.isEmpty(c.getCountry())) {
            return c.getLanguage();
        }
        return c.getLanguage() + "_" + c.getCountry();
    }

    @Override // com.he.jsbinding.snapshot.ISnapshotService
    public String getCurrentAppSnapShotDir() {
        String str = getSnapShotDir() + this.iAppContext.getAppId() + "/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    @Override // com.he.jsbinding.snapshot.ISnapshotService
    public void startCreatingSnapshot() {
        AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "startCreatingSnapshot:");
        ((LaunchScheduler) AppbrandApplicationImpl.getInst(this.iAppContext).getService(LaunchScheduler.class)).addFirstRenderReadyListener(new LaunchScheduler.AbstractC66321a(C67432a.m262319a(this.iAppContext).getAppInfo()) {
            /* class com.he.jsbinding.snapshot.$$Lambda$SnapshotServiceImpl$Q3kUHZFW6rwK3SeE7HUQ_Vcqls */
            public final /* synthetic */ AppInfoEntity f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.tt.miniapp.launchschedule.LaunchScheduler.AbstractC66321a
            public final void onFirstRenderReady() {
                SnapshotServiceImpl.this.lambda$startCreatingSnapshot$0$SnapshotServiceImpl(this.f$1);
            }
        }, true);
    }

    private SnapshotConfig getGrayscaleSnapshotConfig() {
        SnapshotConfig snapshotConfig = this.mGrayscaleSnapshotConfig;
        if (snapshotConfig != null) {
            return snapshotConfig;
        }
        String b = C66810y.m260694a().mo232718b();
        if (!TextUtils.isEmpty(b)) {
            try {
                this.mGrayscaleSnapshotConfig = (SnapshotConfig) this.gson.fromJson(b, SnapshotConfig.class);
            } catch (Exception e) {
                AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "getGrayscaleSnapshotConfig parseObject error" + e.toString());
            }
        }
        return this.mGrayscaleSnapshotConfig;
    }

    private String getSnapShotDir() {
        String str;
        String str2;
        File externalFilesDir = this.iAppContext.getApplicationContext().getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = this.iAppContext.getApplicationContext().getFilesDir();
        }
        if (externalFilesDir != null) {
            str = externalFilesDir.getPath();
        } else {
            str = "";
        }
        if (isEnableStandardSnapshot()) {
            str2 = str + "/standard_snapshot/";
        } else {
            str2 = str + "/snapshot/";
        }
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str2;
    }

    public SnapshotAppConfig getCurrentSnapshotAppConfig() {
        SnapshotAppConfig snapshotAppConfig = this.mCurrentSnapshotAppConfig;
        if (snapshotAppConfig != null) {
            return snapshotAppConfig;
        }
        SnapshotConfig grayscaleSnapshotConfig = getGrayscaleSnapshotConfig();
        if (grayscaleSnapshotConfig != null) {
            String appId = this.iAppContext.getAppId();
            List<SnapshotAppConfig> appListV2 = grayscaleSnapshotConfig.getAppListV2();
            if (appListV2 != null && !appListV2.isEmpty()) {
                for (SnapshotAppConfig snapshotAppConfig2 : appListV2) {
                    if (!TextUtils.isEmpty(appId) && appId.equals(snapshotAppConfig2.getAppId())) {
                        this.mCurrentSnapshotAppConfig = snapshotAppConfig2;
                    }
                }
            }
        }
        return this.mCurrentSnapshotAppConfig;
    }

    @Override // com.he.jsbinding.snapshot.ISnapshotService
    public boolean isEnableStandardSnapshot() {
        if (this.enableStandardSnapshot != null) {
            return this.enableStandardSnapshot.booleanValue();
        }
        SnapshotAppConfig currentSnapshotAppConfig = getCurrentSnapshotAppConfig();
        if (currentSnapshotAppConfig != null) {
            this.enableStandardSnapshot = Boolean.valueOf(currentSnapshotAppConfig.isEnableStandardSnapshot());
        } else {
            this.enableStandardSnapshot = false;
        }
        AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "isEnableStandardSnapshot: " + this.enableStandardSnapshot);
        return this.enableStandardSnapshot.booleanValue();
    }

    @Override // com.he.jsbinding.snapshot.ISnapshotService
    public void setIsRunningInSeparateProcess(boolean z) {
        this.isRunningInSeparateProcess = z;
    }

    private String getSnapshotGeneratorStatus(String str) {
        SharedPreferences sharedPreferences = this.generatorSp;
        if (sharedPreferences != null) {
            return sharedPreferences.getString(str, "STATUS_IDLE");
        }
        return "STATUS_IDLE";
    }

    private String getSnapshotLoadingStatus(String str) {
        SharedPreferences sharedPreferences = this.snapshotLoadingStateSp;
        if (sharedPreferences != null) {
            return sharedPreferences.getString(str, "SNAPSHOT_LOADING_STATE_SUCCESSFULLY");
        }
        return "SNAPSHOT_LOADING_STATE_SUCCESSFULLY";
    }

    private boolean isForceSnapshot(String str) {
        SnapshotAppConfig currentSnapshotAppConfig = getCurrentSnapshotAppConfig();
        if (currentSnapshotAppConfig != null) {
            return currentSnapshotAppConfig.isForceSnapshot();
        }
        return false;
    }

    @Override // com.he.jsbinding.snapshot.ISnapshotService
    public void updateSnapshotABIntent(Intent intent) {
        this.enableAB = intent.getBooleanExtra("extra_ab_snapshot_result", false);
    }

    private void cleanDeprecatedVersionSnapshot(String str) {
        File file = new File(getCurrentAppSnapShotDir());
        String snapshotFilePath = getSnapshotFilePath(str);
        if (snapshotFilePath != null) {
            final File file2 = new File(snapshotFilePath);
            if (file2.exists()) {
                file.listFiles(new FilenameFilter() {
                    /* class com.he.jsbinding.snapshot.SnapshotServiceImpl.C233784 */

                    public boolean accept(File file, String str) {
                        if (!str.equals(file2.getName())) {
                            AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", " cleanDeprecatedVersionSnapshot");
                            new File(file + "/" + str).delete();
                        }
                        return true;
                    }
                });
            }
        }
    }

    @Override // com.he.jsbinding.snapshot.ISnapshotService
    public boolean checkSnapshotExist(String str) {
        String snapshotFilePath = getSnapshotFilePath(str);
        if (snapshotFilePath == null || !new File(snapshotFilePath).exists()) {
            AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "checkSnapshot not Exist:");
            return false;
        }
        AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "checkSnapshot Exist:");
        return true;
    }

    @Override // com.he.jsbinding.snapshot.ISnapshotService
    public void discardSnapshot(String str) {
        AppBrandLogger.m52829e("SnapshotServiceImpl falcon ", "discardSnapshot: appVersion = " + str);
        updateSnapShotLoadingStatus(getSnapshotId(str), "SNAPSHOT_LOADING_STATE_FAILED");
    }

    public boolean isSnapshotSuccess(String str) {
        String snapshotId = getSnapshotId(str);
        if ("SNAPSHOT_LOADING_STATE_SUCCESSFULLY".equals(getSnapshotLoadingStatus(snapshotId))) {
            return true;
        }
        AppBrandLogger.m52829e("SnapshotServiceImpl falcon ", "SnapshotLoadingStatus is not SUCCESSFULLY, snapshotId is " + snapshotId);
        return false;
    }

    public /* synthetic */ void lambda$startCreatingSnapshot$0$SnapshotServiceImpl(final AppInfoEntity appInfoEntity) {
        AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "onFirstRenderReady:");
        ((JsRuntimeManager) AppbrandApplicationImpl.getInst(this.iAppContext).getService(JsRuntimeManager.class)).getCurrentRuntime().postRunnable(new Runnable() {
            /* class com.he.jsbinding.snapshot.SnapshotServiceImpl.RunnableC233762 */

            public void run() {
                SnapshotServiceImpl.this.generateSnapshot(appInfoEntity.version);
            }
        });
    }

    private boolean verifyMinClientVersion(SnapshotAppConfig snapshotAppConfig) {
        if (!TextUtils.isEmpty(snapshotAppConfig.minClientVersionCode)) {
            try {
                if (C26246a.m94978b(this.iAppContext.getApplicationContext()) < Integer.parseInt(snapshotAppConfig.minClientVersionCode)) {
                    return false;
                }
                AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "minClientVersionCode success");
                return true;
            } catch (NumberFormatException unused) {
                AppBrandLogger.m52829e("SnapshotServiceImpl falcon ", "error minClientVersionCode:" + snapshotAppConfig.minClientVersionCode);
                return true;
            }
        } else {
            AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "minClientVersionCode isEmpty");
            return true;
        }
    }

    private boolean verifyMinJsSdkVersion(SnapshotAppConfig snapshotAppConfig) {
        if (!TextUtils.isEmpty(snapshotAppConfig.minJsSdkVersionCode)) {
            try {
                if (AppbrandUtil.convertVersionStrToCode(C66399c.m259608a().mo231922b(AppbrandContext.getInst().getApplicationContext(), this.iAppContext)) < Long.parseLong(snapshotAppConfig.minJsSdkVersionCode)) {
                    return false;
                }
                AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "minJsSdkVersionCode success");
                return true;
            } catch (Exception unused) {
                AppBrandLogger.m52829e("SnapshotServiceImpl falcon ", "error minJsSdkVersionCode:" + snapshotAppConfig.minJsSdkVersionCode);
                return true;
            }
        } else {
            AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "minJsSdkVersionCode isEmpty");
            return true;
        }
    }

    public String getSnapshotId(String str) {
        String b = C66399c.m259608a().mo231922b(this.iAppContext.getApplicationContext(), this.iAppContext);
        StringBuilder sb = new StringBuilder();
        sb.append("Blob_");
        sb.append(this.iAppContext.getAppId());
        sb.append("_");
        sb.append(JsEngine.getVersion());
        if (!C26278h.m95144a() || !C26278h.m95145a(this.iAppContext.getApplicationContext())) {
            sb.append("_");
            sb.append("bit32");
        } else {
            sb.append("_");
            sb.append("bit64");
        }
        sb.append("_");
        sb.append(b);
        sb.append("_");
        sb.append(str);
        sb.append("_");
        sb.append(getSystemLanguage());
        return sb.toString();
    }

    @Override // com.he.jsbinding.snapshot.ISnapshotService
    public synchronized void initEngine(final String str) {
        if (this.hasInitEngine) {
            AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "hasInitEngine");
            return;
        }
        final String snapshotFilePath = getSnapshotFilePath(str);
        AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "falcon-load initEngine");
        final C66244f fVar = (C66244f) ((C66243e) ((JsRuntimeManager) AppbrandApplicationImpl.getInst(this.iAppContext).getService(JsRuntimeManager.class)).getCurrentRuntime()).mo231614a();
        if (fVar == null || snapshotFilePath == null) {
            AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "JsTMARuntime not init");
        } else {
            this.hasInitEngine = true;
            fVar.mJsThreadHandler.removeCallbacksAndMessages(null);
            fVar.mJsThreadHandler.postAtFrontOfQueue(new Runnable() {
                /* class com.he.jsbinding.snapshot.SnapshotServiceImpl.RunnableC233751 */

                public void run() {
                    AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "falcon-load initEngine start");
                    LarkInnerEventHelper.mpInitEngineStart(SnapshotServiceImpl.this.iAppContext);
                    String snapshotId = SnapshotServiceImpl.this.getSnapshotId(str);
                    SnapshotServiceImpl.this.updateSnapShotLoadingStatus(snapshotId, "SNAPSHOT_LOADING_STATE_START");
                    JsEngine jsEngine = new JsEngine(snapshotFilePath);
                    JsContext jsContext = new JsContext(jsEngine);
                    Inspect inspect = Inspect.get(SnapshotServiceImpl.this.iAppContext);
                    inspect.transferInspector(fVar.mJsThread.getJsContext().vm, jsEngine.vm);
                    if (SnapshotServiceImpl.this.isEnableStandardSnapshot()) {
                        inspect.updateLaunchMode("StandardSnapshot");
                    } else {
                        inspect.updateLaunchMode("Snapshot");
                    }
                    fVar.mJsThread.bindJSContext(jsContext);
                    LarkInnerEventHelper.mpInitEngineEnd(SnapshotServiceImpl.this.iAppContext);
                    SnapshotServiceImpl.this.updateSnapShotLoadingStatus(snapshotId, "SNAPSHOT_LOADING_STATE_SUCCESSFULLY");
                    AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "falcon-load initEngine end ");
                }
            });
        }
    }

    @Override // com.he.jsbinding.snapshot.ISnapshotService
    public void startCreatingNewVersionAppSnapshot(String str) {
        AppBrandLogger.m52828d("SnapshotServiceImpl falcon ", "startCreatingNewVersionAppSnapshot: version = " + str);
        AppInfoEntity appInfo = C67432a.m262319a(this.iAppContext).getAppInfo();
        if (appInfo == null) {
            AppBrandLogger.m52829e("SnapshotServiceImpl falcon ", "appInfo is NULL");
        } else if (TextUtils.equals(appInfo.version, str)) {
            AppBrandLogger.m52829e("SnapshotServiceImpl falcon ", "version equals current version");
        } else if (!enableCreatingNewVersionAppSnapshot()) {
            AppBrandLogger.m52829e("SnapshotServiceImpl falcon ", "It is disable creating new version app snapshot");
        }
    }

    public SnapshotServiceImpl(AppbrandApplicationImpl appbrandApplicationImpl) {
        super(appbrandApplicationImpl);
        AppBrandLogger.m52828d("SnapshotServiceImpl falcon ", "SnapshotServiceImpl init start");
        this.iAppContext = appbrandApplicationImpl.getiAppContext();
        if (DebugUtil.debug()) {
            SharedPreferences sharedPreferences = appbrandApplicationImpl.getiAppContext().getApplicationContext().getSharedPreferences("about_debug", 0);
            if (sharedPreferences.getBoolean("use_snapshot", false)) {
                this.mLaunchModelReason = "force_snapshot";
                this.enableSnapshot = true;
            }
            if (sharedPreferences.getBoolean("use_standard_snapshot", false)) {
                this.enableStandardSnapshot = true;
            }
        }
        if (appbrandApplicationImpl.getiAppContext() != null) {
            this.generatorSp = C12899a.m53203a(appbrandApplicationImpl.getiAppContext().getApplicationContext(), "GENERATOR_SP");
            this.snapshotLoadingStateSp = C12899a.m53203a(appbrandApplicationImpl.getiAppContext().getApplicationContext(), "SNAPSHOT_LOADING_STATE_SP");
        }
    }

    @Override // com.he.jsbinding.snapshot.ISnapshotService
    public String getSnapshotFilePath(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            AppBrandLogger.m52828d("SnapshotServiceImpl falcon ", "getSnapshotFilePath start:" + str);
            String str3 = this.snapshotFilePaths.get(str);
            if (str3 != null) {
                return str3;
            }
            str2 = getCurrentAppSnapShotDir() + getSnapshotId(str);
            AppBrandLogger.m52828d("SnapshotServiceImpl falcon ", "getSnapshotFilePath:" + str2);
            if (str2 != null) {
                this.snapshotFilePaths.put(str, str2);
            }
            return str2;
        } catch (Exception e) {
            AppBrandLogger.m52829e("SnapshotServiceImpl falcon ", "getSnapshotFilePath:" + e.toString());
        }
    }

    @Override // com.he.jsbinding.snapshot.ISnapshotService
    public void generateSnapshot(String str) {
        boolean z;
        String str2;
        String snapshotFilePath = getSnapshotFilePath(str);
        JsEngine jsEngine = new JsEngine(true, snapshotFilePath);
        JsContext jsContext = new JsContext(jsEngine, true);
        String snapshotId = getSnapshotId(str);
        if (getSnapshotGeneratorStatus(snapshotId).equals("STATUS_GENERATING")) {
            AppBrandLogger.m52829e("SnapshotServiceImpl falcon ", "generateSnapshot: is generating snapshot");
        } else if (checkSnapshotExist(str)) {
            AppBrandLogger.m52829e("SnapshotServiceImpl falcon ", "generateSnapshot: snapshot file is exist");
        } else {
            String[] strArr = null;
            if (isEnableStandardSnapshot() && ((strArr = JsEngine.getLoadedScriptsAndClear(((JsRuntimeManager) AppbrandApplicationImpl.getInst(this.iAppContext).getService(JsRuntimeManager.class)).getCurrentRuntime().getRuntimePointer())) == null || strArr.length == 0)) {
                AppBrandLogger.m52829e("SnapshotServiceImpl falcon ", "generateSnapshot: loadedScripts is NULL");
            } else if (snapshotFilePath != null) {
                String tracingID = AppbrandContext.getInst().getTracing().getTracingID();
                new OPMonitor("mp_snapshot_create_start").tracing(tracingID).flush();
                updateSnapShotGeneratorStatus(snapshotId, "STATUS_GENERATING");
                jsContext.snapShotRun(new JsContext.ScopeCallback() {
                    /* class com.he.jsbinding.snapshot.SnapshotServiceImpl.C233773 */

                    @Override // com.he.jsbinding.JsContext.ScopeCallback
                    public void run(JsScopedContext jsScopedContext) {
                        AppBrandLogger.m52828d("SnapshotServiceImpl falcon ", " createContext start");
                        JsObject createObject = jsScopedContext.createObject();
                        createObject.set("debug", ((VConsoleManager) AppbrandApplicationImpl.getInst(SnapshotServiceImpl.this.iAppContext).getService(VConsoleManager.class)).isVConsoleSwitchOn());
                        createObject.set("platform", "android");
                        jsScopedContext.global().set("nativeTMAConfig", (AbstractC66047b) createObject);
                        JsObject createObject2 = jsScopedContext.createObject();
                        createObject2.set("platform", "android");
                        jsScopedContext.global().set("TMAConfig", (AbstractC66047b) createObject2);
                        JsObject global = jsScopedContext.global();
                        JsRuntimeManager jsRuntimeManager = (JsRuntimeManager) AppbrandApplicationImpl.getInst(SnapshotServiceImpl.this.iAppContext).getService(JsRuntimeManager.class);
                        JsObject createObject3 = jsScopedContext.createObject();
                        JsBridge jsBridge = (JsBridge) jsRuntimeManager.getJsBridge();
                        IJsRuntime a = ((C66243e) jsRuntimeManager.getCurrentRuntime()).mo231614a();
                        if (a instanceof C66244f) {
                            ((C66244f) a).registerFunctions2Js(jsScopedContext, createObject3, jsBridge);
                        } else {
                            C48936b.m192783a("jsruntime is not tma");
                        }
                        global.set("ttJSCore", (AbstractC66047b) createObject3);
                        AppBrandLogger.m52828d("SnapshotServiceImpl falcon ", " createContext end");
                    }
                });
                String absolutePath = new File(AppbrandConstant.getJsBundleDir(this.iAppContext.getApplicationContext(), this.iAppContext).getAbsoluteFile() + "/tma-core.js").getAbsolutePath();
                if (strArr != null) {
                    z = JsEngine.createStandardSnapshot(jsEngine.vm, absolutePath, strArr);
                } else {
                    boolean isSnapshotHomePage = isSnapshotHomePage();
                    AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", " generateSnapshot start, snapshotHomePage = " + isSnapshotHomePage);
                    if (isSnapshotHomePage) {
                        str2 = AppbrandApplicationImpl.getInst(this.iAppContext).getAppConfig().mo230042c().get(0);
                    } else {
                        str2 = "";
                    }
                    z = JsEngine.generateSnapshot(jsEngine.vm, absolutePath, str2);
                }
                if (z) {
                    updateSnapShotGeneratorStatus(snapshotId, "STATUS_GENERATED");
                    new OPMonitor("mp_snapshot_create_end").tracing(tracingID).flush();
                }
                AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", " generateSnapshot end, success is " + z);
                cleanDeprecatedVersionSnapshot(str);
            } else {
                AppBrandLogger.m52829e("SnapshotServiceImpl falcon ", "generateSnapshot snapShotPath is null");
            }
        }
    }

    private void updateSnapShotGeneratorStatus(String str, String str2) {
        SharedPreferences sharedPreferences = this.generatorSp;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    @Override // com.he.jsbinding.snapshot.ISnapshotService
    public boolean needCreateSnapshot(String str, boolean z) {
        if (!enableSnapshot(str, z) || checkSnapshotExist(str)) {
            return false;
        }
        return true;
    }

    public void updateSnapShotLoadingStatus(String str, String str2) {
        SharedPreferences sharedPreferences = this.snapshotLoadingStateSp;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(str, str2).commit();
        }
    }

    @Override // com.he.jsbinding.snapshot.ISnapshotService
    public boolean needCreateStandardSnapshot(String str, boolean z) {
        if (!enableSnapshot(str, z) || !isEnableStandardSnapshot() || checkSnapshotExist(str)) {
            return false;
        }
        return true;
    }

    private boolean verifyMinMiniAppVersion(SnapshotAppConfig snapshotAppConfig, String str) {
        if (!TextUtils.isEmpty(snapshotAppConfig.minMiniAppVersionCode)) {
            try {
                if (AppbrandUtil.convertVersionStrToCode(str) < AppbrandUtil.convertVersionStrToCode(snapshotAppConfig.minMiniAppVersionCode)) {
                    return false;
                }
                AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "minMiniAppVersionCode success");
                return true;
            } catch (Exception unused) {
                AppBrandLogger.m52829e("SnapshotServiceImpl falcon ", "error minMiniAppVersionCode:" + snapshotAppConfig.minJsSdkVersionCode);
                return true;
            }
        } else {
            AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "minMiniAppVersionCode isEmpty");
            return true;
        }
    }

    @Override // com.he.jsbinding.snapshot.ISnapshotService
    public boolean enableSnapshot(String str, boolean z) {
        if (this.enableSnapshot != null) {
            AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "enableSnapshot:" + this.enableSnapshot);
            return this.enableSnapshot.booleanValue();
        } else if (z) {
            AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "disable snapshot for preview");
            this.mLaunchModelReason = "preview_disable_snapshot";
            this.enableSnapshot = false;
            return false;
        } else {
            IAppContext iAppContext2 = this.iAppContext;
            if (iAppContext2 == null || TextUtils.isEmpty(iAppContext2.getAppId())) {
                AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "isUseSnapshot iAppContext == null:" + this.iAppContext);
                return false;
            } else if (ProcessUtil.isMainProcess(this.iAppContext.getApplicationContext())) {
                AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "isMainProcess");
                this.mLaunchModelReason = "main_disable_snapshot";
                this.enableSnapshot = false;
                return false;
            } else if (!isSnapshotSuccess(str)) {
                this.mLaunchModelReason = "error_disable_snapshot";
                this.enableSnapshot = false;
                return false;
            } else if (!isForceSnapshot(this.iAppContext.getAppId()) && !getSnapshotAB()) {
                AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "AB Experiment return false");
                this.mLaunchModelReason = "ab_disable_snapshot";
                this.enableSnapshot = false;
                return false;
            } else if (!enableSnapshotSettings(this.iAppContext.getAppId(), str)) {
                AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "enableSnapshotSettings return false");
                this.mLaunchModelReason = "settings_disable_snapshot";
                this.enableSnapshot = false;
                return false;
            } else {
                AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "isUseSnapshot:true");
                this.mLaunchModelReason = "default_snapshot";
                this.enableSnapshot = true;
                return true;
            }
        }
    }

    public boolean enableSnapshotSettings(String str, String str2) {
        SnapshotAppConfig currentSnapshotAppConfig = getCurrentSnapshotAppConfig();
        if (currentSnapshotAppConfig == null) {
            return false;
        }
        if (!TextUtils.isEmpty(currentSnapshotAppConfig.tenantId)) {
            if (!currentSnapshotAppConfig.tenantId.equals(HostDependManager.getInst().getTenantId())) {
                AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "enableSnapshotSettings currentTenantId not match:");
                return false;
            }
        }
        if (!verifyMinClientVersion(currentSnapshotAppConfig)) {
            AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "verifyClientVersion false: " + currentSnapshotAppConfig.minClientVersionCode);
            return false;
        } else if (!verifyMinJsSdkVersion(currentSnapshotAppConfig)) {
            AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "verifyJsSdkVersion false: " + currentSnapshotAppConfig.minJsSdkVersionCode);
            return false;
        } else if (verifyMinMiniAppVersion(currentSnapshotAppConfig, str2)) {
            return true;
        } else {
            AppBrandLogger.m52830i("SnapshotServiceImpl falcon ", "verifyMinAppVersion false: " + currentSnapshotAppConfig.minMiniAppVersionCode);
            return false;
        }
    }
}
