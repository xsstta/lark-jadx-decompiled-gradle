package com.ss.android.lark.passport.infra.base.network.manager;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.passport.infra.base.network.C49070b;
import com.ss.android.lark.passport.infra.base.network.handler.CommonCodeHandlers;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import java.lang.reflect.Type;
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
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/manager/UICallback;", "T", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "commonCodeHandlers", "Lcom/ss/android/lark/passport/infra/base/network/handler/CommonCodeHandlers;", "callback", "(Lcom/ss/android/lark/passport/infra/base/network/handler/CommonCodeHandlers;Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;)V", "getCallback", "()Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.network.e.c */
public final class UICallback<T> implements ICallback<T> {

    /* renamed from: a */
    public final CommonCodeHandlers f123284a;

    /* renamed from: b */
    private final ICallback<T> f123285b;

    /* renamed from: b */
    public final ICallback<T> mo171364b() {
        return this.f123285b;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
    /* renamed from: a */
    public Type mo101474a() {
        return this.f123285b.mo101474a();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
    /* renamed from: a */
    public void mo101476a(ResponseModel<T> responseModel) {
        Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Job unused = C69553g.m266944a(GlobalScope.f173453a, C49070b.m193384a(), null, new C49084b(this, responseModel, null), 2, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/ss/android/lark/passport/infra/base/network/manager/UICallback$onError$1$1$1", "com/ss/android/lark/passport/infra/base/network/manager/UICallback$$special$$inlined$let$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.network.e.c$a */
    static final class C49083a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ NetworkErrorResult $networkErrorResult$inlined;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ UICallback this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49083a(Continuation cVar, UICallback cVar2, NetworkErrorResult networkErrorResult) {
            super(2, cVar);
            this.this$0 = cVar2;
            this.$networkErrorResult$inlined = networkErrorResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C49083a aVar = new C49083a(cVar, this.this$0, this.$networkErrorResult$inlined);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C49083a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                this.this$0.f123284a.mo171326a(this.$networkErrorResult$inlined);
                this.this$0.mo171364b().mo101475a(this.$networkErrorResult$inlined);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.passport.infra.base.network.manager.UICallback$onSuccess$1", mo239173f = "UICallback.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.passport.infra.base.network.e.c$b */
    static final class C49084b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ResponseModel $data;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ UICallback this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49084b(UICallback cVar, ResponseModel responseModel, Continuation cVar2) {
            super(2, cVar2);
            this.this$0 = cVar;
            this.$data = responseModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C49084b bVar = new C49084b(this.this$0, this.$data, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C49084b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                this.this$0.f123284a.mo171328a(this.$data);
                this.this$0.mo171364b().mo101476a(this.$data);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
    /* renamed from: a */
    public void mo101475a(NetworkErrorResult networkErrorResult) {
        Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
        if (!this.f123284a.mo171327a(networkErrorResult, this.f123285b)) {
            Job unused = C69553g.m266944a(GlobalScope.f173453a, C49070b.m193384a(), null, new C49083a(null, this, networkErrorResult), 2, null);
        }
    }

    public UICallback(CommonCodeHandlers fVar, ICallback<T> aVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "commonCodeHandlers");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        this.f123284a = fVar;
        this.f123285b = aVar;
    }
}
