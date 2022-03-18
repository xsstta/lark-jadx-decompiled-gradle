package com.bytedance.sdk.bridge.model;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\b\"\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/bytedance/sdk/bridge/model/BridgeTmpInfo;", "", "subscriber", "isActive", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "(Ljava/lang/Object;ZLandroid/arch/lifecycle/Lifecycle;)V", "()Z", "setActive", "(Z)V", "getLifecycle", "()Landroid/arch/lifecycle/Lifecycle;", "getSubscriber", "()Ljava/lang/Object;", "bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.model.c */
public final class BridgeTmpInfo {

    /* renamed from: a */
    private final Object f50552a;

    /* renamed from: b */
    private boolean f50553b;

    /* renamed from: c */
    private final Lifecycle f50554c;

    /* renamed from: a */
    public final Object mo69772a() {
        return this.f50552a;
    }

    /* renamed from: b */
    public final Lifecycle mo69773b() {
        return this.f50554c;
    }

    public BridgeTmpInfo(Object obj, boolean z, Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(obj, "subscriber");
        this.f50552a = obj;
        this.f50553b = z;
        this.f50554c = lifecycle;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BridgeTmpInfo(Object obj, boolean z, Lifecycle lifecycle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : lifecycle);
    }
}
