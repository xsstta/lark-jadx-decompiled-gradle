package com.ss.android.lark.integrator.calendar.dependency.http;

import com.ss.android.lark.http.model.BaseResponseModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/http/CalendarHttpResponse;", "Lcom/ss/android/lark/http/model/BaseResponseModel;", "()V", "responseData", "", "getResponseData", "()Ljava/lang/String;", "setResponseData", "(Ljava/lang/String;)V", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarHttpResponse extends BaseResponseModel {
    private String responseData = "";

    public final String getResponseData() {
        return this.responseData;
    }

    public final void setResponseData(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.responseData = str;
    }
}
