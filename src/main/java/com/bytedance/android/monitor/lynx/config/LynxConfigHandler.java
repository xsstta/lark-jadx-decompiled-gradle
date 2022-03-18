package com.bytedance.android.monitor.lynx.config;

import com.lynx.tasm.LynxView;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/android/monitor/lynx/config/LynxConfigHandler;", "Lcom/bytedance/android/monitor/lynx/config/IConfigHandler;", "()V", "configMap", "", "Lcom/lynx/tasm/LynxView;", "Lcom/bytedance/android/monitor/lynx/config/LynxMonitorConfig;", "get", "view", "put", "", "config", "lynx_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.android.monitor.lynx.a.a */
public final class LynxConfigHandler {

    /* renamed from: a */
    private final Map<LynxView, LynxMonitorConfig> f8443a = new WeakHashMap();

    /* renamed from: a */
    public LynxMonitorConfig mo11479a(LynxView lynxView) {
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        return this.f8443a.get(lynxView);
    }

    /* renamed from: a */
    public void mo11480a(LynxView lynxView, LynxMonitorConfig bVar) {
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        Intrinsics.checkParameterIsNotNull(bVar, "config");
        this.f8443a.put(lynxView, bVar);
    }
}
