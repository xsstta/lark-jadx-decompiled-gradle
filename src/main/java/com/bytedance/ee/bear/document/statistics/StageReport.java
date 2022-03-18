package com.bytedance.ee.bear.document.statistics;

import com.bytedance.ee.bear.connection.C4974b;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.doc.C5130a;
import com.bytedance.ee.bear.document.DocReport;
import com.bytedance.ee.bear.document.offline.C5890a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.bytedance.lynx.webview.internal.C20011y;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0007\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/document/statistics/StageReport;", "", "mAnalytics", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "versionType", "", "(Lcom/bytedance/ee/bear/contract/AnalyticService;Ljava/lang/String;)V", "TAG", "isTTWebView", "", "mStages", "", "", "stageEnd", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/document/statistics/SendEventData;", "stageStart", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.statistics.e */
public final class StageReport {

    /* renamed from: a */
    private final String f17165a = DocReport.f16141b;

    /* renamed from: b */
    private final Map<String, Long> f17166b = new LinkedHashMap();

    /* renamed from: c */
    private final boolean f17167c = C20011y.m73013k();

    /* renamed from: d */
    private final AbstractC5233x f17168d;

    /* renamed from: e */
    private final String f17169e;

    /* renamed from: a */
    public final void mo24869a(SendEventData sendEventData) {
        String str;
        JSONObject jSONObject;
        Map<String, String> map;
        Map<String, String> map2;
        String str2 = null;
        if (sendEventData == null || (map2 = sendEventData.data) == null) {
            str = null;
        } else {
            str = map2.get("stage");
        }
        if (str != null) {
            if (!(sendEventData == null || (map = sendEventData.data) == null)) {
                str2 = map.get("timestamp");
            }
            if (str2 != null) {
                this.f17166b.put(str, Long.valueOf(Long.parseLong(str2)));
            } else {
                this.f17166b.put(str, Long.valueOf(System.currentTimeMillis()));
            }
            if (sendEventData.data != null) {
                Map<String, String> map3 = sendEventData.data;
                if (map3 != null) {
                    jSONObject = new JSONObject(map3);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                }
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject.put("stage", str + "_start");
            jSONObject.put("version_type", this.f17169e);
            jSONObject.put("scm_version", C5130a.m20992a());
            jSONObject.put("enable_x5", this.f17167c);
            jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, System.currentTimeMillis() - DocReport.f16153n.mo23027h());
            jSONObject.put("preload_html_enabled", DocReport.f16153n.mo23024e() ? 1 : 0);
            jSONObject.put("is_first_open_docs", String.valueOf(DocReport.f16153n.mo23023d().get()));
            C13479a.m54764b(this.f17165a, "***reportOpenDoc*** stage: " + jSONObject.get("stage") + "  cost: " + jSONObject.get(HiAnalyticsConstant.BI_KEY_COST_TIME));
            this.f17168d.mo21080a(DocReport.EventID.f16182a.mo23048c(), jSONObject);
            StringBuilder sb = new StringBuilder();
            sb.append("docs_");
            sb.append(DocReport.EventID.f16182a.mo23048c());
            MonitorUtils.monitorEvent(sb.toString(), jSONObject, jSONObject, new JSONObject());
        }
    }

    /* renamed from: b */
    public final void mo24870b(SendEventData sendEventData) {
        String str;
        JSONObject jSONObject;
        Map<String, String> map;
        Map<String, String> map2;
        String str2 = null;
        if (sendEventData == null || (map2 = sendEventData.data) == null) {
            str = null;
        } else {
            str = map2.get("stage");
        }
        if (str != null) {
            Long l = this.f17166b.get(str);
            if (l == null) {
                String a = this.f17168d.mo21075a("start_open", "start_time");
                if (a != null) {
                    l = Long.valueOf(a);
                } else {
                    l = Long.valueOf(DocReport.f16153n.mo23025f());
                }
            }
            if (l == null) {
                C13479a.m54764b(this.f17165a, "stage " + str + " hasn't started.");
                return;
            }
            if (sendEventData.data != null) {
                Map<String, String> map3 = sendEventData.data;
                if (map3 != null) {
                    jSONObject = new JSONObject(map3);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                }
            } else {
                jSONObject = new JSONObject();
            }
            if (!(sendEventData == null || (map = sendEventData.data) == null)) {
                str2 = map.get("timestamp");
            }
            if (str2 != null) {
                jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, Long.parseLong(str2) - l.longValue());
            } else {
                jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, System.currentTimeMillis() - l.longValue());
            }
            jSONObject.put("version_type", this.f17169e);
            jSONObject.put("scm_version", C5130a.m20992a());
            jSONObject.put("file_type", C5890a.m23693a());
            jSONObject.put("doc_network_status", C4974b.m20619a().ordinal());
            jSONObject.put("doc_has_cache", DocReport.f16153n.mo23022c());
            jSONObject.put("doc_from", DocReport.f16153n.mo23018b());
            jSONObject.put("enable_x5", this.f17167c);
            jSONObject.put("preload_html_enabled", DocReport.f16153n.mo23024e() ? 1 : 0);
            jSONObject.put("is_first_open_docs", String.valueOf(DocReport.f16153n.mo23023d().get()));
            C13479a.m54764b(this.f17165a, "***reportOpenDoc*** stage: " + jSONObject.get("stage") + "  cost: " + jSONObject.get(HiAnalyticsConstant.BI_KEY_COST_TIME));
            this.f17168d.mo21080a(DocReport.EventID.f16182a.mo23048c(), jSONObject);
            StringBuilder sb = new StringBuilder();
            sb.append("docs_");
            sb.append(DocReport.EventID.f16182a.mo23048c());
            MonitorUtils.monitorEvent(sb.toString(), jSONObject, jSONObject, new JSONObject());
        }
    }

    public StageReport(AbstractC5233x xVar, String str) {
        Intrinsics.checkParameterIsNotNull(xVar, "mAnalytics");
        Intrinsics.checkParameterIsNotNull(str, "versionType");
        this.f17168d = xVar;
        this.f17169e = str;
    }
}
