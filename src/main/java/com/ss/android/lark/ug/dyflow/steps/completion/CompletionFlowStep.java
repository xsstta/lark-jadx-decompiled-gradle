package com.ss.android.lark.ug.dyflow.steps.completion;

import com.ss.android.lark.ug.dyflow.common.BaseFlowStep;
import com.ss.android.lark.ug.dyflow.common.IFlow;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import com.ss.android.lark.ug.dyflow.steps.StepsUtils;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0002¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/completion/CompletionFlowStep;", "Lcom/ss/android/lark/ug/dyflow/common/BaseFlowStep;", "flow", "Lcom/ss/android/lark/ug/dyflow/common/IFlow;", "flowStepDataData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "(Lcom/ss/android/lark/ug/dyflow/common/IFlow;Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;)V", "doCompletionAction", "", "getMustKeys", "", "", "onExec", "", "openMainActivityIfNeed", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.steps.a.a */
public final class CompletionFlowStep extends BaseFlowStep {
    /* renamed from: g */
    private final boolean m222861g() {
        return BaseFlowStep.m222634a(this, "completion_action", false, 2, null);
    }

    @Override // com.ss.android.lark.ug.dyflow.common.BaseFlowStep
    /* renamed from: c */
    public List<String> mo194766c() {
        List<String> emptyList = Collections.emptyList();
        Intrinsics.checkExpressionValueIsNotNull(emptyList, "Collections.emptyList()");
        return emptyList;
    }

    /* renamed from: h */
    private final void m222862h() {
        if (!StepsUtils.f141524a.mo194973b(mo194767d())) {
            StepsUtils.f141524a.mo194967a();
            StepsUtils.f141524a.mo194969a(mo194767d());
        }
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlowStep
    /* renamed from: f */
    public void mo194919f() {
        if (!m222861g()) {
            m222862h();
        }
        mo194767d().mo194745c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompletionFlowStep(IFlow dVar, FlowStepData flowStepData) {
        super(dVar, flowStepData);
        Intrinsics.checkParameterIsNotNull(dVar, "flow");
        Intrinsics.checkParameterIsNotNull(flowStepData, "flowStepDataData");
    }
}
