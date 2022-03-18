package com.tt.miniapp.manager;

import android.os.Looper;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandServiceManager;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapp.util.C67049n;
import com.tt.miniapp.util.MpTimeLineReporter;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.base.AppType;
import org.json.JSONException;
import org.json.JSONObject;

public class AppConfigManager extends AppbrandServiceManager.ServiceBase {
    private IAppContext appContext = this.mApp.getiAppContext();
    private boolean isDarkModeEnv = false;
    private volatile AppConfig mAppConfig;
    private boolean mLoaded = false;
    private final Object mLock = new Object();
    private int mRetryTime;

    public AppConfig initAppConfig() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            DebugUtil.logOrThrow("AppConfigManager", "do not run in main looper：initAppConfig()");
        }
        synchronized (this.mLock) {
            if (this.mLoaded) {
                return this.mAppConfig;
            }
            initDarkModeConfig();
            loadAppConfig();
            this.mLoaded = true;
            C67049n.m261317d(this.appContext);
            return this.mAppConfig;
        }
    }

    private void initDarkModeConfig() {
        IAppContext iAppContext = this.appContext;
        if (iAppContext == null || iAppContext.getApplicationContext() == null) {
            AppBrandLogger.m52830i("AppConfigManager", "initDarkModeConfig fail : app context is null");
        } else if (this.appContext.isDestroyed() || this.appContext.isDestroying()) {
            AppBrandLogger.m52830i("AppConfigManager", "initDarkModeConfig fail : app context is destroyed");
        } else if (this.appContext.getCurrentActivity() != null) {
            this.isDarkModeEnv = C25529d.m91145a(this.appContext.getCurrentActivity());
            AppBrandLogger.m52830i("AppConfigManager", "initDarkModeConfig result with activity : " + this.isDarkModeEnv);
        } else {
            this.isDarkModeEnv = C25529d.m91145a(this.appContext.getApplicationContext());
            AppBrandLogger.m52830i("AppConfigManager", "initDarkModeConfig result with application : " + this.isDarkModeEnv);
        }
    }

    private void loadAppConfig() {
        try {
            MpTimeLineReporter mpTimeLineReporter = (MpTimeLineReporter) this.mApp.getService(MpTimeLineReporter.class);
            JSONObject a = new MpTimeLineReporter.C67015a().mo233114a("file_path", "app-config.json").mo233115a();
            mpTimeLineReporter.addPoint("get_file_content_from_ttpkg_begin", a);
            TimeLogger.getInstance(this.appContext).logTimeDuration("AppbrandApplicationImpl_startGetAppConfig");
            String loadStringFromStream = StreamLoader.loadStringFromStream("app-config.json", this.appContext);
            mpTimeLineReporter.addPoint("get_file_content_from_ttpkg_end", a);
            mpTimeLineReporter.addPoint("parse_json_begin", a);
            TimeLogger.getInstance(this.appContext).logTimeDuration("AppbrandApplicationImpl_startParseAppConfig");
            this.mAppConfig = AppConfig.m257571a(loadStringFromStream, this.appContext, this.isDarkModeEnv);
            TimeLogger.getInstance(this.appContext).logTimeDuration("AppbrandApplicationImpl_stopParseAppConfig");
            mpTimeLineReporter.addPoint("parse_json_end", a);
            if (this.mAppConfig != null) {
                synchronized (this.mLock) {
                    this.mLock.notifyAll();
                }
            }
        } catch (Exception e) {
            try {
                AppBrandLogger.m52829e("AppConfigManager", e);
                int i = this.mRetryTime;
                if (i < 1) {
                    this.mRetryTime = i + 1;
                    loadAppConfig();
                } else {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, Log.getStackTraceString(e));
                    } catch (JSONException e2) {
                        AppBrandLogger.m52829e("AppConfigManager", e2);
                    }
                    TimeLogger.getInstance(this.appContext).logError("BaseActivityProxy_parseAppConfigFail");
                    C67509b.m262587a("mp_parse_appconfig_error", 1006, jSONObject, this.appContext);
                }
                if (this.mAppConfig != null) {
                    synchronized (this.mLock) {
                        this.mLock.notifyAll();
                    }
                }
            } catch (Throwable th) {
                if (this.mAppConfig != null) {
                    synchronized (this.mLock) {
                        this.mLock.notifyAll();
                    }
                }
                throw th;
            }
        }
    }

    public AppConfig getAppConfig() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return this.mAppConfig;
        }
        if (!ProcessUtil.isMiniappProcess() || (this.appContext != null && AppType.GadgetAPP != this.appContext.getAppType())) {
            return this.mAppConfig;
        }
        if (this.mLoaded) {
            return this.mAppConfig;
        }
        if (this.mAppConfig != null) {
            return this.mAppConfig;
        }
        synchronized (this.mLock) {
            while (this.mAppConfig == null) {
                try {
                    AppBrandLogger.m52830i("AppConfigManager", "wait config");
                    long currentTimeMillis = System.currentTimeMillis();
                    this.mLock.wait();
                    AppBrandLogger.m52830i("AppConfigManager", "wait app config duration:" + (System.currentTimeMillis() - currentTimeMillis));
                } catch (InterruptedException e) {
                    AppBrandLogger.m52829e("AppConfigManager", e);
                }
            }
        }
        return this.mAppConfig;
    }

    protected AppConfigManager(AppbrandApplicationImpl appbrandApplicationImpl) {
        super(appbrandApplicationImpl);
    }
}
