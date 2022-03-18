package com.ss.android.lark.littleapp.prelaunch;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.google.gson.Gson;
import com.ss.android.lark.utils.LarkContext;
import com.tt.miniapp.process.info.api.ISandboxEnvInfo;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapp.settings.configs.PreLaunchSetting;
import com.tt.miniapp.settings.v2.handler.C66800t;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import java.util.ArrayList;
import java.util.List;

@ClaymoreImpl(AbstractC41413a.class)
public class PreLaunchServiceImpl implements AbstractC41413a {
    private static final String TAG = "PreLaunchServiceImpl";
    private final SharedPreferences mAppLaunchRecorder;
    private final Context mContext;
    private final Gson mGson = new Gson();
    private final PreLaunchSetting mPreLaunchSetting;
    private volatile boolean mPreLaunched;

    @Override // com.ss.android.lark.littleapp.prelaunch.AbstractC41413a
    public boolean isPreLaunched() {
        return this.mPreLaunched;
    }

    public PreLaunchServiceImpl() {
        Application application = LarkContext.getApplication();
        this.mContext = application;
        this.mAppLaunchRecorder = application.getSharedPreferences("mini_app_launch_recorder", 0);
        PreLaunchSetting b = C66800t.m260674a().mo232708b();
        this.mPreLaunchSetting = b == null ? new PreLaunchSetting() : b;
    }

    @Override // com.ss.android.lark.littleapp.prelaunch.AbstractC41413a
    public String getPreLaunchAppId() {
        List<PreLaunchSetting.PreLaunchApp> preLaunchApps = this.mPreLaunchSetting.getPreLaunchApps();
        if (preLaunchApps == null) {
            return "";
        }
        for (PreLaunchSetting.PreLaunchApp preLaunchApp : preLaunchApps) {
            if (preLaunchApp.isEnable()) {
                if (preLaunchApp.getSmartLauncher() == null) {
                    return preLaunchApp.getAppId();
                }
                if (matchSmartLauncher(preLaunchApp.getSmartLauncher(), preLaunchApp.getAppId())) {
                    return preLaunchApp.getAppId();
                }
            }
        }
        return "";
    }

    private boolean containsAppId(String str) {
        List<PreLaunchSetting.PreLaunchApp> preLaunchApps = this.mPreLaunchSetting.getPreLaunchApps();
        if (preLaunchApps == null) {
            return false;
        }
        for (PreLaunchSetting.PreLaunchApp preLaunchApp : preLaunchApps) {
            if (preLaunchApp.isEnable() && str.equals(preLaunchApp.getAppId())) {
                return true;
            }
        }
        return false;
    }

    private int getMaxNumberOfRecords(String str) {
        List<PreLaunchSetting.PreLaunchApp> preLaunchApps = this.mPreLaunchSetting.getPreLaunchApps();
        if (preLaunchApps == null) {
            return 0;
        }
        for (PreLaunchSetting.PreLaunchApp preLaunchApp : preLaunchApps) {
            if (preLaunchApp.isEnable() && str.equals(preLaunchApp.getAppId()) && preLaunchApp.getSmartLauncher() != null) {
                return Math.max(preLaunchApp.getSmartLauncher().getRunningCounts(), 0);
            }
        }
        return 0;
    }

    @Override // com.ss.android.lark.littleapp.prelaunch.AbstractC41413a
    public void recordAppLaunched(String str) {
        AppLaunchRecord appLaunchRecord;
        int maxNumberOfRecords = getMaxNumberOfRecords(str);
        if (maxNumberOfRecords > 0 && containsAppId(str)) {
            String str2 = TAG;
            AppBrandLogger.m52828d(str2, "recordAppLaunched: " + str);
            String string = this.mAppLaunchRecorder.getString(str, "");
            if (TextUtils.isEmpty(string)) {
                appLaunchRecord = new AppLaunchRecord();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(System.currentTimeMillis()));
                appLaunchRecord.setLaunchTimestamps(arrayList);
            } else {
                AppLaunchRecord appLaunchRecord2 = (AppLaunchRecord) this.mGson.fromJson(string, AppLaunchRecord.class);
                if (appLaunchRecord2.getLaunchTimestamps() == null) {
                    appLaunchRecord2.setLaunchTimestamps(new ArrayList());
                }
                List<Long> launchTimestamps = appLaunchRecord2.getLaunchTimestamps();
                launchTimestamps.add(Long.valueOf(System.currentTimeMillis()));
                while (launchTimestamps.size() > maxNumberOfRecords) {
                    launchTimestamps.remove(0);
                }
                appLaunchRecord = appLaunchRecord2;
            }
            this.mAppLaunchRecorder.edit().putString(str, this.mGson.toJson(appLaunchRecord)).apply();
        }
    }

    private boolean matchSmartLauncher(PreLaunchSetting.PreLaunchApp.SmartLauncher smartLauncher, String str) {
        List<Long> launchTimestamps;
        String string = this.mAppLaunchRecorder.getString(str, "");
        if (TextUtils.isEmpty(string) || (launchTimestamps = ((AppLaunchRecord) this.mGson.fromJson(string, AppLaunchRecord.class)).getLaunchTimestamps()) == null || launchTimestamps.isEmpty()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - (((long) smartLauncher.getRunningDays()) * 86400000);
        int i = 0;
        for (Long l : launchTimestamps) {
            if (l.longValue() >= currentTimeMillis) {
                i++;
            }
        }
        if (i >= smartLauncher.getRunningCounts()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.littleapp.prelaunch.AbstractC41413a
    public void preLaunchApp(int i, String str, String str2, IAppSandboxEnvProcessor iAppSandboxEnvProcessor, AbstractC67433a aVar) {
        boolean z;
        if (!TextUtils.isEmpty(str2) && !this.mPreLaunched) {
            this.mPreLaunched = true;
            String str3 = TAG;
            AppBrandLogger.m52828d(str3, "preLaunchApp: " + str2);
            ISandboxEnvInfo[] allSandboxEnvs = C66645a.m260337a().mo232355a(IAppSandboxEnvManagerService.SandBoxEnvType.MINI_PROCESS).getAllSandboxEnvs();
            int length = allSandboxEnvs.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                } else if (str2.equals(allSandboxEnvs[i2].getAppId())) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            String str4 = TAG;
            AppBrandLogger.m52828d(str4, "preLaunchApp: isRunning = " + z);
            if (z) {
                iAppSandboxEnvProcessor.preloadEmptySandboxEnv(i, str, aVar);
                return;
            }
            iAppSandboxEnvProcessor.preLaunchSandboxEnvById(i, str, null, str2, aVar);
            iAppSandboxEnvProcessor.preloadEmptySandboxEnv(i, str, null, 5000, aVar);
        }
    }
}
