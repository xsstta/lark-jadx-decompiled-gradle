package com.ss.ugc.effectplatform.exception;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/ugc/effectplatform/exception/StatusCodeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "detailMessage", "", "(ILjava/lang/String;)V", "getStatusCode", "()I", "setStatusCode", "(I)V", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class StatusCodeException extends Exception {
    private int statusCode;

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public StatusCodeException(int i, String str) {
        super(str);
        this.statusCode = i;
    }
}
