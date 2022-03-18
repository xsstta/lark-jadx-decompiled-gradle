package com.ss.android.lark.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.bytedance.mira.plugin.hook.flipped.C20109a;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.lark.app.initiator.AbstractC28914d;
import com.ss.android.lark.app.initiator.C28911a;
import com.ss.android.lark.app.initiator.C28913c;
import com.ss.android.lark.app.initiator.C28920j;
import com.ss.android.lark.app.initiator.C28925m;
import com.ss.android.lark.app.initiator.C28926n;
import com.ss.android.lark.app.initiator.C28928o;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.integrator.EMMModuleProvider;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57765ac;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.LarkContext;
import dagger.hilt.android.HiltAndroidApp;
import ee.android.framework.manis.C68183b;
import me.ele.lancet.base.annotations.Skip;

@HiltAndroidApp
public class LarkApplication extends AbstractApplicationC28849b {
    private AbstractC28914d mAppLauncher;

    public AssetManager LarkApplication__getAssets$___twin___() {
        return super.getAssets();
    }

    public Resources LarkApplication__getResources$___twin___() {
        return super.getResources();
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        com_ss_android_lark_app_LarkApplication_com_ss_android_lark_setting_service_common_LancetHooker_attachApplicationBaseContext(this, context);
    }

    public Context getApplicationContext() {
        return this;
    }

    public AssetManager getAssets() {
        return com_ss_android_lark_app_LarkApplication_com_ss_android_lark_setting_service_common_LancetHooker_getApplicationAssets(this);
    }

    @Override // com.larksuite.component.air.AirApplication
    public Resources getResources() {
        return com_ss_android_lark_app_LarkApplication_com_ss_android_lark_setting_service_common_LancetHooker_getApplicationResources(this);
    }

    public void onTerminate() {
        this.mAppLauncher.mo102664d(this);
        super.onTerminate();
        EMMModuleProvider.m154351a().getEMMApplication().mo136529c(this);
    }

    @Override // com.ss.android.lark.app.AbstractApplicationC28849b, com.larksuite.component.air.AirApplication
    public void onCreate() {
        LarkContext.setApplication(this);
        this.mAppLauncher.mo102661b(this);
        super.onCreate();
        EMMModuleProvider.m154351a().getEMMApplication().mo136528b(this);
        this.mAppLauncher.mo102663c(this);
        C68183b.m264839a().mo237090e();
    }

    public void unbindService(ServiceConnection serviceConnection) {
        try {
            super.unbindService(serviceConnection);
        } catch (Exception unused) {
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mAppLauncher.mo102662b(configuration);
        super.onConfigurationChanged(configuration);
        this.mAppLauncher.mo102660a(configuration);
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        try {
            super.unregisterReceiver(broadcastReceiver);
        } catch (Exception e) {
            Log.m165386e("LarkApplication", e);
            e.printStackTrace();
        }
    }

    public static AssetManager com_ss_android_lark_app_LarkApplication_com_ss_android_lark_setting_service_common_LancetHooker_getApplicationAssets(LarkApplication larkApplication) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(larkApplication);
        }
        return larkApplication.LarkApplication__getAssets$___twin___();
    }

    public static Resources com_ss_android_lark_app_LarkApplication_com_ss_android_lark_setting_service_common_LancetHooker_getApplicationResources(LarkApplication larkApplication) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(larkApplication);
        }
        return larkApplication.LarkApplication__getResources$___twin___();
    }

    public void LarkApplication__attachBaseContext$___twin___(Context context) {
        LarkContext.setApplication(this);
        super.attachBaseContext(context);
        C20109a.m73415a();
        EMMModuleProvider.m154351a().getEMMApplication().mo136527a(this);
        if (!((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isAuthorized()) {
            this.mAppLauncher = new C28926n();
        } else if (((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isSessionNeedUpgrade()) {
            this.mAppLauncher = new C28920j();
        } else if (((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isSimpleModeOn(context) || C57765ac.m224192f(context)) {
            this.mAppLauncher = new C28925m();
        } else if (C57765ac.m224191e(context)) {
            this.mAppLauncher = new C28928o();
        } else if (EMMModuleProvider.m154351a().getEMMApplication().mo136530d(context)) {
            this.mAppLauncher = new C28913c();
        } else {
            this.mAppLauncher = new C28911a();
        }
        this.mAppLauncher.mo102659a(this);
    }

    public static void com_ss_android_lark_app_LarkApplication_com_ss_android_lark_setting_service_common_LancetHooker_attachApplicationBaseContext(LarkApplication larkApplication, Context context) {
        larkApplication.LarkApplication__attachBaseContext$___twin___(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstall(larkApplication);
        }
    }

    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return INVOKESPECIAL_com_ss_android_lark_app_LarkApplication_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(this, broadcastReceiver, intentFilter);
        } catch (Exception e) {
            Log.m165385e("LarkApplication", "registerReceiver error", e, true);
            return null;
        }
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        return openOrCreateDatabase(str, i, cursorFactory, new DatabaseErrorHandler() {
            /* class com.ss.android.lark.app.LarkApplication.C288281 */

            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append("openOrCreateDatabase onCorruption db:");
                if (sQLiteDatabase == null) {
                    str = "null";
                } else {
                    str = sQLiteDatabase.toString();
                }
                sb.append(str);
                Log.m165383e("LarkApplication", sb.toString());
            }
        });
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKESPECIAL_com_ss_android_lark_app_LarkApplication_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(AbstractApplicationC28849b bVar, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return super.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        try {
            return super.openOrCreateDatabase(str, i, cursorFactory, databaseErrorHandler);
        } catch (SQLiteDatabaseCorruptException e) {
            throw new SQLiteDatabaseCorruptException(e.getMessage() + ", dbname:" + str);
        }
    }
}
