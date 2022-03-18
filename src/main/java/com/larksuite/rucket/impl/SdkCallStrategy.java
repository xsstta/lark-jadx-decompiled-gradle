package com.larksuite.rucket.impl;

import com.larksuite.rucket.core.base.AbstractStrategy;
import com.larksuite.rucket.core.proxymethod.AbstractProxyMethod;
import com.larksuite.rucket.impl.sdkimpl.annotation.SdkCall;
import com.larksuite.rucket.impl.sdkimpl.proxymethod.SdkCallProxyMethod;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u001c\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/larksuite/rucket/impl/SdkCallStrategy;", "Lcom/larksuite/rucket/core/base/AbstractStrategy;", "()V", "annotationClazz", "Lkotlin/reflect/KClass;", "", "getAnnotationClazz", "()Lkotlin/reflect/KClass;", "proxyMethod", "Lcom/larksuite/rucket/core/proxymethod/AbstractProxyMethod;", "origin", "Ljava/lang/reflect/Method;", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.impl.a */
public final class SdkCallStrategy extends AbstractStrategy {

    /* renamed from: a */
    private final KClass<? extends Annotation> f64980a = Reflection.getOrCreateKotlinClass(SdkCall.class);

    @Override // com.larksuite.rucket.core.base.AbstractStrategy
    /* renamed from: a */
    public KClass<? extends Annotation> mo93455a() {
        return this.f64980a;
    }

    @Override // com.larksuite.rucket.core.base.AbstractStrategy
    /* renamed from: a */
    public AbstractProxyMethod mo93454a(Method method) {
        Intrinsics.checkParameterIsNotNull(method, "origin");
        return new SdkCallProxyMethod(method);
    }
}
