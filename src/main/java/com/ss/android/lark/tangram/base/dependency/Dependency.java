package com.ss.android.lark.tangram.base.dependency;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/tangram/base/dependency/Dependency;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.tangram.base.c.a */
public final class Dependency {

    /* renamed from: a */
    private final Context f136630a;

    /* renamed from: a */
    public final Context mo188743a() {
        return this.f136630a;
    }

    public Dependency(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f136630a = context;
    }
}
