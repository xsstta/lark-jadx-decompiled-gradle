package com.ss.android.lark.voip.service.impl.rtcengine;

import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.irtc.AbstractC61026e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/voip/service/impl/rtcengine/VoipLogListener;", "Lcom/ss/android/vc/irtc/ILogCallback;", "()V", "logD", "", "p0", "", "p1", "logE", "logI", "monitor", "Lorg/json/JSONObject;", "statistics", "voip_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.voip.service.impl.c.e */
public final class VoipLogListener implements AbstractC61026e {

    /* renamed from: a */
    public static final VoipLogListener f143042a = new VoipLogListener();

    @Override // com.ss.android.vc.irtc.AbstractC61026e
    public void statistics(String str, JSONObject jSONObject) {
    }

    private VoipLogListener() {
    }

    @Override // com.ss.android.vc.irtc.AbstractC61026e
    public void monitor(String str, JSONObject jSONObject) {
        if (str != null) {
            MonitorUtils.monitorCommonLog(str, jSONObject, true);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61026e
    public void logD(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "p0");
        Intrinsics.checkParameterIsNotNull(str2, "p1");
        Log.m165379d(str, str2);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61026e
    public void logE(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "p0");
        Intrinsics.checkParameterIsNotNull(str2, "p1");
        Log.m165383e(str, str2);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61026e
    public void logI(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "p0");
        Intrinsics.checkParameterIsNotNull(str2, "p1");
        Log.m165389i(str, str2);
    }
}
