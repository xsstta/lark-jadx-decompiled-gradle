package com.bytedance.ee.bear.wikiv2.report;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/report/WikiDevReportV2;", "", "()V", "start_time", "", "Ljava/lang/Long;", "reportWikiOpenTreeFinish", "", "file_id", "", ShareHitPoint.f121868c, "result_key", "result_code", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "EventID", "ParamValue", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.c.a */
public final class WikiDevReportV2 {

    /* renamed from: a */
    public static Long f32880a;

    /* renamed from: b */
    public static final WikiDevReportV2 f32881b = new WikiDevReportV2();

    private WikiDevReportV2() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m50894a(String str, String str2, String str3, Integer num) {
        String str4;
        if (str2 != null && f32880a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l = f32880a;
            if (l == null) {
                Intrinsics.throwNpe();
            }
            long longValue = currentTimeMillis - l.longValue();
            JSONObject jSONObject = new JSONObject();
            C12238d.m50933a(jSONObject, "file_id", C12238d.m50931a(str));
            C12238d.m50933a(jSONObject, ShareHitPoint.f121868c, str2);
            C12238d.m50933a(jSONObject, "result_key", str3);
            if (num != null) {
                str4 = String.valueOf(num.intValue());
            } else {
                str4 = null;
            }
            C12238d.m50933a(jSONObject, "result_code", str4);
            C12238d.m50933a(jSONObject, HiAnalyticsConstant.BI_KEY_COST_TIME, Long.valueOf(longValue));
            C12238d.m50933a(jSONObject, "open_type", "network");
            C12238d.m50932a("docs_wiki_performance_open_tree_finish", jSONObject);
        }
    }
}
