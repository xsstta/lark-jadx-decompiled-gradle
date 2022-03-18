package com.ss.android.lark.ug.scheduler.common.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/common/exception/RuleException;", "Lcom/ss/android/lark/ug/scheduler/common/exception/SchedulerException;", "errorInfo", "Lcom/ss/android/lark/ug/scheduler/common/exception/RuleMetricErrorInfo;", "cause", "", "(Lcom/ss/android/lark/ug/scheduler/common/exception/RuleMetricErrorInfo;Ljava/lang/Throwable;)V", "getMetricKey", "", "Companion", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class RuleException extends SchedulerException {
    public static final Companion Companion = new Companion(null);

    @Override // com.ss.android.lark.ug.scheduler.common.exception.SchedulerException
    public String getMetricKey() {
        return "ug_reach_local_rule_error";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/common/exception/RuleException$Companion;", "", "()V", "METRIC_KEY", "", "VALUE_KEY", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.scheduler.common.exception.RuleException$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RuleException(RuleMetricErrorInfo ruleMetricErrorInfo, Throwable th) {
        super(ruleMetricErrorInfo, th, null, 4, null);
        Intrinsics.checkParameterIsNotNull(ruleMetricErrorInfo, "errorInfo");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RuleException(RuleMetricErrorInfo ruleMetricErrorInfo, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ruleMetricErrorInfo, (i & 2) != 0 ? null : th);
    }
}
