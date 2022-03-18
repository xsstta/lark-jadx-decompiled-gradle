package com.larksuite.component.openplatform.core.plugin.messenger.appbadge;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.refer.common.base.AppType;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.appbadge.a */
public class C25103a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.appbadge.a$1 */
    public static /* synthetic */ class C251041 {

        /* renamed from: a */
        static final /* synthetic */ int[] f61350a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tt.refer.common.base.AppType[] r0 = com.tt.refer.common.base.AppType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25103a.C251041.f61350a = r0
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.GadgetAPP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25103a.C251041.f61350a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.WebGadgetAPP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25103a.C251041.f61350a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.WebAPP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25103a.C251041.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static String m90429a(AppType appType) {
        int i = C251041.f61350a[appType.ordinal()];
        if (i == 1 || i == 2) {
            return "MP";
        }
        if (i != 3) {
            return "";
        }
        return "H5";
    }

    /* renamed from: a */
    public static void m90430a(String str, String str2, AppType appType, int i) {
        JSONObject jSONObject = new JSONObject();
        String a = m90429a(appType);
        try {
            jSONObject.put("app_id", str);
            jSONObject.put("appname", str2);
            jSONObject.put("application_type", a);
            jSONObject.put("badge_number", i);
            LarkExtensionManager.getInstance().getExtension().mo49574a("api_invoke_updateBadge", jSONObject);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("BadgeEventReportHelper", "", e);
        }
    }

    /* renamed from: b */
    public static void m90433b(String str, String str2, AppType appType, String str3) {
        JSONObject jSONObject = new JSONObject();
        String a = m90429a(appType);
        try {
            jSONObject.put("app_id", str);
            jSONObject.put("appname", str2);
            jSONObject.put("application_type", a);
            jSONObject.put("authorize_scope", str3);
            LarkExtensionManager.getInstance().getExtension().mo49574a("authorize_modal_show", jSONObject);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("BadgeEventReportHelper", "", e);
        }
    }

    /* renamed from: a */
    public static void m90431a(String str, String str2, AppType appType, String str3) {
        JSONObject jSONObject = new JSONObject();
        String a = m90429a(appType);
        try {
            jSONObject.put("app_id", str);
            jSONObject.put("appname", str2);
            jSONObject.put("application_type", a);
            jSONObject.put("authorize_scope", str3);
            LarkExtensionManager.getInstance().getExtension().mo49574a("api_invoke_authorize", jSONObject);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("BadgeEventReportHelper", "", e);
        }
    }

    /* renamed from: b */
    public static void m90434b(String str, String str2, AppType appType, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        String a = m90429a(appType);
        try {
            jSONObject.put("app_id", str);
            jSONObject.put("appname", str2);
            jSONObject.put("application_type", a);
            jSONObject.put(ShareHitPoint.f121868c, str3);
            jSONObject.put("action", str4);
            LarkExtensionManager.getInstance().getExtension().mo49574a("app_setting_set_Badge", jSONObject);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("BadgeEventReportHelper", "", e);
        }
    }

    /* renamed from: a */
    public static void m90432a(String str, String str2, AppType appType, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        String a = m90429a(appType);
        try {
            jSONObject.put("app_id", str);
            jSONObject.put("appname", str2);
            jSONObject.put("application_type", a);
            jSONObject.put("authorize_scope", str3);
            jSONObject.put("authorize_status", str4);
            LarkExtensionManager.getInstance().getExtension().mo49574a("api_authorize_callback", jSONObject);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("BadgeEventReportHelper", "", e);
        }
    }
}
