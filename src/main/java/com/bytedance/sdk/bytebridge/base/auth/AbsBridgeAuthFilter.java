package com.bytedance.sdk.bytebridge.base.auth;

import com.bytedance.sdk.bytebridge.base.context.AbsBridgeContext;
import com.bytedance.sdk.bytebridge.base.model.BridgeInfo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/auth/AbsBridgeAuthFilter;", "", "()V", "doAuth", "", "bridgeInfo", "Lcom/bytedance/sdk/bytebridge/base/model/BridgeInfo;", "bridgeContext", "Lcom/bytedance/sdk/bytebridge/base/context/AbsBridgeContext;", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.base.a.a */
public abstract class AbsBridgeAuthFilter {
    /* renamed from: a */
    public abstract boolean mo69777a(BridgeInfo bVar, AbsBridgeContext aVar);
}
