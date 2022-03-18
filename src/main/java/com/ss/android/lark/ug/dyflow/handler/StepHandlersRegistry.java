package com.ss.android.lark.ug.dyflow.handler;

import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import com.ss.android.lark.ug.dyflow.common.push.DyFlowPush;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u00020\u0007H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/handler/StepHandlersRegistry;", "", "()V", "pushDyFlowStepListener", "com/ss/android/lark/ug/dyflow/handler/StepHandlersRegistry$pushDyFlowStepListener$1", "Lcom/ss/android/lark/ug/dyflow/handler/StepHandlersRegistry$pushDyFlowStepListener$1;", "listenPush", "", "registerHandlers", "unListenPush", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.b.d */
public final class StepHandlersRegistry {

    /* renamed from: a */
    public static final StepHandlersRegistry f141374a = new StepHandlersRegistry();

    /* renamed from: b */
    private static final C57420a f141375b = new C57420a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/ug/dyflow/handler/StepHandlersRegistry$pushDyFlowStepListener$1", "Lcom/ss/android/lark/ug/dyflow/common/push/DyFlowPush$IPushDyFlowStepListener;", "onPushStepData", "", "stepData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.b.d$a */
    public static final class C57420a implements DyFlowPush.IPushDyFlowStepListener {
        C57420a() {
        }

        @Override // com.ss.android.lark.ug.dyflow.common.push.DyFlowPush.IPushDyFlowStepListener
        /* renamed from: a */
        public void mo194719a(FlowStepData flowStepData) {
            Intrinsics.checkParameterIsNotNull(flowStepData, "stepData");
            SingleStepDispatcher.f141372a.mo194717a(flowStepData);
        }
    }

    private StepHandlersRegistry() {
    }

    /* renamed from: b */
    private final void m222602b() {
        DyFlowPush.f141394b.mo194771a().mo194769a(f141375b);
    }

    /* renamed from: a */
    public final void mo194718a() {
        m222602b();
        SingleStepDispatcher.f141372a.mo194716a(new AlertDialogStepHandler());
        SingleStepDispatcher.f141372a.mo194716a(new ReminderStepHandler());
    }
}
