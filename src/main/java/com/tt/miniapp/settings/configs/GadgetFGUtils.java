package com.tt.miniapp.settings.configs;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.framework.utils.C26246a;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.AppbrandUtil;

public class GadgetFGUtils {
    public static boolean verifyTenantId(String str) {
        if (TextUtils.isEmpty(str) || str.equals(HostDependManager.getInst().getTenantId())) {
            AppBrandLogger.m52830i("GadgetFGUtils", "tenantId isEmpty");
            return true;
        }
        AppBrandLogger.m52830i("GadgetFGUtils", "enableSnapshotSettings currentTenantId not match:");
        return false;
    }

    public static boolean verifyAppId(IAppContext iAppContext, String str) {
        if (iAppContext == null || TextUtils.isEmpty(iAppContext.getAppId()) || TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("GadgetFGUtils", "gadget fg verify app id fail: context error");
            return false;
        }
        AppBrandLogger.m52830i("GadgetFGUtils", "verify app id, current app id:", iAppContext.getAppId(), "config app id:", str);
        return str.equals(iAppContext.getAppId());
    }

    public static boolean verifyMinClientVersion(IAppContext iAppContext, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                int c = C26246a.m94979c(iAppContext.getApplicationContext());
                int parseInt = Integer.parseInt(str);
                AppBrandLogger.m52830i("GadgetFGUtils", "minClientVersionCode, current version: ", Integer.valueOf(c), "config version", Integer.valueOf(parseInt));
                if (c >= parseInt) {
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                AppBrandLogger.m52829e("GadgetFGUtils", "error minClientVersionCode:", str);
                return true;
            }
        } else {
            AppBrandLogger.m52830i("GadgetFGUtils", "minClientVersionCode isEmpty");
            return true;
        }
    }

    public static boolean verifyMinJsSdkVersion(IAppContext iAppContext, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                long convertVersionStrToCode = AppbrandUtil.convertVersionStrToCode(C66399c.m259608a().mo231922b(AppbrandContext.getInst().getApplicationContext(), iAppContext));
                long parseLong = Long.parseLong(str);
                AppBrandLogger.m52830i("GadgetFGUtils", "minJsSdkVersionCode, current js version:", Long.valueOf(convertVersionStrToCode), "config version:", Long.valueOf(parseLong));
                if (convertVersionStrToCode >= parseLong) {
                    return true;
                }
                return false;
            } catch (Exception unused) {
                AppBrandLogger.m52829e("GadgetFGUtils", "error minJsSdkVersionCode:", str);
                return true;
            }
        } else {
            AppBrandLogger.m52830i("GadgetFGUtils", "minJsSdkVersionCode isEmpty");
            return true;
        }
    }

    public static boolean verifyMiniAppVersion(IAppContext iAppContext, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                long convertVersionStrToCode = AppbrandUtil.convertVersionStrToCode(C67432a.m262319a(iAppContext).getAppInfo().version);
                long convertVersionStrToCode2 = AppbrandUtil.convertVersionStrToCode(str);
                AppBrandLogger.m52830i("GadgetFGUtils", "minMiniAppVersionCode success, version", Long.valueOf(convertVersionStrToCode), "config version:", Long.valueOf(convertVersionStrToCode2));
                if (convertVersionStrToCode >= convertVersionStrToCode2) {
                    return true;
                }
                return false;
            } catch (Exception unused) {
                AppBrandLogger.m52829e("GadgetFGUtils", "error minMiniAppVersionCode:", str);
                return true;
            }
        } else {
            AppBrandLogger.m52830i("GadgetFGUtils", "minMiniAppVersionCode isEmpty");
            return true;
        }
    }
}
