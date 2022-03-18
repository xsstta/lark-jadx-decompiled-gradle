package com.bytedance.sdk.bytebridge.base.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0001HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/model/BridgeInfo;", "", "subscriber", "bridgeMethodInfo", "Lcom/bytedance/sdk/bytebridge/base/model/BridgeMethodInfo;", "(Ljava/lang/Object;Lcom/bytedance/sdk/bytebridge/base/model/BridgeMethodInfo;)V", "getBridgeMethodInfo", "()Lcom/bytedance/sdk/bytebridge/base/model/BridgeMethodInfo;", "getSubscriber", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.base.model.b */
public final class BridgeInfo {

    /* renamed from: a */
    private final Object f50610a;

    /* renamed from: b */
    private final C20685c f50611b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BridgeInfo)) {
            return false;
        }
        BridgeInfo bVar = (BridgeInfo) obj;
        return Intrinsics.areEqual(this.f50610a, bVar.f50610a) && Intrinsics.areEqual(this.f50611b, bVar.f50611b);
    }

    public int hashCode() {
        Object obj = this.f50610a;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        C20685c cVar = this.f50611b;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "BridgeInfo(subscriber=" + this.f50610a + ", bridgeMethodInfo=" + this.f50611b + ")";
    }

    /* renamed from: a */
    public final Object mo69832a() {
        return this.f50610a;
    }

    /* renamed from: b */
    public final C20685c mo69833b() {
        return this.f50611b;
    }

    public BridgeInfo(Object obj, C20685c cVar) {
        Intrinsics.checkParameterIsNotNull(obj, "subscriber");
        Intrinsics.checkParameterIsNotNull(cVar, "bridgeMethodInfo");
        this.f50610a = obj;
        this.f50611b = cVar;
    }
}
