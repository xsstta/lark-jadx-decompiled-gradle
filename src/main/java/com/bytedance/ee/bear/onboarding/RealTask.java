package com.bytedance.ee.bear.onboarding;

import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10387a;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d;
import com.bytedance.ee.bear.onboarding.export.ui.AbstractC10405c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/RealTask;", "UI", "Lcom/bytedance/ee/bear/onboarding/export/ui/OnBoardingUI;", "Lcom/bytedance/ee/bear/onboarding/Task;", "mission", "Lcom/bytedance/ee/bear/onboarding/export/mission/OnBoardingMission;", "ui", "(Lcom/bytedance/ee/bear/onboarding/export/mission/OnBoardingMission;Lcom/bytedance/ee/bear/onboarding/export/ui/OnBoardingUI;)V", "getMission", "()Lcom/bytedance/ee/bear/onboarding/export/mission/OnBoardingMission;", "nextMissionId", "", "getNextMissionId", "()Ljava/lang/String;", "getUi", "()Lcom/bytedance/ee/bear/onboarding/export/ui/OnBoardingUI;", "Lcom/bytedance/ee/bear/onboarding/export/ui/OnBoardingUI;", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.onboarding.f */
public final class RealTask<UI extends AbstractC10405c> extends Task {

    /* renamed from: a */
    private final AbstractC10397d<UI> f27971a;

    /* renamed from: b */
    private final UI f27972b;

    /* renamed from: b */
    public final AbstractC10397d<UI> mo39615b() {
        return this.f27971a;
    }

    /* renamed from: c */
    public final UI mo39616c() {
        return this.f27972b;
    }

    /* renamed from: a */
    public final String mo39614a() {
        AbstractC10397d<UI> dVar = this.f27971a;
        if (dVar instanceof AbstractC10387a) {
            return ((AbstractC10387a) dVar).mo39548d();
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealTask(AbstractC10397d<UI> dVar, UI ui) {
        super(null);
        Intrinsics.checkParameterIsNotNull(dVar, "mission");
        Intrinsics.checkParameterIsNotNull(ui, "ui");
        this.f27971a = dVar;
        this.f27972b = ui;
    }
}
