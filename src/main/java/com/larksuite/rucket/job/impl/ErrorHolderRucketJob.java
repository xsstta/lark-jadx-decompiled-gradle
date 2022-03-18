package com.larksuite.rucket.job.impl;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.rucket.job.RucketJobImpl;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/larksuite/rucket/job/impl/ErrorHolderRucketJob;", "T", "Lcom/larksuite/rucket/job/RucketJobImpl;", ApiHandler.API_CALLBACK_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.job.c.b */
public final class ErrorHolderRucketJob<T> extends RucketJobImpl<T> {
    public ErrorHolderRucketJob(final Exception exc) {
        Intrinsics.checkParameterIsNotNull(exc, ApiHandler.API_CALLBACK_EXCEPTION);
        Job unused = C69553g.m266944a(this, null, null, new C263661(this, null), 3, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.larksuite.rucket.job.impl.ErrorHolderRucketJob$1", mo239173f = "ErrorHolderRucketJob.kt", mo239174i = {0, 0}, mo239175l = {20}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "err"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.larksuite.rucket.job.c.b$1 */
    static final class C263661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ ErrorHolderRucketJob this$0;

        {
            this.this$0 = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C263661 r0 = new C263661(this.this$0, exc, cVar);
            r0.p$ = (CoroutineScope) obj;
            return r0;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C263661) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ErrorResult errorResult;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                Exception exc = exc;
                if (exc instanceof ErrorResult) {
                    errorResult = (ErrorResult) exc;
                } else {
                    errorResult = new ErrorResult(exc);
                }
                ErrorHolderRucketJob bVar = this.this$0;
                this.L$0 = ahVar;
                this.L$1 = errorResult;
                this.label = 1;
                if (bVar.mo93482a(errorResult, (Continuation<? super Unit>) this) == a) {
                    return a;
                }
            } else if (i == 1) {
                ErrorResult errorResult2 = (ErrorResult) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }
}
