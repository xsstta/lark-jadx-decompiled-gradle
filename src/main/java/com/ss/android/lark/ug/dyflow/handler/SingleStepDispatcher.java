package com.ss.android.lark.ug.dyflow.handler;

import com.ss.android.lark.ug.apm.OnBoardingAppreciable;
import com.ss.android.lark.ug.apm.UGApm;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/handler/SingleStepDispatcher;", "", "()V", "stepDataHandlers", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/ug/dyflow/handler/SingleStepDispatcher$SingleStepHandler;", "addHandler", "", "handler", "dispatchData", "stepData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "removeHandler", "SingleStepHandler", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.b.c */
public final class SingleStepDispatcher {

    /* renamed from: a */
    public static final SingleStepDispatcher f141372a = new SingleStepDispatcher();

    /* renamed from: b */
    private static final CopyOnWriteArrayList<SingleStepHandler> f141373b = new CopyOnWriteArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/handler/SingleStepDispatcher$SingleStepHandler;", "", "onHandle", "", "stepData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.b.c$a */
    public interface SingleStepHandler {
        /* renamed from: a */
        boolean mo194715a(FlowStepData flowStepData);
    }

    private SingleStepDispatcher() {
    }

    /* renamed from: a */
    public final void mo194716a(SingleStepHandler aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "handler");
        CopyOnWriteArrayList<SingleStepHandler> copyOnWriteArrayList = f141373b;
        if (!copyOnWriteArrayList.contains(aVar)) {
            copyOnWriteArrayList.add(aVar);
        }
    }

    /* renamed from: a */
    public final void mo194717a(FlowStepData flowStepData) {
        Intrinsics.checkParameterIsNotNull(flowStepData, "stepData");
        Iterator<T> it = f141373b.iterator();
        while (it.hasNext()) {
            if (it.next().mo194715a(flowStepData)) {
                return;
            }
        }
        UGApm.DyFlow.f141198a.mo194474a(4, "push unknown step", String.valueOf(flowStepData.mo194828a()), flowStepData.mo194834b(), flowStepData.mo194837c());
        OnBoardingAppreciable.f141195a.mo194463a(4, "push unknown step", String.valueOf(flowStepData.mo194828a()), flowStepData.mo194834b(), flowStepData.mo194837c());
    }
}
