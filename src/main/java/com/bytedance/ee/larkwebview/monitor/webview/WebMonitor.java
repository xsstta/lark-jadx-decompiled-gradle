package com.bytedance.ee.larkwebview.monitor.webview;

import com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B)\b\u0007\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8TX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/larkwebview/monitor/webview/WebMonitor;", "Lcom/bytedance/ee/larkwebview/monitor/webview/BaseMonitor;", "name", "", "dependency", "Lcom/bytedance/ee/larkwebview/monitor/dependency/IMonitorDependency;", "(Ljava/lang/String;Lcom/bytedance/ee/larkwebview/monitor/dependency/IMonitorDependency;)V", "eventName", "code", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "mDependency", "(Ljava/lang/String;Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;Lcom/bytedance/ee/larkwebview/monitor/dependency/IMonitorDependency;)V", "commonParams", "", "", "getCommonParams", "()Ljava/util/Map;", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.monitor.webview.e */
public class WebMonitor extends BaseMonitor {

    /* renamed from: b */
    private final IMonitorDependency f35485b;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.larkwebview.monitor.webview.BaseMonitor
    /* renamed from: a */
    public Map<String, Object> mo49854a() {
        IMonitorDependency aVar = this.f35485b;
        if (aVar != null) {
            return aVar.getCommonParams();
        }
        return null;
    }

    public WebMonitor(String str, OPMonitorCode oPMonitorCode, IMonitorDependency aVar) {
        super(BaseMonitor.f35433a.mo49856a(aVar), str, oPMonitorCode);
        this.f35485b = aVar;
    }
}
