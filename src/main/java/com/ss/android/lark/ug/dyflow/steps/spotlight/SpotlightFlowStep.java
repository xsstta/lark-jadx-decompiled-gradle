package com.ss.android.lark.ug.dyflow.steps.spotlight;

import com.ss.android.lark.guide.p1912b.p1914b.C38560a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.C57345a;
import com.ss.android.lark.ug.dyflow.common.BaseFlowStep;
import com.ss.android.lark.ug.dyflow.common.IFlow;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import com.ss.android.lark.ug.p2859c.AbstractC57392a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/spotlight/SpotlightFlowStep;", "Lcom/ss/android/lark/ug/dyflow/common/BaseFlowStep;", "flow", "Lcom/ss/android/lark/ug/dyflow/common/IFlow;", "flowStepDataData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "(Lcom/ss/android/lark/ug/dyflow/common/IFlow;Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;)V", "getMustKeys", "", "", "onExec", "", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.steps.c.b */
public final class SpotlightFlowStep extends BaseFlowStep {

    /* renamed from: b */
    public static final Companion f141546b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/spotlight/SpotlightFlowStep$Companion;", "", "()V", "TAG", "", "tryLockGuide", "", "unLockGuide", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.c.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: b */
        public final void mo194996b() {
            C38560a.m152076a().mo141286b("all_new_onboarding_guide");
            AbstractC57392a a = C57345a.m222261a();
            Intrinsics.checkExpressionValueIsNotNull(a, "UGModule.getDependency()");
            a.mo194676h().mo194678b("all_new_onboarding_guide");
        }

        /* renamed from: a */
        public final boolean mo194995a() {
            if (C38560a.m152076a().mo141284a("all_new_onboarding_guide")) {
                AbstractC57392a a = C57345a.m222261a();
                Intrinsics.checkExpressionValueIsNotNull(a, "UGModule.getDependency()");
                if (a.mo194676h().mo194677a("all_new_onboarding_guide")) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.ug.dyflow.common.BaseFlowStep
    /* renamed from: c */
    public List<String> mo194766c() {
        return CollectionsKt.listOf((Object[]) new String[]{"spotlight_next", "spotlight_previous", "spotlight_complete"});
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlowStep
    /* renamed from: f */
    public void mo194919f() {
        if (!f141546b.mo194995a()) {
            Log.m165389i("DyFlow", "SpotlightFlowStep, checkToShow=false");
        } else {
            Spotlight.f141535c.mo194989a(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpotlightFlowStep(IFlow dVar, FlowStepData flowStepData) {
        super(dVar, flowStepData);
        Intrinsics.checkParameterIsNotNull(dVar, "flow");
        Intrinsics.checkParameterIsNotNull(flowStepData, "flowStepDataData");
    }
}
