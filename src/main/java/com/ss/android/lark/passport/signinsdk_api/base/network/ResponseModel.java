package com.ss.android.lark.passport.signinsdk_api.base.network;

import com.alibaba.fastjson.JSONObject;
import com.google.firebase.messaging.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J-\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0004HÖ\u0001J\u0006\u0010%\u001a\u00020!J\t\u0010&\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\n\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u001e\u0010\u0012\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006'"}, d2 = {"Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "T", "Ljava/io/Serializable;", "code", "", "message", "", "originData", "Lcom/alibaba/fastjson/JSONObject;", "(ILjava/lang/String;Lcom/alibaba/fastjson/JSONObject;)V", "SUCCESS_CODE", "getSUCCESS_CODE", "()I", "biz_code", "getBiz_code", "setBiz_code", "(I)V", "getCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "getOriginData", "()Lcom/alibaba/fastjson/JSONObject;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "isSuccess", "toString", "signinsdk-api_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ResponseModel<T> implements Serializable {
    private final int SUCCESS_CODE;
    private int biz_code = -1;
    private final int code;
    private T data;
    private final String message;
    private final JSONObject originData;

    public static /* synthetic */ ResponseModel copy$default(ResponseModel responseModel, int i, String str, JSONObject jSONObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = responseModel.code;
        }
        if ((i2 & 2) != 0) {
            str = responseModel.message;
        }
        if ((i2 & 4) != 0) {
            jSONObject = responseModel.originData;
        }
        return responseModel.copy(i, str, jSONObject);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final JSONObject component3() {
        return this.originData;
    }

    public final ResponseModel<T> copy(int i, String str, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        Intrinsics.checkParameterIsNotNull(jSONObject, "originData");
        return new ResponseModel<>(i, str, jSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseModel)) {
            return false;
        }
        ResponseModel responseModel = (ResponseModel) obj;
        return this.code == responseModel.code && Intrinsics.areEqual(this.message, responseModel.message) && Intrinsics.areEqual(this.originData, responseModel.originData);
    }

    public int hashCode() {
        int i = this.code * 31;
        String str = this.message;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.originData;
        if (jSONObject != null) {
            i2 = jSONObject.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "ResponseModel(code=" + this.code + ", message=" + this.message + ", originData=" + this.originData + ")";
    }

    public final int getBiz_code() {
        return this.biz_code;
    }

    public final int getCode() {
        return this.code;
    }

    public final T getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final JSONObject getOriginData() {
        return this.originData;
    }

    public final int getSUCCESS_CODE() {
        return this.SUCCESS_CODE;
    }

    public final boolean isSuccess() {
        if (this.code == this.SUCCESS_CODE || this.data != null) {
            return true;
        }
        return false;
    }

    public final void setBiz_code(int i) {
        this.biz_code = i;
    }

    public final void setData(T t) {
        this.data = t;
    }

    public ResponseModel(int i, String str, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        Intrinsics.checkParameterIsNotNull(jSONObject, "originData");
        this.code = i;
        this.message = str;
        this.originData = jSONObject;
    }
}
