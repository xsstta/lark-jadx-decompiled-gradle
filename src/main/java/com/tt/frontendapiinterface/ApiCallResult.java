package com.tt.frontendapiinterface;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.util.DebugUtil;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class ApiCallResult implements Parcelable {
    public static final Parcelable.Creator<ApiCallResult> CREATOR = new Parcelable.Creator<ApiCallResult>() {
        /* class com.tt.frontendapiinterface.ApiCallResult.C656811 */

        @Override // android.os.Parcelable.Creator
        public ApiCallResult[] newArray(int i) {
            return new ApiCallResult[i];
        }

        @Override // android.os.Parcelable.Creator
        public ApiCallResult createFromParcel(Parcel parcel) {
            return new ApiCallResult(parcel);
        }
    };
    private final boolean mIsFail;
    private final String mResult;
    private final JSONObject mResultJson;

    public int describeContents() {
        return 0;
    }

    public JSONObject getJson() {
        return this.mResultJson;
    }

    public boolean isFail() {
        return this.mIsFail;
    }

    public String toString() {
        return this.mResult;
    }

    public static class Builder {
        private final String mApiName;
        private int mErrorCode;
        private String mExtraInfo;
        private final boolean mIsFail;
        private JSONObject mResponseData;
        private final String mResult;

        public String toString() {
            AppBrandLogger.m52829e("ApiCallResult", "请避免使用 Builder 的 toString");
            return build().toString();
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x007e A[Catch:{ Exception -> 0x00d6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0098 A[Catch:{ Exception -> 0x00d6 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tt.frontendapiinterface.ApiCallResult build() {
            /*
            // Method dump skipped, instructions count: 236
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tt.frontendapiinterface.ApiCallResult.Builder.build():com.tt.frontendapiinterface.ApiCallResult");
        }

        public Builder errorCode(int i) {
            this.mErrorCode = i;
            return this;
        }

        public Builder extraInfo(String str) {
            this.mExtraInfo = str;
            return this;
        }

        public Builder responseData(JSONObject jSONObject) {
            this.mResponseData = jSONObject;
            return this;
        }

        public static Builder createFail(String str) {
            return new Builder(str, "fail");
        }

        public static Builder createOk(String str) {
            return new Builder(str, "ok");
        }

        public Builder extraInfo(Throwable th) {
            this.mExtraInfo = ApiCallResultHelper.generateThrowableExtraInfo(th);
            return this;
        }

        public Builder responseData(HashMap<String, Object> hashMap) {
            this.mResponseData = ApiCallResultHelper.generateJsonObjectResponseData(hashMap);
            return this;
        }

        public static Builder createCancel(String str) {
            return createFail(str, ApiCode.GENERAL_CANCEL.msg, ApiCode.GENERAL_CANCEL.code);
        }

        public static Builder createOk(String str, JSONObject jSONObject) {
            return new Builder(str, "ok").responseData(jSONObject);
        }

        private Builder(String str, String str2) {
            boolean z;
            this.mApiName = str;
            this.mResult = str2;
            if (str2 == "fail") {
                z = true;
            } else {
                z = false;
            }
            this.mIsFail = z;
        }

        public Builder appendResponseData(String str, Object obj) {
            if (this.mResponseData == null) {
                this.mResponseData = new JSONObject();
            }
            try {
                this.mResponseData.put(str, obj);
            } catch (Exception e) {
                AppBrandLogger.m52829e("ApiCallResult", "append", e);
            }
            return this;
        }

        public static Builder createFail(String str, String str2, int i) {
            return new Builder(str, "fail").extraInfo(str2).errorCode(i);
        }

        private static String buildErrMsg(String str, String str2, String str3) {
            if (TextUtils.isEmpty(str3)) {
                return str + ":" + str2;
            }
            return str + ":" + str2 + " " + str3;
        }
    }

    protected ApiCallResult(Parcel parcel) {
        JSONObject jSONObject;
        String readString = parcel.readString();
        if (readString == null) {
            DebugUtil.outputError("ApiCallResult", "读取到空的 Api 执行结果");
            readString = "";
        }
        try {
            jSONObject = new JSONObject(readString);
        } catch (JSONException e) {
            JSONObject jSONObject2 = new JSONObject();
            DebugUtil.outputError("ApiCallResult", "从执行结果解析为 JsonObject 时异常 result：", readString, e);
            jSONObject = jSONObject2;
        }
        this.mResult = readString;
        this.mResultJson = jSONObject;
        this.mIsFail = readString.contains(":fail");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mResult);
    }

    private ApiCallResult(JSONObject jSONObject, boolean z) {
        this.mResultJson = jSONObject;
        this.mResult = jSONObject.toString();
        this.mIsFail = z;
    }
}
