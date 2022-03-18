package com.larksuite.component.openplatform.core.utils;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12783b;
import com.bytedance.ee.lark.infra.foundation.utils.StringUtil;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.ref.card.p690e.C13537b;
import com.bytedance.ee.webapp.p720a.C13755b;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.larksuite.component.openplatform.core.block.C24417g;
import com.larksuite.framework.apiplugin.LKEvent;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.BridgeUniteHelper;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.refer.common.base.AppType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class OPMonitorUtils {

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.utils.OPMonitorUtils$1 */
    public static /* synthetic */ class C255241 {

        /* renamed from: a */
        static final /* synthetic */ int[] f62136a;

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
                com.larksuite.component.openplatform.core.utils.OPMonitorUtils.C255241.f62136a = r0
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.GadgetAPP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.openplatform.core.utils.OPMonitorUtils.C255241.f62136a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.WebAPP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.larksuite.component.openplatform.core.utils.OPMonitorUtils.C255241.f62136a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.BlockitApp     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.larksuite.component.openplatform.core.utils.OPMonitorUtils.C255241.f62136a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.CardAPP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.larksuite.component.openplatform.core.utils.OPMonitorUtils.C255241.f62136a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.WebGadgetAPP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.larksuite.component.openplatform.core.utils.OPMonitorUtils.C255241.f62136a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.WebGadgetGame     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.larksuite.component.openplatform.core.utils.OPMonitorUtils.C255241.f62136a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.GadgetGame     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.utils.OPMonitorUtils.C255241.<clinit>():void");
        }
    }

    private static List<String> getKeySet(Iterator<String> it) {
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private static String transAppTypeToReportType(AppType appType) {
        int i = C255241.f62136a[appType.ordinal()];
        if (i == 1) {
            return "gadget";
        }
        if (i == 2) {
            return "webApp";
        }
        if (i == 3) {
            return "block";
        }
        if (i == 4) {
            return "widget";
        }
        if (i != 5) {
            return "unKnown";
        }
        return "webGadget";
    }

    private static OPMonitor generateNativeLinkTrace(IAppContext iAppContext, String str) {
        OPMonitor opMonitor = getOpMonitor(iAppContext, 10008, "native_link_trace");
        opMonitor.addCategoryValue("linkTraceId", str);
        return opMonitor;
    }

    public static void monitorNativePMStart(IAppContext iAppContext, LKEvent lKEvent) {
        List list;
        if (HostDependManager.getInst().getFeatureGating("openplatform.gadget.full_api_chain_monitor.enable", false)) {
            JSONObject n = lKEvent.mo92147n();
            if (n == null) {
                list = new ArrayList();
            } else {
                list = getKeySet(n.keys());
            }
            lKEvent.mo92134c().mo92189a(generateNativePMStartMonitor(iAppContext, lKEvent.mo92146m(), list));
        }
    }

    private static void setResultType(OPMonitor oPMonitor, String str) {
        str.hashCode();
        if (str.equals("ok")) {
            oPMonitor.setResultTypeSuccess();
        } else if (!str.equals("fail")) {
            AppBrandLogger.m52831w("OPMonitorUtils", "opMonitor with invalid resultType, resultType = " + str);
        } else {
            oPMonitor.setResultTypeFail();
        }
    }

    public static void linkTraceId(IAppContext iAppContext, OPTrace oPTrace, String str) {
        generateNativeLinkTrace(iAppContext, str).flush(oPTrace);
    }

    public static void monitorNativeStart(IAppContext iAppContext, LKEvent lKEvent, boolean z) {
        monitorNativeStart(iAppContext, lKEvent, z, null);
    }

    private static OPMonitor generateNativePMStartMonitor(IAppContext iAppContext, String str, List<String> list) {
        OPMonitor opMonitor = getOpMonitor(iAppContext, 10006, "native_pm_invoke_start");
        opMonitor.addCategoryValue("api_name", str);
        opMonitor.addCategoryValue("param.keys", list);
        return opMonitor;
    }

    private static OPMonitor getOpMonitor(IAppContext iAppContext, int i, String str) {
        OPMonitor opMonitor = getOpMonitor(iAppContext, "op_api_invoke", new OPMonitorCode("client.open_platform.api.common", i, OPMonitorLevel.NORMAL, str));
        if (opMonitor != null) {
            opMonitor.addCategoryValue("isNewBridge", Boolean.valueOf(BridgeUniteHelper.f166701a.mo231125a()));
        }
        return opMonitor;
    }

    private static String buildErrMsg(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        if ("ok".equals(str3)) {
            return str2 + ":" + str3;
        }
        if (str.contains(str2 + ":" + str3)) {
            AppBrandLogger.m52830i("OPMonitorUtils", "already buildErrMsg");
            return str;
        }
        return str2 + ":" + str3 + " " + str;
    }

    public static OPMonitor getOpMonitor(IAppContext iAppContext, String str, OPMonitorCode oPMonitorCode) {
        OPMonitor oPMonitor;
        if (iAppContext == null) {
            AppBrandLogger.m52829e("OPMonitorUtils", "getOpMonitor error: appContext is null!");
            C12783b.m52840a("getOpMonitor error: appContext is null!");
            return new OPMonitor(str, oPMonitorCode);
        }
        int i = C255241.f62136a[iAppContext.getAppType().ordinal()];
        if (i == 1) {
            oPMonitor = new C67500a(str, oPMonitorCode, iAppContext);
        } else if (i == 2) {
            return C13755b.m55771a(str, oPMonitorCode, iAppContext);
        } else {
            if (i == 3) {
                oPMonitor = new C24417g(str, oPMonitorCode, iAppContext);
            } else if (i != 4) {
                return new OPMonitor(str, oPMonitorCode);
            } else {
                oPMonitor = new C13537b(str, oPMonitorCode, iAppContext);
            }
        }
        return oPMonitor;
    }

    public static void monitorNativeStart(IAppContext iAppContext, LKEvent lKEvent, boolean z, String str) {
        if (HostDependManager.getInst().getFeatureGating("openplatform.gadget.full_api_chain_monitor.enable", false)) {
            lKEvent.mo92134c().mo92189a(generateNativeStartMonitor(iAppContext, lKEvent.mo92146m(), z, str));
        }
    }

    public static void monitorOriginNativeStart(IAppContext iAppContext, String str, OPTrace oPTrace, boolean z) {
        if (HostDependManager.getInst().getFeatureGating("openplatform.gadget.full_api_chain_monitor.enable", false)) {
            generateNativeStartMonitor(iAppContext, str, z, null).flush(oPTrace);
        }
    }

    private static OPMonitor generateNativeStartMonitor(IAppContext iAppContext, String str, boolean z, String str2) {
        OPMonitor opMonitor = getOpMonitor(iAppContext, 10004, "native_invoke_start");
        opMonitor.addCategoryValue("api_name", str);
        opMonitor.addCategoryValue("usePM", Boolean.valueOf(z));
        if (!TextUtils.isEmpty(str2)) {
            opMonitor.addCategoryValue("worker", str2);
        }
        return opMonitor;
    }

    public static void monitorOriginResultCallback(IAppContext iAppContext, String str, OPTrace oPTrace, ApiCallResult apiCallResult, boolean z) {
        String str2;
        if (apiCallResult.isFail()) {
            str2 = "fail";
        } else {
            str2 = "ok";
        }
        int optInt = apiCallResult.getJson().optInt("errCode");
        String buildErrMsg = buildErrMsg(apiCallResult.getJson().optString(ApiHandler.API_CALLBACK_ERRMSG), str, str2);
        generateNativeCallbackMonitor(iAppContext, str2, buildErrMsg, buildErrMsg, optInt, optInt, z, null).flush(oPTrace);
        oPTrace.finish(getOpMonitor(iAppContext, "monitor_batch_report", OPTrace.Companion.mo170884a()));
    }

    public static void monitorOriginResult(IAppContext iAppContext, String str, OPTrace oPTrace, ApiCallResult apiCallResult, long j) {
        String str2;
        if (HostDependManager.getInst().getFeatureGating("openplatform.gadget.full_api_chain_monitor.enable", false)) {
            long currentTimeMillis = System.currentTimeMillis() - j;
            if (apiCallResult.isFail()) {
                str2 = "fail";
            } else {
                str2 = "ok";
            }
            int optInt = apiCallResult.getJson().optInt("errCode");
            String buildErrMsg = buildErrMsg(apiCallResult.getJson().optString(ApiHandler.API_CALLBACK_ERRMSG), str, str2);
            generateNativeResultMonitor(iAppContext, currentTimeMillis, false, str2, buildErrMsg, buildErrMsg, optInt, optInt, true, null).flush(oPTrace);
        }
    }

    public static void monitorNativeInvoke(IAppContext iAppContext, OPTrace oPTrace, String str, String str2, String str3, String str4, boolean z) {
        monitorNativeInvoke(iAppContext, oPTrace, str, str2, str3, str4, z, null);
    }

    private static OPMonitor generateNativePMResultMonitor(IAppContext iAppContext, String str, String str2, String str3, int i, int i2, String str4) {
        OPMonitor opMonitor = getOpMonitor(iAppContext, 10007, "native_pm_invoke_result");
        setResultType(opMonitor, str);
        opMonitor.addCategoryValue(ApiHandler.API_CALLBACK_ERRMSG, str2);
        opMonitor.addCategoryValue("innerMsg", str3);
        opMonitor.addCategoryValue("errCode", Integer.valueOf(i));
        opMonitor.addCategoryValue("innerCode", Integer.valueOf(i2));
        if (!TextUtils.isEmpty(str4)) {
            opMonitor.addCategoryValue("worker", str4);
        }
        opMonitor.timing();
        return opMonitor;
    }

    private static OPMonitor generateNativeInvokeMonitor(IAppContext iAppContext, String str, String str2, String str3, String str4, boolean z, String str5) {
        OPMonitor opMonitor = getOpMonitor(iAppContext, (int) UpdateDialogStatusCode.SHOW, "native_receive_invoke");
        opMonitor.addCategoryValue("api_name", str);
        if (str3 != null) {
            opMonitor.addCategoryValue("callbackID", str3);
        }
        opMonitor.addCategoryValue("param.length", Integer.valueOf(str2.length()));
        if (!TextUtils.isEmpty(str4)) {
            opMonitor.addCategoryValue("url", str4);
        }
        opMonitor.addCategoryValue("trace_downgrade", Boolean.valueOf(z));
        opMonitor.addCategoryValue("app_type", transAppTypeToReportType(iAppContext.getAppType()));
        opMonitor.addCategoryValue("app_id", StringUtil.f34171a.mo48349a(iAppContext.getAppId()));
        if (!TextUtils.isEmpty(str5)) {
            opMonitor.addCategoryValue("worker", str5);
        }
        return opMonitor;
    }

    public static void monitorNativeInvoke(IAppContext iAppContext, OPTrace oPTrace, String str, String str2, String str3, String str4, boolean z, String str5) {
        generateNativeInvokeMonitor(iAppContext, str, str2, str3, str4, z, str5).flush(oPTrace);
    }

    private static OPMonitor generateNativeCallbackMonitor(IAppContext iAppContext, String str, String str2, String str3, int i, int i2, boolean z, String str4) {
        OPMonitor opMonitor = getOpMonitor(iAppContext, 10003, "native_callback_invoke");
        setResultType(opMonitor, str);
        opMonitor.addCategoryValue(ApiHandler.API_CALLBACK_ERRMSG, str2);
        opMonitor.addCategoryValue("innerMsg", str3);
        opMonitor.addCategoryValue("errCode", Integer.valueOf(i));
        opMonitor.addCategoryValue("innerCode", Integer.valueOf(i2));
        opMonitor.addCategoryValue("isSyncMethod", Boolean.valueOf(z));
        opMonitor.addCategoryValue("app_type", transAppTypeToReportType(iAppContext.getAppType()));
        opMonitor.addCategoryValue("app_id", StringUtil.f34171a.mo48349a(iAppContext.getAppId()));
        if (!TextUtils.isEmpty(str4)) {
            opMonitor.addCategoryValue("worker", str4);
        }
        opMonitor.timing();
        return opMonitor;
    }

    public static void monitorPMResult(IAppContext iAppContext, LKEvent lKEvent, long j, String str, int i, int i2, String str2, String str3, boolean z) {
        monitorPMResult(iAppContext, lKEvent, j, str, i, i2, str2, str3, z, null);
    }

    public static void monitorResultCallback(IAppContext iAppContext, String str, OPTrace oPTrace, String str2, int i, int i2, String str3, String str4, boolean z) {
        monitorResultCallback(iAppContext, str, oPTrace, str2, i, i2, str3, str4, z, null);
    }

    public static void monitorResultCallback(IAppContext iAppContext, String str, OPTrace oPTrace, String str2, int i, int i2, String str3, String str4, boolean z, String str5) {
        generateNativeCallbackMonitor(iAppContext, str2, buildErrMsg(str3, str, str2), str4, i, i2, z, str5).flush(oPTrace);
        oPTrace.finish(getOpMonitor(iAppContext, "monitor_batch_report", OPTrace.Companion.mo170884a()));
    }

    private static OPMonitor generateNativeResultMonitor(IAppContext iAppContext, long j, boolean z, String str, String str2, String str3, int i, int i2, Boolean bool, String str4) {
        OPMonitor opMonitor = getOpMonitor(iAppContext, 10005, "native_invoke_result");
        setResultType(opMonitor, str);
        opMonitor.addCategoryValue("pm_duration", Long.valueOf(j));
        opMonitor.addCategoryValue("pm_downgrade", Boolean.valueOf(z));
        opMonitor.addCategoryValue(ApiHandler.API_CALLBACK_ERRMSG, str2);
        opMonitor.addCategoryValue("innerMsg", str3);
        opMonitor.addCategoryValue("errCode", Integer.valueOf(i));
        opMonitor.addCategoryValue("innerCode", Integer.valueOf(i2));
        if (bool != null) {
            opMonitor.addCategoryValue("isSyncMethod", bool);
        }
        if (!TextUtils.isEmpty(str4)) {
            opMonitor.addCategoryValue("worker", str4);
        }
        opMonitor.timing();
        return opMonitor;
    }

    public static void monitorPMResult(IAppContext iAppContext, LKEvent lKEvent, long j, String str, int i, int i2, String str2, String str3, boolean z, String str4) {
        if (HostDependManager.getInst().getFeatureGating("openplatform.gadget.full_api_chain_monitor.enable", false)) {
            String buildErrMsg = buildErrMsg(str2, lKEvent.mo92146m(), str);
            lKEvent.mo92134c().mo92189a(generateNativePMResultMonitor(iAppContext, str, buildErrMsg, str3, i, i2, str4));
            lKEvent.mo92134c().mo92189a(generateNativeResultMonitor(iAppContext, System.currentTimeMillis() - j, false, str, buildErrMsg, str3, i, i2, Boolean.valueOf(z), str4));
        }
    }
}
