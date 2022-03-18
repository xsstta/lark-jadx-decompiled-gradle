package com.ss.android.lark.ug.scheduler.rule.service.meta_rule;

import com.ss.android.lark.ug.scheduler.common.api.Storage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/rule/service/meta_rule/CountStrategy;", "Lcom/ss/android/lark/ug/scheduler/rule/service/meta_rule/BaseStrategy;", "storage", "Lcom/ss/android/lark/ug/scheduler/common/api/Storage;", "(Lcom/ss/android/lark/ug/scheduler/common/api/Storage;)V", "update", "", "reachPointAction", "Lcom/ss/android/lark/ug/scheduler/common/entity/ReachPointAction;", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.rule.b.a.c */
public final class CountStrategy extends BaseStrategy {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountStrategy(Storage dVar) {
        super(dVar);
        Intrinsics.checkParameterIsNotNull(dVar, "storage");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r0 != null) goto L_0x0024;
     */
    @Override // com.ss.android.lark.ug.scheduler.rule.service.meta_rule.Strategy
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo195366b(com.ss.android.lark.ug.scheduler.common.entity.ReachPointAction r4) {
        /*
            r3 = this;
            java.lang.String r0 = "reachPointAction"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            com.ss.android.lark.ug.scheduler.common.a.d r0 = r3.mo195364a()
            java.lang.Object r0 = r0.mo195270a(r4)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 == 0) goto L_0x0017
            r0.incrementAndGet()
            if (r0 == 0) goto L_0x0017
            goto L_0x0024
        L_0x0017:
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r2 = 1
            r1.<init>(r2)
            com.ss.android.lark.ug.scheduler.common.a.d r2 = r3.mo195364a()
            r2.mo195272a(r4, r1)
        L_0x0024:
            java.lang.String r4 = java.lang.String.valueOf(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.ug.scheduler.rule.service.meta_rule.CountStrategy.mo195366b(com.ss.android.lark.ug.scheduler.common.entity.a):java.lang.String");
    }
}
