package com.tt.miniapp.video.player;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.ss.ttvideoengine.log.VideoEventManager;
import com.tt.miniapphost.process.C67556a;
import com.tt.refer.common.util.C67866g;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.video.player.b */
public class C67127b implements AbstractC67126a {
    @Override // com.ss.ttvideoengine.log.VideoEventListener
    public void onEventV2(String str) {
    }

    @Override // com.ss.ttvideoengine.log.VideoEventListener
    public void onEvent() {
        AppBrandLogger.m52828d("VideoEventListenerImpl", "onEvent");
        final JSONArray popAllEvents = VideoEventManager.instance.popAllEvents();
        if (popAllEvents != null && popAllEvents.length() > 0) {
            C67866g.m264025a(new Action() {
                /* class com.tt.miniapp.video.player.C67127b.C671281 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    for (int i = 0; i < popAllEvents.length(); i++) {
                        try {
                            JSONObject jSONObject = popAllEvents.getJSONObject(i);
                            if (jSONObject != null) {
                                C67556a.m262936a("video_playq", jSONObject);
                                AppBrandLogger.m52830i("VideoEventListenerImpl", "video_playq", ", ", jSONObject);
                            }
                        } catch (Throwable th) {
                            AppBrandLogger.m52829e("VideoEventListenerImpl", th);
                        }
                    }
                }
            }, Schedulers.longIO());
        }
    }
}
