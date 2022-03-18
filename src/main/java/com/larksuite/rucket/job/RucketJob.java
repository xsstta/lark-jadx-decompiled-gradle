package com.larksuite.rucket.job;

import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.rucket.job.base.IRucketJobChain;
import com.larksuite.rucket.job.base.RucketResult;
import com.larksuite.rucket.job.extension.RucketJobIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Dispatchers;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH&JD\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\n\u001a\u00020\u000b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\rH&ø\u0001\u0000¢\u0006\u0002\u0010\u0011J&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0007JP\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0000\"\u0004\b\u0001\u0010\u00142\b\b\u0002\u0010\n\u001a\u00020\u000b2(\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\rH&ø\u0001\u0000¢\u0006\u0002\u0010\u0011J2\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0000\"\u0004\b\u0001\u0010\u00152\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00150\u0016H\u0007J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&J\b\u0010\u0018\u001a\u00020\u0019H&J\u0015\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u001bH¦\u0002JD\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u0000\"\u0004\b\u0001\u0010\u001d2\b\b\u0002\u0010\n\u001a\u00020\u000b2$\u0010\f\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u0001H\u001d0\u001ej\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u001d`\u001fH&J2\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u0000\"\u0004\b\u0001\u0010\u001d2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u001d0 H\u0007J\u0019\u0010!\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0002\u0010\"J\u001b\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00018\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010%JD\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\n\u001a\u00020\u000b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\rH&ø\u0001\u0000¢\u0006\u0002\u0010\u0011J&\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0007J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000)H&\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcom/larksuite/rucket/job/RucketJob;", "T", "Lcom/larksuite/rucket/job/base/IRucketJobChain;", "()V", "awaitGet", "Lcom/larksuite/rucket/job/base/RucketResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "", "error", "context", "Lkotlin/coroutines/CoroutineContext;", C14002h.f36692e, "Lkotlin/Function2;", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lcom/larksuite/rucket/job/RucketJob;", "Lcom/larksuite/rucket/job/compat/IErrorHandlerCompat;", "flatMap", "U", "V", "Lcom/larksuite/rucket/job/compat/IResultHandlerCompat;", "get", "isCanceled", "", "iterator", "Lcom/larksuite/rucket/job/extension/RucketJobIterator;", "map", "D", "Lkotlin/Function1;", "Lcom/larksuite/rucket/job/compat/IMapFunction;", "Lcom/larksuite/rucket/job/compat/IMapFunctionCompat;", "setError", "(Lcom/larksuite/framework/callback/Entity/ErrorResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setResult", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "then", "Lcom/larksuite/rucket/job/compat/IResultHandlerVoidCompat;", "toFlow", "Lkotlinx/coroutines/flow/Flow;", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.job.a */
public abstract class RucketJob<T> implements IRucketJobChain<RucketJob<?>> {
    /* renamed from: a */
    public abstract <D> RucketJob<D> mo93480a(CoroutineContext fVar, Function1<? super T, ? extends D> function1);

    /* renamed from: a */
    public abstract RucketJob<T> mo93481a(CoroutineContext fVar, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> kVar);

    /* renamed from: a */
    public abstract Object mo93482a(ErrorResult errorResult, Continuation<? super Unit> cVar);

    /* renamed from: a */
    public abstract Object mo93483a(T t, Continuation<? super Unit> cVar);

    /* renamed from: a */
    public abstract Object mo93484a(Continuation<? super RucketResult<? extends T>> cVar);

    /* renamed from: a */
    public abstract void mo93464a();

    /* renamed from: b */
    public abstract RucketJob<T> mo93485b(CoroutineContext fVar, Function2<? super ErrorResult, ? super Continuation<? super Unit>, ? extends Object> kVar);

    /* renamed from: d */
    public abstract boolean mo93486d();

    /* renamed from: e */
    public abstract RucketJobIterator<RucketResult<T>> mo93487e();

    /* renamed from: a */
    public static /* synthetic */ RucketJob m95400a(RucketJob aVar, CoroutineContext fVar, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                fVar = Dispatchers.m266325c();
            }
            return aVar.mo93480a(fVar, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: map");
    }

    /* renamed from: b */
    public static /* synthetic */ RucketJob m95402b(RucketJob aVar, CoroutineContext fVar, Function2 kVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                fVar = Dispatchers.m266325c();
            }
            return aVar.mo93485b(fVar, kVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
    }

    /* renamed from: a */
    public static /* synthetic */ RucketJob m95401a(RucketJob aVar, CoroutineContext fVar, Function2 kVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                fVar = Dispatchers.m266325c();
            }
            return aVar.mo93481a(fVar, kVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: then");
    }
}
