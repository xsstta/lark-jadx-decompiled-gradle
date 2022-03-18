package com.ss.android.lark.ug.scheduler.common.exception;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\b \u0018\u00002\u00060\u0001j\u0002`\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\tJ\b\u0010\u0011\u001a\u00020\tH&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/common/exception/SchedulerException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorInfo", "Lcom/ss/android/lark/ug/scheduler/common/exception/SchedulerMetricInfo;", "cause", "", "extraInfo", "", "", "(Lcom/ss/android/lark/ug/scheduler/common/exception/SchedulerMetricInfo;Ljava/lang/Throwable;Ljava/util/Map;)V", "getExtraInfo", "()Ljava/util/Map;", "setExtraInfo", "(Ljava/util/Map;)V", "getErrorCode", "getErrorMessage", "getMetricKey", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
public abstract class SchedulerException extends Exception {
    private final SchedulerMetricInfo errorInfo;
    private Map<String, String> extraInfo;

    public abstract String getMetricKey();

    public final Map<String, String> getExtraInfo() {
        return this.extraInfo;
    }

    public final String getErrorCode() {
        return this.errorInfo.getErrorCode();
    }

    public final String getErrorMessage() {
        return this.errorInfo.getErrorMessage();
    }

    public final void setExtraInfo(Map<String, String> map) {
        this.extraInfo = map;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SchedulerException(SchedulerMetricInfo aVar, Throwable th, Map<String, String> map) {
        super(aVar.getErrorMessage(), th);
        Intrinsics.checkParameterIsNotNull(aVar, "errorInfo");
        this.errorInfo = aVar;
        this.extraInfo = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SchedulerException(SchedulerMetricInfo aVar, Throwable th, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : map);
    }
}
