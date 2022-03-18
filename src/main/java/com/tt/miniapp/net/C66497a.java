package com.tt.miniapp.net;

import com.bytedance.ee.lark.infra.config.mina.keys.Settings;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.tt.miniapphost.AppbrandContext;

/* renamed from: com.tt.miniapp.net.a */
public class C66497a {
    /* renamed from: a */
    public static String m259866a() {
        return C12738a.m52723a(AppbrandContext.getInst().getApplicationContext(), "default", Settings.BDP_TTREQUEST_CONFIG, Settings.BdpTtRequestConfig.REQUEST_TYPE);
    }
}
