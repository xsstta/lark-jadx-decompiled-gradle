package com.bytedance.ee.bear.onboarding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/PendingTask;", "Lcom/bytedance/ee/bear/onboarding/Task;", "requiredMissionId", "", "(Ljava/lang/String;)V", "getRequiredMissionId", "()Ljava/lang/String;", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.onboarding.e */
final class PendingTask extends Task {

    /* renamed from: a */
    private final String f27927a;

    /* renamed from: a */
    public final String mo39544a() {
        return this.f27927a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PendingTask(String str) {
        super(null);
        Intrinsics.checkParameterIsNotNull(str, "requiredMissionId");
        this.f27927a = str;
    }
}
