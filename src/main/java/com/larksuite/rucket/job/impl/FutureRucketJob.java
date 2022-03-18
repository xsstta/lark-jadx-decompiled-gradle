package com.larksuite.rucket.job.impl;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.rucket.job.RucketJob;
import com.larksuite.rucket.job.RucketJobImpl;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¨\u0006\t"}, d2 = {"Lcom/larksuite/rucket/job/impl/FutureRucketJob;", "T", "Lcom/larksuite/rucket/job/RucketJobImpl;", "Lcom/larksuite/rucket/job/base/IRucketJobDelegate;", "()V", "setOrigin", "", "origin", "Lcom/larksuite/rucket/job/RucketJob;", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.job.c.c */
public final class FutureRucketJob<T> extends RucketJobImpl<T> {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.larksuite.rucket.job.impl.FutureRucketJob$setOrigin$1", mo239173f = "FutureRucketJob.kt", mo239174i = {0}, mo239175l = {21}, mo239176m = "invokeSuspend", mo239177n = {"it"}, mo239178s = {"L$0"})
    /* renamed from: com.larksuite.rucket.job.c.c$a */
    public static final class C26367a extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private Object p$0;
        final /* synthetic */ FutureRucketJob this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26367a(FutureRucketJob cVar, Continuation cVar2) {
            super(2, cVar2);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C26367a aVar = new C26367a(this.this$0, cVar);
            aVar.p$0 = obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> cVar) {
            return ((C26367a) create(obj, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.larksuite.rucket.job.c.c */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                Object obj2 = this.p$0;
                FutureRucketJob cVar = this.this$0;
                this.L$0 = obj2;
                this.label = 1;
                if (cVar.mo93483a(obj2, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "it", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.larksuite.rucket.job.impl.FutureRucketJob$setOrigin$2", mo239173f = "FutureRucketJob.kt", mo239174i = {0}, mo239175l = {23}, mo239176m = "invokeSuspend", mo239177n = {"it"}, mo239178s = {"L$0"})
    /* renamed from: com.larksuite.rucket.job.c.c$b */
    public static final class C26368b extends SuspendLambda implements Function2<ErrorResult, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private ErrorResult p$0;
        final /* synthetic */ FutureRucketJob this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26368b(FutureRucketJob cVar, Continuation cVar2) {
            super(2, cVar2);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C26368b bVar = new C26368b(this.this$0, cVar);
            bVar.p$0 = (ErrorResult) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ErrorResult errorResult, Continuation<? super Unit> cVar) {
            return ((C26368b) create(errorResult, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                ErrorResult errorResult = this.p$0;
                FutureRucketJob cVar = this.this$0;
                this.L$0 = errorResult;
                this.label = 1;
                if (cVar.mo93482a(errorResult, (Continuation<? super Unit>) this) == a) {
                    return a;
                }
            } else if (i == 1) {
                ErrorResult errorResult2 = (ErrorResult) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public void mo93511a(RucketJob<T> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "origin");
        aVar.mo93489c(mo93509g());
        aVar.mo93488b(mo93510h());
        RucketJob.m95402b(RucketJob.m95401a(aVar, (CoroutineContext) null, new C26367a(this, null), 1, (Object) null), null, new C26368b(this, null), 1, null);
    }
}
