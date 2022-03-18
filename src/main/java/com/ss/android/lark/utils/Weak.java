package com.ss.android.lark.utils;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0002\u0010\u0005J&\u0010\b\u001a\u0004\u0018\u00018\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002¢\u0006\u0002\u0010\fJ.\u0010\r\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u0010\u0010R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/utils/Weak;", "T", "", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "weakRef", "Ljava/lang/ref/WeakReference;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "value", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.utils.ap */
public final class Weak<T> {

    /* renamed from: a */
    private WeakReference<T> f142364a;

    public Weak(Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "initializer");
        this.f142364a = new WeakReference<>(function0.invoke());
    }

    /* renamed from: a */
    public final T mo196112a(Object obj, KProperty<?> kProperty) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        return this.f142364a.get();
    }
}
