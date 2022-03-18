package com.bytedance.android.monitor.lynx.data.handler;

import android.view.View;
import com.bytedance.android.monitor.p104a.AbstractC2629a;
import com.google.firebase.messaging.Constants;
import com.lynx.tasm.LynxView;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0005J\u0015\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\nJ\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000fR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/android/monitor/lynx/data/handler/AbsMonitorDataHandler;", "C", "Lcom/bytedance/android/monitor/base/BaseMonitorData;", "Lcom/bytedance/android/monitor/lynx/data/handler/IMonitorDataHandler;", "Lcom/lynx/tasm/LynxView;", "()V", "mCacheMap", "", "createNewDataWithView", "view", "(Lcom/lynx/tasm/LynxView;)Lcom/bytedance/android/monitor/base/BaseMonitorData;", "findLastDataWithView", "putDataWithView", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/lynx/tasm/LynxView;Lcom/bytedance/android/monitor/base/BaseMonitorData;)V", "lynx_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.android.monitor.lynx.b.b.a */
public abstract class AbsMonitorDataHandler<C extends AbstractC2629a> implements IMonitorDataHandler<LynxView, C> {

    /* renamed from: a */
    private final Map<LynxView, C> f8497a = new WeakHashMap();

    /* renamed from: b */
    public C mo11535b(LynxView lynxView) {
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        return this.f8497a.get(lynxView);
    }

    /* renamed from: a */
    public C mo11534a(LynxView lynxView) {
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        C a = mo11536a((View) lynxView);
        this.f8497a.put(lynxView, a);
        return a;
    }
}
