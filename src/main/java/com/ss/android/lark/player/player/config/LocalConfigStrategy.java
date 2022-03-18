package com.ss.android.lark.player.player.config;

import com.ss.android.lark.player.p2513c.C52114o;
import com.ss.android.lark.player.player.LarkPlayerUtils;
import com.ss.android.lark.player.player.LarkVideoEngineCallback;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/player/player/config/LocalConfigStrategy;", "Lcom/ss/android/lark/player/player/config/BaseConfigStrategy;", "()V", "configEngine", "Lcom/ss/ttvideoengine/TTVideoEngine;", "configLark", "", "configMDL", "videoview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.player.c.a.b */
public final class LocalConfigStrategy extends BaseConfigStrategy {
    @Override // com.ss.android.lark.player.player.config.BaseConfigStrategy
    /* renamed from: a */
    public void mo178484a() {
        C52114o.m202146c(true);
        LarkVideoEngineCallback.f129285b.mo178513a(5000);
    }

    @Override // com.ss.android.lark.player.player.config.BaseConfigStrategy
    /* renamed from: b */
    public void mo178485b() {
        super.mo178485b();
        TTVideoEngine.setIntValue(7, 1);
        TTVideoEngine.setIntValue(8, 1);
        TTVideoEngine.setIntValue(90, 0);
        TTVideoEngine.setIntValue(91, 2);
        TTVideoEngine.setIntValue(92, 1);
        TTVideoEngine.setIntValue(1, 314572800);
    }

    @Override // com.ss.android.lark.player.player.config.BaseConfigStrategy
    /* renamed from: c */
    public TTVideoEngine mo178486c() {
        HashMap hashMap = new HashMap();
        hashMap.put("enable_looper", true);
        TTVideoEngine tTVideoEngine = new TTVideoEngine(LarkContext.getApplication(), 0, hashMap);
        tTVideoEngine.setIntOption(7, 1);
        tTVideoEngine.setAsyncInit(true, 0);
        tTVideoEngine.setIntOption(12, 0);
        tTVideoEngine.setIntOption(11, 0);
        tTVideoEngine.setIntOption(322, 1);
        tTVideoEngine.setCacheControlEnabled(true);
        tTVideoEngine.setIntOption(0, 360);
        tTVideoEngine.setIntOption(SmEvents.EVENT_HBRESET, 1);
        tTVideoEngine.setIntOption(954, 104857600);
        tTVideoEngine.setIntOption(561, 1);
        tTVideoEngine.setIntOption(204, 1);
        tTVideoEngine.setIntOption(482, 1);
        tTVideoEngine.setIntOption(509, 1);
        if (LarkPlayerUtils.m202131a()) {
            tTVideoEngine.setIntOption(472, 1);
        }
        tTVideoEngine.setIntOption(4, 0);
        tTVideoEngine.setIntOption(6, 1);
        tTVideoEngine.setIntOption(160, 1);
        tTVideoEngine.setIntOption(21, 1);
        return tTVideoEngine;
    }
}
