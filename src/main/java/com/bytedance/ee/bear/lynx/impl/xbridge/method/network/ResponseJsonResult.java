package com.bytedance.ee.bear.lynx.impl.xbridge.method.network;

import com.bytedance.ee.bear.contract.NetService;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/ResponseJsonResult;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "responseJson", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "getResponseJson", "()Lorg/json/JSONObject;", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ResponseJsonResult extends NetService.Result<Serializable> {
    public static final Companion Companion = new Companion(null);
    private final JSONObject responseJson;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/ResponseJsonResult$Companion;", "", "()V", "convert", "Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/ResponseJsonResult;", "json", "", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.network.ResponseJsonResult$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ResponseJsonResult mo33989a(String str) throws JSONException {
            Intrinsics.checkParameterIsNotNull(str, "json");
            JSONObject jSONObject = new JSONObject(str);
            ResponseJsonResult responseJsonResult = new ResponseJsonResult(jSONObject);
            int optInt = jSONObject.optInt("code");
            String optString = jSONObject.optString("msg", "");
            Intrinsics.checkExpressionValueIsNotNull(optString, "jsonObj.optString(\"msg\", \"\")");
            responseJsonResult.code = optInt;
            responseJsonResult.msg = optString;
            return responseJsonResult;
        }
    }

    public final JSONObject getResponseJson() {
        return this.responseJson;
    }

    public ResponseJsonResult(JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "responseJson");
        this.responseJson = jSONObject;
    }
}
