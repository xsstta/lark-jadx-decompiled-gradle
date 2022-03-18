package com.ss.android.lark.pin.impl.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/pin/impl/entity/PinSubscribeSetting;", "", "subscribe", "", "time", "", "(ZI)V", "getSubscribe", "()Z", "getTime", "()I", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.impl.entity.d */
public final class PinSubscribeSetting {

    /* renamed from: a */
    private final boolean f128197a;

    /* renamed from: b */
    private final int f128198b;

    public PinSubscribeSetting() {
        this(false, 0, 3, null);
    }

    public PinSubscribeSetting(boolean z, int i) {
        this.f128197a = z;
        this.f128198b = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PinSubscribeSetting(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? 8 : i);
    }
}
