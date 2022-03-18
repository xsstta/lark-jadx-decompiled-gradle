package com.larksuite.rucket.core.proxymethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0006\"\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/larksuite/rucket/core/proxymethod/EmptyProxyMethod;", "Lcom/larksuite/rucket/core/proxymethod/AbstractProxyMethod;", "()V", "invoke", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.core.proxymethod.c */
public final class EmptyProxyMethod implements AbstractProxyMethod {
    @Override // com.larksuite.rucket.core.proxymethod.AbstractProxyMethod
    /* renamed from: a */
    public Object mo93457a(Object... objArr) {
        Intrinsics.checkParameterIsNotNull(objArr, "args");
        return null;
    }
}
