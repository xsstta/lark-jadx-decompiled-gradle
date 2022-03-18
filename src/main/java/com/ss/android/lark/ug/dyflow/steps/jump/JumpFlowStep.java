package com.ss.android.lark.ug.dyflow.steps.jump;

import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.lark.guide.statistics.OnboardingHitPoint;
import com.ss.android.lark.ug.dyflow.common.BaseFlowStep;
import com.ss.android.lark.ug.dyflow.common.IFlow;
import com.ss.android.lark.ug.dyflow.common.data.FlowSlotData;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import com.ss.android.lark.ug.dyflow.steps.StepsUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/jump/JumpFlowStep;", "Lcom/ss/android/lark/ug/dyflow/common/BaseFlowStep;", "flow", "Lcom/ss/android/lark/ug/dyflow/common/IFlow;", "flowStepDataData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "(Lcom/ss/android/lark/ug/dyflow/common/IFlow;Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;)V", "jumpTabKey", "", "statJumpType", "doJumpAction", "", "doJumpNextAction", "getMustKeys", "", "onExec", "parseJumpParams", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.steps.b.a */
public final class JumpFlowStep extends BaseFlowStep {

    /* renamed from: b */
    public static final Companion f141532b = new Companion(null);

    /* renamed from: c */
    private String f141533c;

    /* renamed from: d */
    private String f141534d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/jump/JumpFlowStep$Companion;", "", "()V", "JUMP_CHAT", "", "JUMP_TAB", "STAT_JUMP_TYPE", "TAB_KEY", "TAG", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.ug.dyflow.common.BaseFlowStep
    /* renamed from: c */
    public List<String> mo194766c() {
        return CollectionsKt.emptyList();
    }

    /* renamed from: h */
    private final void m222883h() {
        BaseFlowStep.m222634a(this, "jump_next_action", false, 2, null);
    }

    /* renamed from: g */
    private final void m222882g() {
        BaseFlowStep.m222634a(this, "jump_action", false, 2, null);
        String str = this.f141534d;
        if (str != null) {
            OnboardingHitPoint.f99379a.mo141616d(str);
        }
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlowStep
    /* renamed from: f */
    public void mo194919f() {
        m222884i();
        StepsUtils.Companion aVar = StepsUtils.f141524a;
        String str = this.f141533c;
        if (str == null) {
            str = "";
        }
        aVar.mo194970a(str);
        StepsUtils.f141524a.mo194969a(mo194767d());
        m222882g();
        m222883h();
    }

    /* renamed from: i */
    private final void m222884i() {
        boolean z;
        FlowSlotData c = mo194768e().mo194836c("jump_action");
        if (c != null) {
            String f = c.mo194821f();
            if (f == null || f.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String f2 = c.mo194821f();
                String str = "";
                if (f2 == null) {
                    f2 = str;
                }
                Uri parse = Uri.parse(f2);
                Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
                if (TextUtils.equals("tab", parse.getLastPathSegment())) {
                    String queryParameter = parse.getQueryParameter("tabKey");
                    if (queryParameter == null) {
                        queryParameter = str;
                    }
                    this.f141533c = queryParameter;
                }
                String queryParameter2 = parse.getQueryParameter("ug_onboarding_jump_type");
                if (queryParameter2 != null) {
                    str = queryParameter2;
                }
                this.f141534d = str;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JumpFlowStep(IFlow dVar, FlowStepData flowStepData) {
        super(dVar, flowStepData);
        Intrinsics.checkParameterIsNotNull(dVar, "flow");
        Intrinsics.checkParameterIsNotNull(flowStepData, "flowStepDataData");
    }
}
