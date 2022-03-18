package com.tt.miniapp.debug;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandServiceManager;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.AppInfoEntity;

public class VConsoleManager extends AppbrandServiceManager.ServiceBase {
    public boolean isVConsoleSwitchOn() {
        AppInfoEntity appInfo = this.mApp.getAppInfo();
        if (appInfo != null && appInfo.isLocalTest()) {
            return getVConsoleConfig(AppbrandContext.getInst().getApplicationContext()).getBoolean(appInfo.appId, false);
        }
        return false;
    }

    private VConsoleManager(AppbrandApplicationImpl appbrandApplicationImpl) {
        super(appbrandApplicationImpl);
    }

    private SharedPreferences getVConsoleConfig(Context context) {
        return C12899a.m53203a(context, "vconsole_config");
    }

    public void setVConsoleSwitchOn(Context context, boolean z) {
        AppInfoEntity appInfo = this.mApp.getAppInfo();
        if (appInfo != null) {
            String str = appInfo.appId;
            if (!TextUtils.isEmpty(str)) {
                getVConsoleConfig(context).edit().putBoolean(str, z).commit();
            }
        }
    }
}
