package com.ss.android.lark.mm.module.player.core;

import android.text.TextUtils;
import com.ss.android.lark.applogbridge.AppLogProxy;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.statistics.Statistics;
import com.ss.ttvideoengine.log.VideoEventListener;
import com.ss.ttvideoengine.log.VideoEventManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/module/player/core/MmTTVideoEventListener;", "Lcom/ss/ttvideoengine/log/VideoEventListener;", "()V", "tag", "", "onEvent", "", "onEventV2", "monitor_name", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.player.core.k */
public final class MmTTVideoEventListener implements VideoEventListener {

    /* renamed from: a */
    private final String f117287a = "MmTTVideoEventListener";

    @Override // com.ss.ttvideoengine.log.VideoEventListener
    public void onEvent() {
        try {
            JSONArray popAllEvents = VideoEventManager.instance.popAllEvents();
            if (popAllEvents != null) {
                int length = popAllEvents.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = popAllEvents.getJSONObject(i);
                    if (jSONObject != null) {
                        String str = this.f117287a;
                        C45855f.m181664c(str, "onEvent: " + jSONObject);
                        Statistics.recordMiscLog("video_playq", jSONObject);
                    }
                }
            }
        } catch (Exception e) {
            String str2 = this.f117287a;
            Log.m165383e(str2, "VideoEventManager" + e.getMessage());
        }
    }

    @Override // com.ss.ttvideoengine.log.VideoEventListener
    public void onEventV2(String str) {
        Intrinsics.checkParameterIsNotNull(str, "monitor_name");
        try {
            JSONArray popAllEventsV2 = VideoEventManager.instance.popAllEventsV2();
            if (popAllEventsV2 != null) {
                int length = popAllEventsV2.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = popAllEventsV2.getJSONObject(i);
                    if (jSONObject != null && !TextUtils.isEmpty(str)) {
                        jSONObject.putOpt("params_for_special", "videoplayer_monitor");
                        String str2 = this.f117287a;
                        C45855f.m181664c(str2, "onEventV2: " + jSONObject);
                        AppLogProxy.onEventV3(str, jSONObject);
                    }
                }
            }
        } catch (Exception e) {
            String str3 = this.f117287a;
            Log.m165383e(str3, "VideoEventManager" + e.getMessage());
        }
    }
}
