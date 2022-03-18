package com.larksuite.rucket.impl.base.push;

import com.squareup.wire.Message;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0014\b\u0000\u0010\u0007*\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\bj\u0002`\t2\u0006\u0010\n\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00050\fR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/larksuite/rucket/impl/base/push/PushCache;", "", "()V", "pushJobsMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/larksuite/rucket/impl/base/push/BasePushRucketJob;", "getOrPut", "T", "Lcom/squareup/wire/Message;", "Lcom/larksuite/rucket/impl/base/request/PBMessage;", "command", "action", "Lkotlin/Function0;", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.impl.base.a.b */
public final class PushCache {

    /* renamed from: a */
    public static final PushCache f64986a = new PushCache();

    /* renamed from: b */
    private static final ConcurrentHashMap<Object, BasePushRucketJob<?>> f64987b = new ConcurrentHashMap<>();

    private PushCache() {
    }

    /* renamed from: a */
    public final <T extends Message<?, ?>> BasePushRucketJob<T> mo93468a(Object obj, Function0<? extends BasePushRucketJob<T>> function0) {
        Object putIfAbsent;
        Intrinsics.checkParameterIsNotNull(obj, "command");
        Intrinsics.checkParameterIsNotNull(function0, "action");
        ConcurrentMap concurrentMap = f64987b;
        Object obj2 = concurrentMap.get(obj);
        if (obj2 == null && (putIfAbsent = concurrentMap.putIfAbsent(obj, (obj2 = (BasePushRucketJob) function0.invoke()))) != null) {
            obj2 = putIfAbsent;
        }
        if (obj2 != null) {
            return (BasePushRucketJob) obj2;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.larksuite.rucket.impl.base.push.BasePushRucketJob<T>");
    }
}
