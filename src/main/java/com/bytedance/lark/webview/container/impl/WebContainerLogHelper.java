package com.bytedance.lark.webview.container.impl;

import android.text.TextUtils;
import com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency;
import com.bytedance.ee.larkwebview.monitor.webview.WebMonitor;
import com.larksuite.component.webview.container.dto.C25835f;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.ss.android.lark.statistics.Statistics;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/lark/webview/container/impl/WebContainerLogHelper;", "", "()V", "APPLICATION_ID", "", "IDENTIFYTYPE_STSTUS", "IDENTIFYTYPE_WEB", "IDENTIFYTYPE_WEB_APP", "LOG_EVENT_CONTAINER_MENU_VIEW", "SCENE_TYPE", "SOLUTION_ID", "printMenuShowMonitor", "", "titleInfo", "Lcom/larksuite/component/webview/container/dto/WebMenuTitleInfo;", "webview-container_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.lark.webview.container.impl.d */
public final class WebContainerLogHelper {

    /* renamed from: a */
    public static final WebContainerLogHelper f48550a = new WebContainerLogHelper();

    private WebContainerLogHelper() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0016\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"com/bytedance/lark/webview/container/impl/WebContainerLogHelper$printMenuShowMonitor$3", "Lcom/bytedance/ee/larkwebview/monitor/dependency/IMonitorDependency;", "getBaseTraceSpan", "Lcom/ss/android/lark/optrace/api/TracingCoreSpan;", "getBizType", "", "getCommonParams", "", "", "reportEvent", "", "eventName", "eventJson", "Lorg/json/JSONObject;", "webview-container_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.webview.container.impl.d$a */
    public static final class C19876a implements IMonitorDependency {

        /* renamed from: a */
        final /* synthetic */ C25835f f48551a;

        @Override // com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency
        public TracingCoreSpan getBaseTraceSpan() {
            return null;
        }

        @Override // com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency
        public String getBizType() {
            return "";
        }

        @Override // com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency
        public Map<String, Object> getCommonParams() {
            String str;
            C25835f fVar = this.f48551a;
            if (fVar == null || (str = fVar.mo91907a()) == null) {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                str = "none";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("application_id", str);
            hashMap.put("scene_type", "none");
            hashMap.put("solution_id", "none");
            return hashMap;
        }

        C19876a(C25835f fVar) {
            this.f48551a = fVar;
        }

        @Override // com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency
        /* renamed from: a */
        public WebMonitor mo49726a(String str, OPMonitorCode oPMonitorCode) {
            Intrinsics.checkParameterIsNotNull(str, "event");
            return IMonitorDependency.C13442a.m54626a(this, str, oPMonitorCode);
        }

        @Override // com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency
        /* renamed from: b */
        public WebMonitor mo49730b(String str, OPMonitorCode oPMonitorCode) {
            Intrinsics.checkParameterIsNotNull(str, "event");
            return IMonitorDependency.C13442a.m54628b(this, str, oPMonitorCode);
        }

        @Override // com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency
        /* renamed from: a */
        public void mo49729a(String str, JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(str, "eventName");
            Intrinsics.checkParameterIsNotNull(jSONObject, "eventJson");
            Statistics.sendEvent(str, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo67360a(C25835f fVar) {
        String str;
        boolean z;
        C25835f fVar2;
        if (fVar != null) {
            if (fVar.mo91911e() == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                fVar2 = fVar;
            } else {
                fVar2 = null;
            }
            if (fVar2 != null) {
                str = "web_app";
                WebMonitor eVar = new WebMonitor("openplatform_web_container_menu_view", null, new C19876a(fVar));
                eVar.addCategoryValue("identify_status", str);
                eVar.reportPlatform(4).flush();
            }
        }
        str = "web";
        WebMonitor eVar2 = new WebMonitor("openplatform_web_container_menu_view", null, new C19876a(fVar));
        eVar2.addCategoryValue("identify_status", str);
        eVar2.reportPlatform(4).flush();
    }
}
