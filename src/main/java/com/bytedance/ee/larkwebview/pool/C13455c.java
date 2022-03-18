package com.bytedance.ee.larkwebview.pool;

import com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency;
import com.bytedance.ee.larkwebview.monitor.webview.BizType;
import com.bytedance.ee.larkwebview.monitor.webview.CommonMonitorCode;
import com.bytedance.ee.larkwebview.monitor.webview.WebMonitor;
import com.bytedance.ee.larkwebview.p668b.AbstractC13397a;
import com.bytedance.ee.larkwebview.p668b.C13398b;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.ss.android.lark.optrace.core.C48939c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkwebview.pool.c */
public class C13455c {

    /* renamed from: a */
    private static IMonitorDependency f35494a;

    /* renamed from: a */
    private static IMonitorDependency m54690a() {
        if (f35494a == null) {
            f35494a = new IMonitorDependency() {
                /* class com.bytedance.ee.larkwebview.pool.C13455c.C134561 */

                @Override // com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency
                /* renamed from: a */
                public WebMonitor mo49726a(String str, OPMonitorCode oPMonitorCode) {
                    return null;
                }

                @Override // com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency
                /* renamed from: b */
                public WebMonitor mo49730b(String str, OPMonitorCode oPMonitorCode) {
                    return null;
                }

                @Override // com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency
                public TracingCoreSpan getBaseTraceSpan() {
                    return C48939c.m192792a().mo170891b();
                }

                @Override // com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency
                public String getBizType() {
                    return BizType.f35444h.mo49865f().mo49859a();
                }

                @Override // com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency
                public Map<String, Object> getCommonParams() {
                    HashMap hashMap = new HashMap();
                    hashMap.put("os", "Android");
                    return hashMap;
                }

                @Override // com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency
                /* renamed from: a */
                public void mo49729a(String str, JSONObject jSONObject) {
                    AbstractC13397a a = C13398b.m54466a();
                    if (a != null) {
                        a.mo22590a(str, jSONObject);
                    }
                }
            };
        }
        return f35494a;
    }

    /* renamed from: a */
    public static void m54691a(String str) {
        new WebMonitor("wb_pool_register_repetitive", CommonMonitorCode.f35449D, m54690a()).addCategoryValue("pool_id", str).flush();
    }

    /* renamed from: b */
    public static void m54692b(String str) {
        new WebMonitor("wb_pool_tag_not_found", CommonMonitorCode.f35450E, m54690a()).addCategoryValue("pool_id", str).flush();
    }
}
