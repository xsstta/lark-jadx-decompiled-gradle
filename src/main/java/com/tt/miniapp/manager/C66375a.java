package com.tt.miniapp.manager;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkoryx.OryxManagerProxy;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.manager.appinfo.C66409a;
import com.tt.miniapp.manager.appinfo.C66410b;
import com.tt.miniapp.manager.appinfo.C66411c;
import com.tt.miniapp.manager.appinfo.C66412d;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapp.render.RenderEngineType;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.manager.a */
public class C66375a {

    /* renamed from: a */
    public static final String f167578a = (AppbrandConstant.C65701b.m257612c().mo230139d() + "/api/apps/v3/meta");

    /* renamed from: com.tt.miniapp.manager.a$a */
    public interface AbstractC66376a {
        /* renamed from: a */
        void mo148970a(int i, AppInfoEntity appInfoEntity);

        /* renamed from: a */
        void mo148971a(int i, AppInfoEntity appInfoEntity, int i2);

        /* renamed from: a */
        void mo148972a(int i, String str, String str2);
    }

    /* renamed from: a */
    public static String m259516a(Uri uri) {
        return uri.getQueryParameter("least_version");
    }

    /* renamed from: b */
    public static boolean m259524b(Uri uri) {
        String queryParameter = uri.getQueryParameter("launch_mode");
        if (TextUtils.isEmpty(queryParameter)) {
            return false;
        }
        return queryParameter.equalsIgnoreCase("hostStack");
    }

    /* renamed from: a */
    public static AppInfoEntity m259513a(String str) {
        AppInfoEntity appInfoEntity = new AppInfoEntity();
        m259521a(str, appInfoEntity);
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("meta");
        if (!TextUtils.isEmpty(queryParameter)) {
            m259520a(appInfoEntity, queryParameter, !appInfoEntity.isLocalTest());
        }
        if (TextUtils.isEmpty(parse.getQueryParameter(HiAnalyticsConstant.HaKey.BI_KEY_VERSION))) {
            String queryParameter2 = parse.getQueryParameter("url");
            if (!TextUtils.isEmpty(queryParameter2)) {
                m259523b(appInfoEntity, queryParameter2);
            }
        }
        String queryParameter3 = parse.getQueryParameter("inspect");
        if (!TextUtils.isEmpty(queryParameter3)) {
            m259519a(appInfoEntity, queryParameter3);
        }
        return appInfoEntity;
    }

    /* renamed from: a */
    public static void m259517a(Context context, IAppContext iAppContext) {
        C66409a.m259644a(context, iAppContext);
    }

    /* renamed from: a */
    public static AppInfoEntity m259514a(String str, IAppContext iAppContext) {
        return m259515a(str, "current", iAppContext);
    }

    /* renamed from: a */
    public static void m259521a(String str, AppInfoEntity appInfoEntity) {
        if (!m259525b(str, appInfoEntity)) {
            m259527c(str, appInfoEntity);
        }
        if (OryxManagerProxy.f35291a.isAppOryxEnable(appInfoEntity)) {
            appInfoEntity.renderEngineType = RenderEngineType.Oryx;
        }
    }

    /* renamed from: a */
    public static void m259519a(AppInfoEntity appInfoEntity, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                appInfoEntity.session = jSONObject.optString("session");
                appInfoEntity.gtoken = jSONObject.optString("gtoken");
                appInfoEntity.roomid = jSONObject.optString("roomid");
            } catch (Exception e) {
                AppBrandLogger.m52829e("AppInfoManager", "parseAppInfoFromSchemaInspect", e);
            }
        }
    }

    /* renamed from: b */
    public static void m259523b(AppInfoEntity appInfoEntity, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                appInfoEntity.session = jSONObject.optString("session");
                appInfoEntity.gtoken = jSONObject.optString("gtoken");
                appInfoEntity.roomid = jSONObject.optString("roomid");
            } catch (Exception e) {
                AppBrandLogger.m52829e("AppInfoManager", "parseAppInfoFromSchemaInspect", e);
            }
        }
    }

    /* renamed from: b */
    public static boolean m259526b(String str, String str2) {
        try {
            if (!TextUtils.equals(str, "")) {
                if (!TextUtils.equals(str2, "")) {
                    String[] split = str.split("\\.");
                    String[] split2 = str2.split("\\.");
                    if (split.length == split2.length) {
                        for (int i = 0; i < split.length; i++) {
                            if (Integer.parseInt(split[i]) > Integer.parseInt(split2[i])) {
                                return true;
                            }
                            if (Integer.parseInt(split[i]) < Integer.parseInt(split2[i])) {
                                return false;
                            }
                        }
                    } else if (split.length > split2.length) {
                        int i2 = 0;
                        while (i2 < split2.length) {
                            if (Integer.parseInt(split[i2]) > Integer.parseInt(split2[i2])) {
                                return true;
                            }
                            if (Integer.parseInt(split[i2]) < Integer.parseInt(split2[i2])) {
                                return false;
                            }
                            if (Integer.parseInt(split[i2]) == Integer.parseInt(split2[i2])) {
                                if (split2.length != 1) {
                                    if (i2 == split2.length - 1) {
                                        while (i2 < split.length && Integer.parseInt(split[i2]) == 0) {
                                            if (i2 == split.length - 1) {
                                                return false;
                                            }
                                            i2++;
                                        }
                                        return true;
                                    }
                                }
                            }
                            i2++;
                        }
                    } else {
                        for (int i3 = 0; i3 < split.length; i3++) {
                            if (Integer.parseInt(split[i3]) > Integer.parseInt(split2[i3])) {
                                return true;
                            }
                            if (Integer.parseInt(split[i3]) < Integer.parseInt(split2[i3])) {
                                return false;
                            }
                            if (Integer.parseInt(split[i3]) == Integer.parseInt(split2[i3])) {
                                if (split.length != 1) {
                                    if (i3 == split.length - 1) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        } catch (NumberFormatException e) {
            AppBrandLogger.m52829e("AppInfoManager", "NumberFormatException:", e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public static void m259518a(AppInfoEntity appInfoEntity, AppInfoEntity appInfoEntity2) {
        String str;
        String str2;
        long j;
        String str3;
        List<String> list;
        if ("local_dev".equals(appInfoEntity2.versionType)) {
            String defaultUrl = appInfoEntity2.getDefaultUrl();
            if (!TextUtils.isEmpty(defaultUrl)) {
                try {
                    str3 = new URL(defaultUrl).getPath();
                } catch (MalformedURLException e) {
                    AppBrandLogger.m52829e("AppInfoManager", e);
                    str3 = "";
                }
                if (!str3.endsWith(".zip")) {
                    if (TextUtils.isEmpty(appInfoEntity2.getDefaultUrl())) {
                        list = appInfoEntity.appUrls;
                    } else {
                        list = appInfoEntity2.appUrls;
                    }
                    appInfoEntity.appUrls = list;
                }
            }
        }
        if (TextUtils.isEmpty(appInfoEntity2.version)) {
            str = appInfoEntity.version;
        } else {
            str = appInfoEntity2.version;
        }
        appInfoEntity.version = str;
        if (TextUtils.isEmpty(appInfoEntity2.appId)) {
            str2 = appInfoEntity.appId;
        } else {
            str2 = appInfoEntity2.appId;
        }
        appInfoEntity.appId = str2;
        if (appInfoEntity2.versionCode == 0) {
            j = appInfoEntity.versionCode;
        } else {
            j = appInfoEntity2.versionCode;
        }
        appInfoEntity.versionCode = j;
        appInfoEntity.versionType = appInfoEntity2.versionType;
        appInfoEntity.refererInfo = appInfoEntity2.refererInfo;
        appInfoEntity.launchFrom = appInfoEntity2.launchFrom;
        appInfoEntity.scene = appInfoEntity2.scene;
        appInfoEntity.subScene = appInfoEntity2.subScene;
        appInfoEntity.shareTicket = appInfoEntity2.shareTicket;
        appInfoEntity.startPage = appInfoEntity2.startPage;
        appInfoEntity.oriStartPage = appInfoEntity2.oriStartPage;
        appInfoEntity.session = appInfoEntity2.session;
        appInfoEntity.gtoken = appInfoEntity2.gtoken;
        appInfoEntity.roomid = appInfoEntity2.roomid;
        appInfoEntity.extra = appInfoEntity2.extra;
        appInfoEntity.bdpLaunchQuery = appInfoEntity2.bdpLaunchQuery;
        appInfoEntity.query = appInfoEntity2.query;
        appInfoEntity.bdpLog = appInfoEntity2.bdpLog;
        appInfoEntity.location = appInfoEntity2.location;
        appInfoEntity.bizLocation = appInfoEntity2.bizLocation;
        appInfoEntity.launchType = appInfoEntity2.launchType;
    }

    /* renamed from: b */
    public static boolean m259525b(String str, AppInfoEntity appInfoEntity) {
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter(HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        if (TextUtils.isEmpty(queryParameter) || !queryParameter.equals("v2")) {
            return false;
        }
        appInfoEntity.schemaVersion = queryParameter;
        appInfoEntity.appId = parse.getQueryParameter("app_id");
        String queryParameter2 = parse.getQueryParameter("app_sand_box_type");
        if (queryParameter2 != null) {
            appInfoEntity.sandBoxEnvType = IAppSandboxEnvManagerService.SandBoxEnvType.fromNumber(Integer.parseInt(queryParameter2));
        } else {
            appInfoEntity.sandBoxEnvType = IAppSandboxEnvManagerService.SandBoxEnvType.MINI_PROCESS;
        }
        appInfoEntity.bdpLog = parse.getQueryParameter("bdp_log");
        if (!TextUtils.isEmpty(parse.getQueryParameter("launch_from"))) {
            appInfoEntity.launchFrom = parse.getQueryParameter("launch_from");
        }
        if (!TextUtils.isEmpty(parse.getQueryParameter("ttid"))) {
            appInfoEntity.ttId = parse.getQueryParameter("ttid");
        }
        if (!TextUtils.isEmpty(appInfoEntity.bdpLog)) {
            try {
                JSONObject jSONObject = new JSONObject(appInfoEntity.bdpLog);
                String optString = jSONObject.optString("launch_from");
                String optString2 = jSONObject.optString("ttid");
                if (!TextUtils.isEmpty(optString)) {
                    appInfoEntity.launchFrom = optString;
                }
                if (!TextUtils.isEmpty(optString2)) {
                    appInfoEntity.ttId = optString2;
                }
                appInfoEntity.location = jSONObject.optString("location");
                appInfoEntity.bizLocation = jSONObject.optString("biz_location");
            } catch (JSONException e) {
                AppBrandLogger.stacktrace(6, "AppInfoManager", e.getStackTrace());
            }
        }
        if (parse.getQueryParameter("scene") != null) {
            appInfoEntity.scene = parse.getQueryParameter("scene");
        } else if (TextUtils.isEmpty(appInfoEntity.launchFrom)) {
            appInfoEntity.scene = "";
        } else {
            appInfoEntity.scene = HostDependManager.getInst().getScene(appInfoEntity.launchFrom);
        }
        if (TextUtils.isEmpty(appInfoEntity.scene)) {
            appInfoEntity.scene = "0";
        }
        appInfoEntity.shareTicket = parse.getQueryParameter("shareTicket");
        appInfoEntity.startPage = parse.getQueryParameter("start_page");
        appInfoEntity.query = parse.getQueryParameter(SearchIntents.EXTRA_QUERY);
        appInfoEntity.oriStartPage = appInfoEntity.startPage;
        appInfoEntity.versionType = parse.getQueryParameter("version_type");
        appInfoEntity.token = parse.getQueryParameter("token");
        appInfoEntity.extra = parse.getQueryParameter("extra");
        appInfoEntity.bdpLaunchQuery = parse.getQueryParameter("bdp_launch_query");
        if (TextUtils.isEmpty(parse.getQueryParameter("bdp_launch_type"))) {
            appInfoEntity.launchType = "normal";
        } else {
            appInfoEntity.launchType = parse.getQueryParameter("bdp_launch_type");
        }
        appInfoEntity.launchActionAbility = parse.getQueryParameter("required_launch_ability");
        if (TextUtils.equals(parse.getHost(), "microapp")) {
            appInfoEntity.type = 1;
        } else if (TextUtils.equals(parse.getHost(), "microgame")) {
            appInfoEntity.type = 2;
        }
        appInfoEntity.refererInfo = parse.getQueryParameter("referer_info");
        if ((TextUtils.equals(appInfoEntity.launchFrom, "in_mp") || TextUtils.equals(appInfoEntity.launchFrom, "back_mp")) && !TextUtils.isEmpty(appInfoEntity.refererInfo)) {
            try {
                String optString3 = new JSONObject(appInfoEntity.refererInfo).optString("appId");
                if (!TextUtils.isEmpty(optString3)) {
                    appInfoEntity.bizLocation = optString3;
                }
            } catch (JSONException e2) {
                AppBrandLogger.eWithThrowable("AppInfoManager", "error refererInfo", e2);
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m259527c(String str, AppInfoEntity appInfoEntity) {
        Uri parse = Uri.parse(str);
        appInfoEntity.appId = parse.getQueryParameter("app_id");
        String queryParameter = parse.getQueryParameter("app_sand_box_type");
        if (queryParameter != null) {
            appInfoEntity.sandBoxEnvType = IAppSandboxEnvManagerService.SandBoxEnvType.fromNumber(Integer.parseInt(queryParameter));
        } else {
            appInfoEntity.sandBoxEnvType = IAppSandboxEnvManagerService.SandBoxEnvType.MINI_PROCESS;
        }
        if (!TextUtils.isEmpty(parse.getQueryParameter("launch_from"))) {
            appInfoEntity.launchFrom = parse.getQueryParameter("launch_from");
        }
        if (parse.getQueryParameter("scene") != null) {
            appInfoEntity.scene = parse.getQueryParameter("scene");
        } else if (TextUtils.isEmpty(appInfoEntity.launchFrom)) {
            appInfoEntity.scene = "";
        } else {
            appInfoEntity.scene = HostDependManager.getInst().getScene(appInfoEntity.launchFrom);
        }
        if (TextUtils.isEmpty(appInfoEntity.scene)) {
            appInfoEntity.scene = "0";
        }
        if (parse.getQueryParameter("sub_scene") == null) {
            appInfoEntity.subScene = "";
        } else {
            appInfoEntity.subScene = parse.getQueryParameter("sub_scene");
        }
        appInfoEntity.shareTicket = parse.getQueryParameter("shareTicket");
        appInfoEntity.startPage = parse.getQueryParameter("start_page");
        appInfoEntity.query = parse.getQueryParameter(SearchIntents.EXTRA_QUERY);
        appInfoEntity.extra = parse.getQueryParameter("extra");
        appInfoEntity.bdpLaunchQuery = parse.getQueryParameter("bdp_launch_query");
        appInfoEntity.launchActionAbility = parse.getQueryParameter("required_launch_ability");
        if (!TextUtils.isEmpty(parse.getQueryParameter("name"))) {
            appInfoEntity.appName = parse.getQueryParameter("name");
        }
        if (!TextUtils.isEmpty(parse.getQueryParameter("icon"))) {
            appInfoEntity.icon = parse.getQueryParameter("icon");
        }
        if (TextUtils.equals(parse.getHost(), "microapp")) {
            appInfoEntity.setType(1);
        } else if (TextUtils.equals(parse.getHost(), "microgame")) {
            appInfoEntity.setType(2);
        }
        if (!TextUtils.isEmpty(parse.getQueryParameter("ttid"))) {
            appInfoEntity.ttId = parse.getQueryParameter("ttid");
        }
        appInfoEntity.versionType = parse.getQueryParameter("version_type");
        appInfoEntity.token = parse.getQueryParameter("token");
        appInfoEntity.oriStartPage = appInfoEntity.startPage;
        appInfoEntity.bdpLog = parse.getQueryParameter("bdp_log");
        if (TextUtils.isEmpty(parse.getQueryParameter("bdp_launch_type"))) {
            appInfoEntity.launchType = "normal";
        } else {
            appInfoEntity.launchType = parse.getQueryParameter("bdp_launch_type");
        }
        if (!TextUtils.isEmpty(appInfoEntity.bdpLog)) {
            try {
                JSONObject jSONObject = new JSONObject(appInfoEntity.bdpLog);
                String optString = jSONObject.optString("launch_from");
                String optString2 = jSONObject.optString("ttid");
                if (!TextUtils.isEmpty(optString)) {
                    appInfoEntity.launchFrom = optString;
                }
                if (!TextUtils.isEmpty(optString2)) {
                    appInfoEntity.ttId = optString2;
                }
                appInfoEntity.location = jSONObject.optString("location");
                appInfoEntity.bizLocation = jSONObject.optString("biz_location");
            } catch (JSONException e) {
                AppBrandLogger.stacktrace(6, "AppInfoManager", e.getStackTrace());
            }
        }
        appInfoEntity.refererInfo = parse.getQueryParameter("referer_info");
        if ((TextUtils.equals(appInfoEntity.launchFrom, "in_mp") || TextUtils.equals(appInfoEntity.launchFrom, "back_mp")) && !TextUtils.isEmpty(appInfoEntity.refererInfo)) {
            try {
                String optString3 = new JSONObject(appInfoEntity.refererInfo).optString("appId");
                if (!TextUtils.isEmpty(optString3)) {
                    appInfoEntity.bizLocation = optString3;
                }
            } catch (JSONException e2) {
                AppBrandLogger.eWithThrowable("AppInfoManager", "error refererInfo", e2);
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m259522a(String str, String str2) {
        if (!LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.gadget.leastversioncheck.enable")) {
            return false;
        }
        String a = m259516a(Uri.parse(str));
        if (TextUtils.isEmpty(a) || !m259526b(a, str2)) {
            return false;
        }
        AppBrandLogger.m52830i("AppInfoManager", "leastVersion is effective，leastVersion is :" + a, "metaVersion:" + str2);
        return true;
    }

    /* renamed from: a */
    public static AppInfoEntity m259515a(String str, String str2, IAppContext iAppContext) {
        String str3;
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        C66411c a = C66412d.m259646a(applicationContext, iAppContext);
        if (a == null) {
            str3 = "";
        } else {
            str3 = a.f167670c;
        }
        Map<String, Object> a2 = C66409a.m259642a(applicationContext, str, str3, null, str2, iAppContext);
        String a3 = AppbrandContext.getInst().getInitParams().mo234501a(CommonCode.StatusCode.API_CLIENT_EXPIRED, f167578a);
        C12830f a4 = C66409a.m259639a(a3, a2, "prefetch_mini", iAppContext);
        String a5 = C66409a.m259641a(a3, a2);
        C66410b bVar = new C66410b();
        if (C66409a.m259645a(a4.mo48466d(), a5, -1, bVar, iAppContext)) {
            return bVar.f167665a;
        }
        return null;
    }

    /* renamed from: a */
    public static void m259520a(AppInfoEntity appInfoEntity, String str, boolean z) {
        AppBrandLogger.m52830i("AppInfoManager", "parseAppInfoFromSchemaMeta ", str, " isReleaseVersionMiniApp:", Boolean.valueOf(z));
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                appInfoEntity.icon = jSONObject.optString("icon");
                appInfoEntity.appName = jSONObject.optString("name");
            } catch (Exception e) {
                AppBrandLogger.m52829e("AppInfoManager", "parseAppInfoFromSchemaMeta", e);
            }
        }
    }
}
