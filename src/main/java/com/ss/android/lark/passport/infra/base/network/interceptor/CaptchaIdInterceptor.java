package com.ss.android.lark.passport.infra.base.network.interceptor;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.passport.infra.base.network.HttpUtils;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.IRequest;
import java.util.LinkedHashMap;
import java.util.Map;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0019\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/interceptor/CaptchaIdInterceptor;", "Lcom/ss/android/lark/passport/infra/base/network/interceptor/IRequestInterceptor;", "()V", "TAG", "", "doRequestCaptchaToken", "Lcom/ss/android/lark/passport/infra/base/network/interceptor/InterceptorResult;", "request", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;", "getCaptchaToken", "(Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPathWithQueryParameter", "processRequest", "processRequestHeaders", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.network.d.b */
public final class CaptchaIdInterceptor implements IRequestInterceptor {

    /* renamed from: a */
    public final String f123259a = "CaptchaIdInterceptor";

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
        return m193441c(eVar);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/passport/infra/base/network/interceptor/InterceptorResult;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.passport.infra.base.network.interceptor.CaptchaIdInterceptor$doRequestCaptchaToken$1", mo239173f = "CaptchaIdInterceptor.kt", mo239174i = {0}, mo239175l = {46}, mo239176m = "invokeSuspend", mo239177n = {"$this$runBlocking"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.passport.infra.base.network.d.b$a */
    public static final class C49077a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterceptorResult>, Object> {
        final /* synthetic */ IRequest $request;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CaptchaIdInterceptor this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49077a(CaptchaIdInterceptor bVar, IRequest eVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
            this.$request = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C49077a aVar = new C49077a(this.this$0, this.$request, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super InterceptorResult> cVar) {
            return ((C49077a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                CaptchaIdInterceptor bVar = this.this$0;
                IRequest eVar = this.$request;
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.mo171336a(eVar, this);
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

    /* renamed from: c */
    private final InterceptorResult m193441c(IRequest eVar) {
        PassportLog.f123351c.mo171474a().mo171465b(this.f123259a, "doRequestCaptchaToken");
        if (!eVar.mo171297p()) {
            return (InterceptorResult) C69389f.m266835a(null, new C49077a(this, eVar, null), 1, null);
        }
        PassportLog.f123351c.mo171474a().mo171465b(this.f123259a, "no need captchaToken");
        return new InterceptorResult(eVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/passport/infra/base/network/interceptor/CaptchaIdInterceptor$getCaptchaToken$2$callback$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/IGetDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", "token", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.network.d.b$b */
    public static final class C49078b implements AbstractC49352d<String> {

        /* renamed from: a */
        final /* synthetic */ long f123260a;

        /* renamed from: b */
        final /* synthetic */ Continuation f123261b;

        /* renamed from: c */
        final /* synthetic */ CaptchaIdInterceptor f123262c;

        /* renamed from: d */
        final /* synthetic */ IRequest f123263d;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
        /* renamed from: a */
        public void mo145178a(NetworkErrorResult networkErrorResult) {
            String str;
            UniContext d = this.f123263d.mo171285d();
            if (d != null) {
                d.appendOneTimeParam("X-Request-ID", this.f123263d.mo171287f().get("X-Request-ID"));
            }
            PassportLog.f123351c.mo171474a().mo171471d(this.f123262c.f123259a, PassportLog.f123351c.mo171478a("sendRequestBeforeGetToken onError", networkErrorResult));
            InterceptorResult hVar = new InterceptorResult(this.f123263d);
            if (networkErrorResult == null || (str = networkErrorResult.getErrorMessage()) == null) {
                str = "getCaptchaToken error ";
            }
            hVar.mo171344a(new NetworkErrorResult(-4, str));
            Continuation cVar = this.f123261b;
            Result.Companion aVar = Result.Companion;
            cVar.resumeWith(Result.m271569constructorimpl(hVar));
        }

        /* renamed from: a */
        public void mo145179a(String str) {
            C49096b.m193576a(this.f123263d.mo171298q(), System.currentTimeMillis() - this.f123260a);
            if (!TextUtils.isEmpty(str)) {
                HttpUtils.f123257a.mo171332a(this.f123263d.mo171287f(), "X-Sec-Captcha-Token", str);
            } else {
                PassportLog.f123351c.mo171474a().mo171465b(this.f123262c.f123259a, "sendRequestBeforeGetToken request token is empty");
            }
            Continuation cVar = this.f123261b;
            InterceptorResult hVar = new InterceptorResult(this.f123263d);
            Result.Companion aVar = Result.Companion;
            cVar.resumeWith(Result.m271569constructorimpl(hVar));
        }

        C49078b(long j, Continuation cVar, CaptchaIdInterceptor bVar, IRequest eVar) {
            this.f123260a = j;
            this.f123261b = cVar;
            this.f123262c = bVar;
            this.f123263d = eVar;
        }
    }

    /* renamed from: d */
    private final String m193442d(IRequest eVar) {
        String c = eVar.mo171284c();
        LinkedHashMap<String, String> linkedHashMap = eVar.mo171291j().urlParamsMap;
        Intrinsics.checkExpressionValueIsNotNull(linkedHashMap, "request.getParams().urlParamsMap");
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        if (!(!linkedHashMap2.isEmpty())) {
            return c;
        }
        Uri.Builder buildUpon = Uri.parse(c).buildUpon();
        for (Map.Entry<String, String> entry : linkedHashMap2.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String uri = buildUpon.build().toString();
        Intrinsics.checkExpressionValueIsNotNull(uri, "builder.build().toString()");
        return uri;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo171336a(IRequest eVar, Continuation<? super InterceptorResult> cVar) {
        String str;
        String str2;
        SafeContinuation gVar = new SafeContinuation(C69086a.m265825a(cVar));
        C49078b bVar = new C49078b(System.currentTimeMillis(), gVar, this, eVar);
        String d = m193442d(eVar);
        if (HttpMethod.POST == eVar.mo171286e()) {
            String a = C38760a.m153057a(eVar.mo171290i());
            Intrinsics.checkExpressionValueIsNotNull(a, "FastJsonUtil.toJSONStrin…request.getRequestBody())");
            str = a;
        } else {
            str = "";
        }
        Context applicationContext = ServiceFinder.m193748c().getApplicationContext();
        try {
            String str3 = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionName;
            Intrinsics.checkExpressionValueIsNotNull(str3, "pi.versionName");
            str2 = str3;
        } catch (Exception e) {
            PassportLog.f123351c.mo171474a().mo171462a(this.f123259a, "sendRequestBeforeGetToken, init error", e);
            str2 = "";
        }
        PassportLog a2 = PassportLog.f123351c.mo171474a();
        String str4 = this.f123259a;
        a2.mo171465b(str4, "info: " + eVar.mo171286e() + "; " + str2 + "; " + "android");
        ServiceFinder.m193752g().getCaptchaToken(d, str, str2, "android", bVar);
        Object a3 = gVar.mo239163a();
        if (a3 == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return a3;
    }
}
