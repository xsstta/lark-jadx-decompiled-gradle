package com.bytedance.ee.larkwebview.bridge;

import android.webkit.WebView;
import com.alibaba.fastjson.JSON;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\bH\u0016J\u0018\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/larkwebview/bridge/BridgeExetension;", "", "()V", "getResponseJSData", "Lcom/bytedance/ee/larkwebview/bridge/ResponseJsData;", UpdateKey.STATUS, "Lcom/bytedance/ee/larkwebview/bridge/Status;", "callbackId", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "extraStr", "jsDataToMessage", "Lcom/bytedance/ee/larkwebview/bridge/Message;", "kotlin.jvm.PlatformType", "reqAuthWith", "", "webview", "Landroid/webkit/WebView;", "msg", "shouldMonitorHandlerConsumTime", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.bridge.b */
public class BridgeExetension {
    /* renamed from: a */
    public ResponseJsData mo35579a(Status status, String str, Object obj, String str2) {
        Intrinsics.checkParameterIsNotNull(status, UpdateKey.STATUS);
        Intrinsics.checkParameterIsNotNull(str, "callbackId");
        Intrinsics.checkParameterIsNotNull(str2, "extraStr");
        return null;
    }

    /* renamed from: a */
    public boolean mo49785a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo49786a(WebView webView, Message message) {
        Intrinsics.checkParameterIsNotNull(webView, "webview");
        Intrinsics.checkParameterIsNotNull(message, "msg");
        return true;
    }

    /* renamed from: a */
    public Message mo23541a(String str) {
        Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return (Message) JSON.parseObject(str, Message.class);
    }
}
