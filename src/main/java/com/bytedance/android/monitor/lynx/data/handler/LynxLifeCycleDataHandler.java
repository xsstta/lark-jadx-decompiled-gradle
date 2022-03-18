package com.bytedance.android.monitor.lynx.data.handler;

import com.bytedance.android.monitor.lynx.data.entity.LynxLifecycleData;
import com.lynx.tasm.LynxView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/android/monitor/lynx/data/handler/LynxLifeCycleDataHandler;", "Lcom/bytedance/android/monitor/lynx/data/handler/AbsMonitorDataHandler;", "Lcom/bytedance/android/monitor/lynx/data/entity/LynxLifecycleData;", "()V", "getNewData", "view", "Lcom/lynx/tasm/LynxView;", "lynx_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.android.monitor.lynx.b.b.d */
public final class LynxLifeCycleDataHandler extends AbsMonitorDataHandler<LynxLifecycleData> {
    /* renamed from: c */
    public LynxLifecycleData mo11536a(LynxView lynxView) {
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        return new LynxLifecycleData();
    }
}
