package com.bytedance.android.monitor.lynx.data.handler;

import com.bytedance.android.monitor.lynx.LynxMonitor;
import com.bytedance.android.monitor.lynx.config.LynxMonitorConfig;
import com.bytedance.android.monitor.lynx.data.entity.LynxCommonData;
import com.lynx.tasm.LynxView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/android/monitor/lynx/data/handler/LynxCommonDataHandler;", "Lcom/bytedance/android/monitor/lynx/data/handler/AbsMonitorDataHandler;", "Lcom/bytedance/android/monitor/lynx/data/entity/LynxCommonData;", "()V", "createNewDataWithView", "view", "Lcom/lynx/tasm/LynxView;", "findLastDataWithView", "getNewData", "lynx_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.android.monitor.lynx.b.b.c */
public final class LynxCommonDataHandler extends AbsMonitorDataHandler<LynxCommonData> {
    /* renamed from: d */
    public synchronized LynxCommonData mo11535b(LynxView lynxView) {
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        return (LynxCommonData) super.mo11535b(lynxView);
    }

    /* renamed from: e */
    public synchronized LynxCommonData mo11534a(LynxView lynxView) {
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        return (LynxCommonData) super.mo11534a(lynxView);
    }

    /* renamed from: c */
    public LynxCommonData mo11536a(LynxView lynxView) {
        String str;
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        LynxMonitorConfig a = LynxMonitor.f8455b.mo11508a().mo11492a().mo11479a(lynxView);
        LynxCommonData aVar = new LynxCommonData();
        if (a == null || (str = a.mo11491i()) == null) {
            str = "";
        }
        aVar.f8411f = str;
        return aVar;
    }
}
