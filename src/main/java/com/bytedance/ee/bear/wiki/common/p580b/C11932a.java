package com.bytedance.ee.bear.wiki.common.p580b;

import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.wiki.common.b.a */
public class C11932a {
    /* renamed from: a */
    public static void m49471a(AbstractC5233x xVar, String str, String str2, String str3, String str4, String str5, long j, String str6) {
        if (xVar == null) {
            C13479a.m54758a("WikiPerformanceReport", "analyticService is null");
            return;
        }
        HashMap hashMap = new HashMap(9);
        hashMap.put("action", str);
        hashMap.put("file_id", C13598b.m55197d(str2));
        hashMap.put(ShareHitPoint.f121868c, str3);
        hashMap.put("result_key", str4);
        hashMap.put("result_code", str5);
        hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, Long.valueOf(j));
        hashMap.put("open_type", str6);
        C13479a.m54772d("WikiPerformanceReport", "reportTreeOperationFinish map = " + hashMap);
        try {
            xVar.mo21079a("docs_wiki_performance_tree_operation_finish", hashMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
