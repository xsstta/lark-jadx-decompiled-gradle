package com.larksuite.component.openplatform.core.loader.jsbundle;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapphost.host.HostDependManager;

/* renamed from: com.larksuite.component.openplatform.core.loader.jsbundle.a */
public class C24512a {

    /* renamed from: a */
    private static int f60446a = -1;

    /* renamed from: b */
    private static Boolean f60447b;

    /* renamed from: a */
    public static boolean m89384a() {
        return false;
    }

    /* renamed from: b */
    public static boolean m89386b() {
        return HostDependManager.getInst().getFeatureGating("openplatform.gadget.api_use_jssdk_monitor", false);
    }

    /* renamed from: c */
    public static boolean m89388c() {
        return HostDependManager.getInst().getFeatureGating("gadget.worker.api_use_jssdk_monitor", false);
    }

    /* renamed from: d */
    public static boolean m89390d() {
        return HostDependManager.getInst().getFeatureGating("gadget.worker.module_disable", false);
    }

    /* renamed from: e */
    public static boolean m89391e() {
        return HostDependManager.getInst().getFeatureGating("gadget.worker.check_update_on_launch.enable", false);
    }

    /* renamed from: a */
    public static boolean m89385a(String str) {
        if (f60447b == null) {
            f60447b = Boolean.valueOf(m89389c(str));
        }
        return f60447b.booleanValue();
    }

    /* renamed from: b */
    public static boolean m89387b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        HostDependManager inst = HostDependManager.getInst();
        return inst.getFeatureGating("gadget.textarea.use.render.inbrowser." + str, false);
    }

    /* renamed from: c */
    private static boolean m89389c(String str) {
        AppBrandLogger.m52830i("FgSwitch", "fg isSpeedUp ", str);
        boolean featureGating = HostDependManager.getInst().getFeatureGating("openplatform.gadget.page.reorder.enable", false);
        AppBrandLogger.m52830i("FgSwitch", "fg isSpeedUp FEATURE_KEY_GADGET_PAGE_REORDER_ENABLE", Boolean.valueOf(featureGating));
        if (!featureGating || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!HostDependManager.getInst().getFeatureGating("openplatform.gadget.page.reorder.enable." + str, false)) {
            return false;
        }
        AppBrandLogger.m52830i("FgSwitch", "fg isSpeedUp true");
        return true;
    }
}
