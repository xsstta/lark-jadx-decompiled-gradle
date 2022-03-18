package com.tt.miniapphost;

import android.app.Application;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12825c;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.bytedance.ee.lark.infra.network.p633e.C12835b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.he.jsbinding.JsEngine;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.plugin.messenger.location.C25225h;
import com.larksuite.component.openplatform.core.utils.OPMonitorUtils;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.p2069j.p2070a.C40636c;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapp.util.C67053q;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.base.AppType;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapphost.d */
public class C67475d {

    /* renamed from: a */
    private static JSONObject f170107a;

    /* renamed from: a */
    public static void m262458a(String str, String str2, String str3, String str4, String str5, String str6, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js_version", str2);
            jSONObject.put("js_grey_hash", str3);
            jSONObject.put("latest_version", str4);
            jSONObject.put("result_type", str5);
            jSONObject.put("_param_for_special", "micro_app");
            if (j >= 0) {
                jSONObject.put("duration", j);
            }
            if (!TextUtils.isEmpty(str6)) {
                jSONObject.put("error_msg", str6);
            }
        } catch (JSONException e) {
            AppBrandLogger.stacktrace(6, "tma_EventHelper", e.getStackTrace());
        }
        AppBrandLogger.m52828d("tma_EventHelper", "exit event:", jSONObject.toString());
        C67556a.m262937a(str, jSONObject, 6);
    }

    /* renamed from: a */
    public static void m262459a(String str, String str2, String str3, String str4, boolean z, long j, String str5, String str6, IAppContext iAppContext) {
        JSONObject a = m262451a(new JSONObject(), null, iAppContext);
        try {
            if (!TextUtils.isEmpty(str)) {
                a.put("app_id", str);
            }
            if (!TextUtils.isEmpty(str)) {
                a.put("launch_from", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                a.put("scene", str3);
            }
            if (!TextUtils.isEmpty(str)) {
                a.put("sub_scene", str4);
            }
            if (!TextUtils.isEmpty(str)) {
                a.put("_param_for_special", z ? "micro_game" : "micro_app");
            }
            a.put("duration", j);
            a.put("result_type", str5);
            a.put("error_msg", str6);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C67556a.m262937a("mp_init_result", a, 6);
    }

    /* renamed from: a */
    public static void m262460a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null) {
            try {
                jSONObject2.put("js_version", jSONObject.opt("js_version"));
                jSONObject2.put("miniapp_sdk_version", jSONObject.opt("miniapp_sdk_version"));
                jSONObject2.put("js_engine_version", jSONObject.opt("js_engine_version"));
                jSONObject2.put("js_engine_type", jSONObject.opt("js_engine_type"));
                jSONObject2.put("v8_version", jSONObject.opt("v8_version"));
                jSONObject2.put("dora_version", jSONObject.opt("dora_version"));
                jSONObject2.put("_param_for_special", jSONObject.opt("_param_for_special"));
                jSONObject2.put("app_id", jSONObject.opt("app_id"));
                jSONObject2.put("mp_gid", jSONObject.opt("mp_gid"));
                jSONObject2.put("mp_name", jSONObject.opt("mp_name"));
                jSONObject2.put("launch_from", jSONObject.opt("launch_from"));
                jSONObject2.put("scene", jSONObject.opt("scene"));
                jSONObject2.put("sub_scene", jSONObject.opt("sub_scene"));
                jSONObject2.put("bdp_log", jSONObject.opt("bdp_log"));
                jSONObject2.put("location", jSONObject.opt("location"));
                jSONObject2.put("biz_location", jSONObject.opt("biz_location"));
                jSONObject2.put("trace_id", jSONObject.opt("trace_id"));
            } catch (JSONException e) {
                AppBrandLogger.eWithThrowable("tma_EventHelper", "fetchCommonParams exp!", e);
            }
        }
    }

    /* renamed from: a */
    private static void m262456a(AppInfoEntity appInfoEntity, JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject;
        if (appInfoEntity != null && jSONObject != null) {
            String str = appInfoEntity.extra;
            if (!TextUtils.isEmpty(str) && (optJSONObject = new JSONObject(str).optJSONObject("event_extra")) != null) {
                try {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, optJSONObject.get(next));
                    }
                } catch (JSONException e) {
                    AppBrandLogger.stacktrace(5, "tma_EventHelper", e.getStackTrace());
                }
            }
        }
    }

    /* renamed from: a */
    public static void m262461a(boolean z, String str, long j, int i, String str2, IAppContext iAppContext) {
        JSONObject b = m262462b(iAppContext);
        try {
            b.put("use_expire_time", z);
            b.put("duration", j);
            b.put("error_code", i);
            b.put("error_msg", str2);
            b.put("result_type", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C67556a.m262937a("mp_check_session_result", b, 6);
    }

    /* renamed from: a */
    public static void m262457a(String str, long j, Long l, Boolean bool, String str2, Boolean bool2, IAppContext iAppContext) {
        JSONObject c = m262463c(str, j, str2, iAppContext);
        if (l != null) {
            try {
                c.put("invoke_duration", l);
            } catch (JSONException e) {
                AppBrandLogger.m52829e("tma_EventHelper", "put invokeDuration", e);
            }
        }
        if (bool != null) {
            try {
                c.put("js_core_ready", bool);
            } catch (JSONException e2) {
                AppBrandLogger.m52829e("tma_EventHelper", "put isJsCoreReady", e2);
            }
        }
        if (bool2 == null) {
            bool2 = Boolean.FALSE;
        }
        if (bool2 != null) {
            try {
                c.put("from_pre_login", bool2);
            } catch (JSONException e3) {
                AppBrandLogger.m52829e("tma_EventHelper", "put isJsCoreReady", e3);
            }
        }
        C67556a.m262937a("mp_login_result", c, 6);
    }

    /* renamed from: a */
    public static void m262454a(IAppContext iAppContext, String str) {
        OPMonitor opMonitor = OPMonitorUtils.getOpMonitor(iAppContext, "mp_location_plugin_process_start", C40636c.f103066c);
        if (opMonitor != null) {
            opMonitor.reportPlatform(2).addCategoryValue("location_args", str).flush();
        }
    }

    /* renamed from: a */
    public static void m262455a(IAppContext iAppContext, String str, long j, int i, float f, long j2, String str2, long j3, String str3, float f2, int i2, String str4, int i3, String str5, boolean z, int i4, int i5, ArrayList<C25225h> arrayList) {
        JSONObject c = m262463c(str, j, str4, iAppContext);
        try {
            c.put("timeout", j3).put("mode", str3).put("desired_accuracy", (double) f2);
            c.put("change_count", i3);
            c.put("location_from", str5);
            if (f > BitmapDescriptorFactory.HUE_RED) {
                c.put("accuracy", (double) f);
            }
            if (j2 > 0) {
                c.put("location_time", j2);
            }
            if (!TextUtils.isEmpty(str2)) {
                c.put("provider", str2);
            }
            if (i > 0) {
                c.put("location_type", i);
            }
            c.put("api_time", System.currentTimeMillis());
            if (i2 != 0) {
                c.put("error_code", i2);
            }
            Application applicationContext = AppbrandContext.getInst().getApplicationContext();
            if (applicationContext != null) {
                WifiManager wifiManager = (WifiManager) applicationContext.getSystemService("wifi");
                if (wifiManager != null) {
                    c.put("wifi_status", wifiManager.isWifiEnabled());
                }
                LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
                c.put("gps_env", z);
                c.put("wifi_env", i4);
                c.put("base_station_env", i5);
                if (locationManager != null) {
                    c.put("gps_status", locationManager.isProviderEnabled("gps"));
                    c.put("network_status", locationManager.isProviderEnabled("network"));
                }
            }
            if (arrayList != null && arrayList.size() > 0) {
                c.put("location_counts", arrayList.size());
                JSONArray jSONArray = new JSONArray();
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    Location location = arrayList.get(i6).f61592a;
                    if (location != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("accuracy", (double) location.getAccuracy()).put("location_time", location.getTime()).put("provider", location.getProvider()).put("api_time", arrayList.get(i6).f61593b);
                        jSONArray.put(jSONObject);
                    }
                }
                c.put("location_list", jSONArray);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C67556a.m262937a("mp_location_quality", c, 6);
    }

    /* renamed from: a */
    private static String m262446a() {
        String curProcessName = ProcessUtil.getCurProcessName(AppbrandContext.getInst().getApplicationContext());
        if (curProcessName == null) {
            curProcessName = "";
        }
        return curProcessName + "(" + Process.myPid() + ")";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapphost.d$1 */
    public static /* synthetic */ class C674761 {

        /* renamed from: a */
        static final /* synthetic */ int[] f170108a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tt.refer.common.base.AppType[] r0 = com.tt.refer.common.base.AppType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.tt.miniapphost.C67475d.C674761.f170108a = r0
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.WebAPP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.tt.miniapphost.C67475d.C674761.f170108a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.GadgetGame     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.tt.miniapphost.C67475d.C674761.f170108a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.GadgetAPP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.tt.miniapphost.C67475d.C674761.f170108a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.WebGadgetAPP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.tt.miniapphost.C67475d.C674761.f170108a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.WebGadgetGame     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.tt.miniapphost.C67475d.C674761.f170108a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.CardAPP     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.tt.miniapphost.C67475d.C674761.f170108a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.BlockitApp     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.C67475d.C674761.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static String m262447a(AppInfoEntity appInfoEntity) {
        if (appInfoEntity == null || 2 != appInfoEntity.type) {
            return "micro_app";
        }
        return "micro_game";
    }

    /* renamed from: a */
    private static String m262449a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str;
    }

    /* renamed from: b */
    public static JSONObject m262462b(IAppContext iAppContext) {
        if (f170107a == null) {
            f170107a = m262450a(iAppContext);
        }
        try {
            return new JSONObject(f170107a.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return m262450a(iAppContext);
        }
    }

    /* renamed from: a */
    public static String m262448a(AppType appType) {
        switch (C674761.f170108a[appType.ordinal()]) {
            case 1:
                return "web_app";
            case 2:
                return "native_game";
            case 3:
                return "native_app";
            case 4:
                return "html5_app";
            case 5:
                return "html5_game";
            case 6:
                return "native_card";
            case 7:
                return "block";
            default:
                return "unknown";
        }
    }

    /* renamed from: a */
    private static JSONObject m262450a(IAppContext iAppContext) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (AppbrandContext.getInst().getApplicationContext() != null) {
                jSONObject.put("network_type", C67053q.m261329b(AppbrandContext.getInst().getApplicationContext()));
                jSONObject.put("connected", C67053q.m261335f(AppbrandContext.getInst().getApplicationContext()));
                jSONObject.put("js_version", C66399c.m259608a().mo231922b(AppbrandContext.getInst().getApplicationContext(), iAppContext));
                jSONObject.put("trace_id", AppbrandContext.getInst().getTraceId());
            }
            if (iAppContext != null && !iAppContext.isDestroyed() && !iAppContext.isDestroying()) {
                jSONObject.put("app_type", m262448a(iAppContext.getAppType()));
                AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(iAppContext);
                if (!(inst == null || inst.getAppInfo() == null)) {
                    jSONObject.put("app_id", inst.getAppInfo().appId);
                    jSONObject.put("app_version", inst.getAppInfo().version);
                    jSONObject.put("scene", inst.getAppInfo().scene);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m262451a(JSONObject jSONObject, AppInfoEntity appInfoEntity, IAppContext iAppContext) {
        JSONObject jSONObject2;
        String str;
        String str2;
        if (jSONObject == null) {
            try {
                jSONObject2 = new JSONObject();
            } catch (JSONException e) {
                JSONObject jSONObject3 = new JSONObject();
                AppBrandLogger.stacktrace(6, "tma_EventHelper", e.getStackTrace());
                jSONObject2 = jSONObject3;
            }
        } else {
            jSONObject2 = new JSONObject(jSONObject.toString());
        }
        jSONObject2.put("js_version", C67552k.m262720a(AppbrandContext.getInst().getApplicationContext(), iAppContext));
        jSONObject2.put("js_engine_version", C67552k.m262723d());
        jSONObject2.put("js_engine_type", JsEngine.getEngineType());
        jSONObject2.put("v8_version", JsEngine.getVersion());
        jSONObject2.put("dora_version", C67552k.m262724e());
        jSONObject2.put("miniapp_sdk_version", C67552k.m262722c());
        jSONObject2.put("miniapp_process", m262446a());
        jSONObject2.put("miniapp_sdk_version_code", C67552k.m262721b());
        jSONObject2.put("report_timestamp", System.currentTimeMillis());
        jSONObject2.put("unique_id", AppbrandContext.getInst().getUniqueId());
        jSONObject2.put("is_tt_webview", HostDependManager.getInst().isTTWebView());
        if (ProcessUtil.isMiniappProcess() || (iAppContext != null && iAppContext.getAppType() == AppType.GadgetAPP)) {
            if (!(appInfoEntity != null || iAppContext == null || C67432a.m262319a(iAppContext) == null)) {
                appInfoEntity = C67432a.m262319a(iAppContext).getAppInfo();
            }
            jSONObject2.put("trace_id", AppbrandContext.getInst().getTraceId());
        }
        if (appInfoEntity == null) {
            appInfoEntity = new AppInfoEntity();
        }
        jSONObject2.put("_param_for_special", m262447a(appInfoEntity));
        jSONObject2.put("app_id", m262449a(appInfoEntity.appId));
        if (TextUtils.isEmpty(appInfoEntity.appId)) {
            str = "none";
        } else {
            str = appInfoEntity.appId;
        }
        jSONObject2.put("application_id", str);
        jSONObject2.put("app_version", m262449a(appInfoEntity.version));
        jSONObject2.put("mp_gid", m262449a(appInfoEntity.ttId));
        jSONObject2.put("launch_from", m262449a(appInfoEntity.launchFrom));
        jSONObject2.put("scene", m262449a(appInfoEntity.scene));
        if (TextUtils.isEmpty(appInfoEntity.scene)) {
            str2 = "none";
        } else {
            str2 = appInfoEntity.scene;
        }
        jSONObject2.put("scene_type", str2);
        jSONObject2.put("sub_scene", m262449a(appInfoEntity.subScene));
        jSONObject2.put("bdp_log", m262449a(appInfoEntity.bdpLog));
        jSONObject2.put("location", m262449a(appInfoEntity.location));
        jSONObject2.put("biz_location", m262449a(appInfoEntity.bizLocation));
        jSONObject2.put("solution_id", "none");
        m262456a(appInfoEntity, jSONObject2);
        return C67548h.getCommonParams(jSONObject2, appInfoEntity, iAppContext);
    }

    /* renamed from: c */
    public static JSONObject m262463c(String str, long j, String str2, IAppContext iAppContext) {
        JSONObject b = m262462b(iAppContext);
        try {
            b.put("result_type", str);
            b.put("duration", j);
            if (str2 != null) {
                b.put("error_msg", str2);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return b;
    }

    /* renamed from: a */
    public static void m262452a(C12827e eVar, C12830f fVar, long j, IAppContext iAppContext) {
        int i;
        int i2;
        C66020b.C66021a a = C66020b.m258530a("mp_sdk_request_result", iAppContext);
        Context applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (applicationContext == null) {
            applicationContext = iAppContext.getApplicationContext();
        }
        try {
            a.mo231090a("url", eVar.mo48450m());
            a.mo231090a("duration", Long.valueOf(j));
            if (C12835b.m53005a(applicationContext)) {
                i = 1;
            } else {
                i = 0;
            }
            a.mo231090a("is_net_availbale", Integer.valueOf(i));
            a.mo231090a(HiAnalyticsConstant.BI_KEY_NET_TYPE, C12835b.m53006b(applicationContext));
            if (fVar != null) {
                a.mo231090a("net_code", Integer.valueOf(fVar.mo48463b()));
                a.mo231090a("net_message", fVar.mo48465c());
                a.mo231090a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, fVar.mo48466d());
                a.mo231090a("err_stack", Log.getStackTraceString(fVar.mo48468f()));
                if (fVar instanceof C12825c) {
                    File a2 = ((C12825c) fVar).mo48421a();
                    if (a2 == null || !a2.exists()) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    a.mo231090a("download_file_result", Integer.valueOf(i2));
                }
                if (eVar.mo48455r() != null) {
                    Iterator<String> keys = eVar.mo48455r().keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        a.mo231090a(next, eVar.mo48455r().get(next));
                    }
                }
                if (fVar.mo48469g() != null) {
                    Iterator<String> keys2 = fVar.mo48469g().keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        a.mo231090a(next2, fVar.mo48469g().get(next2));
                    }
                }
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_EventHelper", "mpSdkRequestResult error:", e.getMessage(), e);
        }
        a.mo231092a();
    }

    /* renamed from: a */
    public static void m262453a(IAppContext iAppContext, long j, int i, float f, long j2, String str, long j3, float f2, List<Location> list) {
        JSONObject c = m262463c("success", j, null, iAppContext);
        try {
            c.put("timeout", j3).put("desired_accuracy", (double) f2);
            if (f > BitmapDescriptorFactory.HUE_RED) {
                c.put("accuracy", (double) f);
            }
            if (j2 > 0) {
                c.put("location_time", j2);
            }
            if (!TextUtils.isEmpty(str)) {
                c.put("provider", str);
            }
            if (i > 0) {
                c.put("location_type", i);
            }
            c.put("api_time", System.currentTimeMillis());
            if (AppbrandContext.getInst().getApplicationContext() != null) {
                WifiManager wifiManager = (WifiManager) AppbrandContext.getInst().getApplicationContext().getSystemService("wifi");
                if (wifiManager != null) {
                    c.put("wifi_status", wifiManager.isWifiEnabled());
                }
                LocationManager locationManager = (LocationManager) AppbrandContext.getInst().getApplicationContext().getSystemService("location");
                if (locationManager != null) {
                    c.put("gps_status", locationManager.isProviderEnabled("gps"));
                    c.put("network_status", locationManager.isProviderEnabled("network"));
                }
            }
            if (list != null && list.size() > 0) {
                c.put("location_counts", list.size());
                if (list.size() > 1) {
                    JSONArray jSONArray = new JSONArray();
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Location location = list.get(i2);
                        if (location != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("accuracy", (double) location.getAccuracy()).put("location_time", location.getTime()).put("provider", location.getProvider());
                            jSONArray.put(jSONObject);
                        }
                    }
                    c.put("location_list", jSONArray);
                }
            }
            C67556a.m262937a("mp_onlocationchange", c, 6);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
