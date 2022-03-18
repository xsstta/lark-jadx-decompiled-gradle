package com.ss.android.lark.meego.wrapper.common;

import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/meego/wrapper/common/MeegoHitPoint;", "", "()V", "sendLarkTryCreateMeego", "", "channel", "", "meego_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.meego.wrapper.a.d */
public final class MeegoHitPoint {

    /* renamed from: a */
    public static final MeegoHitPoint f113632a = new MeegoHitPoint();

    private MeegoHitPoint() {
    }

    /* renamed from: a */
    public final void mo158742a(String str) {
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        Statistics.sendEvent("lark_try_create_meego", jSONObject.put("channel", str));
    }
}
