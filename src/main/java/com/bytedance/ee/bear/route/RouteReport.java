package com.bytedance.ee.bear.route;

import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.util.url.UrlRouteReportParam;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/route/RouteReport;", "", "()V", "EventID_LINK_CLICKED", "", "TAG", "reportCCMLink", "", "analyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "scene", "location", "route_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.route.e */
public final class RouteReport {

    /* renamed from: a */
    public static final RouteReport f28727a = new RouteReport();

    private RouteReport() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m44506a(AbstractC5233x xVar, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
        Intrinsics.checkParameterIsNotNull(str, "scene");
        Intrinsics.checkParameterIsNotNull(str2, "location");
        Map<String, String> a = UrlRouteReportParam.m55765a(str, str2);
        if (!a.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : a.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            xVar.mo21081a("link_clicked", jSONObject, "");
        }
    }
}
