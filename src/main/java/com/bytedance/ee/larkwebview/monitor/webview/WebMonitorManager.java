package com.bytedance.ee.larkwebview.monitor.webview;

import android.net.Uri;
import com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J$\u0010\r\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J(\u0010\u000f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u0017\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ'\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010 \u001a\u0004\u0018\u00010\u0004J\u0016\u0010!\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0013J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010#\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010$\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001a\u0010%\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010&\u001a\u0004\u0018\u00010\u0004J\u0018\u0010'\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001c\u001a\u00020\u0013J\u000e\u0010(\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010)\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010*\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ.\u0010+\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010,\u001a\u00020\u00042\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010.J\u001a\u0010/\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u001a\u00100\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0018\u00101\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0018\u001a\u00020\u0019J\u001a\u00102\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0012\u00103\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/bytedance/ee/larkwebview/monitor/webview/WebMonitorManager;", "", "()V", "TAG", "", "addUrl", "", "dependency", "Lcom/bytedance/ee/larkwebview/monitor/dependency/IMonitorDependency;", "monitor", "Lcom/bytedance/ee/larkwebview/monitor/webview/WebMonitor;", "url", "expandTracingSpan", "reportBizApiInvoke", "api_name", "reportBlankCheck", "isBlank", "", "rate", "", "color", "reportContainerPause", "reportContainerResume", "reportFirstContentfulPaint", "duration", "", "reportGlOom", "reportHttpError", "errorCode", "mimeType", "(Lcom/bytedance/ee/larkwebview/monitor/dependency/IMonitorDependency;Ljava/lang/Integer;Ljava/lang/String;)V", "reportJSError", ApiHandler.API_CALLBACK_ERRMSG, "reportLoadFailed", "reportLoadStart", "reportLoadSuccess", "reportOverrideUrlNotSafe", "reportPerformTiming", "performance", "reportReceiveError", "reportRenderProcessGone", "reportSetWebChromeClientFailed", "reportSetWebViewClientFailed", "reportUseTAG", "tag", "map", "", "reportWebBrowseEnd", "reportWebBrowseStart", "reportWebViewCreate", "reportWebViewDestroy", "shouldAddUrl", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.monitor.webview.f */
public final class WebMonitorManager {

    /* renamed from: a */
    public static final WebMonitorManager f35486a = new WebMonitorManager();

    private WebMonitorManager() {
    }

    /* renamed from: a */
    public final void mo49873a(IMonitorDependency aVar, String str, Map<String, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        OPMonitor addCategoryValue = new WebMonitor("wb_html_tag", CommonMonitorCode.f35464f, aVar).addCategoryValue("tag", str);
        if (map == null) {
            map = new HashMap();
        }
        addCategoryValue.addMap(map).flush();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.monitor.webview.f$a */
    public static final class RunnableC13446a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IMonitorDependency f35487a;

        /* renamed from: b */
        final /* synthetic */ String f35488b;

        RunnableC13446a(IMonitorDependency aVar, String str) {
            this.f35487a = aVar;
            this.f35488b = str;
        }

        public final void run() {
            WebMonitor eVar = new WebMonitor("wb_container_resume", CommonMonitorCode.f35473o, this.f35487a);
            WebMonitorManager.f35486a.mo49869a(this.f35487a, eVar, this.f35488b);
            eVar.flush();
        }
    }

    /* renamed from: d */
    public final void mo49880d(IMonitorDependency aVar) {
        new WebMonitor("wb_override_url_loading_not_safe", CommonMonitorCode.f35447B, aVar).flush();
    }

    /* renamed from: e */
    public final void mo49882e(IMonitorDependency aVar) {
        new WebMonitor("wb_set_webview_client_failed", CommonMonitorCode.f35467i, aVar).flush();
    }

    /* renamed from: f */
    public final void mo49884f(IMonitorDependency aVar) {
        new WebMonitor("wb_set_webchrome_client_failed", CommonMonitorCode.f35468j, aVar).flush();
    }

    /* renamed from: g */
    private final boolean m54643g(IMonitorDependency aVar) {
        String str;
        if (aVar != null) {
            str = aVar.getBizType();
        } else {
            str = null;
        }
        return Intrinsics.areEqual(str, BizType.f35444h.mo49861b().mo49859a());
    }

    /* renamed from: a */
    public final void mo49866a(IMonitorDependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        new WebMonitor("wb_load_url_end", CommonMonitorCode.f35460b, aVar).addCategoryValue("result_code", 0).flush();
    }

    /* renamed from: b */
    public final void mo49874b(IMonitorDependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        new WebMonitor("wb_load_url_start", CommonMonitorCode.f35459a, aVar).flush();
    }

    /* renamed from: c */
    public final void mo49878c(IMonitorDependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        new WebMonitor("wb_render_process_gone", CommonMonitorCode.f35484z, aVar).flush();
    }

    /* renamed from: h */
    private final void m54644h(IMonitorDependency aVar) {
        Map<String, Object> commonParams;
        String str;
        TracingCoreSpan generateSpan;
        if (!(aVar == null || (commonParams = aVar.getCommonParams()) == null)) {
            TracingCoreSpan baseTraceSpan = aVar.getBaseTraceSpan();
            if (baseTraceSpan == null || (generateSpan = baseTraceSpan.generateSpan()) == null || (str = generateSpan.getTracingID()) == null) {
                str = "";
            }
            if (commonParams.put("trace_id", str) != null) {
                return;
            }
        }
        Log.m165383e("WebMonitorManager", "expand TracingSpan error");
        Unit unit = Unit.INSTANCE;
    }

    /* renamed from: d */
    public final void mo49881d(IMonitorDependency aVar, String str) {
        WebMonitor eVar = new WebMonitor("wb_browse_url_end", CommonMonitorCode.f35471m, aVar);
        mo49869a(aVar, eVar, str);
        eVar.flush();
    }

    /* renamed from: e */
    public final void mo49883e(IMonitorDependency aVar, String str) {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().submit(new RunnableC13446a(aVar, str));
    }

    /* renamed from: f */
    public final void mo49885f(IMonitorDependency aVar, String str) {
        WebMonitor eVar = new WebMonitor("wb_container_pause", CommonMonitorCode.f35474p, aVar);
        mo49869a(aVar, eVar, str);
        eVar.flush();
    }

    /* renamed from: a */
    public final void mo49867a(IMonitorDependency aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        new WebMonitor("wb_load_url_end", CommonMonitorCode.f35465g, aVar).addCategoryValue("result_code", 1).addCategoryValue("error_code", Integer.valueOf(i)).flush();
    }

    /* renamed from: b */
    public final void mo49875b(IMonitorDependency aVar, int i) {
        new WebMonitor("wb_load_received_error", CommonMonitorCode.f35469k, aVar).addMetricValue("error_code", Integer.valueOf(i)).flush();
    }

    /* renamed from: c */
    public final void mo49879c(IMonitorDependency aVar, String str) {
        WebMonitor eVar = new WebMonitor("wb_browse_url_start", CommonMonitorCode.f35470l, aVar);
        mo49869a(aVar, eVar, str);
        m54644h(aVar);
        eVar.flush();
    }

    /* renamed from: a */
    public final void mo49868a(IMonitorDependency aVar, long j) {
        new WebMonitor("wb_first_content_paint", CommonMonitorCode.f35480v, aVar).addCategoryValue("fcp_time", Long.valueOf(j)).flush();
    }

    /* renamed from: b */
    public final void mo49876b(IMonitorDependency aVar, long j) {
        new WebMonitor("wb_webview_create", CommonMonitorCode.f35466h, aVar).addCategoryValue("duration", Long.valueOf(j)).flush();
    }

    /* renamed from: b */
    public final void mo49877b(IMonitorDependency aVar, String str) {
        new WebMonitor("wb_performance_timing", CommonMonitorCode.f35483y, aVar).addCategoryValue("performance", str).flush();
    }

    /* renamed from: a */
    public final void mo49871a(IMonitorDependency aVar, String str) {
        new WebMonitor("wb_js_error", CommonMonitorCode.f35463e, aVar).addCategoryValue("err_msg", str).flush();
    }

    /* renamed from: a */
    public final void mo49869a(IMonitorDependency aVar, WebMonitor eVar, String str) {
        if (m54643g(aVar)) {
            try {
                Uri parse = Uri.parse(str);
                Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
                eVar.addCategoryValue("host", parse.getHost());
                eVar.addCategoryValue("path", parse.getPath());
            } catch (Exception e) {
                Log.m165383e("WebMonitorManager", "add url exception " + e);
            }
        }
    }

    /* renamed from: a */
    public final void mo49870a(IMonitorDependency aVar, Integer num, String str) {
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        new WebMonitor("wb_load_res_failed", CommonMonitorCode.f35461c, aVar).addMetricValue("error_code", num).addCategoryValue("mime_type", str).flush();
    }

    /* renamed from: a */
    public final void mo49872a(IMonitorDependency aVar, String str, String str2) {
        new WebMonitor("web_biz_api_invoke", CommonMonitorCode.f35457L, aVar).addCategoryValue("api_name", str).addCategoryValue("url", str2).flush();
    }
}
