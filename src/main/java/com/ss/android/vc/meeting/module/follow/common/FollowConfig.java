package com.ss.android.vc.meeting.module.follow.common;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.VCSettingsService;
import com.ss.android.vc.net.service.VcBizService;
import java.io.Serializable;

public class FollowConfig {

    /* renamed from: a */
    public static volatile boolean f155113a;

    /* renamed from: b */
    private static DegradationConfig f155114b;

    /* renamed from: c */
    private static int f155115c;

    public static class DegradationConfig implements Serializable {
        public int least_system_memory;
        public int least_system_sdk_int;
    }

    /* renamed from: c */
    public static void m241447c() {
        if (!f155113a) {
            VcBizService.modifyVideoChatUserSetting(4, m241446b(), new AbstractC63598b() {
                /* class com.ss.android.vc.meeting.module.follow.common.FollowConfig.C618021 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onSuccess(Object obj) {
                    FollowConfig.f155113a = true;
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("FollowLog_FollowConfig", "[reportDegradationToServer]", "error = " + eVar);
                }
            });
        }
    }

    /* renamed from: b */
    public static boolean m241446b() {
        DegradationConfig a = m241445a();
        if (a == null) {
            C60700b.m235864f("FollowLog_FollowConfig", "[isFollowEnable]", "DegradationConfig is null, warning...");
            return false;
        }
        if (f155115c == 0) {
            f155115c = C61806b.m241469a(ar.m236694a());
        }
        if (f155115c < a.least_system_memory || Build.VERSION.SDK_INT < a.least_system_sdk_int) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static DegradationConfig m241445a() {
        DegradationConfig degradationConfig = f155114b;
        if (degradationConfig != null) {
            return degradationConfig;
        }
        String settings = VCSettingsService.getSettings("follow_degradation_config");
        if (TextUtils.isEmpty(settings)) {
            settings = "{\"least_system_memory\": 3500000, \"least_system_sdk_int\": 22}";
        }
        try {
            C60700b.m235851b("FollowLog_FollowConfig", "[getDegradationConfig]", "settings = " + settings);
            DegradationConfig degradationConfig2 = (DegradationConfig) JSON.parseObject(settings, DegradationConfig.class);
            if (degradationConfig2 == null || degradationConfig2.least_system_memory == 0 || degradationConfig2.least_system_sdk_int == 0) {
                degradationConfig2 = (DegradationConfig) JSON.parseObject("{\"least_system_memory\": 3500000, \"least_system_sdk_int\": 22}", DegradationConfig.class);
            }
            f155114b = degradationConfig2;
        } catch (Exception e) {
            C60700b.m235864f("FollowLog_FollowConfig", "[getDegradationConfig2]", e.getMessage());
            if (f155114b == null) {
                f155114b = (DegradationConfig) JSON.parseObject("{\"least_system_memory\": 3500000, \"least_system_sdk_int\": 22}", DegradationConfig.class);
            }
        }
        return f155114b;
    }
}
