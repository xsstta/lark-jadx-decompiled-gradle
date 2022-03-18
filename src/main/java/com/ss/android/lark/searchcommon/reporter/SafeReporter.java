package com.ss.android.lark.searchcommon.reporter;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/searchcommon/reporter/SafeReporter;", "", "()V", "TAG", "", "safeSendEvent", "", "eventKey", "param", "Lorg/json/JSONObject;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.d.d */
public final class SafeReporter {

    /* renamed from: a */
    public static final SafeReporter f133151a = new SafeReporter();

    private SafeReporter() {
    }

    /* renamed from: a */
    public final void mo183813a(String str, JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            Log.m165383e("LarkSearch.Common.SearchNewHitPoint", "wtf!!!");
            return;
        }
        try {
            Statistics.sendEvent(str, jSONObject);
            Log.m165379d("LarkSearch.Common.SearchNewHitPoint", "eventKey:" + str + " param:" + jSONObject);
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }
}
