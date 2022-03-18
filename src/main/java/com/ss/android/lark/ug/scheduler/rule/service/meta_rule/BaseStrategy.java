package com.ss.android.lark.ug.scheduler.rule.service.meta_rule;

import com.ss.android.lark.ug.scheduler.common.api.Storage;
import com.ss.android.lark.ug.scheduler.common.entity.ReachPointAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/rule/service/meta_rule/BaseStrategy;", "Lcom/ss/android/lark/ug/scheduler/rule/service/meta_rule/Strategy;", "storage", "Lcom/ss/android/lark/ug/scheduler/common/api/Storage;", "(Lcom/ss/android/lark/ug/scheduler/common/api/Storage;)V", "getStorage", "()Lcom/ss/android/lark/ug/scheduler/common/api/Storage;", "getValue", "", "reachPointAction", "Lcom/ss/android/lark/ug/scheduler/common/entity/ReachPointAction;", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.rule.b.a.a */
public abstract class BaseStrategy implements Strategy {

    /* renamed from: a */
    private final Storage f141827a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Storage mo195364a() {
        return this.f141827a;
    }

    public BaseStrategy(Storage dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "storage");
        this.f141827a = dVar;
    }

    @Override // com.ss.android.lark.ug.scheduler.rule.service.meta_rule.Strategy
    /* renamed from: a */
    public String mo195365a(ReachPointAction aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "reachPointAction");
        Object a = this.f141827a.mo195270a(aVar);
        if (a != null) {
            return a.toString();
        }
        return null;
    }
}
