package com.ss.android.lark.ug.scheduler.common.exception;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/common/exception/CoordinatorMetricErrorInfo;", "", "Lcom/ss/android/lark/ug/scheduler/common/exception/SchedulerMetricInfo;", "code", "", "message", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getErrorCode", "getErrorMessage", "INVALID_DATA", "MISS_NODE", "MISS_SCENARIO", "CYCLIC_GRAPH", GrsBaseInfo.CountryCodeSource.UNKNOWN, "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum CoordinatorMetricErrorInfo implements SchedulerMetricInfo {
    INVALID_DATA("101", "ug entity data is invalid!"),
    MISS_NODE("102", "ug node in missed!"),
    MISS_SCENARIO("103", "scenario missed!"),
    CYCLIC_GRAPH("201", "there is circle dependency in graph!"),
    UNKNOWN("500", "other error.");
    
    private final String code;
    private final String message;

    @Override // com.ss.android.lark.ug.scheduler.common.exception.SchedulerMetricInfo
    public String getErrorCode() {
        return this.code;
    }

    @Override // com.ss.android.lark.ug.scheduler.common.exception.SchedulerMetricInfo
    public String getErrorMessage() {
        return this.message;
    }

    private CoordinatorMetricErrorInfo(String str, String str2) {
        this.code = str;
        this.message = str2;
    }
}
