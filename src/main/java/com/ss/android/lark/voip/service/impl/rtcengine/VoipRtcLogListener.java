package com.ss.android.lark.voip.service.impl.rtcengine;

import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.impl.AbstractC61014c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/voip/service/impl/rtcengine/VoipRtcLogListener;", "Lcom/ss/android/vc/impl/IRtcLogCallback;", "()V", "onLogReport", "", ShareHitPoint.f121869d, "", "msg", "Lorg/json/JSONObject;", "voip_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.voip.service.impl.c.f */
public final class VoipRtcLogListener extends AbstractC61014c {

    /* renamed from: a */
    public static final VoipRtcLogListener f143043a = new VoipRtcLogListener();

    private VoipRtcLogListener() {
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: a */
    public void mo197060a(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("event_key");
            if (Intrinsics.areEqual(optString, "rtc_join_room") || Intrinsics.areEqual(optString, "rtc_leave_room")) {
                Log.m165389i("RTCSDKWatchEvent", jSONObject.toString());
            }
            MonitorUtils.monitorCommonLog(str, jSONObject, true);
        }
    }
}
