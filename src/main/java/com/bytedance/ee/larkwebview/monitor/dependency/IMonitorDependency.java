package com.bytedance.ee.larkwebview.monitor.dependency;

import com.bytedance.ee.larkwebview.monitor.webview.WebMonitor;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000b\u001a\u00020\u0005H&J\u0016\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH&J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H&¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/larkwebview/monitor/dependency/IMonitorDependency;", "", "createErrorMonitor", "Lcom/bytedance/ee/larkwebview/monitor/webview/WebMonitor;", "event", "", "monitorCode", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "createNormalMonitor", "getBaseTraceSpan", "Lcom/ss/android/lark/optrace/api/TracingCoreSpan;", "getBizType", "getCommonParams", "", "reportEvent", "", "eventName", "eventJson", "Lorg/json/JSONObject;", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.monitor.b.a */
public interface IMonitorDependency {
    /* renamed from: a */
    WebMonitor mo49726a(String str, OPMonitorCode oPMonitorCode);

    /* renamed from: a */
    void mo49729a(String str, JSONObject jSONObject);

    /* renamed from: b */
    WebMonitor mo49730b(String str, OPMonitorCode oPMonitorCode);

    TracingCoreSpan getBaseTraceSpan();

    String getBizType();

    Map<String, Object> getCommonParams();

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.monitor.b.a$a */
    public static final class C13442a {
        /* renamed from: a */
        public static WebMonitor m54626a(IMonitorDependency aVar, String str, OPMonitorCode oPMonitorCode) {
            Intrinsics.checkParameterIsNotNull(str, "event");
            return new WebMonitor(str, oPMonitorCode, aVar);
        }

        /* renamed from: b */
        public static WebMonitor m54628b(IMonitorDependency aVar, String str, OPMonitorCode oPMonitorCode) {
            Intrinsics.checkParameterIsNotNull(str, "event");
            return aVar.mo49726a(str, oPMonitorCode);
        }

        /* renamed from: a */
        public static /* synthetic */ WebMonitor m54627a(IMonitorDependency aVar, String str, OPMonitorCode oPMonitorCode, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    oPMonitorCode = null;
                }
                return aVar.mo49730b(str, oPMonitorCode);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createNormalMonitor");
        }
    }
}
