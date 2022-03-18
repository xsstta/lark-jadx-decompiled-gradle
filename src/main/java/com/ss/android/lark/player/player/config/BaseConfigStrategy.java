package com.ss.android.lark.player.player.config;

import com.huawei.hms.location.ActivityIdentificationData;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.LarkContext;
import com.ss.ttvideoengine.TTVideoEngine;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/player/player/config/BaseConfigStrategy;", "", "()V", "configDNSHost", "", "configEngine", "Lcom/ss/ttvideoengine/TTVideoEngine;", "configLark", "configMDL", "videoview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.player.c.a.a */
public abstract class BaseConfigStrategy {
    /* renamed from: a */
    public abstract void mo178484a();

    /* renamed from: c */
    public abstract TTVideoEngine mo178486c();

    /* renamed from: b */
    public void mo178485b() {
        mo178487d();
        TTVideoEngine.setStringValue(0, C57881t.m224646r(LarkContext.getApplication()));
    }

    /* renamed from: d */
    private final void mo178487d() {
        String a = DynamicConfigModule.m145552b().mo136165a("tt_dns_server_host");
        TTVideoEngine.setTTDNSServerHost(a);
        TTVideoEngine.setStringValue(ActivityIdentificationData.WALKING, a);
        TTVideoEngine.setStringValue(108, DynamicConfigModule.m145552b().mo136165a("tt_google_dns"));
    }
}
