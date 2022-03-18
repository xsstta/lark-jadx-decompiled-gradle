package com.ss.android.appcenter.common.view.video.listener;

import com.ss.android.appcenter.common.util.C28184h;
import com.ss.ttvideoengine.log.VideoEventManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/appcenter/common/view/video/listener/VideoEventListener;", "Lcom/ss/ttvideoengine/log/VideoEventListener;", "()V", "tag", "", "onEvent", "", "onEventV2", "monitor_name", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.common.view.video.b.g */
public final class VideoEventListener implements com.ss.ttvideoengine.log.VideoEventListener {

    /* renamed from: a */
    private final String f70843a = "TTVideoEventListener";

    @Override // com.ss.ttvideoengine.log.VideoEventListener
    public void onEventV2(String str) {
        Intrinsics.checkParameterIsNotNull(str, "monitor_name");
    }

    @Override // com.ss.ttvideoengine.log.VideoEventListener
    public void onEvent() {
        try {
            JSONArray popAllEvents = VideoEventManager.instance.popAllEvents();
            if (popAllEvents != null) {
                int length = popAllEvents.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = popAllEvents.getJSONObject(i);
                    if (jSONObject != null) {
                        String str = this.f70843a;
                        C28184h.m103250d(str, "onEvent: " + jSONObject);
                    }
                }
            }
        } catch (JSONException e) {
            String str2 = this.f70843a;
            C28184h.m103248b(str2, "VideoEventManager" + e.getMessage());
        }
    }
}
