package com.ss.android.lark.forward.template;

import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002¨\u0006\u0006"}, d2 = {"sendTabSendEvent", "", "send", "", "postId", "", "core_forward_forward_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.forward.template.e */
public final class C38511e {
    /* renamed from: a */
    public static final void m151893a(boolean z, String str) {
        String str2;
        JSONObject put = new JSONObject().put("post_id", str);
        if (z) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        Statistics.sendEvent("community_tab_share_send", put.put("action", str2));
    }
}
