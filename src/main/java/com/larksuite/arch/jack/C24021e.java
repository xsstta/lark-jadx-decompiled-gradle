package com.larksuite.arch.jack;

import androidx.lifecycle.C1143ag;
import com.larksuite.rucket.job.base.RucketResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69388e;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a_\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0002\b\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"launch", "", "S", "Lcom/larksuite/arch/jack/State;", "Lcom/larksuite/arch/jack/JackViewModel;", "context", "Lkotlin/coroutines/CoroutineContext;", "start", "Lkotlinx/coroutines/CoroutineStart;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lcom/larksuite/arch/jack/JackViewModel;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)V", "unwrap", "Lcom/larksuite/arch/jack/Async;", "R", "Lcom/larksuite/rucket/job/base/RucketResult;", "jack-ext_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.larksuite.arch.jack.e */
public final class C24021e {
    /* renamed from: a */
    public static final <R> Async<R> m87795a(RucketResult<? extends R> bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "$this$unwrap");
        if (bVar instanceof RucketResult.Success) {
            return new Success(bVar.mo93490a());
        }
        if (bVar instanceof RucketResult.Error) {
            return new Fail(((RucketResult.Error) bVar).mo93493c());
        }
        return Uninitialized.f59411a;
    }

    /* renamed from: a */
    public static final <S extends State> void m87796a(JackViewModel<S> lVar, CoroutineContext fVar, CoroutineStart coroutineStart, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> kVar) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$launch");
        Intrinsics.checkParameterIsNotNull(fVar, "context");
        Intrinsics.checkParameterIsNotNull(coroutineStart, "start");
        Intrinsics.checkParameterIsNotNull(kVar, "block");
        C69388e.m266832b(C1143ag.m5356a(lVar), fVar, coroutineStart, kVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m87797a(JackViewModel lVar, CoroutineContext fVar, CoroutineStart coroutineStart, Function2 kVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        m87796a(lVar, fVar, coroutineStart, kVar);
    }
}
