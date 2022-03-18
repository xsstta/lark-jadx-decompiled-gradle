package com.ss.android.lark.platform.network.ttnet;

import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13996d;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.lark.biz.core.api.au;
import com.ss.android.lark.biz.core.api.av;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.platform.network.ttnet.d */
public class C51878d {
    /* renamed from: a */
    public static int m201199a() {
        return TTNetInit.getEffectiveConnectionType();
    }

    /* renamed from: b */
    public static au m201201b() {
        try {
            C13996d networkQuality = TTNetInit.getNetworkQuality();
            if (networkQuality != null) {
                return new au(networkQuality.f36674a, networkQuality.f36675b, networkQuality.f36676c);
            }
            return null;
        } catch (Exception e) {
            Log.m165386e("LarkTTNetModule", e);
            return null;
        }
    }

    /* renamed from: b */
    public static void m201202b(av avVar) {
        C51879e.m201203a().mo178056b(avVar);
    }

    /* renamed from: a */
    public static void m201200a(av avVar) {
        C51879e.m201203a().mo178055a(avVar);
    }
}
