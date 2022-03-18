package com.ss.android.lark.passport.infra.base.network.interceptor;

import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49194j;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.IRequest;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69389f;
import kotlinx.coroutines.CoroutineScope;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/interceptor/DeviceIdInterceptor;", "Lcom/ss/android/lark/passport/infra/base/network/interceptor/IRequestInterceptor;", "()V", "TAG", "", "getDeviceId", "Lcom/ss/android/lark/passport/infra/base/network/interceptor/InterceptorResult;", "encrypt", "", "request", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;", "(ZLcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processRequest", "processRequestHeaders", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.network.d.e */
public final class DeviceIdInterceptor implements IRequestInterceptor {

    /* renamed from: a */
    public final String f123266a = "DeviceIdInterceptor";

    @Override // com.ss.android.lark.passport.infra.base.network.interceptor.IRequestInterceptor
    /* renamed from: a */
    public IRequest mo171335a(IRequest eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "request");
        return eVar;
    }

    @Override // com.ss.android.lark.passport.infra.base.network.interceptor.IRequestInterceptor
    /* renamed from: b */
    public InterceptorResult mo171337b(IRequest eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "request");
        return (InterceptorResult) C69389f.m266835a(null, new C49080b(this, eVar, null), 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/passport/infra/base/network/interceptor/DeviceIdInterceptor$getDeviceId$2$callback$1", "Lcom/ss/android/lark/passport/signinsdk_api/interfaces/IGetDeviceIdCallback;", "onError", "", "message", "", "onSuccess", "deviceId", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.network.d.e$a */
    public static final class C49079a implements AbstractC49392e {

        /* renamed from: a */
        final /* synthetic */ Continuation f123267a;

        /* renamed from: b */
        final /* synthetic */ DeviceIdInterceptor f123268b;

        /* renamed from: c */
        final /* synthetic */ IRequest f123269c;

        /* renamed from: d */
        final /* synthetic */ boolean f123270d;

        @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
        /* renamed from: a */
        public void mo171341a(String str) {
            PassportLog a = PassportLog.f123351c.mo171474a();
            String str2 = this.f123268b.f123266a;
            a.mo171465b(str2, "login with getDeviceId deviceId=" + str);
            Continuation cVar = this.f123267a;
            InterceptorResult hVar = new InterceptorResult(this.f123269c);
            Result.Companion aVar = Result.Companion;
            cVar.resumeWith(Result.m271569constructorimpl(hVar));
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
        /* renamed from: b */
        public void mo171342b(String str) {
            UniContext d = this.f123269c.mo171285d();
            if (d != null) {
                d.appendOneTimeParam("X-Request-ID", this.f123269c.mo171287f().get("X-Request-ID"));
            }
            PassportLog a = PassportLog.f123351c.mo171474a();
            String str2 = this.f123268b.f123266a;
            a.mo171471d(str2, "login failed, getDeviceId error: " + str);
            InterceptorResult hVar = new InterceptorResult(this.f123269c);
            hVar.mo171344a(new NetworkErrorResult(-1, str));
            Continuation cVar = this.f123267a;
            Result.Companion aVar = Result.Companion;
            cVar.resumeWith(Result.m271569constructorimpl(hVar));
        }

        C49079a(Continuation cVar, DeviceIdInterceptor eVar, IRequest eVar2, boolean z) {
            this.f123267a = cVar;
            this.f123268b = eVar;
            this.f123269c = eVar2;
            this.f123270d = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/passport/infra/base/network/interceptor/InterceptorResult;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.passport.infra.base.network.interceptor.DeviceIdInterceptor$processRequest$1", mo239173f = "DeviceIdInterceptor.kt", mo239174i = {0}, mo239175l = {29}, mo239176m = "invokeSuspend", mo239177n = {"$this$runBlocking"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.passport.infra.base.network.d.e$b */
    static final class C49080b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterceptorResult>, Object> {
        final /* synthetic */ IRequest $request;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ DeviceIdInterceptor this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49080b(DeviceIdInterceptor eVar, IRequest eVar2, Continuation cVar) {
            super(2, cVar);
            this.this$0 = eVar;
            this.$request = eVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C49080b bVar = new C49080b(this.this$0, this.$request, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super InterceptorResult> cVar) {
            return ((C49080b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                DeviceIdInterceptor eVar = this.this$0;
                IRequest eVar2 = this.$request;
                this.L$0 = ahVar;
                this.label = 1;
                obj = eVar.mo171340a(false, eVar2, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* renamed from: a */
    public final Object mo171340a(boolean z, IRequest eVar, Continuation<? super InterceptorResult> cVar) {
        SafeContinuation gVar = new SafeContinuation(C69086a.m265825a(cVar));
        C49194j.m193951a(z, new C49079a(gVar, this, eVar, z));
        Object a = gVar.mo239163a();
        if (a == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return a;
    }
}
