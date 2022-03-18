package com.bytedance.sdk.bytebridge.base.result;

import com.bytedance.sdk.bytebridge.base.error.BridgeErrorType;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/result/BridgeErrorResult;", "Lcom/bytedance/sdk/bytebridge/base/result/BridgeSyncResult;", "code", "", "errorType", "Lcom/bytedance/sdk/bytebridge/base/error/BridgeErrorType;", "message", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lorg/json/JSONObject;", "(ILcom/bytedance/sdk/bytebridge/base/error/BridgeErrorType;Ljava/lang/String;Lorg/json/JSONObject;)V", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.base.result.d */
public final class BridgeErrorResult extends BridgeSyncResult {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BridgeErrorResult(int i, BridgeErrorType bVar, String str, JSONObject jSONObject) {
        super(i, bVar, str, jSONObject, null);
        Intrinsics.checkParameterIsNotNull(bVar, "errorType");
    }
}
