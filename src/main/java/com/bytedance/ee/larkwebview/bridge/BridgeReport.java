package com.bytedance.ee.larkwebview.bridge;

import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency;
import com.bytedance.ee.larkwebview.monitor.webview.CommonMonitorCode;
import com.bytedance.ee.larkwebview.monitor.webview.WebMonitor;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J*\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\fJ6\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fXT¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ee/larkwebview/bridge/BridgeReport;", "", "()V", "CODE_API_AUTH_FAILED", "", "CODE_BRIDGE_IS_BAN", "CODE_BUILD_APIMESSAGE_FAILED", "CODE_CALLBACKID_IS_NULL_OR_EMPTY", "CODE_DATA_MORE_THAN_2M", "CODE_JS_METHOD_EMPTY", "CODE_NO_API_HANDLER", "EVENT_BRIDGE_ERROR", "", "EVENT_WB_CALLBACK_JS", "TAG", "reportCallbackStatusAndConsume", "", "webView", "Lcom/bytedance/ee/larkwebview/base/LarkWebView;", "handlerName", UpdateKey.STATUS, "Lcom/bytedance/ee/larkwebview/bridge/Status;", "executeTime", "", "reportError", "event", "code", "errorMsg", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.bridge.d */
public final class BridgeReport {

    /* renamed from: a */
    public static final BridgeReport f35365a = new BridgeReport();

    private BridgeReport() {
    }

    /* renamed from: a */
    public final void mo49787a(LarkWebView larkWebView, String str, int i, String str2) {
        Intrinsics.checkParameterIsNotNull(larkWebView, "webView");
        Intrinsics.checkParameterIsNotNull(str, "event");
        Log.m165383e("JSBridge", str2);
        larkWebView.mo49726a(str, new CommonMonitorCode.WebMonitorBridgeCode(i, OPMonitorLevel.ERROR, str2)).flush();
    }

    /* renamed from: a */
    public final void mo49789a(LarkWebView larkWebView, String str, Status status, long j) {
        Intrinsics.checkParameterIsNotNull(larkWebView, "webView");
        Intrinsics.checkParameterIsNotNull(str, "handlerName");
        Intrinsics.checkParameterIsNotNull(status, UpdateKey.STATUS);
        WebMonitor a = IMonitorDependency.C13442a.m54627a(larkWebView, "wb_api_invoke_result", null, 2, null);
        a.addCategoryValue("api_name", str);
        a.addCategoryValue("duration", Long.valueOf(j));
        int i = C13417e.f35366a[status.ordinal()];
        if (i == 1) {
            a.setResultTypeSuccess();
        } else if (i == 2) {
            a.setResultTypeSuccess();
        } else if (i == 3) {
            a.setResultTypeFail();
        } else if (i == 4) {
            a.setResultTypeCancel();
        } else if (i == 5) {
            a.setResultTypeTimeout();
        }
        a.flush();
    }

    /* renamed from: a */
    public final void mo49788a(LarkWebView larkWebView, String str, int i, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(larkWebView, "webView");
        Intrinsics.checkParameterIsNotNull(str, "event");
        Log.m165383e("JSBridge", str2);
        larkWebView.mo49726a(str, new CommonMonitorCode.WebMonitorBridgeCode(i, OPMonitorLevel.ERROR, str2)).addCategoryValue("api_name", str3).flush();
    }
}
