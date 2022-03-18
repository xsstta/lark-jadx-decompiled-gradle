package com.bytedance.sdk.bytebridge.base.auth;

import com.bytedance.sdk.bytebridge.base.context.AbsBridgeContext;
import com.bytedance.sdk.bytebridge.base.model.BridgeInfo;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/auth/AbsBridgeAuthenticator;", "", "()V", "authFilterChain", "Ljava/util/LinkedList;", "Lcom/bytedance/sdk/bytebridge/base/auth/AbsBridgeAuthFilter;", "addAuthFilter", "authFilter", "auth", "", "bridgeInfo", "Lcom/bytedance/sdk/bytebridge/base/model/BridgeInfo;", "bridgeContext", "Lcom/bytedance/sdk/bytebridge/base/context/AbsBridgeContext;", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.base.a.b */
public abstract class AbsBridgeAuthenticator {

    /* renamed from: a */
    private final LinkedList<AbsBridgeAuthFilter> f50558a = new LinkedList<>();

    /* renamed from: a */
    public final boolean mo69778a(BridgeInfo bVar, AbsBridgeContext aVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "bridgeInfo");
        Intrinsics.checkParameterIsNotNull(aVar, "bridgeContext");
        if (this.f50558a.isEmpty()) {
            return true;
        }
        Iterator<T> it = this.f50558a.iterator();
        while (it.hasNext()) {
            if (it.next().mo69777a(bVar, aVar)) {
                return true;
            }
        }
        return false;
    }
}
