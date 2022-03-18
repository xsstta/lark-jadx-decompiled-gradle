package com.ss.android.lark.main.splash;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.splash.SplashAdLoadResult;
import com.ss.android.lark.pb.ad.PullSplashADRequest;
import com.ss.android.lark.pb.ad.PullSplashADResponse;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.sdk.SdkSender;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/main/splash/SplashAdService;", "", "()V", "LOG_TAG", "", "getSplashAd", "Lcom/ss/android/lark/main/splash/SplashAdLoadResult;", "lastSplashAdId", "", "displayWidth", "", "displayHeight", "(JIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.splash.c */
public final class SplashAdService {

    /* renamed from: a */
    public static final SplashAdService f112883a = new SplashAdService();

    private SplashAdService() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/main/splash/SplashAdService$getSplashAd$2$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/ad/PullSplashADResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.splash.c$a */
    public static final class C44522a implements IGetDataCallback<PullSplashADResponse> {

        /* renamed from: a */
        final /* synthetic */ Continuation f112884a;

        C44522a(Continuation cVar) {
            this.f112884a = cVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("SplashAd_Service", "getSplashAd error: " + errorResult.getDebugMsg());
            Continuation cVar = this.f112884a;
            SplashAdLoadResult.SplashAdLoadError bVar = new SplashAdLoadResult.SplashAdLoadError(errorResult);
            Result.Companion aVar = Result.Companion;
            cVar.resumeWith(Result.m271569constructorimpl(bVar));
        }

        /* renamed from: a */
        public void onSuccess(PullSplashADResponse pullSplashADResponse) {
            if (pullSplashADResponse != null) {
                Log.m165389i("SplashAd_Service", "getSplashAd success, proceed with decoding");
                Continuation cVar = this.f112884a;
                String utf8 = pullSplashADResponse.msplash.utf8();
                Intrinsics.checkExpressionValueIsNotNull(utf8, "data.msplash.utf8()");
                SplashAdLoadResult.SplashAdData aVar = new SplashAdLoadResult.SplashAdData(utf8);
                Result.Companion aVar2 = Result.Companion;
                cVar.resumeWith(Result.m271569constructorimpl(aVar));
                return;
            }
            Log.m165389i("SplashAd_Service", "getSplashAd success, but data is empty");
            Continuation cVar2 = this.f112884a;
            SplashAdLoadResult.SplashAdLoadError bVar = new SplashAdLoadResult.SplashAdLoadError(new ErrorResult("PullSplashAdResponse is null"));
            Result.Companion aVar3 = Result.Companion;
            cVar2.resumeWith(Result.m271569constructorimpl(bVar));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/pb/ad/PullSplashADResponse;", "kotlin.jvm.PlatformType", "byteArray", "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.splash.c$b */
    public static final class C44523b<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C44523b f112885a = new C44523b();

        C44523b() {
        }

        /* renamed from: a */
        public final PullSplashADResponse parse(byte[] bArr) {
            return PullSplashADResponse.ADAPTER.decode(bArr);
        }
    }

    /* renamed from: a */
    public final Object mo157980a(long j, int i, int i2, Continuation<? super SplashAdLoadResult> cVar) {
        SafeContinuation gVar = new SafeContinuation(C69086a.m265825a(cVar));
        SafeContinuation gVar2 = gVar;
        PullSplashADRequest.C49411a a = new PullSplashADRequest.C49411a().mo172456a(C69089a.m265840a(j));
        if (i > 0) {
            a.mo172455a(C69089a.m265839a(i));
        }
        if (i2 > 0) {
            a.mo172458b(C69089a.m265839a(i2));
        }
        SdkSender.sendPassThroughRequest(Command.PULL_SPLASH_AD, a, new C44522a(gVar2), C44523b.f112885a);
        Object a2 = gVar.mo239163a();
        if (a2 == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return a2;
    }
}
