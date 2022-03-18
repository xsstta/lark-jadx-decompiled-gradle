package com.ss.android.lark.ug.scheduler.rule.service.meta_rule;

import com.ss.android.lark.ug.scheduler.common.api.Storage;
import com.ss.android.lark.ug.scheduler.common.entity.ReachPointAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/rule/service/meta_rule/ContentStrategy;", "Lcom/ss/android/lark/ug/scheduler/rule/service/meta_rule/BaseStrategy;", "storage", "Lcom/ss/android/lark/ug/scheduler/common/api/Storage;", "(Lcom/ss/android/lark/ug/scheduler/common/api/Storage;)V", "update", "", "reachPointAction", "Lcom/ss/android/lark/ug/scheduler/common/entity/ReachPointAction;", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.rule.b.a.b */
public final class ContentStrategy extends BaseStrategy {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentStrategy(Storage dVar) {
        super(dVar);
        Intrinsics.checkParameterIsNotNull(dVar, "storage");
    }

    @Override // com.ss.android.lark.ug.scheduler.rule.service.meta_rule.Strategy
    /* renamed from: b */
    public String mo195366b(ReachPointAction aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "reachPointAction");
        String c = aVar.mo195282c();
        Storage a = mo195364a();
        if (c != null) {
            a.mo195272a(aVar, c);
        } else {
            a.mo195273b(aVar);
        }
        return c;
    }
}
