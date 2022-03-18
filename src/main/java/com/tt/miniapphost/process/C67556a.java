package com.tt.miniapphost.process;

import android.app.Activity;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3375a.C67560a;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.refer.common.util.C67866g;
import java.io.Serializable;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.tt.miniapphost.process.a */
public class C67556a {
    /* renamed from: a */
    public static void m262929a(Activity activity, String str) {
    }

    /* renamed from: a */
    private static void m262933a(String str, AppInfoEntity appInfoEntity, boolean z, Integer num, String str2) {
    }

    /* renamed from: d */
    public static JSONObject m262947d() {
        return null;
    }

    /* renamed from: a */
    public static boolean m262941a(String str) {
        return AppbrandContext.getInst().isDataHandlerExist(str);
    }

    /* renamed from: a */
    public static void m262938a(String str, JSONObject jSONObject, AbstractC67565b bVar) {
        C67560a.m262959a("uploadFeedback", CrossProcessDataEntity.C67574a.m263013a().mo234760a("feedbackLogType", (Object) str).mo234760a("feedbackPath", jSONObject).mo234763b(), bVar);
    }

    /* renamed from: a */
    public static void m262940a(boolean z, AbstractC67565b bVar, IAppContext iAppContext) {
        AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(iAppContext).getAppInfo();
        C67560a.m262959a("getSnapshot", CrossProcessDataEntity.C67574a.m263013a().mo234759a("appSandboxType", (Serializable) appInfo.sandBoxEnvType).mo234760a("miniAppId", (Object) appInfo.appId).mo234760a("forceGetHostActivitySnapshot", (Object) Boolean.valueOf(z)).mo234763b(), bVar);
    }

    /* renamed from: a */
    public static void m262939a(List<String> list) {
        C67560a.m262955a("type_favorite_list_handle", new CrossProcessDataEntity.C67574a().mo234760a("favorites_handle_mode", (Object) 3).mo234762a("favorites_list", list).mo234763b());
    }

    /* renamed from: f */
    public static CrossProcessDataEntity m262949f() {
        return C67560a.m262955a("getUserInfo", (CrossProcessDataEntity) null);
    }

    /* renamed from: i */
    public static CrossProcessDataEntity m262952i() {
        return C67560a.m262955a("getHostSettings", (CrossProcessDataEntity) null);
    }

    /* renamed from: a */
    public static String m262928a() {
        CrossProcessDataEntity a = C67560a.m262955a("getLoginCookie", (CrossProcessDataEntity) null);
        if (a != null) {
            return a.mo234744b("loginCookie");
        }
        return null;
    }

    /* renamed from: c */
    public static List<String> m262945c() {
        CrossProcessDataEntity a = C67560a.m262955a("typeGetPermissionDialogABTestMPID", (CrossProcessDataEntity) null);
        if (a != null) {
            return a.mo234750g("getPermissionDialogABTestMpid");
        }
        return null;
    }

    /* renamed from: e */
    public static boolean m262948e() {
        CrossProcessDataEntity a = C67560a.m262955a("reportPerformanceEnable", (CrossProcessDataEntity) null);
        if (a != null) {
            return a.mo234746d("reportPerformance");
        }
        return false;
    }

    /* renamed from: g */
    public static String m262950g() {
        CrossProcessDataEntity a = C67560a.m262955a("favorites_settings", (CrossProcessDataEntity) null);
        if (a != null) {
            return a.mo234740a("favoritesSettings", (String) null);
        }
        return null;
    }

    /* renamed from: h */
    public static List<String> m262951h() {
        CrossProcessDataEntity a = C67560a.m262955a("type_favorite_list_handle", new CrossProcessDataEntity.C67574a().mo234760a("favorites_handle_mode", (Object) 2).mo234763b());
        if (a != null) {
            return a.mo234741a("favorites_list", (List<String>) null);
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m262944b() {
        CrossProcessDataEntity a = C67560a.m262955a("typeIsOnWhiteList", (CrossProcessDataEntity) null);
        if (a != null) {
            return a.mo234746d("isOnWhiteList");
        }
        return true;
    }

    /* renamed from: b */
    public static void m262942b(String str) {
        C67560a.m262955a("type_favorite_list_handle", new CrossProcessDataEntity.C67574a().mo234760a("favorites_handle_mode", (Object) 0).mo234760a("miniAppId", (Object) str).mo234763b());
    }

    /* renamed from: a */
    public static void m262932a(final AbstractC67565b bVar) {
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapphost.process.C67556a.C675571 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C67560a.m262959a("getCurrentLang", (CrossProcessDataEntity) null, bVar);
            }
        }, Schedulers.shortIO());
    }

    /* renamed from: c */
    public static void m262946c(String str) {
        C67560a.m262955a("type_favorite_list_handle", new CrossProcessDataEntity.C67574a().mo234760a("favorites_handle_mode", (Object) 1).mo234760a("miniAppId", (Object) str).mo234763b());
    }

    /* renamed from: b */
    public static void m262943b(String str, AbstractC67565b bVar) {
        C67560a.m262959a("preloadMiniApp", CrossProcessDataEntity.C67574a.m263013a().mo234760a("preload_app_args", (Object) str).mo234763b(), bVar);
    }

    /* renamed from: a */
    public static void m262934a(String str, AbstractC67565b bVar) {
        C67560a.m262959a("uploadAlog", CrossProcessDataEntity.C67574a.m263013a().mo234760a("alogScene", (Object) str).mo234763b(), bVar);
    }

    /* renamed from: a */
    public static void m262936a(final String str, final JSONObject jSONObject) {
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapphost.process.C67556a.C675593 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C67560a.m262955a("actionMiscAppLog", CrossProcessDataEntity.C67574a.m263013a().mo234760a("logEventName", (Object) str).mo234760a("logEventData", jSONObject).mo234763b());
            }
        }, Schedulers.shortIO());
    }

    /* renamed from: a */
    public static void m262930a(AppInfoEntity appInfoEntity, boolean z, Integer num) {
        m262933a("open", appInfoEntity, z, num, null);
    }

    /* renamed from: a */
    public static void m262935a(String str, String str2, AbstractC67565b bVar) {
        CrossProcessDataEntity b = CrossProcessDataEntity.C67574a.m263013a().mo234760a("apiData", (Object) str).mo234760a("ttId", (Object) str2).mo234763b();
        AppBrandLogger.m52830i("HostProcessBridge", "handleUserRelation", b);
        C67560a.m262959a("handleUserRelation", b, bVar);
    }

    /* renamed from: a */
    public static void m262937a(final String str, final JSONObject jSONObject, final int i) {
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapphost.process.C67556a.C675582 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                StringBuilder sb = new StringBuilder();
                sb.append("GadgetEvent, eventName: ");
                sb.append(str);
                sb.append(", data: ");
                Object obj = jSONObject;
                if (obj == null) {
                    obj = "";
                }
                sb.append(obj);
                AppBrandLogger.m52830i("HostProcessBridge", sb.toString());
                C67560a.m262955a("actionLog", CrossProcessDataEntity.C67574a.m263013a().mo234760a("logPlatform", (Object) Integer.valueOf(i)).mo234760a("logEventName", (Object) str).mo234760a("logEventData", jSONObject).mo234763b());
            }
        }, Schedulers.shortIO());
    }

    /* renamed from: a */
    public static void m262931a(AppInfoEntity appInfoEntity, boolean z, Integer num, String str) {
        m262933a("close", appInfoEntity, z, num, str);
    }
}
