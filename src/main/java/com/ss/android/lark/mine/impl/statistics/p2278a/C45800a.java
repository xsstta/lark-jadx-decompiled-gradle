package com.ss.android.lark.mine.impl.statistics.p2278a;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mine.impl.statistics.a.a */
public class C45800a extends BaseHitPoint {
    /* renamed from: a */
    public static void m181470a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121868c, "photo");
            Statistics.sendEvent("click_all_activity_page", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
