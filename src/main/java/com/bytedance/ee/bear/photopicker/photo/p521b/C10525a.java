package com.bytedance.ee.bear.photopicker.photo.p521b;

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
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"runInCoroutines", "", "T", "param", "task", "Lkotlin/Function1;", "consumer", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "file-selector_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.photopicker.photo.b.a */
public final class C10525a {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 15})
    @DebugMetadata(mo239172c = "com.bytedance.ee.bear.photopicker.photo.util.CoroutinesUtils$runInCoroutines$1", mo239173f = "CoroutinesUtils.kt", mo239174i = {0, 0}, mo239175l = {20}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "resultDeferred"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.bytedance.ee.bear.photopicker.photo.b.a$a */
    public static final class C10526a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1 $consumer;
        final /* synthetic */ Object $param;
        final /* synthetic */ Function1 $task;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10526a(Function1 function1, Object obj, Function1 function12, Continuation cVar) {
            super(2, cVar);
            this.$task = function1;
            this.$param = obj;
            this.$consumer = function12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C10526a aVar = new C10526a(this.$task, this.$param, this.$consumer, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C10526a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 15})
        @DebugMetadata(mo239172c = "com.bytedance.ee.bear.photopicker.photo.util.CoroutinesUtils$runInCoroutines$1$resultDeferred$1", mo239173f = "CoroutinesUtils.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
        /* renamed from: com.bytedance.ee.bear.photopicker.photo.b.a$a$a */
        public static final class C10527a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
            int label;
            private CoroutineScope p$;
            final /* synthetic */ C10526a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10527a(C10526a aVar, Continuation cVar) {
                super(2, cVar);
                this.this$0 = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                C10527a aVar = new C10527a(this.this$0, cVar);
                aVar.p$ = (CoroutineScope) obj;
                return aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope ahVar, Object obj) {
                return ((C10527a) create(ahVar, (Continuation) obj)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                C69086a.m265828a();
                if (this.label == 0) {
                    C69097g.m265891a(obj);
                    return this.this$0.$task.invoke(this.this$0.$param);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                Deferred aoVar = C69553g.m266946b(GlobalScope.f173453a, Dispatchers.m266326d(), null, new C10527a(this, null), 2, null);
                this.L$0 = ahVar;
                this.L$1 = aoVar;
                this.label = 1;
                obj = aoVar.mo242667a(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                Deferred aoVar2 = (Deferred) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.$consumer.invoke(obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final <T> void m43607a(T t, Function1<? super T, ? extends T> function1, Function1<? super T, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(function1, "task");
        Intrinsics.checkParameterIsNotNull(function12, "consumer");
        Job unused = C69553g.m266944a(GlobalScope.f173453a, Dispatchers.m266324b(), null, new C10526a(function1, t, function12, null), 2, null);
    }
}
