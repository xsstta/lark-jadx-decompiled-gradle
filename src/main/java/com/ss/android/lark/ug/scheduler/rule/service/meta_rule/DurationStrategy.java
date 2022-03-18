package com.ss.android.lark.ug.scheduler.rule.service.meta_rule;

import com.ss.android.lark.ug.scheduler.common.api.Storage;
import com.ss.android.lark.ug.scheduler.common.entity.ReachPointAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/rule/service/meta_rule/DurationStrategy;", "Lcom/ss/android/lark/ug/scheduler/rule/service/meta_rule/BaseStrategy;", "storage", "Lcom/ss/android/lark/ug/scheduler/common/api/Storage;", "(Lcom/ss/android/lark/ug/scheduler/common/api/Storage;)V", "getValue", "", "reachPointAction", "Lcom/ss/android/lark/ug/scheduler/common/entity/ReachPointAction;", "update", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.rule.b.a.d */
public final class DurationStrategy extends BaseStrategy {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DurationStrategy(Storage dVar) {
        super(dVar);
        Intrinsics.checkParameterIsNotNull(dVar, "storage");
    }

    @Override // com.ss.android.lark.ug.scheduler.rule.service.meta_rule.Strategy, com.ss.android.lark.ug.scheduler.rule.service.meta_rule.BaseStrategy
    /* renamed from: a */
    public String mo195365a(ReachPointAction aVar) {
        long j;
        Intrinsics.checkParameterIsNotNull(aVar, "reachPointAction");
        Long l = (Long) mo195364a().mo195270a(aVar);
        if (l != null) {
            l.longValue();
            j = System.currentTimeMillis() - l.longValue();
        } else {
            j = 0;
        }
        return String.valueOf(j);
    }

    @Override // com.ss.android.lark.ug.scheduler.rule.service.meta_rule.Strategy
    /* renamed from: b */
    public String mo195366b(ReachPointAction aVar) {
        long j;
        Intrinsics.checkParameterIsNotNull(aVar, "reachPointAction");
        Long l = (Long) mo195364a().mo195270a(aVar);
        if (l != null) {
            l.longValue();
            j = System.currentTimeMillis() - l.longValue();
        } else {
            mo195364a().mo195272a(aVar, Long.valueOf(Long.valueOf(System.currentTimeMillis()).longValue()));
            j = 0;
        }
        return String.valueOf(j);
    }
}
