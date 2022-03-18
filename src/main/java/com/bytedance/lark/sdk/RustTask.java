package com.bytedance.lark.sdk;

import com.bytedance.lark.sdk.util.GenerateID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/lark/sdk/RustTask;", "", "msg", "", "taskId", "", "([BJ)V", "getMsg", "()[B", "getTaskId", "()J", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.lark.sdk.k */
public final class RustTask {

    /* renamed from: a */
    private final byte[] f48407a;

    /* renamed from: b */
    private final long f48408b;

    /* renamed from: a */
    public final byte[] mo67195a() {
        return this.f48407a;
    }

    /* renamed from: b */
    public final long mo67196b() {
        return this.f48408b;
    }

    public RustTask(byte[] bArr, long j) {
        Intrinsics.checkParameterIsNotNull(bArr, "msg");
        this.f48407a = bArr;
        this.f48408b = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RustTask(byte[] bArr, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i & 2) != 0 ? GenerateID.f48386b.mo67172a() : j);
    }
}
