package com.bytedance.ee.bear.onboarding;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/Task;", "", "()V", "createTime", "", "getCreateTime", "()J", "Lcom/bytedance/ee/bear/onboarding/RealTask;", "Lcom/bytedance/ee/bear/onboarding/PendingTask;", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.onboarding.g */
public abstract class Task {

    /* renamed from: a */
    private final long f27973a;

    /* renamed from: d */
    public final long mo39617d() {
        return this.f27973a;
    }

    private Task() {
        this.f27973a = System.currentTimeMillis();
    }

    public /* synthetic */ Task(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
