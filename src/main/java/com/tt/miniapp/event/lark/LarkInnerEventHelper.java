package com.tt.miniapp.event.lark;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.he.jsbinding.snapshot.ISnapshotService;
import com.he.jsbinding.snapshot.SnapshotServiceImpl;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.BridgeUniteHelper;
import com.tt.miniapp.event.C66035c;
import com.tt.miniapp.event.lark.C66039b;
import com.tt.miniapp.falcon.snapshot.C66070a;
import com.tt.miniapp.jsbridge.C66240d;
import com.tt.miniapp.jsbridge.JsRuntimeManager;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.C67548h;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3371e.AbstractC67510c;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.p3257c.C65680a;
import com.tt.refer.common.meta.AbstractC67796c;
import com.tt.refer.common.p3417c.C67746a;
import com.tt.refer.common.p3417c.C67751c;
import com.tt.refer.impl.business.meta.GadgetAppInfo;
import org.json.JSONObject;

public class LarkInnerEventHelper extends C67548h {
    private static String getWebViewType(boolean z) {
        return z ? "tt_webview" : "android_webview";
    }

    private static String getPkgType(int i) {
        return C67751c.m263613a(i);
    }

    public static void mpAppPreloadRelease(IAppContext iAppContext) {
        C66039b.m258622a("mp_app_preload_release", iAppContext).mo231124a();
    }

    public static void mpInitEngineEnd(IAppContext iAppContext) {
        C66039b.m258622a("mp_init_engine_end", iAppContext).mo231124a();
    }

    public static void mpInitEngineStart(IAppContext iAppContext) {
        C66039b.m258622a("mp_init_engine_start", iAppContext).mo231124a();
    }

    public static void mpJsCoreAppLoadStart(IAppContext iAppContext) {
        C66039b.m258622a("mp_jscore_app_load_start", iAppContext).mo231124a();
    }

    public static void mpJsCoreLibLoadStart(IAppContext iAppContext) {
        C66039b.m258622a("mp_jscore_lib_load_start", iAppContext).mo231124a();
    }

    public static void mpJsCoreLoadDomReady(IAppContext iAppContext) {
        C66039b.m258622a("mp_jscore_load_dom_ready", iAppContext).mo231124a();
    }

    public static void mpJsCoreLoadStart(IAppContext iAppContext) {
        C66039b.m258622a("mp_jscore_load_start", iAppContext).mo231124a();
    }

    public static void mpWebViewAppLoadStart(IAppContext iAppContext) {
        C66039b.m258622a("mp_webview_app_load_start", iAppContext).mo231124a();
    }

    public static void mpWebViewLibLoadStart(IAppContext iAppContext) {
        C66039b.m258622a("mp_webview_lib_load_start", iAppContext).mo231124a();
    }

    public static void mpWebViewLoadDomReady(IAppContext iAppContext) {
        C66039b.m258622a("mp_webview_load_dom_ready", iAppContext).mo231124a();
    }

    private static String getPkgMD5(AppInfoEntity appInfoEntity) {
        if (appInfoEntity == null || TextUtils.isEmpty(appInfoEntity.md5)) {
            return "";
        }
        return appInfoEntity.md5;
    }

    public static void mpJsSDKDownloadStart(IMonitorCreator iMonitorCreator) {
        if (iMonitorCreator == null) {
            AppBrandLogger.m52829e("tma_InnerEventHelper", "mpJsSDKDownloadStart ->monitorCreator is null!");
            return;
        }
        iMonitorCreator.createOPMonitor("op_common_jssdk_download_start", null).flush();
    }

    public static void mpJsSDKInstallStart(IMonitorCreator iMonitorCreator) {
        if (iMonitorCreator == null) {
            AppBrandLogger.m52829e("tma_InnerEventHelper", "mpJsSDKInstallStart ->monitorCreator is null!");
            return;
        }
        iMonitorCreator.createOPMonitor("op_common_jssdk_install_start", null).flush();
    }

    public static void mpJsSDKRequestStart(IMonitorCreator iMonitorCreator) {
        if (iMonitorCreator == null) {
            AppBrandLogger.m52829e("tma_InnerEventHelper", "mpJsSDKRequestStart ->monitorCreator is null!");
            return;
        }
        iMonitorCreator.createOPMonitor("op_common_jssdk_request_start", null).flush();
    }

    public static void mpAppEventLink(String str, IAppContext iAppContext) {
        C66039b.m258622a("mp_app_event_link", iAppContext).mo231123a("link_trace_id", str).mo231124a();
    }

    public static void mpUninstall(String str, IAppContext iAppContext) {
        C66039b.m258622a("mp_uninstall", iAppContext).mo231123a("pkg_md5", str).mo231124a();
    }

    public static void mpWebViewPageLoadStart(String str, IAppContext iAppContext) {
        C66039b.m258622a("mp_webview_page_load_start", iAppContext).mo231123a("page_path", str).mo231124a();
    }

    public static void mpAppContainerLoaded(int i, IAppContext iAppContext) {
        C66039b.m258622a("mp_app_container_loaded", iAppContext).mo231123a("launch_type", Integer.valueOf(i)).mo231124a();
    }

    public static void mpAppContainerSetuped(IAppContext iAppContext, long j) {
        C66039b.C66040a a = C66039b.m258622a("mp_app_container_setuped", iAppContext);
        if (j > 0) {
            a.mo231123a("total_duration", Long.valueOf(j));
        }
        a.mo231124a();
    }

    public static void mpLoadTimeline(JSONObject jSONObject, IAppContext iAppContext) {
        if (C65680a.m257566a()) {
            C66035c.m258576a("mp_load_timeline", jSONObject);
        } else {
            C66039b.m258623a("mp_load_timeline", null, jSONObject, iAppContext).mo231124a();
        }
    }

    public static void mpLoadingExit(String str, IAppContext iAppContext) {
        C66039b.m258622a("mp_loading_exit", iAppContext).mo231123a("user_exit_from", str).mo231124a();
        new C67500a("mp_loading_exit", C67501b.ab, iAppContext).flush();
    }

    public static void mpJsRuntimeError(JSONObject jSONObject, AppInfoEntity appInfoEntity, IAppContext iAppContext) {
        C66039b.m258623a("mp_js_runtime_error", appInfoEntity, jSONObject, iAppContext).mo231124a();
    }

    public static void mpJsRuntimeError(int i, String str, IAppContext iAppContext) {
        C66039b.m258622a("mp_js_runtime_error", iAppContext).mo231123a("error_code", Integer.valueOf(i)).mo231123a("error_msg", str).mo231124a();
    }

    public static void mpLifecyclePageOnReady(long j, String str, IAppContext iAppContext) {
        C66039b.m258622a("mp_lifecycle_page_onready", iAppContext).mo231123a("from_page_start_duration", Long.valueOf(j)).mo231123a("trace_id", str).mo231124a();
    }

    public static void mpWebViewLoadException(int i, String str, IAppContext iAppContext) {
        C66039b.m258622a("mp_webview_load_exception", iAppContext).mo231123a("load_progress", Integer.valueOf(i)).mo231123a("page_path", str).mo231124a();
    }

    public static void mpWebViewLoadStart(boolean z, String str, IAppContext iAppContext) {
        C66039b.m258622a("mp_webview_load_start", iAppContext).mo231123a("webview_type", getWebViewType(z)).mo231123a("webview_version", str).mo231124a();
    }

    public static void mpDownloadStart(IMonitorCreator iMonitorCreator, String str, int i) {
        if (iMonitorCreator == null) {
            AppBrandLogger.m52830i("tma_InnerEventHelper", "mpMetaRequestResult --> monitorCreator is null!");
            return;
        }
        AbstractC67510c cVar = (AbstractC67510c) iMonitorCreator.createOPMonitor("op_common_package_download_start", null);
        cVar.addCategoryValue("load_type", C67751c.m263613a(i)).addCategoryValue("identifier", str);
        cVar.mo234323b(i);
    }

    public static void mpInstallStart(IMonitorCreator iMonitorCreator, String str, int i) {
        if (iMonitorCreator == null) {
            AppBrandLogger.m52830i("tma_InnerEventHelper", "mpMetaRequestResult --> monitorCreator is null!");
            return;
        }
        AbstractC67510c cVar = (AbstractC67510c) iMonitorCreator.createOPMonitor("op_common_package_install_start", null);
        cVar.addCategoryValue("load_type", C67751c.m263613a(i)).addCategoryValue("identifier", str);
        cVar.mo234323b(i);
    }

    public static void mpInstallUpdateStart(IMonitorCreator iMonitorCreator, String str, int i) {
        if (iMonitorCreator == null) {
            AppBrandLogger.m52830i("tma_InnerEventHelper", "mpInstallUpdateStart --> monitorCreator is null!");
            return;
        }
        AbstractC67510c cVar = (AbstractC67510c) iMonitorCreator.createOPMonitor("op_common_install_update_start", null);
        cVar.addCategoryValue("load_type", C67751c.m263613a(i)).addCategoryValue("identifier", str);
        cVar.mo234323b(i);
    }

    public static void mpJsComponentInstallStart(IMonitorCreator iMonitorCreator, String str, int i) {
        if (iMonitorCreator == null) {
            AppBrandLogger.m52830i("tma_InnerEventHelper", "mpJsComponentInstallStart --> monitorCreator is null!");
            return;
        }
        OPMonitor createOPMonitor = iMonitorCreator.createOPMonitor("op_common_component_install_start", null);
        createOPMonitor.addCategoryValue("component_download_type", C67751c.m263615b(i));
        createOPMonitor.addCategoryValue("component", str);
        createOPMonitor.flush();
    }

    public static void mpLoadMetaStart(IMonitorCreator iMonitorCreator, int i, String str) {
        if (iMonitorCreator == null) {
            AppBrandLogger.m52830i("tma_InnerEventHelper", "mpLoadMetaStart --> monitorCreator is null!");
            return;
        }
        AbstractC67510c cVar = (AbstractC67510c) iMonitorCreator.createOPMonitor("op_common_load_meta_start", null);
        cVar.addCategoryValue("load_type", C67751c.m263613a(i)).addCategoryValue("identifier", str);
        cVar.mo234323b(i);
    }

    public static void mpLoadPackageStart(IMonitorCreator iMonitorCreator, String str, int i) {
        if (iMonitorCreator == null) {
            AppBrandLogger.m52830i("tma_InnerEventHelper", "mpLoadPackageStart --> monitorCreator is null!");
            return;
        }
        AbstractC67510c cVar = (AbstractC67510c) iMonitorCreator.createOPMonitor("op_common_load_package_start", null);
        cVar.addCategoryValue("identifier", str).addCategoryValue("load_type", C67751c.m263613a(i));
        cVar.mo234323b(i);
    }

    public static void mpMetaRequestStart(IMonitorCreator iMonitorCreator, String str, int i) {
        if (iMonitorCreator == null) {
            AppBrandLogger.m52830i("tma_InnerEventHelper", "mpMetaRequestStart --> monitorCreator is null!");
            return;
        }
        AbstractC67510c cVar = (AbstractC67510c) iMonitorCreator.createOPMonitor("op_common_meta_request_start", null);
        cVar.addCategoryValue("load_type", C67751c.m263613a(i)).addCategoryValue("identifier", str);
        cVar.mo234323b(i);
    }

    public static void statusRate(String str, int i, JSONObject jSONObject, IAppContext iAppContext) {
        C66039b.m258623a(str, null, jSONObject, iAppContext).mo231123a(UpdateKey.STATUS, Integer.valueOf(i)).mo231124a();
    }

    public static void mpAppLoadStart(long j, int i, AppInfoEntity appInfoEntity, IAppContext iAppContext) {
        C66039b.m258622a("mp_app_load_start", iAppContext).mo231123a("block_duration", Long.valueOf(j)).mo231123a("pkg_md5", getPkgMD5(appInfoEntity)).mo231123a("package_type", getPkgType(i)).mo231123a("launch_type", appInfoEntity.launchType).mo231124a();
    }

    public static void mpJsComponentDownloadStart(IMonitorCreator iMonitorCreator, String str, String str2, int i) {
        if (iMonitorCreator == null) {
            AppBrandLogger.m52830i("tma_InnerEventHelper", "mpJsComponentDownloadStart --> monitorCreator is null!");
            return;
        }
        OPMonitor createOPMonitor = iMonitorCreator.createOPMonitor("op_common_component_download_start", null);
        createOPMonitor.addCategoryValue("components", str);
        createOPMonitor.addCategoryValue("component_download_type", C67751c.m263615b(i));
        createOPMonitor.addCategoryValue("component_url", str2);
        createOPMonitor.flush();
    }

    public static void mpPageCrash(Boolean bool, boolean z, boolean z2, IAppContext iAppContext) {
        String str;
        C66039b.C66040a a = C66039b.m258622a("mp_page_crash", iAppContext).mo231123a("did_crash", bool).mo231123a("webview_type", getWebViewType(z));
        if (z2) {
            str = "running";
        } else {
            str = "preload";
        }
        a.mo231123a("gadget_state", str).mo231124a();
    }

    public static void mpFirstContentfulPaint(boolean z, long j, boolean z2, boolean z3, IAppContext iAppContext) {
        String str;
        String str2;
        C66039b.C66040a a = C66039b.m258622a("mp_first_content", iAppContext);
        if (z) {
            str = "success";
        } else {
            str = "timeout";
        }
        C66039b.C66040a a2 = a.mo231123a("first_content_result", str).mo231123a("webview_type", getWebViewType(z2));
        if (z3) {
            str2 = "gone";
        } else {
            str2 = "normal";
        }
        a2.mo231123a("render_process", str2).mo231123a("duration", Long.valueOf(j)).mo231124a();
    }

    public static void mpLifecyclePageStart(int i, long j, String str, String str2, IAppContext iAppContext) {
        C66039b.m258622a("mp_lifecycle_page_start", iAppContext).mo231123a("total_duration", Long.valueOf(j)).mo231123a("first_launch_page", Integer.valueOf(i)).mo231123a("page_path", str).mo231123a("trace_id", str2).mo231124a();
    }

    public static void mpRequestUploadStart(TracingCoreSpan tracingCoreSpan, String str, String str2, String str3, IAppContext iAppContext) {
        OPMonitor reportPlatform = new C67500a("mp_request_upload_start", null, iAppContext).reportPlatform(6);
        reportPlatform.addCategoryValue("method", str).addCategoryValue("path", str2).addCategoryValue("domain", str3);
        if (tracingCoreSpan != null) {
            reportPlatform.addCategoryValue("trace_id", tracingCoreSpan.getTracingID());
            if (!TextUtils.isEmpty(tracingCoreSpan.getRequestId())) {
                reportPlatform.addCategoryValue("request_id", tracingCoreSpan.getRequestId());
            }
        } else {
            AppBrandLogger.m52829e("tma_InnerEventHelper", " span is null");
        }
        reportPlatform.flush();
    }

    public static void mpAppPreloadResult(String str, String str2, int i, String str3, JSONObject jSONObject, IAppContext iAppContext) {
        mpAppEventResult("mp_app_preload_result", str, str2, Integer.valueOf(i), str3, jSONObject, iAppContext);
    }

    public static void mpJsCoreAppLoadResult(String str, String str2, int i, String str3, JSONObject jSONObject, IAppContext iAppContext) {
        mpAppEventResult("mp_jscore_app_load_result", str, str2, Integer.valueOf(i), str3, jSONObject, iAppContext);
    }

    public static void mpAppAuthSetting(IMonitorCreator iMonitorCreator, String str, String str2, boolean z, String str3, String str4) {
        C67746a.C67747a aVar;
        if (iMonitorCreator == null) {
            AppBrandLogger.m52830i("tma_InnerEventHelper", "mpBadgeLocalOperation --> monitorCreator is null!");
            return;
        }
        if (z) {
            aVar = C67746a.f170617e;
        } else {
            aVar = C67746a.f170616d;
        }
        OPMonitor createOPMonitor = iMonitorCreator.createOPMonitor("op_app_auth_setting", aVar);
        createOPMonitor.addCategoryValue("app_id", str).addCategoryValue("auth_setting_brief", str2);
        if (z) {
            createOPMonitor.setResultTypeSuccess();
        } else {
            createOPMonitor.setResultTypeFail().setErrorCode(str3).setErrorMessage(str4);
        }
        createOPMonitor.flush();
    }

    public static void mpJsCoreLibLoadResult(String str, String str2, int i, String str3, JSONObject jSONObject, IAppContext iAppContext) {
        C66039b.m258622a("mp_jscore_lib_load_result", iAppContext).mo231123a("result_type", str).mo231123a("error_domain", str2).mo231123a("error_code", Integer.valueOf(i)).mo231123a("error_msg", str3).mo231123a("error_ex", jSONObject).mo231124a();
    }

    public static void mpJsCoreLoadResult(String str, String str2, int i, String str3, JSONObject jSONObject, IAppContext iAppContext) {
        C66039b.m258622a("mp_jscore_load_result", iAppContext).mo231123a("result_type", str).mo231123a("error_domain", str2).mo231123a("error_code", Integer.valueOf(i)).mo231123a("error_msg", str3).mo231123a("error_ex", jSONObject).mo231124a();
    }

    public static void mpProcessLoadResult(String str, String str2, int i, String str3, JSONObject jSONObject, IAppContext iAppContext) {
        C66039b.m258622a("mp_process_load_result", iAppContext).mo231123a("result_type", str).mo231123a("error_domain", str2).mo231123a("error_code", Integer.valueOf(i)).mo231123a("error_msg", str3).mo231123a("error_ex", jSONObject).mo231124a();
    }

    public static void mpWebViewLibLoadResult(String str, String str2, int i, String str3, JSONObject jSONObject, IAppContext iAppContext) {
        C66039b.m258622a("mp_webview_lib_load_result", iAppContext).mo231123a("result_type", str).mo231123a("error_domain", str2).mo231123a("error_code", Integer.valueOf(i)).mo231123a("error_msg", str3).mo231123a("error_ex", jSONObject).mo231124a();
    }

    public static void mpWebViewLoadResult(String str, String str2, int i, String str3, JSONObject jSONObject, IAppContext iAppContext) {
        C66039b.m258622a("mp_webview_load_result", iAppContext).mo231123a("result_type", str).mo231123a("error_domain", str2).mo231123a("error_code", Integer.valueOf(i)).mo231123a("error_msg", str3).mo231123a("error_ex", jSONObject).mo231124a();
    }

    public static void mpRequestDownloadStart(TracingCoreSpan tracingCoreSpan, String str, String str2, String str3, String str4, IAppContext iAppContext) {
        OPMonitor reportPlatform = new C67500a("mp_request_download_start", null, iAppContext).reportPlatform(6);
        reportPlatform.addCategoryValue("method", str).addCategoryValue("path", str2).addCategoryValue("domain", str3);
        if (!TextUtils.isEmpty(str4)) {
            reportPlatform.addCategoryValue("request_header", str4);
        }
        if (tracingCoreSpan != null) {
            reportPlatform.addCategoryValue("trace_id", tracingCoreSpan.getTracingID());
            if (!TextUtils.isEmpty(tracingCoreSpan.getRequestId())) {
                reportPlatform.addCategoryValue("request_id", tracingCoreSpan.getRequestId());
            }
        } else {
            AppBrandLogger.m52829e("tma_InnerEventHelper", " span is null");
        }
        reportPlatform.flush();
    }

    public static void mpAppEventResult(String str, String str2, String str3, Integer num, String str4, JSONObject jSONObject, IAppContext iAppContext) {
        C66039b.m258622a(str, iAppContext).mo231123a("result_type", str2).mo231123a("error_domain", str3).mo231123a("error_code", num).mo231123a("error_msg", str4).mo231123a("error_ex", jSONObject).mo231124a();
    }

    public static void mpBadgeLocalOperation(IMonitorCreator iMonitorCreator, String str, Integer num, String str2, boolean z, String str3, String str4) {
        C67746a.C67747a aVar;
        if (iMonitorCreator == null) {
            AppBrandLogger.m52830i("tma_InnerEventHelper", "mpBadgeLocalOperation --> monitorCreator is null!");
            return;
        }
        if (z) {
            aVar = C67746a.f170617e;
        } else {
            aVar = C67746a.f170616d;
        }
        OPMonitor createOPMonitor = iMonitorCreator.createOPMonitor(str, aVar);
        if (num != null) {
            createOPMonitor.addCategoryValue("scene", num);
        }
        createOPMonitor.addCategoryValue("badge_brief", str2);
        if (z) {
            createOPMonitor.setResultTypeSuccess();
        } else {
            createOPMonitor.setResultTypeFail().setErrorCode(str3).setErrorMessage(str4);
        }
        createOPMonitor.flush();
    }

    public static void mpWebViewAppLoadResult(String str, long j, String str2, int i, String str3, JSONObject jSONObject, IAppContext iAppContext) {
        C66039b.m258622a("mp_webview_app_load_result", iAppContext).mo231123a("result_type", str).mo231123a("total_duration", Long.valueOf(j)).mo231123a("error_domain", str2).mo231123a("error_code", Integer.valueOf(i)).mo231123a("error_msg", str3).mo231123a("error_ex", jSONObject).mo231124a();
    }

    public static void mpWebViewPageLoadResult(String str, long j, String str2, int i, String str3, JSONObject jSONObject, IAppContext iAppContext) {
        C66039b.m258622a("mp_webview_page_load_result", iAppContext).mo231123a("result_type", str).mo231123a("duration", Long.valueOf(j)).mo231123a("error_domain", str2).mo231123a("error_code", Integer.valueOf(i)).mo231123a("error_msg", str3).mo231123a("error_ex", jSONObject).mo231124a();
    }

    public static void mpCheckTTWebview(boolean z, String str, String str2, boolean z2, boolean z3, boolean z4, IAppContext iAppContext) {
        String str3;
        C66039b.C66040a a = C66039b.m258622a("mp_ttwebview_state", iAppContext).mo231123a("ttw_ttwebview", String.valueOf(z)).mo231123a("ttw_local_version", str).mo231123a("ttw_load_version", str2).mo231123a("ttw_check", String.valueOf(z2));
        if (z3) {
            str3 = "4g";
        } else {
            str3 = "wifi";
        }
        a.mo231123a("ttw_download_type", str3).mo231123a("ttw_app_foreground", String.valueOf(z4)).mo231124a();
    }

    public static void mpInstallResult(IMonitorCreator iMonitorCreator, String str, int i, boolean z, long j, String str2, String str3) {
        OPMonitorCode oPMonitorCode;
        if (iMonitorCreator == null) {
            AppBrandLogger.m52830i("tma_InnerEventHelper", "mpMetaRequestResult --> monitorCreator is null!");
            return;
        }
        if (z) {
            oPMonitorCode = C67746a.f170602C;
        } else {
            oPMonitorCode = C67751c.m263614b(str2);
        }
        AbstractC67510c cVar = (AbstractC67510c) iMonitorCreator.createOPMonitor("op_common_package_install_result", oPMonitorCode);
        cVar.addCategoryValue("load_type", C67751c.m263613a(i)).addCategoryValue("identifier", str).addCategoryValue("duration", Long.valueOf(j));
        if (z) {
            cVar.setResultTypeSuccess();
        } else {
            cVar.setResultTypeFail().setErrorCode(str2).setErrorMessage(str3);
        }
        cVar.mo234323b(i);
    }

    public static void mpJsSDKRequestResult(IMonitorCreator iMonitorCreator, boolean z, String str, String str2, String str3, String str4, long j) {
        if (iMonitorCreator == null) {
            AppBrandLogger.m52829e("tma_InnerEventHelper", "mpJsSDKRequestResult ->monitorCreator is null!");
            return;
        }
        OPMonitor createOPMonitor = iMonitorCreator.createOPMonitor("op_common_jssdk_request_result", null);
        createOPMonitor.addCategoryValue("local_jssdk_version", str2).addCategoryValue("latest_jssdk_version", str).addCategoryValue("duration", Long.valueOf(j));
        if (z) {
            createOPMonitor.setResultTypeSuccess();
        } else {
            createOPMonitor.setResultTypeFail().setErrorCode(str3).setErrorMessage(str4);
        }
        createOPMonitor.flush();
    }

    public static void mpAppLaunchResult(String str, String str2, String str3, Integer num, String str4, JSONObject jSONObject, IAppContext iAppContext) {
        boolean z;
        boolean z2;
        String str5;
        AbstractC67796c cVar;
        boolean z3 = false;
        if (!LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.gadget.preset.enable", false) || (cVar = (AbstractC67796c) iAppContext.findServiceByInterface(AbstractC67796c.class)) == null || !(cVar.mo88670a() instanceof GadgetAppInfo)) {
            z = false;
        } else {
            z = ((GadgetAppInfo) cVar.mo88670a()).getFromPreset();
        }
        if (C66240d.m259242a()) {
            C66070a appSnapshot = ((JsRuntimeManager) AppbrandApplicationImpl.getInst(iAppContext).getService(JsRuntimeManager.class)).getAppSnapshot();
            if (appSnapshot != null) {
                z2 = appSnapshot.mo231215b().mo231237d();
                str5 = appSnapshot.mo231216c().mo231226b();
            } else {
                str5 = "app_snapshot_null";
                z2 = false;
            }
        } else {
            ISnapshotService iSnapshotService = (ISnapshotService) AppbrandApplicationImpl.getInst(iAppContext).getService(SnapshotServiceImpl.class);
            z2 = iSnapshotService.checkSnapshotExist(C67432a.m262319a(iAppContext).getAppInfo().version);
            str5 = iSnapshotService.getLaunchModelReason();
        }
        if (iAppContext instanceof AbstractC67433a) {
            z3 = ((AbstractC67433a) iAppContext).mo234167g();
        }
        C66039b.m258622a("mp_app_launch_result", iAppContext).mo231123a("launch_mode", str).mo231123a("result_type", str2).mo231123a("error_domain", str3).mo231123a("error_code", num).mo231123a("error_msg", str4).mo231123a("error_ex", jSONObject).mo231123a("isNewBridge", Boolean.valueOf(BridgeUniteHelper.f166701a.mo231125a())).mo231123a("is_buildin", Boolean.valueOf(z)).mo231123a("is_subpackage_mode", Boolean.valueOf(z3)).mo231123a("snapshot_exist", Boolean.valueOf(z2)).mo231123a("launch_mode_reason", str5).mo231124a();
    }

    public static void mpDownloadResult(IMonitorCreator iMonitorCreator, String str, int i, boolean z, String str2, long j, String str3, String str4) {
        OPMonitorCode oPMonitorCode;
        if (iMonitorCreator == null) {
            AppBrandLogger.m52830i("tma_InnerEventHelper", "mpMetaRequestResult --> monitorCreator is null!");
            return;
        }
        if (z) {
            oPMonitorCode = C67746a.f170631s;
        } else {
            oPMonitorCode = C67751c.m263611a(str3);
        }
        AbstractC67510c cVar = (AbstractC67510c) iMonitorCreator.createOPMonitor("op_common_package_download_result", oPMonitorCode);
        cVar.addCategoryValue("load_type", C67751c.m263613a(i)).addCategoryValue("pkg_url", str2).addCategoryValue("identifier", str).addCategoryValue("duration", Long.valueOf(j));
        if (z) {
            cVar.setResultTypeSuccess();
        } else {
            cVar.setResultTypeFail().setErrorCode(str3).setErrorMessage(str4);
        }
        cVar.mo234323b(i);
    }

    public static void mpInstallUpdateResult(IMonitorCreator iMonitorCreator, String str, int i, boolean z, long j, String str2, String str3, int i2) {
        OPMonitorCode oPMonitorCode;
        if (iMonitorCreator == null) {
            AppBrandLogger.m52830i("tma_InnerEventHelper", "mpInstallUpdateResult --> monitorCreator is null!");
            return;
        }
        if (z) {
            oPMonitorCode = C67746a.f170602C;
        } else {
            oPMonitorCode = C67751c.m263614b(str2);
        }
        AbstractC67510c cVar = (AbstractC67510c) iMonitorCreator.createOPMonitor("op_common_install_update_result", oPMonitorCode);
        cVar.addCategoryValue("load_type", C67751c.m263613a(i)).addCategoryValue("identifier", str).addCategoryValue("duration", Long.valueOf(j)).addCategoryValue("pkg_downlaod", Integer.valueOf(i2));
        if (z) {
            cVar.setResultTypeSuccess();
        } else {
            cVar.setResultTypeFail().setErrorCode(str2).setErrorMessage(str3);
        }
        cVar.mo234323b(i);
    }

    public static void mpJsComponentInstallResult(IMonitorCreator iMonitorCreator, int i, String str, String str2, long j, boolean z, String str3, String str4) {
        C67746a.C67747a aVar;
        if (iMonitorCreator == null) {
            AppBrandLogger.m52830i("tma_InnerEventHelper", "mpJsComponentInstallResult --> monitorCreator is null!");
            return;
        }
        if (z) {
            aVar = C67746a.f170617e;
        } else {
            aVar = C67746a.f170616d;
        }
        OPMonitor createOPMonitor = iMonitorCreator.createOPMonitor("op_common_component_install_result", aVar);
        createOPMonitor.addCategoryValue("component_download_type", C67751c.m263615b(i)).addCategoryValue("duration", Long.valueOf(j)).addCategoryValue("component", str).addCategoryValue("componentVersion", str2);
        if (z) {
            createOPMonitor.setResultTypeSuccess();
        } else {
            createOPMonitor.setResultTypeFail().setErrorCode(str3).setErrorMessage(str4);
        }
        createOPMonitor.flush();
    }

    public static void mpJsSDKDownloadResult(IMonitorCreator iMonitorCreator, boolean z, String str, String str2, String str3, String str4, int i, long j) {
        if (iMonitorCreator == null) {
            AppBrandLogger.m52829e("tma_InnerEventHelper", "mpJsSDKDownloadResult ->monitorCreator is null!");
            return;
        }
        OPMonitor createOPMonitor = iMonitorCreator.createOPMonitor("op_common_jssdk_download_result", null);
        createOPMonitor.addCategoryValue("local_jssdk_version", str2).addCategoryValue("latest_jssdk_version", str).addCategoryValue("duration", Long.valueOf(j)).addCategoryValue("from_cache", Integer.valueOf(i));
        if (z) {
            createOPMonitor.setResultTypeSuccess();
        } else {
            createOPMonitor.setResultTypeFail().setErrorCode(str3).setErrorMessage(str4);
        }
        createOPMonitor.flush();
    }

    public static void mpJsSDKInstallResult(IMonitorCreator iMonitorCreator, boolean z, String str, String str2, String str3, String str4, int i, long j) {
        if (iMonitorCreator == null) {
            AppBrandLogger.m52829e("tma_InnerEventHelper", "mpJsSDKDownloadResult ->monitorCreator is null!");
            return;
        }
        OPMonitor createOPMonitor = iMonitorCreator.createOPMonitor("op_common_jssdk_install_result", null);
        createOPMonitor.addCategoryValue("local_jssdk_version", str2).addCategoryValue("latest_jssdk_version", str).addCategoryValue("duration", Long.valueOf(j)).addCategoryValue("install_type", Integer.valueOf(i));
        if (z) {
            createOPMonitor.setResultTypeSuccess();
        } else {
            createOPMonitor.setResultTypeFail().setErrorCode(str3).setErrorMessage(str4);
        }
        createOPMonitor.flush();
    }

    public static void mpLoadMetaResult(IMonitorCreator iMonitorCreator, String str, boolean z, String str2, String str3, int i, int i2, long j) {
        OPMonitorCode oPMonitorCode;
        if (iMonitorCreator == null) {
            AppBrandLogger.m52830i("tma_InnerEventHelper", "mpLoadMetaResult --> monitorCreator is null!");
            return;
        }
        if (z) {
            oPMonitorCode = C67746a.f170627o;
        } else {
            oPMonitorCode = C67751c.m263612a(str2, str3);
        }
        AbstractC67510c cVar = (AbstractC67510c) iMonitorCreator.createOPMonitor("op_common_load_meta_result", oPMonitorCode);
        cVar.addCategoryValue("identifier", str).addCategoryValue("meta_cache", Integer.valueOf(i)).addCategoryValue("load_type", C67751c.m263613a(i2)).addCategoryValue("duration", Long.valueOf(j));
        if (z) {
            cVar.setResultTypeSuccess();
        } else {
            cVar.setResultTypeFail().setErrorCode(str2).setErrorMessage(str3);
        }
        cVar.mo234323b(i2);
    }

    public static void mpMetaRequestResult(IMonitorCreator iMonitorCreator, TracingCoreSpan tracingCoreSpan, String str, boolean z, int i, String str2, String str3, long j) {
        OPMonitorCode oPMonitorCode;
        if (iMonitorCreator == null) {
            AppBrandLogger.m52830i("tma_InnerEventHelper", "mpMetaRequestResult --> monitorCreator is null!");
            return;
        }
        if (z) {
            oPMonitorCode = C67746a.f170627o;
        } else {
            oPMonitorCode = C67751c.m263612a(str2, str3);
        }
        AbstractC67510c cVar = (AbstractC67510c) iMonitorCreator.createOPMonitor("op_common_meta_request_result", oPMonitorCode);
        cVar.addCategoryValue("load_type", C67751c.m263613a(i)).addCategoryValue("duration", Long.valueOf(j)).addCategoryValue("identifier", str);
        if (tracingCoreSpan == null) {
            AppBrandLogger.m52829e("tma_InnerEventHelper", " span is null");
        } else if (!TextUtils.isEmpty(tracingCoreSpan.getRequestId())) {
            cVar.addCategoryValue("request_id", tracingCoreSpan.getRequestId());
        }
        if (z) {
            cVar.setResultTypeSuccess();
        } else {
            cVar.setResultTypeFail().setErrorCode(str2).setErrorMessage(str3);
        }
        cVar.mo234323b(i);
    }

    public static void mpReportBadge(IMonitorCreator iMonitorCreator, String str, String str2, int i, int i2, boolean z, String str3, String str4) {
        C67746a.C67747a aVar;
        if (iMonitorCreator == null) {
            AppBrandLogger.m52830i("tma_InnerEventHelper", "mpBadgeLocalOperation --> monitorCreator is null!");
            return;
        }
        if (z) {
            aVar = C67746a.f170617e;
        } else {
            aVar = C67746a.f170616d;
        }
        OPMonitor createOPMonitor = iMonitorCreator.createOPMonitor("op_app_badge_report_node", aVar);
        createOPMonitor.addCategoryValue("app_id", str).addCategoryValue("badge_brief", str2).addMetricValue("badge_from_app", Integer.valueOf(i)).addMetricValue("badge_from_op", Integer.valueOf(i2));
        if (z) {
            createOPMonitor.setResultTypeSuccess();
        } else {
            createOPMonitor.setResultTypeFail().setErrorCode(str3).setErrorMessage(str4);
        }
        createOPMonitor.flush();
    }

    public static void mpLoadPackageResult(IMonitorCreator iMonitorCreator, String str, int i, boolean z, long j, String str2, String str3, int i2, IAppContext iAppContext) {
        boolean z2;
        OPMonitorCode oPMonitorCode;
        int i3 = 0;
        if (iMonitorCreator == null) {
            AppBrandLogger.m52830i("tma_InnerEventHelper", "mpLoadPackageResult --> monitorCreator is null!");
            return;
        }
        if (iAppContext instanceof AbstractC67433a) {
            z2 = ((AbstractC67433a) iAppContext).mo234167g();
        } else {
            z2 = false;
        }
        if (z) {
            oPMonitorCode = C67746a.f170631s;
        } else {
            oPMonitorCode = C67751c.m263611a(str2);
        }
        if (!(iAppContext == null || iAppContext.isDestroyed() || iAppContext.getExtra("installed_pkg_type") == null)) {
            i3 = ((Integer) iAppContext.getExtra("installed_pkg_type")).intValue();
        }
        AbstractC67510c cVar = (AbstractC67510c) iMonitorCreator.createOPMonitor("op_common_load_package_result", oPMonitorCode);
        cVar.addCategoryValue("identifier", str).addCategoryValue("load_type", C67751c.m263613a(i)).addCategoryValue("package_cache", Integer.valueOf(i2)).addCategoryValue("is_subpackage_mode", Boolean.valueOf(z2)).addCategoryValue("pkg_type", Integer.valueOf(i3)).addCategoryValue("duration", Long.valueOf(j));
        if (z) {
            cVar.setResultTypeSuccess();
        } else {
            cVar.setResultTypeFail().setErrorCode(str2).setErrorMessage(str3);
        }
        cVar.mo234323b(i);
    }

    public static void mpJsComponentDownloadResult(IMonitorCreator iMonitorCreator, String str, String str2, int i, String str3, long j, boolean z, int i2, String str4, String str5) {
        OPMonitorCode oPMonitorCode;
        if (iMonitorCreator == null) {
            AppBrandLogger.m52830i("tma_InnerEventHelper", "mpJsComponentDownloadResult --> monitorCreator is null!");
            return;
        }
        if (z) {
            oPMonitorCode = C67746a.f170619g;
        } else {
            oPMonitorCode = C67751c.m263616c(str4);
        }
        OPMonitor createOPMonitor = iMonitorCreator.createOPMonitor("op_common_component_download_result", oPMonitorCode);
        createOPMonitor.addCategoryValue("component_download_type", C67751c.m263615b(i)).addCategoryValue("component", str).addCategoryValue("componentVersion", str2).addCategoryValue("pkg_downlaod", Integer.valueOf(i2)).addCategoryValue("component_url", str3).addCategoryValue("duration", Long.valueOf(j));
        if (z) {
            createOPMonitor.setResultTypeSuccess();
        } else {
            createOPMonitor.setResultTypeFail().setErrorCode(str4).setErrorMessage(str5);
        }
        createOPMonitor.flush();
    }

    public static void mpRequestDownloadResult(TracingCoreSpan tracingCoreSpan, String str, String str2, String str3, String str4, String str5, int i, String str6, JSONObject jSONObject, long j, int i2, long j2, String str7, String str8, IAppContext iAppContext) {
        OPMonitor reportPlatform = new C67500a("mp_request_download_result", null, iAppContext).reportPlatform(6);
        reportPlatform.addCategoryValue("method", str).addCategoryValue("path", str2).addCategoryValue("domain", str3).addCategoryValue("from_request_start_duration", Long.valueOf(j)).addCategoryValue("http_code", Integer.valueOf(i2)).addCategoryValue("file_size", Long.valueOf(j2)).addCategoryValue("result_type", str4).addCategoryValue("error_domain", str5).addCategoryValue("error_code", Integer.valueOf(i)).addCategoryValue("error_msg", str6).addCategoryValue("error_ex", jSONObject);
        if (!TextUtils.isEmpty(str7)) {
            reportPlatform.addCategoryValue("request_header", str7);
        }
        if (!TextUtils.isEmpty(str8)) {
            reportPlatform.addCategoryValue("response_header", str8);
        }
        if (tracingCoreSpan != null) {
            reportPlatform.addCategoryValue("trace_id", tracingCoreSpan.getTracingID());
            if (!TextUtils.isEmpty(tracingCoreSpan.getRequestId())) {
                reportPlatform.addCategoryValue("request_id", tracingCoreSpan.getRequestId());
            }
        } else {
            AppBrandLogger.m52829e("tma_InnerEventHelper", " span is null");
        }
        reportPlatform.flush();
    }

    public static void mpRequestUploadResult(TracingCoreSpan tracingCoreSpan, String str, String str2, String str3, String str4, String str5, int i, String str6, JSONObject jSONObject, long j, int i2, long j2, String str7, String str8, IAppContext iAppContext) {
        OPMonitor reportPlatform = new C67500a("mp_request_upload_result", null, iAppContext).reportPlatform(6);
        reportPlatform.addCategoryValue("method", str).addCategoryValue("path", str2).addCategoryValue("domain", str3).addCategoryValue("from_request_start_duration", Long.valueOf(j)).addCategoryValue("http_code", Integer.valueOf(i2)).addCategoryValue("file_size", Long.valueOf(j2)).addCategoryValue("result_type", str4).addCategoryValue("error_domain", str5).addCategoryValue("error_code", Integer.valueOf(i)).addCategoryValue("error_msg", str6).addCategoryValue("error_ex", jSONObject);
        if (!TextUtils.isEmpty(str7)) {
            reportPlatform.addCategoryValue("request_header", str7);
        }
        if (!TextUtils.isEmpty(str8)) {
            reportPlatform.addCategoryValue("response_header", str8);
        }
        if (tracingCoreSpan != null) {
            reportPlatform.addCategoryValue("trace_id", tracingCoreSpan.getTracingID());
            if (!TextUtils.isEmpty(tracingCoreSpan.getRequestId())) {
                reportPlatform.addCategoryValue("request_id", tracingCoreSpan.getRequestId());
            }
        } else {
            AppBrandLogger.m52829e("tma_InnerEventHelper", " span is null");
        }
        reportPlatform.flush();
    }
}
