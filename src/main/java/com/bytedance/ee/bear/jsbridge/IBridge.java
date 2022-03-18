package com.bytedance.ee.bear.jsbridge;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH&J(\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/jsbridge/IBridge;", "", "addBridgeMsgInterceptor", "", "interceptor", "Lcom/bytedance/ee/bear/jsbridge/BridgeMsgInterceptor;", "bindBridgeHandler", "handlerName", "", "handler", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "dispatchBridgeMsg", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callBack", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "removeBridgeMsgInterceptor", "unbindBridgeHandler", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.jsbridge.i */
public interface IBridge {
    /* renamed from: a */
    void mo19348a(String str);

    /* renamed from: a */
    void mo19349a(String str, AbstractC7945d<?> dVar);

    /* renamed from: a */
    void mo19350a(String str, Object obj, AbstractC7947h hVar);
}
