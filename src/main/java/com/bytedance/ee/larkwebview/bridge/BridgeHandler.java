package com.bytedance.ee.larkwebview.bridge;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J3\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00018\u0001H&¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/larkwebview/bridge/BridgeHandler;", "T", "D", "", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/larkwebview/bridge/JsCallBack;", "extraStr", "", "context", "(Ljava/lang/Object;Lcom/bytedance/ee/larkwebview/bridge/JsCallBack;Ljava/lang/String;Ljava/lang/Object;)V", "shouldRunInUIThread", "", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.bridge.c */
public interface BridgeHandler<T, D> {
    /* renamed from: a */
    void mo30815a(T t, JsCallBack gVar, String str, D d);

    /* renamed from: a */
    boolean mo30817a();
}
