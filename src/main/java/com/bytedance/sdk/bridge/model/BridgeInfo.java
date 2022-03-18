package com.bytedance.sdk.bridge.model;

import androidx.lifecycle.Lifecycle;
import com.bytedance.sdk.bridge.C20666f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\f\"\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/bytedance/sdk/bridge/model/BridgeInfo;", "", "subscriber", "birdgeMethodinfo", "Lcom/bytedance/sdk/bridge/BridgeMethodInfo;", "isActive", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "(Ljava/lang/Object;Lcom/bytedance/sdk/bridge/BridgeMethodInfo;ZLandroid/arch/lifecycle/Lifecycle;)V", "getBirdgeMethodinfo", "()Lcom/bytedance/sdk/bridge/BridgeMethodInfo;", "()Z", "setActive", "(Z)V", "getLifecycle", "()Landroid/arch/lifecycle/Lifecycle;", "getSubscriber", "()Ljava/lang/Object;", "bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.model.a */
public final class BridgeInfo {

    /* renamed from: a */
    private final Object f50539a;

    /* renamed from: b */
    private final C20666f f50540b;

    /* renamed from: c */
    private boolean f50541c;

    /* renamed from: d */
    private final Lifecycle f50542d;

    /* renamed from: a */
    public final Object mo69767a() {
        return this.f50539a;
    }

    /* renamed from: b */
    public final C20666f mo69769b() {
        return this.f50540b;
    }

    /* renamed from: c */
    public final boolean mo69770c() {
        return this.f50541c;
    }

    /* renamed from: d */
    public final Lifecycle mo69771d() {
        return this.f50542d;
    }

    /* renamed from: a */
    public final void mo69768a(boolean z) {
        this.f50541c = z;
    }

    public BridgeInfo(Object obj, C20666f fVar, boolean z, Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(obj, "subscriber");
        Intrinsics.checkParameterIsNotNull(fVar, "birdgeMethodinfo");
        this.f50539a = obj;
        this.f50540b = fVar;
        this.f50541c = z;
        this.f50542d = lifecycle;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BridgeInfo(Object obj, C20666f fVar, boolean z, Lifecycle lifecycle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, fVar, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : lifecycle);
    }
}
