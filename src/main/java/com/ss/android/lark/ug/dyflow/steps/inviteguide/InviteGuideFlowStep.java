package com.ss.android.lark.ug.dyflow.steps.inviteguide;

import com.ss.android.lark.ug.C57345a;
import com.ss.android.lark.ug.dyflow.common.BaseFlowStep;
import com.ss.android.lark.ug.dyflow.common.IFlow;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import com.ss.android.lark.ug.p2859c.AbstractC57392a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/InviteGuideFlowStep;", "Lcom/ss/android/lark/ug/dyflow/common/BaseFlowStep;", "flow", "Lcom/ss/android/lark/ug/dyflow/common/IFlow;", "flowStepDataData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "(Lcom/ss/android/lark/ug/dyflow/common/IFlow;Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;)V", "getMustKeys", "", "", "onExec", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.steps.inviteguide.a */
public final class InviteGuideFlowStep extends BaseFlowStep {
    @Override // com.ss.android.lark.ug.dyflow.common.BaseFlowStep
    /* renamed from: c */
    public List<String> mo194766c() {
        return CollectionsKt.listOf((Object[]) new String[]{"invite_guide_title", "invite_guide_add"});
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlowStep
    /* renamed from: f */
    public void mo194919f() {
        AbstractC57392a a = C57345a.m222261a();
        AbstractC57392a a2 = C57345a.m222261a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "UGModule.getDependency()");
        a.mo194665a(a2.mo194672d());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteGuideFlowStep(IFlow dVar, FlowStepData flowStepData) {
        super(dVar, flowStepData);
        Intrinsics.checkParameterIsNotNull(dVar, "flow");
        Intrinsics.checkParameterIsNotNull(flowStepData, "flowStepDataData");
    }
}
