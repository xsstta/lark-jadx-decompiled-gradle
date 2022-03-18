package com.tt.miniapphost;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.ss.android.lark.log.Log;
import com.tt.miniapp.BridgeUniteHelper;
import com.tt.miniapp.event.lark.C66039b;
import com.tt.miniapp.jsbridge.C66240d;
import com.tt.miniapp.util.C67044k;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.base.AppType;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapphost.h */
public class C67548h {
    private static String getProcess() {
        String curProcessName = ProcessUtil.getCurProcessName(AppbrandContext.getInst().getApplicationContext());
        if (curProcessName == null) {
            curProcessName = "";
        }
        return curProcessName + "(" + Process.myPid() + ")";
    }

    private static String null2Empty(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str;
    }

    private static String trimParams(String str) {
        int indexOf;
        if (TextUtils.isEmpty(str) || (indexOf = str.indexOf(63)) == -1) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    public static void mpProcessLoadStart(String str, IAppContext iAppContext) {
        C66039b.m258622a("mp_process_load_start", iAppContext).mo231123a("trace_id", str).mo231124a();
    }

    public static void mpAppContainerStart(long j, String str, IAppContext iAppContext) {
        C66039b.m258622a("mp_app_container_start", iAppContext).mo231123a("trace_id", str).mo231123a("total_duration", Long.valueOf(j)).mo231124a();
    }

    public static JSONObject getCommonParams(JSONObject jSONObject, AppInfoEntity appInfoEntity, IAppContext iAppContext) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e) {
                JSONObject jSONObject2 = new JSONObject();
                AppBrandLogger.stacktrace(6, "tma_EventHelper", e.getStackTrace());
                return jSONObject2;
            }
        }
        jSONObject.put("time", System.currentTimeMillis());
        jSONObject.put("cpu_time", SystemClock.elapsedRealtime());
        jSONObject.put("boot_time_exclude_sleep", SystemClock.uptimeMillis());
        if (ProcessUtil.isMiniappProcess()) {
            if (!(appInfoEntity != null || iAppContext == null || C67432a.m262319a(iAppContext) == null)) {
                appInfoEntity = C67432a.m262319a(iAppContext).getAppInfo();
            }
            jSONObject.put("trace_id", AppbrandContext.getInst().getTraceId());
        } else if (iAppContext != null && AppType.GadgetAPP == iAppContext.getAppType()) {
            if (appInfoEntity == null && C67432a.m262319a(iAppContext) != null) {
                appInfoEntity = C67432a.m262319a(iAppContext).getAppInfo();
            }
            jSONObject.put("trace_id", iAppContext.getTraceId());
        }
        if (appInfoEntity == null) {
            appInfoEntity = new AppInfoEntity();
        }
        String str = "1";
        if (C25529d.m91158c(iAppContext)) {
            jSONObject.put("new_container", str);
        }
        jSONObject.put("gadget_is_ssb", C25529d.m91167h(iAppContext));
        if (!C66240d.m259242a()) {
            str = "0";
        }
        jSONObject.put("is_falcon_js_engine", str);
        if (!TextUtils.isEmpty(appInfoEntity.appId)) {
            jSONObject.put("app_id", null2Empty(appInfoEntity.appId));
        } else if (iAppContext != null) {
            jSONObject.put("app_id", null2Empty(iAppContext.getAppId()));
        }
        jSONObject.put("compile_version", null2Empty(appInfoEntity.compileVersion));
        jSONObject.put("app_version", null2Empty(appInfoEntity.version));
        jSONObject.put("app_name", null2Empty(appInfoEntity.appName));
        if (!(iAppContext == null || iAppContext.getAppType() == null)) {
            if (AppType.WebGadgetAPP == iAppContext.getAppType()) {
                jSONObject.put("app_type", "html5_app");
            } else if (AppType.GadgetAPP == iAppContext.getAppType()) {
                jSONObject.put("app_type", "native_app");
            }
        }
        jSONObject.put("js_version", C67552k.m262720a(AppbrandContext.getInst().getApplicationContext(), iAppContext));
        jSONObject.put("scene", null2Empty(appInfoEntity.scene));
        jSONObject.put("sub_scene", null2Empty(appInfoEntity.subScene));
        jSONObject.put("process_info", getProcess());
        jSONObject.put("tid", Thread.currentThread().getName());
        jSONObject.put("is_tt_webview", HostDependManager.getInst().isTTWebView());
        return jSONObject;
    }

    public static void mpAppPreloadStart(String str, long j, String str2, IAppContext iAppContext) {
        C66039b.m258622a("mp_app_preload_start", iAppContext).mo231123a("trace_id", str).mo231123a("app_launch_time", Long.valueOf(j)).mo231123a("preload_type", str2).mo231124a();
    }

    public static void h5GadgetLaunchStart(long j, String str, int i, String str2, String str3, String str4, IAppContext iAppContext) {
        C66039b.m258622a("mp_app_launch_start", iAppContext).mo231123a("app_launch_time", Long.valueOf(j)).mo231123a("first_launch", Integer.valueOf(i)).mo231123a("scene", str).mo231123a("app_id", str4).mo231123a("tenant_id", C67044k.m261292a(str2)).mo231123a("user_id", C67044k.m261292a(str3)).mo231124a();
    }

    public static void mpAppLaunchStart(String str, long j, String str2, Float f, String str3, Integer num, Float f2, String str4, int i, String str5, String str6, int i2, IAppContext iAppContext) {
        Log.m165389i("tma_EventHelper", "launch_start_XXXX:" + str);
        C66039b.m258622a("mp_app_launch_start", iAppContext).mo231123a("trace_id", str).mo231123a("app_launch_time", Long.valueOf(j)).mo231123a("from", str2).mo231123a("cpu_max", f).mo231123a("schema", str3).mo231123a("fps_min", num).mo231123a("memory_percent", f2).mo231123a("start_page_path", trimParams(str4)).mo231123a("first_launch", Integer.valueOf(i)).mo231123a("tenant_id", C67044k.m261292a(str5)).mo231123a("user_id", C67044k.m261292a(str6)).mo231123a("isNewBridge", Boolean.valueOf(BridgeUniteHelper.f166701a.mo231125a())).mo231123a("aot_running", Integer.valueOf(i2)).mo231124a();
    }
}
