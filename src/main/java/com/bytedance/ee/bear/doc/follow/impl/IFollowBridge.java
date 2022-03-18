package com.bytedance.ee.bear.doc.follow.impl;

import com.bytedance.ee.bear.doc.follow.AbstractC5426c;
import com.bytedance.ee.bear.doc.follow.FollowInvokeResult;
import com.bytedance.ee.bear.doc.follow.impl.rn.AbstractC5440a;
import com.bytedance.ee.bear.doc.follow.impl.rn.RNFollowEvent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J8\u0010\b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&J4\u0010\u0014\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH&J*\u0010\u001b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H&J$\u0010\u001d\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u0005H&¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/doc/follow/impl/IFollowBridge;", "", "destroy", "", "token", "", "getCallbackMap", "Lcom/bytedance/ee/bear/doc/follow/impl/FollowCallbackMapUtil;", "invoke", "funName", "paramJson", "metaJson", "callback", "Lcom/bytedance/ee/bear/doc/follow/FollowInvokeCallback;", "onEvent", "event", "Lcom/bytedance/ee/bear/doc/follow/impl/rn/RNFollowEvent;", "onInvokeResult", "result", "Lcom/bytedance/ee/bear/doc/follow/FollowInvokeResult;", "registerEventHandler", "module", "eventType", "handler", "Lcom/bytedance/ee/bear/doc/follow/impl/rn/RNEventHandler;", "outer", "", "sendEvent", "dataJson", "unRegisterEventHandler", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.doc.follow.impl.d */
public interface IFollowBridge {
    /* renamed from: a */
    FollowCallbackMapUtil mo21765a();

    /* renamed from: a */
    String mo21766a(String str, String str2, String str3, String str4, AbstractC5426c cVar);

    /* renamed from: a */
    void mo21767a(FollowInvokeResult followInvokeResult);

    /* renamed from: a */
    void mo21768a(RNFollowEvent rNFollowEvent);

    /* renamed from: a */
    void mo21769a(String str);

    /* renamed from: a */
    void mo21770a(String str, String str2, String str3);

    /* renamed from: a */
    void mo21771a(String str, String str2, String str3, AbstractC5440a aVar, boolean z);
}
