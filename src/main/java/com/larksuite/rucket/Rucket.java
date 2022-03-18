package com.larksuite.rucket;

import com.larksuite.rucket.core.RucketImpl;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\u0007¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/larksuite/rucket/Rucket;", "", "()V", "create", "T", "service", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "registerStrategy", "", "strategy", "Lcom/larksuite/rucket/core/base/AbstractStrategy;", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.a */
public final class Rucket {

    /* renamed from: a */
    public static final Rucket f64969a = new Rucket();

    private Rucket() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final <T> T m95345a(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "service");
        return (T) RucketImpl.f64972a.mo93448a(cls);
    }
}
