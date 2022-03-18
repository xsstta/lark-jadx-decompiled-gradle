package com.bytedance.sdk.bytebridge.base.result;

import com.bytedance.sdk.bytebridge.base.error.BridgeCallSuccess;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/result/BridgeSuccessResult;", "Lcom/bytedance/sdk/bytebridge/base/result/BridgeSyncResult;", "message", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lorg/json/JSONObject;", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.base.result.e */
final class BridgeSuccessResult extends BridgeSyncResult {
    public BridgeSuccessResult(String str, JSONObject jSONObject) {
        super(BridgeResultCode.SUCCESS.getValue(), BridgeCallSuccess.f50603a, str, jSONObject, null);
    }
}
