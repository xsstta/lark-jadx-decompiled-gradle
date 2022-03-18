package com.bytedance.ee.lark.infra.network.p622a.p623a.p625b;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* renamed from: com.bytedance.ee.lark.infra.network.a.a.b.b */
public final class C12802b {
    /* renamed from: a */
    public static InetAddress m52890a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return InetAddress.getByName(str);
        } catch (UnknownHostException e) {
            AppBrandLogger.m52829e("tma_NetAddressUtil", e.getMessage());
            return null;
        }
    }
}
