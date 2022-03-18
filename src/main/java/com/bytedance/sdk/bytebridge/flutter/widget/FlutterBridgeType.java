package com.bytedance.sdk.bytebridge.flutter.widget;

import com.bytedance.sdk.bytebridge.base.model.SynchronizeType;
import com.bytedance.sdk.bytebridge.base.monitor.BridgeMonitorInfo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/sdk/bytebridge/flutter/widget/FlutterBridgeType;", "", "Lcom/bytedance/sdk/bytebridge/base/monitor/BridgeMonitorInfo$EventType;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCallType", "Lcom/bytedance/sdk/bytebridge/base/model/SynchronizeType;", "getEventName", "CALL", "ON", "flutter_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum FlutterBridgeType implements BridgeMonitorInfo.EventType {
    CALL("flutter_call"),
    ON("flutter_on");
    
    private final String value;

    @Override // com.bytedance.sdk.bytebridge.base.monitor.BridgeMonitorInfo.EventType
    public SynchronizeType getCallType() {
        return SynchronizeType.ASYNC;
    }

    public String getEventName() {
        return this.value;
    }

    private FlutterBridgeType(String str) {
        this.value = str;
    }
}
