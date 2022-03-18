package com.bytedance.sdk.bytebridge.web.widget;

import com.bytedance.sdk.bytebridge.base.model.SynchronizeType;
import com.bytedance.sdk.bytebridge.base.monitor.BridgeMonitorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/bytedance/sdk/bytebridge/web/widget/JsCallType;", "", "Lcom/bytedance/sdk/bytebridge/base/monitor/BridgeMonitorInfo$EventType;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCallType", "Lcom/bytedance/sdk/bytebridge/base/model/SynchronizeType;", "getEventName", "JS_CALL", "JS_CALL_SYNC", "JS_INVOKE", "JS_SCHEME", "JS_CALL_FROM_BRIDGE_SDK", "JS_CALL_SYNC_FROM_BRIDGE_SDK", "web_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum JsCallType implements BridgeMonitorInfo.EventType {
    JS_CALL("js_call"),
    JS_CALL_SYNC("js_call_sync"),
    JS_INVOKE("js_invoke"),
    JS_SCHEME("js_scheme"),
    JS_CALL_FROM_BRIDGE_SDK("js call from BridgeSDK"),
    JS_CALL_SYNC_FROM_BRIDGE_SDK("js call sync from BridgeSDK");
    
    private final String value;

    public String getEventName() {
        return this.value;
    }

    @Override // com.bytedance.sdk.bytebridge.base.monitor.BridgeMonitorInfo.EventType
    public SynchronizeType getCallType() {
        if (Intrinsics.areEqual(this.value, "js_call_sync")) {
            return SynchronizeType.SYNC;
        }
        return SynchronizeType.ASYNC;
    }

    private JsCallType(String str) {
        this.value = str;
    }
}
