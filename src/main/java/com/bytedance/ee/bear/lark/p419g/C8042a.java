package com.bytedance.ee.bear.lark.p419g;

import com.bytedance.ee.log.C13479a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.statistics.Statistics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.lark.g.a */
public class C8042a {
    /* renamed from: a */
    public void mo31079a(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, j);
        } catch (JSONException e) {
            C13479a.m54758a("DocLaunch", e.toString());
        }
        Statistics.sendEvent("docs_dev_performance_lark_launch_docs_init", jSONObject);
    }
}
