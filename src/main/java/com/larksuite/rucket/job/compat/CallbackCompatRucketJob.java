package com.larksuite.rucket.job.compat;

import com.google.firebase.messaging.Constants;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.rucket.job.RucketJobImpl;
import com.larksuite.rucket.job.extension.EmptyResultException;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B)\u0012\"\u0010\u0004\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/larksuite/rucket/job/compat/CallbackCompatRucketJob;", "T", "Lcom/larksuite/rucket/job/RucketJobImpl;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "callbackResolver", "Lkotlin/Function1;", "", "Lcom/larksuite/rucket/job/compat/IAsyncHandler;", "(Lkotlin/jvm/functions/Function1;)V", "onError", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.job.b.a */
public final class CallbackCompatRucketJob<T> extends RucketJobImpl<T> implements IGetDataCallback<T> {
    public CallbackCompatRucketJob(Function1<? super IGetDataCallback<T>, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "callbackResolver");
        function1.invoke(this);
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback
    public void onError(ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(errorResult, "err");
        Job unused = C69553g.m266944a(this, null, null, new C26363a(this, errorResult, null), 3, null);
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
    public void onSuccess(T t) {
        Job unused = C69553g.m266944a(this, null, null, new C26364b(this, t, null), 3, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.larksuite.rucket.job.compat.CallbackCompatRucketJob$onError$1", mo239173f = "CallbackCompatRucketJob.kt", mo239174i = {0}, mo239175l = {34}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.larksuite.rucket.job.b.a$a */
    public static final class C26363a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ErrorResult $err;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CallbackCompatRucketJob this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26363a(CallbackCompatRucketJob aVar, ErrorResult errorResult, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
            this.$err = errorResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C26363a aVar = new C26363a(this.this$0, this.$err, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C26363a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                CallbackCompatRucketJob aVar = this.this$0;
                ErrorResult errorResult = this.$err;
                this.L$0 = ahVar;
                this.label = 1;
                if (aVar.mo93482a(errorResult, (Continuation<? super Unit>) this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.larksuite.rucket.job.compat.CallbackCompatRucketJob$onSuccess$1", mo239173f = "CallbackCompatRucketJob.kt", mo239174i = {0, 1}, mo239175l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0"})
    /* renamed from: com.larksuite.rucket.job.b.a$b */
    static final class C26364b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Object $data;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CallbackCompatRucketJob this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26364b(CallbackCompatRucketJob aVar, Object obj, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
            this.$data = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C26364b bVar = new C26364b(this.this$0, this.$data, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C26364b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: com.larksuite.rucket.job.b.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                Object obj2 = this.$data;
                if (obj2 != null) {
                    CallbackCompatRucketJob aVar = this.this$0;
                    this.L$0 = ahVar;
                    this.label = 1;
                    if (aVar.mo93483a(obj2, this) == a) {
                        return a;
                    }
                } else {
                    this.L$0 = ahVar;
                    this.label = 2;
                    if (this.this$0.mo93482a((ErrorResult) new EmptyResultException(), (Continuation<? super Unit>) this) == a) {
                        return a;
                    }
                }
            } else if (i == 1 || i == 2) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }
}
