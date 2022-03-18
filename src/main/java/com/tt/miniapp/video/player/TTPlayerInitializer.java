package com.tt.miniapp.video.player;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.TTVideoEngine;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class TTPlayerInitializer {

    /* renamed from: a */
    private final String f169227a = "tma_TTPlayerInitializer";

    /* renamed from: b */
    private int f169228b;

    /* renamed from: c */
    private IAppContext f169229c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface TTPlayerType {
    }

    /* renamed from: a */
    public int mo233389a() {
        return 0;
    }

    /* renamed from: b */
    public TTVideoEngine mo233391b() {
        int a = mo233389a();
        this.f169228b = a;
        return mo233390a(a);
    }

    public TTPlayerInitializer(IAppContext iAppContext) {
        this.f169229c = iAppContext;
    }

    /* renamed from: a */
    public TTVideoEngine mo233390a(int i) {
        this.f169228b = i;
        TTVideoEngine tTVideoEngine = new TTVideoEngine(AppbrandContext.getInst().getApplicationContext(), i);
        tTVideoEngine.setIntOption(SmEvents.EVENT_NO, 1);
        tTVideoEngine.setTag("miniapp");
        tTVideoEngine.setSubTag("miniapp_appid:" + C67432a.m262319a(this.f169229c).getAppInfo().appId);
        return tTVideoEngine;
    }
}
