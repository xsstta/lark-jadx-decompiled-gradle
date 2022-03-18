package com.ss.android.lark.player.player;

import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.ttvideoengine.log.VideoEventListener;
import com.ss.ttvideoengine.log.VideoEventManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/player/player/LarkVideoEventListener;", "Lcom/ss/ttvideoengine/log/VideoEventListener;", "()V", "onEvent", "", "onEventV2", "monitor_name", "", "videoview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.player.c.i */
public final class LarkVideoEventListener implements VideoEventListener {
    @Override // com.ss.ttvideoengine.log.VideoEventListener
    public void onEvent() {
        try {
            JSONArray popAllEvents = VideoEventManager.instance.popAllEvents();
            if (popAllEvents != null) {
                int length = popAllEvents.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = popAllEvents.getJSONObject(i);
                    if (jSONObject != null) {
                        Log.m165389i("TTEnginePlayerListeners", "onEvent: " + jSONObject);
                        Statistics.recordMiscLog("video_playq", jSONObject);
                    }
                }
            }
        } catch (JSONException e) {
            Log.m165383e("TTEnginePlayerListeners", "VideoEventManager, onEvent exception: " + e.getMessage());
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
                        Log.m165389i("TTEnginePlayerListeners", "onEventV2: " + jSONObject);
                        Statistics.sendEvent(str, jSONObject);
                    }
                }
            }
        } catch (JSONException e) {
            Log.m165383e("TTEnginePlayerListeners", "VideoEventManager, onEventV2 exception: " + e.getMessage());
        }
    }
}
