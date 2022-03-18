package com.bytedance.sdk.bytebridge.base.monitor;

import com.bytedance.sdk.bytebridge.base.ByteBridge;
import com.bytedance.sdk.bytebridge.base.utils.BridgeUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/monitor/BridgeMonitor;", "", "()V", "reportMonitorInfo", "", "monitorInfo", "Lcom/bytedance/sdk/bytebridge/base/monitor/BridgeMonitorInfo;", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.base.d.a */
public final class BridgeMonitor {

    /* renamed from: a */
    public static final BridgeMonitor f50581a = new BridgeMonitor();

    private BridgeMonitor() {
    }

    /* renamed from: a */
    public final void mo69806a(BridgeMonitorInfo bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "monitorInfo");
        IBridgeMonitorInterceptor c = ByteBridge.f50573b.mo69803b().mo69829c();
        if (c == null) {
            return;
        }
        if (BridgeUtils.f50598a.mo69820c()) {
            c.mo69812a(bVar);
        } else {
            c.mo69813b(bVar);
        }
    }
}
