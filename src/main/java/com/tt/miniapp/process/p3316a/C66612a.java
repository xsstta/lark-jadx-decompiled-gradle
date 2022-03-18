package com.tt.miniapp.process.p3316a;

import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.event.p3280a.C66019a;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapp.util.C67019aa;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3375a.C67560a;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.miniapphost.util.ProcessUtil;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.process.a.a */
public class C66612a {
    /* renamed from: a */
    public static void m260227a(String str, String str2, boolean z) {
        Uri uri;
        Uri parse = Uri.parse(str2);
        String str3 = "restart";
        if (!TextUtils.isEmpty(parse.getQueryParameter("bdp_launch_type"))) {
            if (!z) {
                str3 = "reload";
            }
            uri = C67019aa.m261222a(parse, "bdp_launch_type", str3);
        } else {
            Uri.Builder buildUpon = parse.buildUpon();
            if (!z) {
                str3 = "reload";
            }
            uri = buildUpon.appendQueryParameter("bdp_launch_type", str3).build();
        }
        C67560a.m262955a("restart_app", CrossProcessDataEntity.C67574a.m263013a().mo234760a("miniAppId", (Object) str).mo234760a("miniAppSchema", (Object) uri.toString()).mo234763b());
    }

    /* renamed from: a */
    public static void m260228a(String str, boolean z, String str2, boolean z2, IAppContext iAppContext) {
        C67560a.m262955a("jump_to_app_from_schema", CrossProcessDataEntity.C67574a.m263013a().mo234760a("schema", (Object) C66019a.m258526a(str, iAppContext)).mo234760a("miniAppFromId", (Object) str2).mo234760a("isGame", (Object) Boolean.valueOf(z)).mo234760a("killCurrentProcess", (Object) Boolean.valueOf(z2)).mo234763b());
        AppbrandApplicationImpl.getInst(iAppContext).setJumpToApp(true);
    }

    /* renamed from: a */
    public static boolean m260231a(String str, boolean z, IAppContext iAppContext) {
        AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(iAppContext).getAppInfo();
        CrossProcessDataEntity a = C67560a.m262955a("back_app", CrossProcessDataEntity.C67574a.m263013a().mo234760a("refererInfo", (Object) str).mo234760a("isApiCall", (Object) Boolean.valueOf(z)).mo234760a("miniAppId", (Object) (appInfo != null ? appInfo.appId : null)).mo234763b());
        if (a != null) {
            return a.mo234743a("back_app_result", false);
        }
        return false;
    }

    /* renamed from: a */
    public static void m260229a(String str, boolean z, boolean z2) {
        C67560a.m262955a("update_jump_list", CrossProcessDataEntity.C67574a.m263013a().mo234760a("miniAppId", (Object) str).mo234760a("isGame", (Object) Boolean.valueOf(z)).mo234760a("isSpecial", (Object) Boolean.valueOf(z2)).mo234763b());
    }

    /* renamed from: a */
    public static void m260230a(List<String> list) {
        C67560a.m262955a("type_update_favorite_set", CrossProcessDataEntity.C67574a.m263013a().mo234762a("favorite_set", list).mo234763b());
    }

    /* renamed from: a */
    public static void m260226a(String str, String str2, String str3) {
        C67560a.m262955a("saveSpData", CrossProcessDataEntity.C67574a.m263013a().mo234760a("sp_data_key", (Object) str2).mo234760a("sp_data_file", (Object) str).mo234760a("sp_data_value", (Object) str3).mo234763b());
    }

    /* renamed from: a */
    public static String m260218a() {
        CrossProcessDataEntity a = C67560a.m262955a("type_get_favorite_settings", (CrossProcessDataEntity) null);
        if (a != null) {
            return a.mo234740a("favorite_settings", (String) null);
        }
        return null;
    }

    /* renamed from: b */
    public static LinkedHashSet<String> m260233b() {
        List<String> a;
        CrossProcessDataEntity a2 = C67560a.m262955a("type_get_favorite_set", (CrossProcessDataEntity) null);
        if (a2 == null || (a = a2.mo234741a("favorite_set", (List<String>) null)) == null) {
            return null;
        }
        return new LinkedHashSet<>(a);
    }

    /* renamed from: a */
    public static void m260223a(AbstractC67565b bVar) {
        C67560a.m262959a("getLocation", CrossProcessDataEntity.C67574a.m263013a().mo234763b(), bVar);
    }

    /* renamed from: c */
    public static void m260236c(String str) {
        C67560a.m262955a("mini_process_used", CrossProcessDataEntity.C67574a.m263013a().mo234760a("sandboxName", (Object) str).mo234763b());
    }

    /* renamed from: d */
    public static void m260238d(String str) {
        C67560a.m262955a("type_add_to_favorite_set", CrossProcessDataEntity.C67574a.m263013a().mo234760a("mini_app_id", (Object) str).mo234763b());
    }

    /* renamed from: e */
    public static void m260240e(String str) {
        C67560a.m262955a("type_remove_from_favorite_set", CrossProcessDataEntity.C67574a.m263013a().mo234760a("mini_app_id", (Object) str).mo234763b());
    }

    /* renamed from: a */
    public static String m260219a(String str) {
        CrossProcessDataEntity a = C67560a.m262955a("getPlatformSession", CrossProcessDataEntity.C67574a.m263013a().mo234760a("miniAppId", (Object) str).mo234763b());
        if (a != null) {
            return a.mo234744b("platformSession");
        }
        return null;
    }

    /* renamed from: a */
    public static void m260220a(IAppSandboxEnvManagerService.SandBoxEnvType sandBoxEnvType) {
        C67560a.m262959a("notifyPreloadEmptyProcess", CrossProcessDataEntity.C67574a.m263013a().mo234759a("current_env_sand_box_type", (Serializable) sandBoxEnvType).mo234763b(), (AbstractC67565b) null);
    }

    /* renamed from: a */
    public static void m260221a(AbstractC67433a aVar) {
        AppInfoEntity appInfo = C67432a.m262319a(aVar).getAppInfo();
        if (appInfo != null) {
            Application applicationContext = AppbrandContext.getInst().getApplicationContext();
            CrossProcessDataEntity.C67574a a = CrossProcessDataEntity.C67574a.m263013a().mo234760a("miniAppId", (Object) appInfo.appId).mo234760a("miniAppVersionType", (Object) appInfo.versionType);
            if (ProcessUtil.isMainProcess(applicationContext)) {
                AppBrandLogger.m52828d("InnerHostProcessBridge", "current process is main, so process name put sandBoxEnvName");
                a.mo234760a("processName", (Object) aVar.mo234164d());
            } else {
                AppBrandLogger.m52828d("InnerHostProcessBridge", "current process is mini, so process name put processName");
                a.mo234760a("processName", (Object) ProcessUtil.getCurProcessName(applicationContext));
            }
            C67560a.m262959a("setTmaLaunchFlag", a.mo234763b(), (AbstractC67565b) null);
        }
    }

    /* renamed from: b */
    public static boolean m260235b(String str) {
        CrossProcessDataEntity a = C67560a.m262955a("is_in_jump_list", CrossProcessDataEntity.C67574a.m263013a().mo234760a("miniAppId", (Object) str).mo234763b());
        if (a != null) {
            return a.mo234743a("is_in_jumplist", false);
        }
        return false;
    }

    /* renamed from: c */
    public static void m260237c(String str, String str2) {
        C67560a.m262955a("notify_mini_app_process_crash", CrossProcessDataEntity.C67574a.m263013a().mo234760a("processName", (Object) str).mo234760a("exceptionMessage", (Object) str2).mo234763b());
    }

    /* renamed from: d */
    public static void m260239d(String str, String str2) {
        C67560a.m262955a("addHostEventListener", CrossProcessDataEntity.C67574a.m263013a().mo234760a("host_event_mp_id", (Object) str).mo234760a("host_event_event_name", (Object) str2).mo234763b());
    }

    /* renamed from: e */
    public static void m260241e(String str, String str2) {
        C67560a.m262955a("removeHostEventListener", CrossProcessDataEntity.C67574a.m263013a().mo234760a("host_event_mp_id", (Object) str).mo234760a("host_event_event_name", (Object) str2).mo234763b());
    }

    /* renamed from: b */
    public static void m260234b(String str, String str2) {
        C67560a.m262959a("activity_created", CrossProcessDataEntity.C67574a.m263013a().mo234760a("mini_app_id", (Object) str).mo234760a("sand_box_env_name", (Object) str2).mo234763b(), (AbstractC67565b) null);
    }

    /* renamed from: a */
    public static void m260224a(String str, String str2) {
        C67560a.m262959a("savePlatformSession", CrossProcessDataEntity.C67574a.m263013a().mo234760a("miniAppId", (Object) str2).mo234760a("platformSession", (Object) str).mo234763b(), (AbstractC67565b) null);
    }

    /* renamed from: b */
    public static String m260232b(String str, String str2, String str3) {
        CrossProcessDataEntity a = C67560a.m262955a("getSpData", CrossProcessDataEntity.C67574a.m263013a().mo234760a("sp_data_key", (Object) str2).mo234760a("sp_data_file", (Object) str).mo234760a("sp_data_default", (Object) str3).mo234763b());
        if (a != null) {
            return a.mo234744b("sp_data_value");
        }
        return str3;
    }

    /* renamed from: a */
    public static void m260222a(AppInfoEntity appInfoEntity, String str, IAppContext iAppContext) {
        CrossProcessDataEntity.C67574a a = CrossProcessDataEntity.C67574a.m263013a().mo234760a("miniAppToId", (Object) appInfoEntity.appId).mo234760a("miniAppFromId", (Object) str).mo234760a("startPage", (Object) appInfoEntity.startPage).mo234760a(SearchIntents.EXTRA_QUERY, (Object) appInfoEntity.query).mo234760a("refererInfo", (Object) appInfoEntity.refererInfo).mo234760a("version_type", (Object) appInfoEntity.versionType).mo234760a("miniAppOrientation", (Object) Integer.valueOf(appInfoEntity.isLandScape ? 1 : 0)).mo234760a("isGame", (Object) Boolean.valueOf(appInfoEntity.isGame()));
        JSONObject a2 = C66019a.m258527a(iAppContext);
        if (a2 != null) {
            a.mo234760a("miniAppOriginEntrance", (Object) a2.toString());
        }
        AppbrandApplicationImpl.getInst(iAppContext).setJumpToApp(true);
        C67560a.m262955a("jump_to_app", a.mo234763b());
    }

    /* renamed from: a */
    public static void m260225a(String str, String str2, AbstractC67565b bVar) {
        C67560a.m262959a("scheduleApiHandler", CrossProcessDataEntity.C67574a.m263013a().mo234760a(HiAnalyticsConstant.HaKey.BI_KEY_APINAME, (Object) str).mo234760a("apiData", (Object) str2).mo234763b(), bVar);
    }
}
